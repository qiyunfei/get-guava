package com.qiyunfei.get.guava.base;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

import java.util.Collections;
import java.util.List;

public class GetOrdering {
    public static void main(String[] args) {
        List<String> list = Lists.newArrayList("123", "sswew", "grdf", "sdf", "ll");
        Collections.sort(list, Ordering.natural());
        System.out.println("Ordering.natural():" + list);
        Collections.sort(list, Ordering.usingToString());
        System.out.println("Ordering.usingToString():" + list);
        Collections.sort(list, Ordering.usingToString().reverse());
        System.out.println("Ordering.usingToString().reverse():" + list);

        int i = Ordering.natural().min(1,2,3);
        System.out.println("Ordering.natural().min:" + i);
        boolean isOrdered = Ordering.natural().isOrdered(Lists.newArrayList(1,2,3,4,6));
        System.out.println("Ordering.natural().isOrdered:" + isOrdered);
    }
}
