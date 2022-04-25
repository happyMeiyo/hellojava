package com.tuya.lesson.java.dao;

import com.tuya.lesson.java.entity.Film;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FilmMapper {
    int deleteByPrimaryKey(Short filmId);

    int insert(Film record);

    int insertSelective(Film record);

    Film selectByPrimaryKey(Short filmId);

    int updateByPrimaryKeySelective(Film record);

    int updateByPrimaryKey(Film record);

    /**
     * 查询 分页查询
     *
     * @date 2022/03/29
     **/
    List<Film> filmList(int offset, int pageSize);

    /**
     * 查询 分页查询 count
     *
     * @date 2022/03/29
     **/
    int filmCount();
}