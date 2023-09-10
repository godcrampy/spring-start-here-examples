package org.example.spring_examples._3_wiring_beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.spring_examples._3_wiring_beans")
public class ProjectConfig {

    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot("kiki");
        return p;
    }

    @Bean(name = "emma")
    public Parrot parrotEmma() {
        Parrot p = new Parrot("emma");
        return p;
    }
}
