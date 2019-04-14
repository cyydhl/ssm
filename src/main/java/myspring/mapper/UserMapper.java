package myspring.mapper;

import myspring.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * Created by chenyingying on 2019/4/6.
 */
@Repository
public interface UserMapper {
   public User getUserById(int i);
}
