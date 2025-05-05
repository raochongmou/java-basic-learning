import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入我的时尚度");
        int myFashion = sc.nextInt();
        System.out.println("请输入我的相亲对象的时尚度");
        int girl = sc.nextInt();
        Boolean result = myFashion > girl;
        System.out.println("result:" + result);
    }
}