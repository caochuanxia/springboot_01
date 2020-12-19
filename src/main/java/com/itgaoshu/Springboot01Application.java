package com.itgaoshu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication //此注解包含了@Componentscan(扫描包)注解,所以要求自定义的类必须和项目主入口类同级或在子级目录下
@MapperScan("com.itgaoshu.mapper")
@EnableCaching //开启缓存
public class Springboot01Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot01Application.class, args);
    }

}
