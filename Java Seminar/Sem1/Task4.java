import java.util.Scanner;

// Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
// Если общего префикса нет, вернуть пустую строку "".

public class Task4 {
    
    public String longestCommonPrefix(String[] arr) {

        if (arr.length == 0) {
            return " ";
        }
        if (arr.length == 1) {
            return arr[0];
        }
        String res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            String cur = arr[i];
            int reader = 0;
            int lastCommon = 0;
            while (reader < res.length() & reader < cur.length()) {
                if (res.charAt(reader) == cur.charAt(reader)) {
                    lastCommon++;
                } else {
                    break;
                }
                reader++;
            }
            res = res.substring(0, lastCommon);
        }
        return res;
    }
}

// /**
//  * InnerTask4
//  */
// public class InnerTask4 {
// public static void main(String[] args) {
//     public static void main(String[] args) {
//         // Scanner iScanner = new Scanner(System.in, "866");
//         // System.out.print("Введите слова через пробел: ");
//         // String strInput = iScanner.nextLine();
//         // String[] arrInput = strInput.split(' ');
//         String[] arrStrings = { "flower", "flow", "flight" };
//         System.out.print(arrStrings);
//     }
// }
    
// }