package com.epam.IharKoshman.git;

import java.util.Scanner;

/**
 * Create a simple program and share it on Gitlab. Add changes via creating a merge request.
 * Write a simple Java program that reads a name from the standard input and prints "Hello, name".
 */

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name to be greeted: ");
        String name = scan.nextLine();

        print(name);

    }
    public static void print(String name) {
        System.out.println("Hello, " + name);
    }
}
