package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Person person = context.getBean("Amir", Person.class);
        Person person1 = context.getBean("Kolya", Person.class);
        Person person2 = context.getBean("Aziz", Person.class);

        System.out.println("Owner: " + person.getName());
        System.out.println("Owner: " + person1.getName());
        System.out.println("Owner: " + person2.getName());

        Turtle turtle = context.getBean("Leonardo", Turtle.class);
        Turtle turtle1 = context.getBean("Mikelanjelo", Turtle.class);
        Turtle turtle2 = context.getBean("Mikey", Turtle.class);

        System.out.println("\nTurtles:");
        System.out.println(turtle.getName());
        System.out.println(turtle1.getName());
        System.out.println(turtle2.getName());
    }
}