package com.gome.simple.service;

import com.gome.simple.dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author LiTao
 * @Date 2016-11-24
 * @Email litao28@gome.com.cn
 * @Desc
 */
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<String> getAll(){
        return userDao.getAll();
    }
}
