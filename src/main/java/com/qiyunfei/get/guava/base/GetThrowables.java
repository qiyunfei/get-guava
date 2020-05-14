package com.qiyunfei.get.guava.base;

import com.google.common.base.Throwables;

public class GetThrowables {
    public static void main(String[] args) {
        Throwables.throwIfUnchecked(new Exception("11"));
    }
}
