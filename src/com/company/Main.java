package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Profile operator=new Profile();
        operator.setFirstName("Ivanov");
        operator.setLastName("Ivan");
        operator.setAge(25);
        User user1 = new User("IvIv","123");

        System.out.println(operator.toString());

    }

}
