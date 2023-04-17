// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class DomZadanie1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "866");
        System.out.print("Введите n для треугольного числа: ");
        String vvod = iScanner.nextLine();
        iScanner.close();
        int n = Integer.parseInt(vvod);
        int res = 0;
        while (n > 0) {
            res = res + n;
            n--;
        }
        System.out.printf("Результат треугольного числа от введеного n: %d", res);
    }
}
