package com.qiyunfei.get.guava.base;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;

import java.util.List;

public class GetPreConditions {
    public static void main(String[] args) {
        int i = -1;
        int j = 2;
        try {
            Preconditions.checkArgument(i >= 0, "错误");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Preconditions.checkArgument(i >= j, "Expected i < j, but %s > %s", i, j);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<Integer> s = Lists.newArrayList(1, 2, 3, 4);
        try {
            Preconditions.checkElementIndex(7, s.size(), "越界");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Preconditions.checkPositionIndex(7, s.size(), "越界");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Preconditions.checkPositionIndexes(1, 5, s.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Preconditions.checkNotNull(null,"NULL");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Preconditions.checkState(i==j,"NULL");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Preconditions.
    }
}
