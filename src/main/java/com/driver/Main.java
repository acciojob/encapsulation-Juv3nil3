package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        //member has private access in com.driver.RWOnly

        obj.setName("New name");
        System.out.println(obj.getName());
    }
}