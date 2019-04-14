package myspring.dao;

import myspring.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * Created by chenyingying on 2019/4/6.
 */

/**
 * 传统方式dao
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    @Override
    public User findUserById(int id) throws Exception {
        SqlSession session = getSqlSession();
        User user = session.selectOne("test.findUserById", id);
        //不能关闭SqlSession，让spring容器来完成
        //session.close();
        return user;
    }

}
