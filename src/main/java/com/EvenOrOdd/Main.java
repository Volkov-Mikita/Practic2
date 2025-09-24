package com.EvenOrOdd;


public class Main {
    public static void main(String[] args) {
        System.out.println(EvenOrOdd(25));

    }

    static String EvenOrOdd(int number){
        if (number % 2 == 0){
            return "The number is even";
        }
        else {
            return "The number is odd";
        }
    }

}