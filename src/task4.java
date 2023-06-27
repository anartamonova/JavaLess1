import java.util.Scanner;

//        4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
//        могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
//        восстановить выражение до верного равенства. Предложить хотя бы
//        одно решение или сообщить, что его нет.
public class task4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int q = iScanner.nextInt();
        int w = iScanner.nextInt();
        int e = iScanner.nextInt();
        System.out.print(Res(q, w, e));
    }

    static int Res (int a, int b, int c) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (a * 10 + i + j * 10 + b == c) {
                    count += 1;
                    System.out.print(count + ") " + a + i + " + " + j + b + " = " + c + "\n");
                    return count;
                }
            }
        }
        System.out.println("\n");
        if (count == 0) {
            System.out.print("Решений нет\n");
            }
        return 0;
    }
}
