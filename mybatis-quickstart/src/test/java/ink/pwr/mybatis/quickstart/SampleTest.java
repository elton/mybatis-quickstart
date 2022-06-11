package ink.pwr.mybatis.quickstart;

import ink.pwr.mybatis.quickstart.entity.User;
import ink.pwr.mybatis.quickstart.mapper.UserMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SampleTest {

  @Autowired private UserMapper userMapper;

  @Test
  public void testSelect() {
    System.out.println("---- selectAll ----");
    List<User> userList = userMapper.selectList(null);
    Assertions.assertEquals(5, userList.size());
    userList.forEach(System.out::println);
  }
}
