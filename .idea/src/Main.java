import java.io.OutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   //  ввывод на консоль

        System.out.println("Input: ");
        int[] number = new int[10];       // массив с десятью ячейками.
        for (int i = 1; i < 11; i++)
        {
            number[i] = sc.nextInt();
            int a = number[i];

            char w = sc.next().charAt(0);
            number[i] = sc.nextInt();
            int b = number[i];
            if (a > 10)

                if (w == '+') {
                    int r = a + b;
                    System.out.println("Output: "  + r );

                }
            if (w == '-') {
                int r = a - b;
                System.out.println("Output: "  + r );

            }

            if (w == '*') {
                int r = a * b;
                System.out.println("Output: "  + r );

            }
            if (w == '/') {
                int r = a / b;
                System.out.println("Output: "  + r );

            }


        }





    }

}

