package com.tuya.lesson.java.dto;

import com.tuya.lesson.java.entity.Actor;
import lombok.Data;

import java.util.List;

/**
 * Author: my.deng@tuya.com
 * Date: 2022/5/5 15:58
 */

@Data
public class QueryActorVo {
    int total;
    private List<Actor> data;
    int pageNum;
    int pageSize;
}
