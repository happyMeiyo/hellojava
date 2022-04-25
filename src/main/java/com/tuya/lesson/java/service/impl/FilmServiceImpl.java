package com.tuya.lesson.java.service.impl;

import com.tuya.lesson.java.dao.FilmDao;
import com.tuya.lesson.java.entity.Film;
import com.tuya.lesson.java.service.FilmService;
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
    private FilmDao filmMapper;

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
}
