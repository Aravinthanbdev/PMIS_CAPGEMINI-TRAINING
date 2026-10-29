package com.spring.beans;

import com.spring.beans.basic.BasicBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BeansApplicationTests {
    @Autowired BasicBean basicBean;
    @Autowired GreetingService greetingService;

    @Test
    void contextLoadsAndBeansWork() {
        assertThat(basicBean.greet()).isEqualTo("Hello, Spring Bean!");
        assertThat(greetingService.greet("Test")).contains("Hello, Test");
    }
}
