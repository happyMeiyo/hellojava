package com.tuya.lesson.java.dao;

import com.tuya.lesson.java.entity.Actor;
import com.tuya.lesson.java.entity.Film;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ActorMapper {
    List<Actor> queryActors(String firstName, String lastName);

    int deleteByPrimaryKey(Short actorId);

    int insert(Actor record);

    int insertSelective(Actor record);

    Actor selectByPrimaryKey(Short actorId);

    int updateByPrimaryKeySelective(Actor record);

    int updateByPrimaryKey(Actor record);

    List<Actor> queryActorsByPage(String firstName, String lastName, int pageNum, int pageSize);

    int queryCountForActors(String firstName, String lastName);

    List<Film> queryActorsByFilmId(int filmId);
}