import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input:");
        String s = reader.readLine();
        String[] arrS = s.split(" ");


        int num1 = Integer.parseInt(arrS[0]);
        int num2 = Integer.parseInt(arrS[2]);

        int res = 0;

        switch (arrS[1]){
            case "+":
                res = num1 + num2;
                break;
            case "-":
                res = num1 - num2;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "/":
                res = num1 / num2;
                break;
        }

        System.out.println(res);
    }
}




