package myspring.dao;

import myspring.pojo.User;

/**
 * Created by chenyingying on 2019/4/6.
 */
public interface UserDao {
    public User findUserById(int id) throws Exception;
}
