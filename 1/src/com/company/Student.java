package com.company;

public class Student extends  Person implements Notifiable {
    private String login, email;

    public Student(){}

    public Student(String login, String email){
        this.email = email;
        this.login = login;
    }
    @Override
    public void notify(String message){
        System.out.println(this.toString());
    }

    public void setLogin(String login){
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin(){
        return this.login;
    }

    public String getEmail(){
        return this.email;
    }

    @Override
    public String toString(){
        return super.toString() + " " + this.email + " " + this.login;
    }
}
