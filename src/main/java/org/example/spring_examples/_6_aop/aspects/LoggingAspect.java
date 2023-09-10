package org.example.spring_examples._6_aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@Order(2)
public class LoggingAspect {
    @Around("execution(void org.example.spring_examples._6_aop.*.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Calling function: " + joinPoint.getSignature().getName());
        System.out.println("Provided args: " + Arrays.toString(joinPoint.getArgs()));
        joinPoint.proceed();
        System.out.println("Done.");
    }
}
