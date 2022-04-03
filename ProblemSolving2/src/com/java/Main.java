package com.java;

public class Main {

    public static void main(String[] args) {
        String str = "kadal", reverseStr = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
//    public static void main(String[] args) {
//        int num = -383, reversedNum = 0, remainder;
//
//        int originalNum = num;
//        if (num<0){
//            System.out.println("false");
//            System.exit(0);
//        }
//        while (num != 0) {
//            remainder = num % 10;
//            reversedNum = reversedNum * 10 + remainder;
//            num /= 10;
//        }
//        if (originalNum == reversedNum) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }
//    }
    }
