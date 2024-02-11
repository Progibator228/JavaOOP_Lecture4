package org.example;

import java.util.Arrays;

public class NumbersBox <B extends Number>  {

    private B [] numbers  ;

    public NumbersBox(B[] numbers) {
        this.numbers = numbers;
    }

    public double avarage() {
        double result = 0;
        for (B number : numbers) {
            result += number.doubleValue();
        }
        return result / numbers.length;
    }

    public boolean compaerAvarage (NumbersBox<?>  numbersBox){
        if (avarage() > numbersBox.avarage()){
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "NumbersBox{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
