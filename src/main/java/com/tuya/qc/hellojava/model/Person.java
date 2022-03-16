package com.tuya.qc.hellojava.model;

import lombok.Data;

/**
 * Author: my.deng@tuya.com
 * Date: 2022/3/16 20:16
 */

@Data
public class Person {
    private String name;

    private Integer age;

    private String sex;

    private String personId;

    private Boolean hasPet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, boolean hasPet) {
        this.name = name;
        this.age = age;
        this.hasPet = hasPet;
    }
}
