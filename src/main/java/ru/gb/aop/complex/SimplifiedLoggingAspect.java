package ru.gb.aop.complex;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
//@Order(-100)
public class SimplifiedLoggingAspect {
    @Before("execution(public * ru.gb.aop.UserDAO.*())")
    public void allMethodsCallsLogging() {
        System.out.println("В классе вызывают метод (Logging)");
    }
}
