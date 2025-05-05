import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            if(i * i == num) {
                System.out.println(i + "就是" + num + "算术平方根!");
                break;
            }
            if(i * i < num && (i + 1) * (i + 1) > num ) {
                System.out.println(num + "的算术平方根在" + i + '~' + (i + 1) + "之间");
                break;
            }
        }
    }
}
