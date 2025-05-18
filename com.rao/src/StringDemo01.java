public class StringDemo01 {
    public static void main(String[] args) {
        String a = new String("abc");
        String c = "abc";
        System.out.println(a == c);
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase(c));
    }
}
