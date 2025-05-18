public class SubstrDemo {
    public static void main(String[] args) {
        String phone = "19972116211";
        // 截取前三位
        String start = phone.substring(0, 3);
        // 截取后四位
        String end = phone.substring(7);
        // 拼接
        System.out.println(start + "****" + end);
    }
}
