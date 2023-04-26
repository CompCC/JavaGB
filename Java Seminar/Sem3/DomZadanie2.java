// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

import java.util.ArrayList;
import java.util.List;

import java.util.Random;

public class DomZadanie2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(i, rd.nextInt(1, 100));
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            int temp = 0;
            temp = list.get(i);
            if (temp % 2 == 0) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
