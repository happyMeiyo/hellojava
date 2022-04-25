package com.tuya.lesson.java.service;

import com.tuya.lesson.java.entity.Actor;

/**
 * Author: my.deng@tuya.com
 * Date: 2022/4/25 17:08
 */
public interface ActorService {


    /**
     * 根据主键 id 查询
     */
    public Actor load(short actorId);
}
