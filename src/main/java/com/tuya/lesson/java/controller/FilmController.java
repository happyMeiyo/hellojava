package com.tuya.lesson.java.controller;

import com.github.pagehelper.PageInfo;
import com.tuya.lesson.java.entity.Film;
import com.tuya.lesson.java.service.FilmService;
import com.tuya.lesson.java.dto.QueryFilmDto;
import com.tuya.lesson.java.util.ReturnT;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Author: my.deng@tuya.com
 * Date: 2022/4/25 18:34
 */

@RestController
@RequestMapping(value = "/film")
public class FilmController {
    @Resource
    private FilmService filmService;

    @RequestMapping("/filmList")
    public Map<String, Object> filmList(@RequestParam(required = false, defaultValue = "0") int offset,
                                        @RequestParam(required = false, defaultValue = "10") int pageSize) {
        return filmService.filmList(offset, pageSize);
    }


    /**
     * 分页插件，根据演员的id，查询电影列表
     * curl --header "Content-Type: application/json" --request POST --data '{"actorId":2,"pageNum":1,"pageSize":10}' http://localhost:12345/film/queryFilmByActorId
     * curl --header "Content-Type: application/json" --request POST --data '{"actorId":2,"pageNum":2,"pageSize":10}' http://localhost:12345/film/queryFilmByActorId
     * curl --header "Content-Type: application/json" --request POST --data '{"actorId":2,"pageNum":3,"pageSize":10}' http://localhost:12345/film/queryFilmByActorId
     **/
    @PostMapping("/queryFilmByActorId")
    public ReturnT<PageInfo<Film>> queryFilmByActorId(@RequestBody QueryFilmDto queryFilmDto) {
        return filmService.queryFilmByActorId(queryFilmDto);
    }
}
