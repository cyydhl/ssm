package myspring.service;

import myspring.dao.UserDao;
import myspring.mapper.UserMapper;
import myspring.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chenyingying on 2019/4/6.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserById(String id) {
        return userMapper.getUserById(Integer.parseInt(id));
    }
}
