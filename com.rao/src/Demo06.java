import java.util.Random;
import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        /**
         * 需求：程序生成一个1-100的随机数，使用键盘输入猜这个随机数
         */
        // 生成随机数1-100
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你猜的数字");
            int guessNumber = sc.nextInt();
            if(guessNumber > number) {
                System.out.println("猜大了，请再猜!");
            } else if(guessNumber < number){
                System.out.println("猜小了，请再猜!");
            } else {
                System.out.println("恭喜猜对了!");
                break;
            }
        }
    }
}
