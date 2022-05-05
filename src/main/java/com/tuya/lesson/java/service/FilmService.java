package com.tuya.lesson.java.service;

import com.github.pagehelper.PageInfo;
import com.tuya.lesson.java.dto.QueryFilmDto;
import com.tuya.lesson.java.entity.Film;
import com.tuya.lesson.java.util.ReturnT;

import java.util.Map;

/**
 * Author: my.deng@tuya.com
 * Date: 2022/4/25 18:25
 */
public interface FilmService {
    /**
     * 分页查询
     */
    public Map<String, Object> filmList(int offset, int pageSize);

    ReturnT<PageInfo<Film>> queryFilmByActorId(QueryFilmDto queryFilmDto);
}
