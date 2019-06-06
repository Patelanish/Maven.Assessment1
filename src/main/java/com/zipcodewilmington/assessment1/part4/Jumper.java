package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int n) {

        int result = k%n + k/n;
        return result;

    }
}
