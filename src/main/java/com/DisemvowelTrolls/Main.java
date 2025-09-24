package com.DisemvowelTrolls;

public class Main {
    public static void main(String[] args) {
        String s = "Some bad string with many letters";
        System.out.println(newString(s));
    }

    static String newString(String s){
        return s.replaceAll("[a,e,u,i,o,A,E,U,I,O]", "");
    }

}
