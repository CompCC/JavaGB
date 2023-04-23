import java.util.ArrayList;

import javax.management.InstanceNotFoundException;

// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа. 
// Пройти по списку, найти и удалить целые числа.

public class Task3 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList<String>();
        list1.add(345);
        list1.add("aswd");
        list1.add(1);
        list1.add("ewd");
        list1.add(85);
        list1.add(543);
        list1.add(3387624);

        for (int i = 0 ; i < list1.size(); i++) {
            if (list1.get(i) instanceof Integer) {
                list1.remove(i--);
            }

            // try {
            // Integer.parseInt(list1.get(i));
            // list1.remove(i);
            // } catch (Exception e) {
            // System.out.println("cath");
            // }
        }
        System.out.println(list1);

    }
}
