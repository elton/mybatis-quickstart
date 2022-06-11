package ink.pwr.mybatis.quickstart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("ink.pwr.mybatis.quickstart.mapper")
public class QuickStartApplication {

  public static void main(String[] args) {
    SpringApplication.run(QuickStartApplication.class, args);
  }
}
