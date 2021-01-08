package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int ageLimit = 18;

        System.out.println("How old are you?");

        int age = Integer.parseInt(userInput.nextLine());

        if (age < ageLimit){
            System.out.println("You are too young! Sorry!");
            System.exit(0);
        } else {
            //Program continues as normal because they past the age test!
        }
    }
}
