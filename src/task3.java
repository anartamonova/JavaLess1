//3. Реализовать простой калькулятор

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter two numbers: ");
        double x = iScanner.nextDouble();
        double y = iScanner.nextDouble();
        double res = 0;
        System.out.print("Choose operation +, -, /, *, ^: ");
        char operation = iScanner.next().charAt(0);
        iScanner.close();
        System.out.printf(x +" " + operation +" " + y + " = "+ Calc(x,y,res, operation));
    }
    static double Calc (double x, double y, double res, char operation){

        switch (operation) {
            case '+':
                res = x+y;
                break;
            case '-':
                res = x-y;
                break;
            case '*':
                res = x*y;
                break;
            case '/':
                res = x/y;
                break;
            case '^':
                res = Math.pow(x, y);
                break;
            default:
                System.out.printf("Incorrect operation");;
                break;
        }


        return res;

    }
}
