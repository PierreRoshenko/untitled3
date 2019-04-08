package com.company;

public class Calculator {

    public void calculate(int firstNumber, int secondNumber, char operation) {
        int res;
        switch (operation) {
            case '+':
                res = firstNumber + secondNumber;
                System.out.println("Результат =" + res);
                break;
            case '-':
                res = firstNumber - secondNumber;
                System.out.println("Результат =" + res);
                break;
            case '*':
                res = firstNumber * secondNumber;
                System.out.println("Результат =" + res);
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("На 0 ніхто не ділить, генію");
                } else {
                    res = firstNumber / secondNumber;
                    System.out.println("Результат = " + res);
                }
                break;
        }
    }
}
