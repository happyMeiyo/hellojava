package com.tuya.qc.hellojava.lesson2;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Author: my.deng@tuya.com
 * Date: 2022/3/16 19:52
 */

@Slf4j
public class ForEachTest {
    public List<String> arrayList = new ArrayList<>();
    public String[] strings = new String[]{"111", "222", "333"};
    public HashMap<String, Integer> prices = new HashMap<>();

    @BeforeClass
    public void init(){
        arrayList.add("aaaa");
        arrayList.add("bbbb");
        arrayList.add("cccc");

        prices.put("shoes", 200);
        prices.put("bag", 300);
        prices.put("pant", 150);
    }

    @Test
    public void forEachTest() {
        arrayList.forEach(string -> System.out.println("string:" + string));

        for(String str: strings){
            System.out.printf("string is %s\n", str);
        }

        for (String string : strings) {
            System.out.printf("string: %s\n", string);
        }

        prices.forEach((key, value)-> log.info("key: {}}, value:{}", key, value));


    }

}
