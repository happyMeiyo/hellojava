package com.tuya.lesson.java.service.impl;

import com.tuya.lesson.java.dao.FilmActorMapper;
import com.tuya.lesson.java.entity.FilmActor;
import com.tuya.lesson.java.service.FilmActorService;
import com.tuya.lesson.java.util.ReturnT;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author qingchuan
 * @description film_actor
 * @date 2022-04-25
 */
@Service
public class FilmActorServiceImpl implements FilmActorService {

    @Resource
    private FilmActorMapper filmActorMapper;


    @Override
    public Object insert(FilmActor filmActor) {

        // valid
        if (filmActor == null) {
            return ReturnT.error("必要参数缺失");
        }

        filmActorMapper.insert(filmActor);
        return ReturnT.success();
    }


    @Override
    public Object delete(int id) {
        int ret = filmActorMapper.delete(id);
        return ret > 0 ? ReturnT.success() : ReturnT.error();
    }


    @Override
    public Object update(FilmActor filmActor) {
        int ret = filmActorMapper.update(filmActor);
        return ret > 0 ? ReturnT.success() : ReturnT.error();
    }


    @Override
    public FilmActor load(int id) {
        return filmActorMapper.load(id);
    }


    @Override
    public Map<String, Object> pageList(int offset, int pagesize) {

        List<FilmActor> pageList = filmActorMapper.pageList(offset, pagesize);
        int totalCount = filmActorMapper.pageListCount(offset, pagesize);

        // result
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("pageList", pageList);
        result.put("totalCount", totalCount);

        return result;
    }

}