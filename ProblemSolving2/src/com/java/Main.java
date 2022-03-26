package com.java;

import java.util.ArrayList;

public class Main {

    public static boolean palindrome(int number)
    {
        if (number < 0)
            return false;

        ArrayList<Integer> digits = new ArrayList<Integer>();
        while (number > 0) {
            digits.add(number % 10);
            number /= 10;
        }
        for (int i = 0, j = digits.size()-1; i < j; i++, j--) {
            if (digits.get(i) != digits.get(j))
                return false;
        }

        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(palindrome(171));
        System.out.println(palindrome(-171));
        System.out.println(palindrome(10));
    }
}
