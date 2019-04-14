package myspring.controller;

import myspring.dao.UserDao;
import myspring.mapper.UserMapper;
import myspring.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by chenyingying on 2019/4/6.
 */
public class Mybatis_first {

    private ApplicationContext applicationContext;
    @Before
    public void setUp() throws Exception{
        String configLocation = "classpath:applicationContext-*.xml";
        //初始化spring运行环境
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
    }


    /**
     * 传统方式dao
     * @throws Exception
     */
    @Test
    public void testFindUserById() throws Exception {
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = userDao.findUserById(1);
        System.out.println(user);
    }

    /**
     * Mapper代理形式
     */
    @Test
    public void testGetUserById() {
        UserMapper userMapper = applicationContext.getBean(UserMapper.class);
        User user = userMapper.getUserById(1);
        System.out.println(user);
    }


}
