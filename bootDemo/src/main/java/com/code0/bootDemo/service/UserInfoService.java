package com.code0.bootDemo.service;


import com.code0.bootDemo.entity.UserInfo;

public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}