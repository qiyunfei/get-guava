package com.qiyunfei.get.guava.base;

import com.google.common.collect.Lists;
import com.qiyunfei.get.guava.base.model.User;

import java.util.Comparator;
import java.util.Objects;

public class GetObjects {
    public static void main(String[] args) {
        User user1 = new User(1L, "宝儿姐", Lists.newArrayList(2L, 3L));
        User user2 = new User(2L, "宝儿姐", Lists.newArrayList(2L, 3L));

        int compare = Objects.compare(user1, user2, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getUserId().compareTo(o2.getUserId());
            }
        });
        System.out.println("compare:" + compare);

        Boolean deepEquals = Objects.deepEquals(user1, user2);
        System.out.println("deepEquals:" + deepEquals);

        Boolean equals = Objects.equals(user1, user2);
        System.out.println("equals:" + equals);

        int hash = Objects.hash(user1.getUserId(), user1.getUserName());
        System.out.println("hash:" + hash);
        int hash2 = Objects.hash(user1.getUserId(), user1.getUserName(), user1.getObsevers());
        System.out.println("hash2:" + hash2);

        int hashCodeUser1 = Objects.hashCode(user1);
        int hashCodeUser2 = Objects.hashCode(user2);
        System.out.println("hashCodeUser1:" + hashCodeUser1);
        System.out.println("hashCodeUser2:" + hashCodeUser2);
        System.out.println("user1:" + user1.hashCode());
        System.out.println("user2:" + user2.hashCode());

        boolean isNull = Objects.isNull(user1);
        System.out.println("isNull:" + isNull);

        boolean nonNull = Objects.nonNull(user1);
        System.out.println("nonNull:" + nonNull);

    }
}
