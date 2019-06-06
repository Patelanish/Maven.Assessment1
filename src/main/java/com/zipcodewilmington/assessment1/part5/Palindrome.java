package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input) {

        int a = input.length();
        for (int i = 0; i < input.length(); i++) {
            for (int b = i + 2; b <= input.length(); b++) {
                a += ispalindrome(input.substring(i, b));

            }
        }
        return a;

    }


    private int ispalindrome(String substring) {

        for(int i = 0; i < substring.length()/ 2; i++) {
            if(substring.charAt(i) !=substring.charAt(substring.length() - 1 - i))
                return 0;
        }
        return 1;
    }
}



