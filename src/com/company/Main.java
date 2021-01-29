package com.company;

public class Main {

    public static void main(String[] args) {
        double [] array={-7.1,-6.1,-5.1, -4.1,-3.1,-2.1, -1.1,0.1, 1.1, 2.1, 3.1, 4.1, 5.1, 6.1, 7.1,};
        double sum=0;
        double col = 0;
        boolean k =false;
        for (double num:array )
        {
            if (num<0){
                k = true;
            }
            else {
                sum+= num;
                col++;
        }

    }
        System.out.println(sum/col);
}}
