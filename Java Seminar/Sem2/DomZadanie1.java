import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

// В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. 
// Значения null не включаются в запрос.

public class DomZadanie1 {
    public static void main(String[] args) {
        String input = null;
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                input = line;

            }
        } catch (Exception e) {
            System.out.printf("Ошибка! %s\n", e.getMessage());
        }

        String strTrim = input.replace("{", "")
                .replace("}", "")
                .replace("\"", "");

        String[] temp = strTrim.split(",");

        Map<String, String> dictMap = new HashMap<>();
        for (String item : temp) {
            String[] strNew = item.split(":");
            for (int i = 0; i < strNew.length; i++) {
                dictMap.put(strNew[0], strNew[1]);
            }
        }
        System.out.println(dictMap);
        
        StringBuilder sb = new StringBuilder();
        Set<Map.Entry<String, String>> pair = dictMap.entrySet();
        List<Map.Entry<String, String>> list = new ArrayList<>(pair);
        
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).getValue().equals("null")) {
                sb.append(list.get(i).getKey() + " = " + list.get(i).getValue() + " and ");
            }
        }
        System.out.println(sb);
    }

}
