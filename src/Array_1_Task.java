import java.io.IOException;
import java.util.Scanner;

public class Array_1_Task {
    //for a given integer n calculate the value which is equal to a:
    // *squared number, if its value is strictly positive;
    // *modulus of a number, if its value is strictly negative;
    // *zero, if the integer n is zero

    public static int verification(int n){
        int a = 0;
        if (n>0) a=n*n;
        if (n<0) a=Math.abs(n);
        if (n==0) a=0;

        return a;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            System.out.println(i);

            int num;
            num = verification(i);
            System.out.println("a="+num);

        } else {
            System.out.println("Ви ввели не ціле число");
        }

//        int c = verification(5);
//        System.out.println("a="+c);
//
//        int d = verification(-2);
//        System.out.println("a="+d);
//
//        int f = verification(0);
//        System.out.println("a="+f);
    }
}
