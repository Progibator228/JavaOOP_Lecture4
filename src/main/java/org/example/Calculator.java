package org.example;


import java.util.ArrayList;
import java.util.List;


public class Calculator {




    public static double sum(List<? extends Number> numbers) {
        double result = 0;
        for (Number number : numbers) {
            result += number.doubleValue();
        }
        return result;
    }

    public static double sumMultiplication(int value1, int value2) {
        double result = 0;
        return result = value1 * value2;
    }

    public static double sumDivision(int value1, int value2) {
        double result = 0;
        if (value1 < value2) {
            System.out.println("Ч");
        }
        return result = value1 / value2;
    }

    public static String binaryTranslation(Integer value ){
        String result ;
        result = Integer.toBinaryString(value);
        return result;
    }
    public static String binaryTranslation(String value ){
        String result ;
        int data = Integer.parseInt (value);
        result = Integer.toBinaryString(data);
        return result;
    }





}
