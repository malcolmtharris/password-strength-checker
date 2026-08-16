package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PasswordChecker checker = new PasswordChecker();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a password:");
        String password = scanner.nextLine();

        System.out.println(checker.rateStrength(password));

    }
}