package com.qiyunfei.get.guava.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class User {
    private Long userId;
    private String userName;
    private List<Long> obsevers;
}
