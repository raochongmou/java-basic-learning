import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        /**
         * 键盘输入一个正整数，
         * 求这个正整数是否为质数
         * 质数特点：只能被1和它本身整除的数
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number = sc.nextInt();
        if(number < 2) {
            System.out.println("请输入一个比1大的整数!");
            return;
        }
        boolean isZs = true;
        for (int i = 2; i <= number; i++) {
            if(number % i == 0 && number != i) {
                System.out.println(number + "可以被" + i + "整除!");
                isZs = false;
                break;
            }
        }
        if(isZs) {
            System.out.println(number + "是一个质数");
        } else {
            System.out.println(number + "是一个素数");
        }
    }
}
