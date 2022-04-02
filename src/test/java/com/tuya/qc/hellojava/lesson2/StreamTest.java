package com.tuya.qc.hellojava.lesson2;

import com.tuya.qc.hellojava.model.Person;
import lombok.extern.slf4j.Slf4j;
import cn.hutool.json.JSONUtil;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: my.deng@tuya.com
 * Date: 2022/3/16 20:13
 */
@Slf4j
public class StreamTest {
    public List<Person> arrayList = new ArrayList<>();

    @BeforeClass
    public void init() {
        arrayList.add(new Person("张三", 24));
        arrayList.add(new Person("李四", 3));
        arrayList.add(new Person("王五", 55, true));
        arrayList.add(new Person("赵六", 33, false));
        arrayList.add(new Person("钱七", 45, true));
    }

    @Test(description = "过滤30岁一下的人员，并返回list")
    public void filterByAgeTest() {
        List<Person> collect = arrayList.stream().filter(
                person -> person.getAge() < 30
        ).collect(Collectors.toList());
        log.info("collect: {}", JSONUtil.toJsonPrettyStr(collect));
    }


    @Test(description = "过滤有宠物的人员，并返回list")
    public void filterByPetTest() {
        List<Person> collect = arrayList.stream().filter(
                person -> (person.getHasPet() != null && person.getHasPet())
        ).collect(Collectors.toList());
        log.info("collect: {}", JSONUtil.toJsonPrettyStr(collect));
    }

    @Test(description = "获取姓名，并返回list")
    public void getNameTest() {
        List<String> collect = arrayList.stream().map(Person::getName).collect(Collectors.toList());
        log.info("collect: {}", JSONUtil.toJsonPrettyStr(collect));
    }

    @Test
    public void sortTest() {
        List<Person> collect = arrayList.stream().sorted(
                Comparator.comparing(Person::getAge)
        ).collect(Collectors.toList());

        log.info("collect: {}", JSONUtil.toJsonPrettyStr(collect));
    }

    @Test
    public void sortReverseTest() {
        List<Person> collect = arrayList.stream().sorted(
                Comparator.comparing(Person::getAge).reversed()
        ).collect(Collectors.toList());

        log.info("collect: {}", JSONUtil.toJsonPrettyStr(collect));
    }
}
