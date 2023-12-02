package org.example;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        User user1 = new User("Virajini", 28);
        user.name = "chethana";
        System.out.println(user.name);
        System.out.println(user1.name);

        user.sayHello();
    }
}