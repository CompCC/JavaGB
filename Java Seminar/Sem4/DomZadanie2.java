import java.util.LinkedList;


// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

public class DomZadanie2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("qwer");
        list.add("reewq");
        list.add("edcrf");
        list.add("ujmik");
        // enqueue(list, "3ed4r");
        System.out.println(enqueue(list, "3ed4r"));
        System.out.println(list);
        System.out.println(dequeue(list));
        System.out.println(first(list));
        System.out.println(list);


    }

    public static LinkedList<String> enqueue(LinkedList<String> list, String input) {
        int temp = list.size();
        list.add(temp, input);
        return list;
    }

    public static String dequeue(LinkedList<String> list){
        String output = list.get(0);
        list.remove(0);
        return output;
    }

    public static String first(LinkedList<String> list){
        String output = list.get(0);
        return output;
    }
}
