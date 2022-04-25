package com.tuya.lesson.java.service;

import com.tuya.lesson.java.entity.FilmActor;

import java.util.Map;
/**
 * @description film_actor
 * @author qingchuan
 * @date 2022-04-25
 */
public interface FilmActorService {

    /**
     * 新增
     */
    public Object insert(FilmActor filmActor);

    /**
     * 删除
     */
    public Object delete(int id);

    /**
     * 更新
     */
    public Object update(FilmActor filmActor);

    /**
     * 根据主键 id 查询
     */
    public FilmActor load(int id);

    /**
     * 分页查询
     */
    public Map<String,Object> pageList(int offset, int pagesize);

}