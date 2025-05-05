public class Demo03 {
    public static void main(String[] args) {
        /**
         * 求1-100以内7的倍数，且含7的数字
         * 如果满足 打印【过】
         * 否则 打印原数字
         */
        int num = 100;
        for (int i = 1; i < num; i++) {
            if(i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println('过');
                continue;
            }
            System.out.println(i);
        }
    }
}
