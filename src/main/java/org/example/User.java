package org.example;

public class User {
    String name;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
    }
    //methods
    public void sayHello(){
        System.out.println("Hi my name is "+ name);
    }


}
