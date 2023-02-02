package ru.gb.aop;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class PointcutDeclarationAspect {
    @Pointcut("execution(public * ru.gb.aop.UserDAO.get*(..))")
    public void userDAOGetTrackerPointcut() {
    }

    @Pointcut("execution(public * ru.gb.aop.UserDAO.set*(..))")
    public void userDAOSetTrackerPointcut() {
    }

    @Pointcut("userDAOGetTrackerPointcut() || userDAOSetTrackerPointcut()")
    public void userDAOGetOrSetTrackerPointcut() {
    }

    @Before("userDAOGetOrSetTrackerPointcut()")
    public void userDAOGetOrSetTracker() {
        System.out.println("В классе UserDAO вызывают геттер и сеттер");
    }
}
