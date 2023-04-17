import java.util.Arrays;

// Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

public class Task5 {
    public static void main(String[] args) {
        String input = "Добро пожаловать на курс по Java";
        String[] temp = input.split(" ");
        String[] res = new String[temp.length];
        int count = temp.length;
        for (int i = 0; i < temp.length; i++) {
            res[i] = temp[count - 1];
            count--;
        }
        String formattedString = Arrays.toString(res)
                .replace(",", " ")
                .replace("[", " ")
                .replace("]", " ");

        System.out.println(formattedString);
    }
}
