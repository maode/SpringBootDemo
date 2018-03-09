package com.code0.bootDemo.service.impl;

import com.code0.bootDemo.entity.UserInfo;
import com.code0.bootDemo.repository.UserInfoDao;
import com.code0.bootDemo.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}