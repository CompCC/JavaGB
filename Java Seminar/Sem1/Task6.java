// Реализовать функцию возведения числа а в степень b.  
// Сводя количество выполняемых действий к минимуму.
// Пример 1: а = 3, b = 2, ответ: 9
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1

public class Task6 {
    public static double powIter(int a, int b) {
        if (a == 0 || a == 1) {
            return 1;
        }
        if (b < 0) {
            b = -b;
            a = 1 / a;
        }
        double res = 1;
        for (int i = 0; i <= b; i++) {
            res = res * a;
        }
        return res;
    }
}
