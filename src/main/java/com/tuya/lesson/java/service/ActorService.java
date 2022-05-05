package com.tuya.lesson.java.service;

import com.tuya.lesson.java.entity.Actor;
import com.tuya.lesson.java.util.ReturnT;
import com.tuya.lesson.java.dto.QueryActorDto;
import com.tuya.lesson.java.dto.QueryActorVo;

import java.util.List;

/**
 * Author: my.deng@tuya.com
 * Date: 2022/4/25 17:08
 */
public interface ActorService {


    /**
     * 根据主键 id 查询
     */
    public Actor load(short actorId);

    ReturnT<List<Actor>> queryActorList(QueryActorDto queryActorDto);

    ReturnT<QueryActorVo>  queryActorByPage(QueryActorDto queryActorDto);
}
