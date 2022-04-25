package com.tuya.lesson.java.controller;

/**
 * Author: my.deng@tuya.com
 * Date: 2022/4/25 19:26
 */

import com.tuya.lesson.java.entity.FilmActor;
import com.tuya.lesson.java.service.FilmActorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @description film_actor
 * @author qingchuan
 * @date 2022-04-25
 */
@RestController
@RequestMapping(value = "/filmActor")
public class FilmActorController {

    @Resource
    private FilmActorService filmActorService;

    /**
     * 新增
     * @author qingchuan
     * @date 2022/04/25
     **/
    @RequestMapping("/insert")
    public Object insert(FilmActor filmActor){
        return filmActorService.insert(filmActor);
    }

    /**
     * 刪除
     * @author qingchuan
     * @date 2022/04/25
     *
     * @return*/
    @RequestMapping("/delete")
    public Object delete(int id){
        return filmActorService.delete(id);
    }

    /**
     * 更新
     * @author qingchuan
     * @date 2022/04/25
     *
     * @return*/
    @RequestMapping("/update")
    public Object update(FilmActor filmActor){
        return filmActorService.update(filmActor);
    }

    /**
     * 查询 根据主键 id 查询
     * @author qingchuan
     * @date 2022/04/25
     **/
    @RequestMapping("/load")
    public Object load(int id){
        return filmActorService.load(id);
    }

    /**
     * 查询 分页查询
     * @author qingchuan
     * @date 2022/04/25
     **/
    @RequestMapping("/pageList")
    public Map<String, Object> pageList(@RequestParam(required = false, defaultValue = "0") int offset,
                                        @RequestParam(required = false, defaultValue = "10") int pagesize) {
        return filmActorService.pageList(offset, pagesize);
    }

}