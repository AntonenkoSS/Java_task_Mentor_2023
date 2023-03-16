import java.util.Scanner;

public class Task_4 {
//    For a positive integer n calculate the result value, which is equal to the amount of the “1” in the binary
//    representation of n.
//            Example,
//    n = 14 = 1110 result = 3
//    n = 128 = 1000 0000 result = 1

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле додатнє число: ");
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if (i>0) {
                int sum = 0;
                int a = 0;
                while(i>0){
                    a = i % 2;
                    if(a == 1)
                    {
                        sum=sum+1;
                    }
                    i=i-a;
                    i = i / 2;

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
