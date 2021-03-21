package org.wjlrn.vhr2;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan(basePackages = "org.wjlrn.vhr2.mapper")
public class Vhr2Application {

    public static void main(String[] args) {
        SpringApplication.run(Vhr2Application.class, args);
    }

}
