import java.io.IOException;
import java.util.Scanner;

public class Array_3_Task {
    // for a positive integer n calculate the result value,which is equal to the sum of odd number of n,
    // n=1234 ---> result=4   or  n=246 ----> result = 0

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле додатнє число: ");
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if (i>0) {
                //System.out.println(i);
                int sum = 0;
                while(i>0){
                    int x = i%10;
                    if (x%2==1){
                        sum = sum+x;
                    }
                    i=(i-x)/10;
                }
                System.out.println(sum);

            }else{
                System.out.println("Ви ввели відємне число");
            }
        } else {
            System.out.println("Ви ввели не ціле число");
        }

    }
}
