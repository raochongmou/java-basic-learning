public class Demo02 {
    public static void main(String[] args) {
        /**
         * 有两个正整数，其中一个是被除数  另一个是除数
         * 在不使用除法、乘法、%的情况下
         * 求它的商和余数各是多少
         */
        int a = 100;
        int b = 37;
        int c = 0;
        while(a >= b) {
            a = a -b;
            c++;
        }
        System.out.println("余数是:" + a);
        System.out.println("商是:" + c);
    }
}
