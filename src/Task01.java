// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner MyScanner = new Scanner(System.in);
        System.out.println("Введите число, а я вычислю треугольное число для этого числа, а так же его факториал: ");
        int num = MyScanner.nextInt();
        System.out.printf("Треугольное число = %d", triangular(num));
        System.out.println();
        System.out.printf("Факториал числа = %s", factorial(num));
    }

    static int triangular(int number) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
        }
        return result;
    }

    static double factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial((number - 1));
    }
}
