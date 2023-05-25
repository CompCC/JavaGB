// Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.

// Создать множество ноутбуков.

// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, 
// отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объём ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев — сохранить 
// параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class DomZadanie {
    public static void main(String[] args) {

        Notebook note1 = new Notebook(16, 128, "win", "black", "Dell");
        Notebook note2 = new Notebook(32, 1024, "win", "red", "HP");
        Notebook note3 = new Notebook(16, 256, "win", "blck", "HP");
        Notebook note4 = new Notebook(8, 128, " ", "black", "Acer");

        Set<Notebook> laptops = new HashSet<>(Arrays.asList(note1, note2, note3, note4));
        HashSet<Notebook> res = new HashSet<>();

        System.out.print(
                "Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.nextLine();
        Map<String, Object> filters = new HashMap<>();

        while (n != 5) {
            if (n == 1) {
                System.out.println("Введите минимальную оперативную память");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("ram", temp);
            }
            if (n == 2) {
                System.out.println("Введите минимальный объем ЖД");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("hdd", temp);
            }
            if (n == 3) {
                System.out.println("Введите ОС");
                String temp = sc.nextLine();
                filters.put("operationSystem", temp);
            }
            if (n == 4) {
                System.out.println("Введите цвет");
                String temp = sc.nextLine();
                filters.put("color", temp);
            }
            System.out.print(
                    "Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
            n = sc.nextInt();
            sc.nextLine();
        }

        for (Entry<String, Object> entry : filters.entrySet()) {
            if (entry.getKey().equals("ram")) {
                Iterator it = laptops.iterator();
                while (it.hasNext()) {
                    Notebook lap = (Notebook) it.next();
                    if (lap.getRam() >= (Integer) entry.getValue()) {
                        res.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("hdd")) {
                Iterator it = laptops.iterator();
                while (it.hasNext()) {
                    Notebook lap = (Notebook) it.next();
                    if (lap.getHdd() >= (Integer) entry.getValue()) {
                        res.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("OS")) {
                Iterator it = laptops.iterator();
                while (it.hasNext()) {
                    Notebook lap = (Notebook) it.next();
                    if (lap.getOperationSystem().equals(entry.getValue())) {
                        res.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("color")) {
                Iterator it = laptops.iterator();
                while (it.hasNext()) {
                    Notebook lap = (Notebook) it.next();
                    if (lap.getColor().equals(entry.getValue())) {
                        res.add(lap);
                    }
                }
            }
        }

        Iterator it = res.iterator();
        while (it.hasNext()) {
            Notebook lap = (Notebook) it.next();
            System.out.println(lap.toString());
            System.out.println();
        }

    }
}
