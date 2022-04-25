package com.tuya.lesson.java.dao;

/**
 * Author: my.deng@tuya.com
 * Date: 2022/4/25 19:30
 */
import com.tuya.lesson.java.entity.FilmActor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description film_actor
 * @author qingchuan
 * @date 2022-04-25
 */
@Mapper
@Repository
public interface FilmActorMapper {

    /**
     * 新增
     * @author qingchuan
     * @date 2022/04/25
     **/
    int insert(FilmActor filmActor);

    /**
     * 刪除
     * @author qingchuan
     * @date 2022/04/25
     **/
    int delete(int id);

    /**
     * 更新
     * @author qingchuan
     * @date 2022/04/25
     **/
    int update(FilmActor filmActor);

    /**
     * 查询 根据主键 id 查询
     * @author qingchuan
     * @date 2022/04/25
     **/
    FilmActor load(int id);

    /**
     * 查询 分页查询
     * @author qingchuan
     * @date 2022/04/25
     **/
    List<FilmActor> pageList(int offset, int pagesize);

    /**
     * 查询 分页查询 count
     * @author qingchuan
     * @date 2022/04/25
     **/
    int pageListCount(int offset,int pagesize);

}
