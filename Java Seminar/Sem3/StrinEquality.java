public class StrinEquality {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String (new char[] { 'h', 'e', 'l', 'l', 'o' });
        if (s1 == s4)
            System.out.println("Равны ссылки");
        else
            System.out.println("не равны ссылки");
        if (s1.equals(s4))
            System.out.println("равны значения");

        else
            System.out.println("не равны значения");

    }
}
