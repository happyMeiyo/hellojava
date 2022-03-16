package com.tuya.qc.hellojava.service;

import com.tuya.qc.hellojava.dto.PersonDto;

/**
 * Author: my.deng@tuya.com
 * Date: 2022/3/15 15:36
 */
public interface HelloService {
    String doHello();

    String doHello(String name);

    String doHello(String name, int age);

    String doHello(PersonDto personDto);
}
