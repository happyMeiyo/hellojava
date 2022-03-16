package com.tuya.qc.hellojava.controller;

import com.tuya.qc.hellojava.dto.PersonDto;
import com.tuya.qc.hellojava.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: my.deng@tuya.com
 * @Date: 2022/3/15 15:29
 */

@RestController
@RequestMapping("/api")
public class FirstController {
    @Autowired
    HelloService helloService;

    // curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://127.0.0.1:12345/api/hello1
    @GetMapping("/hello1")
    public String hello1() {
        return helloService.doHello();
    }


    //  curl --header "Content-Type: application/json" --request POST  --data 'Meiyo' http://127.0.0.1:12345/api/hello2
    @PostMapping("/hello2")
    public String hello2(@RequestBody String myName) {
        return helloService.doHello(myName);
    }

    //  curl --header "Content-Type: application/json" --request POST  --data '{"name":"Meiyo","age":24}' http://127.0.0.1:8080/api/hello3
    @PostMapping("hello3")
    public String hello3(@RequestBody PersonDto person){
        return helloService.doHello(person.getName(), person.getAge());
    }

    //  curl --header "Content-Type: application/json" --request POST  --data '{"name":"Meiyo","age":24}' http://127.0.0.1:8080/api/hello3
    @PostMapping("hello4")
    public String hello4(@RequestBody PersonDto person){
        return helloService.doHello(person);
    }





}
