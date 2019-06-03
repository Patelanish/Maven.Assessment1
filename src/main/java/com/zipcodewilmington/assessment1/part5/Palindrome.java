package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){

        String a;
        int countSubs = toString().length();
        for(int i = 0; i < toString().length(); i++){
            for (int j = i+ 2; j <= toString().length(); j++){
                a = toString().substring(i,j);
                countSubs +=count(a);

            }
        }
        return countSubs;
    }
    public static int count(String a){
        for (int i = 0; i <a.length(); i++) {
            if (a.charAt(i) != a.charAt(a.length() - 1 - i))
                return 0;
            }
        return 1;

        }
    }



