package com.company;

public class Undergraduate extends Student{
    Academic tutor;

    public void setTutor(Academic tutor){
        if(tutor == null) throw new IllegalArgumentException();
        this.tutor = tutor;
    }

    public Academic getTutor(){
        return this.tutor;
    }

    public Undergraduate(String name, String email, String login, Academic academic){
        this.setName(name);
        this.setTutor(academic);
        this.setEmail(email);
        this.setLogin(login);
    }
}
