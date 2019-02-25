package com.company;

public class Postgraduate extends Student{
    Academic supervisor;

    public void setSupervisor(Academic supervisor){
        if(supervisor == null) throw new IllegalArgumentException();
        this.supervisor = supervisor;
    }

    public Academic getSupervisor(){
        return this.supervisor;
    }

    public Postgraduate(String name, String email, String login, Academic academic){
        this.setName(name);
        this.setSupervisor(academic);
        this.setEmail(email);
        this.setLogin(login);
    }

}
