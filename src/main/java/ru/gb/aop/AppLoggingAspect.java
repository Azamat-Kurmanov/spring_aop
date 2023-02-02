package ru.gb.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class AppLoggingAspect {
//    @Before("execution(public void ru.gb.aop.UserDAO.addUser())") // pointcut expression
//    public void beforeAddUserInDAOClass() {
//        System.out.println("AOP: Поймали добавление пользователя");
//    }
//
//    @Before("execution(public void ru.gb.aop.UserDAO.*User())") // pointcut expression
//    public void beforeUserModifyInUserDAOClass() {
//        System.out.println("AOP: работа с пользователем в UserDAO");
//    }
//
//    @Before("execution(public void ru.gb.aop.UserDAO.*())") // pointcut expression
//    public void beforeAnyMethodWithoutArgsInUserDAOClass() {
//        System.out.println("AOP: любой void метод без аргументов из UserDAO");
//    }
//
//    @Before("execution(public void ru.gb.aop.*.*(..))") // pointcut expression
//    public void beforeAnyMethodInUserDAOClass() {
//        System.out.println("AOP: любой метод без аргументов из UserDAO");
//    }

//    @Before("execution(public void ru.gb.aop.UserDAO.*(..))") // pointcut expression
//    public void beforeAnyMethodInUserDAOClassWithDetails(JoinPoint joinPoint) {
//        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
//        System.out.println("В UserDAO был вызван метод: " + methodSignature);
//        Object[] args = joinPoint.getArgs();
//        if (args.length > 0){
//            System.out.println("Аргументы");
//            for (Object o: args){
//                System.out.println(o);
//            }
//        }
//    }

//    @AfterReturning(
//            pointcut = "execution(public * ru.gb.aop.UserDAO.getAllUsers(..))",
//            returning = "result")
//    public void afterGetBobInfo(JoinPoint joinPoint, List<String> result) {
//        result.set(0, "Donald Duck");
//    }

    //----Вылавливает исключения с ошибками---
//    @AfterThrowing(
//            pointcut = "execution(public * ru.gb.aop.UserDAO.*(..))",
//            throwing = "exc")
//    public void afterThrowing(JoinPoint joinPoint, Throwable exc) {
//        System.out.println(exc);
//    }

//    @After("execution(public * ru.gb.aop.UserDAO.*(..))")
//    public void afterMethod() {
//        System.out.println("After");
//    }

    //----Определяет за какое время выполняются методы с возвратом результата
//    @Around("execution(public * ru.gb.aop.UserDAO.*(..))")
//    public Object methodProfiling(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("start profiling");
//        long begin = System.currentTimeMillis();
//        Object out = proceedingJoinPoint.proceed();
//        long end = System.currentTimeMillis();
//        long duration = end - begin;
//        System.out.println(proceedingJoinPoint.getSignature() + " duration: " + duration);
//        System.out.println("end profiling");
//        return out;
//    }
}
