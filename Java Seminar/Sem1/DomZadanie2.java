// Вывести все простые числа от 1 до 1000 

import java.util.Scanner;;

public class DomZadanie2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "866");
        System.out.print("Введите число: ");
        int n = iScanner.nextInt();
        iScanner.close();
        for (int i = 0; i < n; i++) {//заносим каждое число из диапазона в метод simple
            if (simple(i)) {
                System.out.print(i + "\t");
            }
        }
    }

    public static boolean simple(int n) { // метод для определения, является ли число простым
        boolean t = false;
        if (n == 2) { //если число равно 2м вносим таблицу
            t = true;
        }
        for (int i = 2; i < n; i++) {
            if (i == (n - 1)) {
                t = true;
            }
            if ((n % i == 0)) {
                break;
            }
        }
        return t;
    }
}
