package com.tuya.lesson.java.service.impl;

import com.tuya.lesson.java.dao.ActorMapper;
import com.tuya.lesson.java.entity.Actor;
import com.tuya.lesson.java.service.ActorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author: my.deng@tuya.com
 * Date: 2022/4/25 17:11
 */
@Service
public class ActorServiceImpl implements ActorService {

    @Resource
    private ActorMapper actorMapper;


    @Override
    public Actor load(short actorId) {
        return actorMapper.selectByPrimaryKey(actorId);
    }
}
