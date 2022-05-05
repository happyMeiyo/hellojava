package com.tuya.lesson.java.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tuya.lesson.java.dao.FilmMapper;
import com.tuya.lesson.java.dto.QueryFilmDto;
import com.tuya.lesson.java.entity.Film;
import com.tuya.lesson.java.service.FilmService;
import com.tuya.lesson.java.util.ReturnT;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: my.deng@tuya.com
 * Date: 2022/4/25 18:26
 */
@Service
public class FilmServiceImpl implements FilmService {

    @Resource
    private FilmMapper filmMapper;

    @Override
    public Map<String, Object> filmList(int offset, int pageSize) {
        List<Film> pageList = filmMapper.filmList(offset, pageSize);
        int totalCount = filmMapper.filmCount();

        // result
        Map<String, Object> result = new HashMap<>();
        result.put("pageList", pageList);
        result.put("totalCount", totalCount);

        return result;
    }

    @Override
    public ReturnT<PageInfo<Film>> queryFilmByActorId(QueryFilmDto queryFilmDto) {
        Page<Film> objects = PageHelper.startPage(queryFilmDto.getPageNum(), queryFilmDto.getPageSize());
        List<Film> films = filmMapper.queryFilmsByActorId(queryFilmDto.getActorId());

        return ReturnT.success().setT(objects.toPageInfo());
    }
}
