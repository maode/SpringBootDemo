package com.code0.bootDemo.repository;

import com.code0.bootDemo.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Code0
 * @description 用户信息持久层
 * @create 2018-03-08 19:04
 */
public interface UserInfoDao extends JpaRepository<UserInfo,Long> {
    /**根据userNames属性查找用户
     * @param userName
     * @return
     */
    public UserInfo findByUsername(String userName);
}
