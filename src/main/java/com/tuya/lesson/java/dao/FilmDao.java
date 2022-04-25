package com.tuya.lesson.java.dao;

import com.tuya.lesson.java.entity.Film;

public interface FilmDao {
    int deleteByPrimaryKey(Short filmId);

    int insert(Film record);

    int insertSelective(Film record);

    Film selectByPrimaryKey(Short filmId);

    int updateByPrimaryKeySelective(Film record);

    int updateByPrimaryKey(Film record);
}