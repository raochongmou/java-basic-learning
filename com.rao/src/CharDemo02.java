import java.util.Scanner;

public class CharDemo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要计算的字符串:");
        String str = scanner.next();
        // 计算大写字母数量
        int capitalLetters = 0;
        int lowercase = 0;
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // a - z
            if(c > 'a' && c < 'z') {
                lowercase++;
            } else if(c > 'A' && c < 'Z') {
                capitalLetters++;
            } else if(c > '0' && c < '9') {
                number++;
            }
        }
        System.out.println(lowercase); // 小写
        System.out.println(capitalLetters); // 大写
        System.out.println(number); // 数字
    }
}
