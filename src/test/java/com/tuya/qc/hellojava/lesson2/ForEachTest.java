package com.tuya.qc.hellojava.lesson2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: my.deng@tuya.com
 * Date: 2022/3/16 19:52
 */


public class ForEachTest {
    public List<String> arrayList = new ArrayList<>();

    {
        arrayList.add("aaaa");
        arrayList.add("bbbb");
        arrayList.add("cccc");
    }

    @Test
    public void forEachTest() {
        arrayList.forEach(string -> System.out.println("string:" + string));
    }

}
