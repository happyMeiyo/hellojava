package com.tuya.qc.hellojava.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Author: my.deng@tuya.com
 * Date: 2022/4/2 13:50
 */
@Data
@Configuration
@ConfigurationProperties(value = "lesson")
public class LessonConfig {
    public String name;
    public Integer count;

}
