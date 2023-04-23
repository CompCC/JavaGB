import java.io.FileReader;
import java.io.IOException;

public class OpenFile {
    public static  main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("file.txt");
            // открыть файл: неправильное имя файла
            // читать из файла: — сбой
        } catch (IOException ex) {
            System.out.printf("Была проблема! %s", ex);
        }
        catch (Exception ex) {
            System.out.printf("Была проблема! %s", ex);
        } finally {
            if (reader != null)
                reader.close();
        }
    }
}
