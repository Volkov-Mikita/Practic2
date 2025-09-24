package com.SquareEveryDigit;


public class Main {
    public static void main(String[] args) {
        System.out.println(SquareEveryDigit(133));
    }

    static int SquareEveryDigit(int value){
        String result = "";

        for (char c: String.valueOf(value).toCharArray()){
            int number = Character.getNumericValue(c);
            result += (number * number);
        }
        return Integer.parseInt(result);
    }

}
