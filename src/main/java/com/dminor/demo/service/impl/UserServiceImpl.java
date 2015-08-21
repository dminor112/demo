package com.dminor.demo.service.impl;

import java.util.List;

import com.dminor.demo.dao.IUserDao;
import com.dminor.demo.model.User;
import com.dminor.demo.service.UserService;

public class UserServiceImpl implements UserService {

    private IUserDao userDao;
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    public int deleteById(String id) {
        int i = userDao.deleteById(id);
                //测试事务
//        int j = 1/0;
        return i;
    }

    public User get(String id) {
        return userDao.get(id);
    }

    public int insert(User u) {
        return userDao.insert(u);
    }

    public List<User> list() {
        return userDao.list();
    }

    public int update(User u) {
        return userDao.update(u);
    }

}