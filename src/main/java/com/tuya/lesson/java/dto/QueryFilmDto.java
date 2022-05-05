package com.tuya.lesson.java.dto;

import lombok.Data;

/**
 * Author: my.deng@tuya.com
 * Date: 2022/5/5 16:24
 */

@Data
public class QueryFilmDto {
    private int actorId;
    private int filmId;

    int pageNum;

    int pageSize;

}
