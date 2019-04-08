package com.company;


import com.company.utils.Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void demo() {
        RomanToDecimal roman = new RomanToDecimal();

        Util op = new Util();
        try {
            Calculator rah = new Calculator();
            System.out.println("Введіть число 1");
            String num1 = bf.readLine();
            System.out.println("Яка орерація?(+, -, * чи /)");
            char operation = bf.readLine().charAt(0);
            System.out.println("Введіть число 2");
            String num2 = bf.readLine();

            if (op.isInteger(num1) && op.isInteger(num2)) {
                rah.calculate(Integer.valueOf(num1), Integer.valueOf(num2), operation);
            } else if (!op.isInteger(num1) && op.isInteger(num2) || op.isInteger(num1) && !op.isInteger(num2)) {

                System.out.println("Не правильно, го ше раз");
                demo();
            } else {

                rah.calculate(roman.romanToDecimal(num1), roman.romanToDecimal(num2), operation);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        demo();
    }
}

