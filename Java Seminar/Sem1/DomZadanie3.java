
// Реализовать простой калькулятор
import java.util.Scanner;;

public class DomZadanie3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "866");
        System.out.print("Введите первое число: ");
        int n = iScanner.nextInt();
        System.out.print("Введите второе число: ");
        int m = iScanner.nextInt();
        System.out.print("Введите операцию (+, -, *, /): ");
        char action = iScanner.next().charAt(0);
        iScanner.close();
        switch (action) {
            case '+':
                System.out.printf("Результат операции %c будет равно %d", action, n + m);
                break;

            case '-':
                System.out.printf("Результат операции %c будет равно %d", action, n - m);
                break;

            case '*':
                System.out.printf("Результат операции %c будет равно %d", action, n * m);
                break;

            case '/':
                System.out.printf("Результат операции %c будет равно %d", action, n / m);
                break;
            default:
            System.out.println("Введите корректную опреацию!");
                break;
        }
    }
}
