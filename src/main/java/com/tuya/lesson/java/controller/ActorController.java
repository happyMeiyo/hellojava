package com.tuya.lesson.java.controller;

import com.tuya.lesson.java.service.ActorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Author: my.deng@tuya.com
 * Date: 2022/4/25 17:05
 */

@RestController
@RequestMapping(value = "/actor")
public class ActorController {
    @Resource
    private ActorService actorService;

    // http://localhost:8080/actor/load?id=2
    /**
     * 查询 根据主键 id 查询
     **/
    @RequestMapping("/load")
    public Object load(short actorId) {
        return actorService.load(actorId);
    }


}
