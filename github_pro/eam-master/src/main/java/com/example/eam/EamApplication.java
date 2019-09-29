package com.example.eam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @version 1.0.0
 * @Author 凌波水月
 * @date 2019/9/28 13:08
 */
@SpringBootApplication
@EnableCaching
@EnableSwagger2
@EnableConfigurationProperties
@MapperScan("com.example.eam.mapper")
public class EamApplication {
    public static void main(String[] args) {
        SpringApplication.run(EamApplication.class, args);
    }
}
