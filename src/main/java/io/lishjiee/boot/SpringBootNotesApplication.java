package io.lishjiee.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//添加扫描mybatis的dao层接口，生成实现类
@MapperScan(value = "io.lishijiee.boot.mapper")
public class SpringBootNotesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootNotesApplication.class, args);
    }

}
