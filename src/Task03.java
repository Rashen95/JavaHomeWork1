// Реализовать простой калькулятор

import java.util.Scanner;
import java.text.DecimalFormat;

public class Task03 {
    public static void main(String[] args) {
        Scanner MyScanner = new Scanner(System.in);
        System.out.println("Данная программа выполняет функцию простого калькулятора");
        label:
        while (true) {
            System.out.println("Какую операцию вы хотите произветсти с числами? (введите соответствующую цифру)");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("5. Завершить работу приложения");
            String calc = MyScanner.nextLine();
            calc = calc.replaceAll("\\s", "");
            switch (calc) {
                case "1":
                    sum();
                    break;
                case "2":
                    diff();
                    break;
                case "3":
                    mult();
                    break;
                case "4":
                    div();
                    break;
                case "5":
                    System.out.println("Завершаю работу приложения");
                    break label;
            }
            if (!calc.equals("1") && !calc.equals("2") && !calc.equals("3") && !calc.equals("4")) {
                System.out.println("Нет такого пункта!");
            }
        }
    }

    static boolean isDigit(String s) throws NumberFormatException {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static String round(String s, String l) {
        int round1 = 0;
        int round2 = 0;
        String pattern1 = "#";
        String pattern2 = "#";
        if (s.contains(".")) {
            round1 = s.substring(s.indexOf(".")).length() - 1;
            pattern1 = "#." + "#".repeat(round1);
        }
        if (l.contains(".")) {
            round2 = l.substring(l.indexOf(".")).length() - 1;
            pattern2 = "#." + "#".repeat(round2);
        }
        if (round1 > round2) {
            return pattern1;
        } else {
            return pattern2;
        }
    }

    static void sum() {
        Scanner MyScanner = new Scanner(System.in);
        System.out.println("Вы выбрали операцию сложения");
        String number1;
        while (true) {
            System.out.print("Введите первое слагаемое: ");
            number1 = MyScanner.nextLine();
            number1 = number1.replace(',', '.');
            if (isDigit(number1)) {
                break;
            } else {
                System.out.println("Вы ввели не число");
            }
        }
        double number11 = Double.parseDouble(number1);
        String number2;
        while (true) {
            System.out.print("Введите второе слагаемое: ");
            number2 = MyScanner.nextLine();
            number2 = number2.replace(',', '.');
            if (isDigit(number2)) {
                break;
            } else {
                System.out.println("Вы ввели не число");
            }
        }
        double number22 = Double.parseDouble(number2);
        double sum = number11 + number22;
        DecimalFormat df = new DecimalFormat(round(Double.toString(number11), Double.toString(number22)));
        String result = df.format(sum);
        System.out.printf("Сумма введенных чисел равна %s", result);
        System.out.println();
    }

    static void diff() {
        Scanner MyScanner = new Scanner(System.in);
        System.out.println("Вы выбрали операцию вычитания");
        String number1;
        while (true) {
            System.out.print("Введите уменьшаемое: ");
            number1 = MyScanner.nextLine();
            number1 = number1.replace(',', '.');
            if (isDigit(number1)) {
                break;
            } else {
                System.out.println("Вы ввели не число");
            }
        }
        double number11 = Double.parseDouble(number1);
        String number2;
        while (true) {
            System.out.print("Введите вычитаемое: ");
            number2 = MyScanner.nextLine();
            number2 = number2.replace(',', '.');
            if (isDigit(number2)) {
                break;
            } else {
                System.out.println("Вы ввели не число");
            }
        }
        double number22 = Double.parseDouble(number2);
        double diff = number11 - number22;
        DecimalFormat df = new DecimalFormat(round(Double.toString(number11), Double.toString(number22)));
        String result = df.format(diff);
        System.out.printf("Разность введенных чисел равна %s", result);
        System.out.println();
    }

    static void mult() {
        Scanner MyScanner = new Scanner(System.in);
        System.out.println("Вы выбрали операцию умножения");
        String number1;
        while (true) {
            System.out.print("Введите первый множитель: ");
            number1 = MyScanner.nextLine();
            number1 = number1.replace(',', '.');
            if (isDigit(number1)) {
                break;
            } else {
                System.out.println("Вы ввели не число");
            }
        }
        double number11 = Double.parseDouble(number1);
        String number2;
        while (true) {
            System.out.print("Введите второй множитель: ");
            number2 = MyScanner.nextLine();
            number2 = number2.replace(',', '.');
            if (isDigit(number2)) {
                break;
            } else {
                System.out.println("Вы ввели не число");
            }
        }
        double number22 = Double.parseDouble(number2);
        double mult = number11 * number22;
        System.out.printf("Произведение введенных чисел равно %s", mult);
        System.out.println();
    }

    static void div() {
        Scanner MyScanner = new Scanner(System.in);
        System.out.println("Вы выбрали операцию деления");
        String number1;
        while (true) {
            System.out.print("Введите делимое: ");
            number1 = MyScanner.nextLine();
            number1 = number1.replace(',', '.');
            if (isDigit(number1)) {
                break;
            } else {
                System.out.println("Вы ввели не число");
            }
        }
        double number11 = Double.parseDouble(number1);
        String number2;
        while (true) {
            System.out.print("Введите делитель: ");
            number2 = MyScanner.nextLine();
            number2 = number2.replaceAll("\\s", "");
            number2 = number2.replace(',', '.');
            if (number2.equals("0")) {
                System.out.println("На ноль делить нельзя!");
            } else if (isDigit(number2)) {
                break;
            } else {
                System.out.println("Вы ввели не число");
            }
        }
        double number22 = Double.parseDouble(number2);
        double div = number11 / number22;
        System.out.printf("Частное введенных чисел равно %s", div);
        System.out.println();
    }
}