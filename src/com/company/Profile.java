package com.company;

import javax.xml.soap.SOAPPart;

public class Profile {
    private String firstName;
    private String lastName;
    private int age;
    private User user;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void toPrint(){
        System.out.println("Пользователь: "+firstName+" " +lastName+" "+age+"лет");
    }


}
