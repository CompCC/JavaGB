import java.util.Scanner;

/**
 * Task1
 * Дано четное число N (>0) и символы c1 и c2.
 * Написать метод, который вернет строку длины N, которая состоит из
 * чередующихся символов c1 и c2, начиная с c1.
 * 
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите четное число > 0");
        int lenght = iScanner.nextInt();

        System.out.println("Введите число с1: ");
        int numsC1 = iScanner.nextInt();

        System.out.println("Введите число с2:");
        int numsC2 = iScanner.nextInt();
        iScanner.close();

        System.out.println(massiv(lenght, numsC1, numsC2));
    }

    public static String massiv(int a, int b, int c) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < a; i++) {
            if (i % 0 == 0) {
                str.append(b);
            } else {
                str.append(c);
            }
        }
        return str.toString();
    }
}