package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
@ComponentScan(basePackages = "org.example")
public class Config {
    @Bean
    public Person Amir(){
        Person person = new Person();
        person.setName("Amir");
        return person;
    }
    @Bean
    @Primary
    public Person Aziz(){
        Person person = new Person();
        person.setName("Aziz");
        return person;
    }
    @Bean
    public Person Kolya(){
        Person person = new Person();
        person.setName("Kolya");
        return person;
    }
    @Bean
    public Turtle Leonardo(){
        Turtle turtle = new Turtle();
        turtle.setName("Leonardo");
        return turtle;
    }
    @Bean
    public Turtle Mikelanjelo(){
        Turtle turtle = new Turtle();
        turtle.setName("Mikelanjelo");
        return turtle;
    }
    @Bean
    public Turtle Mikey(){
        Turtle turtle = new Turtle();
        turtle.setName("Mikey");
        return turtle;
    }
}
