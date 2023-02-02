package ru.gb.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserDAO userDAO = context.getBean(UserDAO.class);
//        userDAO.addUser();
//        userDAO.deleteUser();
//        userDAO.updateUser();
//        userDAO.getAllUsers();

//        System.out.println(userDAO.getX());
//        userDAO.setX(10);
        System.out.println(userDAO.getAllUsers());
        context.close();
    }
}
