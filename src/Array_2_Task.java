import java.io.IOException;
import java.util.Scanner;

public class Array_2_Task {

        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть ціле 3-значне число: ");
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println(i);
                int sum = 0;
                if (100 <= i && i <= 999) {
                    int a = i % 10;
                    int b = (i - a) / 10 % 10;
                    int c = (i - a - b * 10) / 100;
                    if (a >= b) {
                        if (b > c) {
                            sum = a * 100 + b * 10 + c;
                        } else {
                            sum = a * 100 + c * 10 + b;
                        }
                    }

                    if (b > a && b > c) {
                        if (a > c) {
                            sum = b * 100 + a * 10 + c;
                        } else {
                            sum = b * 100 + c * 10 + a;
                        }
                    }

                    if (c >= b) {
                        if (b > a) {
                            sum = c * 100 + b * 10 + a;
                        } else {
                            sum = c * 100 + a * 10 + b;
                        }
                    }

                    if (b > c && b > a) {
                        if (a > c) {
                            sum = b * 100 + a * 10 + c;
                        } else {
                            sum = b * 100 + c * 10 + a;
                        }
                    }
                } else {
                    System.out.println("Ви ввели не тризначне число");
                }

                System.out.println("Найбільше число з даних цифр =" + sum);
            } else {
                System.out.println("Ви ввели не ціле число");
            }

        }

}
