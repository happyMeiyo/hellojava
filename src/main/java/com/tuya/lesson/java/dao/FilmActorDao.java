package com.tuya.lesson.java.dao;

import com.tuya.lesson.java.entity.FilmActor;
import com.tuya.lesson.java.entity.FilmActorKey;

public interface FilmActorDao {
    int deleteByPrimaryKey(FilmActorKey key);

    int insert(FilmActor record);

    int insertSelective(FilmActor record);

    FilmActor selectByPrimaryKey(FilmActorKey key);

    int updateByPrimaryKeySelective(FilmActor record);

    int updateByPrimaryKey(FilmActor record);
}