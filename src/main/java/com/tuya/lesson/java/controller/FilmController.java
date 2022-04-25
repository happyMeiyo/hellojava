package com.tuya.lesson.java.controller;

import com.tuya.lesson.java.service.FilmService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
