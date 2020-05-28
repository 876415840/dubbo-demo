package org.demo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: 启动类
 * @Author MengQingHao
 * @Date 2020/5/28 11:02 上午
 */
@Slf4j
@SpringBootApplication
@EnableDubboConfiguration
public class ProductApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProductApplication.class);
        log.info(" springBoot run success ");
    }
}
