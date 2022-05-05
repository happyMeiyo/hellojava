package com.tuya.lesson.java.controller;

import com.tuya.lesson.java.entity.Actor;
import com.tuya.lesson.java.service.ActorService;
import com.tuya.lesson.java.util.ReturnT;
import com.tuya.lesson.java.dto.QueryActorDto;
import com.tuya.lesson.java.dto.QueryActorVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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

    /**
     * 精确查询查询演员列表，最多10个
     * curl --header "Content-Type: application/json" --request POST --data '{"firstName":"PENELOPE","lastName":"GUINESS"}' http://localhost:12345/actor/queryActorList
     **/
    @PostMapping("/queryActorList")
    public ReturnT<List<Actor>> queryActorList(@RequestBody QueryActorDto queryActorDto) {
        return actorService.queryActorList(queryActorDto);
    }

    /**
     * 分页,模糊查询查询演员列表
     * curl --header "Content-Type: application/json" --request POST --data '{"firstName":"P","lastName":"","pageNum":1,"pageSize":100}' http://localhost:12345/actor/queryActorByPage
     **/
    @PostMapping("/queryActorByPage")
    public ReturnT<QueryActorVo> queryActorByPage(@RequestBody QueryActorDto queryActorDto) {
        return actorService.queryActorByPage(queryActorDto);
    }
}
