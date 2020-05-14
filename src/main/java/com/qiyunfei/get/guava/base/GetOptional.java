package com.qiyunfei.get.guava.base;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;

import java.util.List;

public class GetOptional {


    public static void main(String[] args) {
        /**
         *     静态方法
         *         Optional.of(T)                   创建指定引用的Optional实例，若引用为null则快速失败
         *         Optional.absent()	            创建引用缺失的Optional实例
         *         Optional.fromNullable()          创建指定引用的Optional实例，若引用为null则表示缺失
         *         Optional.presentInstances()      把非缺失的引用转换为相应的Iterable
         *         Optional.toJavaUtil()            guava转java的Optional
         *         Optional.fromJavaUtil()          java转guava的Optional
         */
        try {
            Optional optionalNull = Optional.of(null);
        } catch (Exception e) {
            System.out.println("optionalNull is null throw exception:" + e.getMessage());
            e.printStackTrace();
        }
        Optional optionalNotNull = Optional.of(1);
        System.out.println("optionalNotNull:" + optionalNotNull.isPresent());
        Optional absent = Optional.absent();
        System.out.println("absent:" + absent.isPresent());
        java.util.Optional javaOptional = java.util.Optional.of(2);
        Optional fromJava = Optional.fromJavaUtil(javaOptional);
        javaOptional = Optional.toJavaUtil(fromJava);

        Optional<Integer> fromNullableNotNull = Optional.fromNullable(4);
        Optional<Integer> fromNullableNull = Optional.fromNullable(null);
        System.out.println("fromNullableNotNull:" + fromNullableNotNull.get());
        System.out.println("fromNullableNull:" + fromNullableNull.isPresent());

        Optional<Integer> optionalOf = Optional.fromNullable(5);
        System.out.println(optionalOf.isPresent());
        System.out.println(optionalOf.get());
        System.out.println(optionalOf.asSet());
        System.out.println(optionalOf.or(3));
        System.out.println(optionalOf.orNull());
        System.out.println(optionalOf.transform(e -> "kkk:" + e.doubleValue()).get());

        List<Optional<Long>> l = Lists.newArrayList(
                Optional.fromNullable(1L),
                Optional.fromNullable(null),
                Optional.fromNullable(3L),
                Optional.fromNullable(4L),
                Optional.fromNullable(null));
        Iterable<Long> presentInstances = Optional.presentInstances(l);
        for (Long ll : presentInstances) {
            System.out.println(ll);
        }
    }
}
