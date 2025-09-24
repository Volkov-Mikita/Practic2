package com.VowelCount;

public class Main {
    public static void main(String[] args) {
        String s = "Some string with many letters";
        System.out.println(getCount(s));
    }

    static int getCount(String s){
        int count = 0;
        for (char c:s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
        }
        return count;
    }

}
