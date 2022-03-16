package com.tuya.qc.hellojava.service.impl;

import com.tuya.qc.hellojava.dto.PersonDto;
import com.tuya.qc.hellojava.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * Author: my.deng@tuya.com
 * Date: 2022/3/15 15:36
 */
@Service
public class HelloServiceImpl implements HelloService {


    @Override
    public String doHello() {
        return "Hello, I'm Meiyo";
    }

    @Override
    public String doHello(String name) {
        return String.format("Hello, I am %s", name);
    }

    @Override
    public String doHello(String name, int age) {
        return String.format("Hello, I'm %s, I'm %d years old.", name, age);
    }

    @Override
    public String doHello(PersonDto person) {
        return String.format("Hello, I am %s, I am %d years old.", person.getName(), person.getAge());
    }
}
