package Lesson3.Task29;

import java.util.Scanner;

class DigitsDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = input.nextInt();
        Digits digits = new Digits(number);
        digits.countDigits();
    }
}
