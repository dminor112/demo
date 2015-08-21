package com.dminor.demo.dao.impl;

import java.util.List;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import com.dminor.demo.dao.IUserDao;
import com.dminor.demo.model.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements IUserDao {
    
    //删除
    public int deleteById(String id) {
        return this.getSqlSession().delete("com.dminor.demo.model.User.delete",id);
    }

    //新增
    public int insert(User u) {
        return this.getSqlSession().insert("com.dminor.demo.model.User.create", u);
    }

    //列表
    public List<User> list() {
        return this.getSqlSession().selectList("com.dminor.demo.model.User.listAll");
    }

    //修改
    public int update(User u) {
        return this.getSqlSession().update("com.dminor.demo.model.User.update",u);
    }

    //获取对象
    public User get(String id) {
        return (User) this.getSqlSession().selectOne("com.dminor.demo.model.User.get", id);
    }

}