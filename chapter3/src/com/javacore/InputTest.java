package com.javacore;

import java.io.Console;
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("what is your name?");
//        String name = in.nextLine();
//        System.out.println("How old are you?");
//        int age = in.nextInt();
//        System.out.println("hello,"+ name +".next year,you will be "+(age+1));
        Console cons = System.console();
        String username = cons.readLine();
        char[] passwd = cons.readPassword("Password: ");
    }
}


