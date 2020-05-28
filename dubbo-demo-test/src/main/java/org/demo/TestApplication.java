package org.demo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: 启动类
 * @Author MengQingHao
 * @Date 2020/5/27 7:01 下午
 */
@Slf4j
@SpringBootApplication
@EnableDubboConfiguration
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class);
        log.info(" springBoot run success ");
    }
}
