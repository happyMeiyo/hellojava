package com.tuya.qc.hellojava.controller;

import com.tuya.qc.hellojava.config.LessonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: my.deng@tuya.com
 * Date: 2022/4/2 14:05
 */
@RestController
@RequestMapping("api2/")
public class SecondController {

    @Autowired
    LessonConfig lessonConfig;

    // http://localhost:12345/api2/get_count
    @GetMapping("/get_count")
    public Integer getCount(){
        return lessonConfig.getCount();
    }

    @GetMapping("/get_info")
    public String getInfo(){
        return String.format("name: %s, count: %d", lessonConfig.getName(), lessonConfig.getCount());
    }

}
