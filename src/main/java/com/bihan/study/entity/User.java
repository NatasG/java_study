package com.bihan.study.entity;

public class User {

    private String userName;
    private int age;




    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString(String name,int age){
        return  "{\"name\":\""+name+"\".\"age\":"+age+"}";
    }


}
