package org.example.spring_examples._6_aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class SecurityAspect {

    @Before("@annotation(Protected)")
    public void secure() {
        System.out.println("Checking credentials....");
        System.out.println("secure!");
    }
}
