package com.tuya.lesson.java.service.impl;

import com.tuya.lesson.java.dao.ActorMapper;
import com.tuya.lesson.java.entity.Actor;
import com.tuya.lesson.java.service.ActorService;
import com.tuya.lesson.java.util.ReturnT;
import com.tuya.lesson.java.dto.QueryActorDto;
import com.tuya.lesson.java.dto.QueryActorVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    @Override
    public ReturnT<List<Actor>> queryActorList(QueryActorDto queryActorDto) {
        List<Actor> actors = actorMapper.queryActors(queryActorDto.getFirstName(), queryActorDto.getLastName());
        
        return ReturnT.success().setT(actors);
    }

    @Override
    public ReturnT<QueryActorVo>  queryActorByPage(QueryActorDto queryActorDto) {
        if (queryActorDto.getPageNum() < 1){
            queryActorDto.setPageNum(1);
        }

        List<Actor> actors = actorMapper.queryActorsByPage(queryActorDto.getFirstName(), queryActorDto.getLastName(),
                (queryActorDto.getPageNum()-1) * queryActorDto.getPageSize(), queryActorDto.getPageSize());

        int total = actorMapper.queryCountForActors(queryActorDto.getFirstName(), queryActorDto.getLastName());

        QueryActorVo queryActorVo = new QueryActorVo();
        queryActorVo.setData(actors);
        queryActorVo.setTotal(total);
        queryActorVo.setPageNum(queryActorDto.getPageNum());
        queryActorVo.setPageSize(queryActorDto.getPageSize());

        return ReturnT.success().setT(queryActorVo);
    }
}
