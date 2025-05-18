public class StringBuilderDemo001 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("abc");
        System.out.println(sb.capacity()); // 扩容
        System.out.println(sb.length()); // 实际的长度
        sb.append("defghijklmnopqrstuvwxyz");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
