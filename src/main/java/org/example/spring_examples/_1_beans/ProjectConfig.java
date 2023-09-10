package org.example.spring_examples._1_beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    @Primary
    public Parrot parrotJohn() {
        return new Parrot("john");
    }

    @Bean(value = "emma")
    public Parrot parrotEmma() {
        return new Parrot("emma");
    }

    @Bean
    public Integer integer() {
        return 42;
    }
}
