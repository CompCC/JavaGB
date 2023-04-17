
/**
 * Написать программу, которая запросит пользователя ввести <Имя> в консоли.
 * Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
 * В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида 
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59

 */
import java.util.Scanner;
import java.time.LocalDateTime;

public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "cp866");
        System.out.print("Введите ваше имя: ");
        String vvod = iScanner.nextLine();
        // System.out.printf("Привет, %s", vvod);
        iScanner.close();
        LocalDateTime now = LocalDateTime.now();
        // DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");
        if (now.getHour() >= 5 & now.getHour() < 12) {
            System.out.printf("Доброе утро, %s!", vvod);
        } else if (now.getHour() >= 12 & now.getHour() < 18) {
            System.out.printf("Добрый день, %s!", vvod);
        } else if (now.getHour() >= 18 & now.getHour() < 23) {
            System.out.printf("Добрый вечер, %s!", vvod);
        } else {
            System.out.printf("Доброй ночи, %s!", vvod);
        }
    }

}