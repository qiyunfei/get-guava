package com.qiyunfei.get.guava.collection;

import com.google.common.collect.ImmutableSet;

public class GetImmutableCollections {
    public static final ImmutableSet<String> COLOR_NAMES = ImmutableSet.of(
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "purple");

    public static void main(String[] args) {
        ImmutableSet<String> set1 = ImmutableSet.copyOf(COLOR_NAMES);
        System.out.println("set1:" + set1);
        ImmutableSet<String> set2 = ImmutableSet.of("1", "3", "2", "23", "2");
        System.out.println("set2:" + set2);
        ImmutableSet<String> set3 = ImmutableSet.<String>builder().addAll(set1).addAll(set2).add("wwww").build();
        System.out.println("set3:" + set3);
        ImmutableSet<String> set4 = ImmutableSet.<String>builderWithExpectedSize(1).add("11").add("1").add("3").add("12").add("2").build();
        System.out.println("set4:" + set4);
    }
}
