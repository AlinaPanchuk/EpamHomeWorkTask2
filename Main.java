package com.Epam.company.HomeWork2;

public class Main {

    public static void main(String[] args) {
        int number = 123;
        int firstNumber=number%10;
        int secondNumber=(number%100-firstNumber)/10;
        int thirdNumber=number/100;
        int reverseNumber=firstNumber*100+secondNumber*10+thirdNumber;
        int remainder=number-reverseNumber;
        System.out.println("Remainder = " + remainder);
    }
}