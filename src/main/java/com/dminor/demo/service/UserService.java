package com.dminor.demo.service;

import java.util.List;

import com.dminor.demo.model.User;

public interface UserService {
    public List<User> list();
    public User get(String id);
    public int insert(User u);
    public int update(User u);
    public int deleteById(String id);
}