package com.spring.beans;

import com.spring.beans.basic.BasicBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeansApplication {
    public static void main(String[] args) {
        SpringApplication.run(BeansApplication.class, args);
    }

    @Bean
    CommandLineRunner showBeanExamples(ApplicationContext context, BasicBean basicBean) {
        return args -> {
            System.out.println("\n=== Spring Beans Demo ===");
            System.out.println(basicBean.greet());
            System.out.println("GreetingService bean: " + context.getBean(GreetingService.class).greet("Spring Developer"));
            System.out.println("Singleton same instance: " + (context.getBean(SingletonBean.class) == context.getBean(SingletonBean.class)));
            System.out.println("Prototype different instances: " + (context.getBean(PrototypeBean.class) != context.getBean(PrototypeBean.class)));
            System.out.println("=========================\n");
        };
    }
}
