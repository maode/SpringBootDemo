package com.code0.bootDemo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 测试加载properties文件中的参数
 */
@Configuration
@PropertySource(value = "classpath:test.properties")
@ConfigurationProperties(prefix = "profiles.test")
@Component
@Data
public class BootDemoProperties {
    @Value("${spring.profiles.active}")
    private String active;
    @Value("${profiles.test.name}")
    private String name;
    @Value("${profiles.test.title}")
    private String title;
    @Value("${profiles.test.test}")
    private String test;
    @Value("${profiles.test.value}")
    private String value;
}
