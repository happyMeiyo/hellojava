package com.tuya.lesson.java.dto;

import lombok.Data;

/**
 * Author: my.deng@tuya.com
 * Date: 2022/5/5 14:43
 */

@Data
public class QueryActorDto {
    private String firstName;
    private String lastName;
    private int actorId;

    int pageNum;
    int pageSize;
}
