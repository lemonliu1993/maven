package com.lemon.mavenjava;

/**
 * Created by lemoon on 2024/9/8 20:22
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(18);
        user.setName("lisi");
        user.setSalary(40000.0);
        System.out.println(user);
    }
}
