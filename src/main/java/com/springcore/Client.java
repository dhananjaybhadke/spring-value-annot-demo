package com.springcore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student stu = context.getBean("student", Student.class);
        stu.getStudentInfo();
    }
}