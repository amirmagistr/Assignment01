package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Turtle {
    private String name;
    @Autowired
    private Person person;

    public Turtle(){}
    public Turtle(String name, Person person){
        this.name = name;
        this.person = person;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Person getPerson(){
        return person;
    }
    public void setPerson(Person person){
        this.person = person;
    }
}
