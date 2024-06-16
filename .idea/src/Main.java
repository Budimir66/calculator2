

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   //  ввывод на консоль

        System.out.println("Input: ");
        int[] number = new int[11];
        for (int i = 0; i < 11; i++)
        {
            number[i] = sc.nextInt();
            int a = number[i];

            char w = sc.next().charAt(0);
            number[i] = sc.nextInt();
            int b = number[i];
            if (a > 10) {System.out.println("Значение больше 10 не удовлетворяет условиям");}
            else if (a < 1) {System.out.println("Значение меньше 0 не удовлетворяет условиям");}
            else if (b > 10) {System.out.println("Значение больше 10 не удовлетворяет условиям");}
            else if (b < 1) {System.out.println("Значение меньше 0 не удовлетворяет условиям");}

            else if (w == '+') {
                int r = a + b;
                System.out.println("Output: "  + r );

            }
            else if (w == '-') {
                int r = a - b;
                System.out.println("Output: "  + r );

            }

            else if (w == '*') {
                int r = a * b;
                System.out.println("Output: "  + r );

            }
            else  if (w == '/') {
                int r = a / b;
                System.out.println("Output: "  + r );

            }
            else {System.out.println("строка не является математической операцией");

            }

        }





    }

}

