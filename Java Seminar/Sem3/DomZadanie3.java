import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

public class DomZadanie3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);
        Random rd = new Random();
            
        for (int i = 0; i < 10; i++) {
            list.add(i, rd.nextInt(1, 100));
        }
        System.out.println(list);

        int min = list.get(0);
        int max = list.get(0);
        int average = list.get(0);

        for (int i = 0; i < list.size(); i++) {

            int temp = 0;
            temp = list.get(i);
            if (temp < min) {
                min = temp;
            }
            if (temp > max) {
                max = temp;
            }
            average += temp;
        }
        average = average/list.size();
        
        System.out.printf("Значения листа: минимальное - %d, максимальное - %d, среднее арифметическое - %d", min, max,
                average);
    }

}
