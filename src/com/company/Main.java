package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("IvIv","123");
        User user2 = new User("Petr","456");
        Profile operator=new Profile("Ivanov","Ivan",25,user1,1);
        Profile buh=new Profile("Petrova","Olga",45,user2,2);

        System.out.println(operator.toString());
        System.out.println(buh.toString());

        if (operator.hashCode()==buh.hashCode())
        {
          if (operator.equals(buh)){
              System.out.println("Профили идентичны");
          }
        }
        else
        {
          System.out.println("Профили не идентичны");
        }

    }

}
