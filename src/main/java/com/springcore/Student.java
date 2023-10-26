package com.springcore;

import org.springframework.beans.factory.annotation.Value;

public class Student {

    // No need of setter methods if using @value on field declaration
    @Value("${student.name}")
    private String name;
    @Value("${student.interestedCourse}")
    private String interestedCourse;
    @Value("${student.hobby}")
    private String hobby;


    public void getStudentInfo(){
        System.out.println("Student name is "+name);
        System.out.println("Student is interested in  "+interestedCourse);
        System.out.println("Student having hobby "+hobby);

    }

}


// If we add @Value annotation on setter methods it is use setter methods to set the values
// instead use the @value annotation above each feild declaration so that will not need to create the setter methods
/*    @Value("${student.name}")
    public void setName(String name) {
        this.name = name;
        System.out.println("Student.setName  setter is called");
    }


    @Value("${student.interestedCourse}")
    public void setInterestedCourse(String interestedCourse) {
        this.interestedCourse = interestedCourse;
        System.out.println("Student.setInterestedCourse setter is called");
    }

    @Value("${student.hobby}")
    public void setHobby(String hobby) {
        this.hobby = hobby;
        System.out.println("Student.setHobby setter is called");
    }*/
