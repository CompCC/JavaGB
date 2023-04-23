import java.util.ArrayList;
import java.util.List;

/**
 * ListQuirks
 */
public class ListQuirks {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(0);
        list.add("hello");
        list.add(null);
        for (Object o : list)
            if (o != null)
                System.out.printf("%s %s\n", o.toString(), o.getClass().getName());

    }
}