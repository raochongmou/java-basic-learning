import java.util.StringJoiner;

public class StringJoinerDemo001 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        sj.add("1");
        sj.add("2");
        sj.add("3");
        sj.add("4");
        String s = sj.toString();
        System.out.println(s);
    }
}
