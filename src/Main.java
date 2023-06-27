//1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
//        (произведение чисел от 1 до n)
//        2. Вывести все простые числа от 1 до 1000
//        3. Реализовать простой калькулятор
//        4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
//        могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
//        восстановить выражение до верного равенства. Предложить хотя бы
//        одно решение или сообщить, что его нет.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter N: ");
        int n = iScanner.nextInt();
        iScanner.close();

        System.out.println("Треугольное число = "+Triangle(n));
        System.out.println("Факториал = "+Fact(n));
    }
    static  int Triangle(int n) {
        int count = 0;
        for (int i=1; i <= n; i++) {
            count += i;
        };
        return count;
    };
    static  int Fact(int n) {
        int count = 1;
        for (int i=1; i <= n; i++) {
            count = count * i;
        };
        return count;
    };
}