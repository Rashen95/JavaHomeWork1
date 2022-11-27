// Вывести все простые числа от 1 до 1000

public class Task02 {
    public static void main(String[] args) {
        String numbers = "2";
        for (int i = 3; i < 1001; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                numbers = String.join(", ", numbers, Integer.toString(i));
            }
        }
        System.out.println("Вот все простые числа от 1 до 1000 (Делятся нацело только на себя и на еденицу):");
        System.out.println(numbers);
    }
}
