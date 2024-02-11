package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


//        SimpleBox intBox1 = new SimpleBox(10);
//        SimpleBox intBox2 = new SimpleBox(20);
//        int sum = (Integer)intBox1.getObj() + (Integer)intBox2.getObj();
//        System.out.println(sum);
//
//        GenBox <Integer> genbox1 = new GenBox<>(30);
//        GenBox <Integer> genbox2 = new GenBox<>(80);
//        System.out.println(genbox1.getObg() + genbox2.getObg());
//
//        GenBox <String> genbox3 = new GenBox<>("Кек");
//        GenBox <String> genbox4 = new GenBox<>("ЛОЛ");
//        System.out.println(genbox3.getObg()+ " " +genbox4.getObg());



//        Double [] array1 = {1.0,2.0,3.0};
//        NumbersBox <Double>  numbersBox = new NumbersBox<>(array1);
//        System.out.println("numbersBox.avarage() = " + numbersBox.avarage());
//
//        Integer [] array2 = {1,2,3};
//        NumbersBox <Integer>  numbersBo2 = new NumbersBox<>(array2);
//        System.out.println("numbersBox.avarage() = " + numbersBo2.avarage());
//
//        System.out.println("numbersBox.compaerAvarage(numbersBo2) = " + numbersBox.compaerAvarage(numbersBo2));
//

        List<Integer> array66 = new ArrayList<>();
        array66.add(12);
        array66.add(13);

        int  [] array2 = {10,20,30};
        System.out.println("Calculator.sum(array66) = " + Calculator.sum(array66));

        System.out.println("Calculator.sumMultiplication(2,4) = " + Calculator.sumMultiplication(2, 4));

        System.out.println("Calculator.sumDivision(20,5) = " + Calculator.sumDivision(20, 5));


        System.out.println("Calculator.binaryTranslation(357) = " + Calculator.binaryTranslation(357));
        System.out.println("Calculator.binaryTranslation(357) = " + Calculator.binaryTranslation("357"));


    }



}