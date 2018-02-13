package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int next = i + 1;
        int prev = i - 1;
        System.out.println("The next number for the number " + i + " is " + next + ".\nThe previous number for the number " + i + " is " + prev + ".");
    }
}
