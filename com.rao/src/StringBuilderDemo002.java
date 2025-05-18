import java.util.Scanner;

public class StringBuilderDemo002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (true) {
            System.out.println("请输入一串字符串数字:");
            str = sc.next();
            boolean flag = isLuoMaNumber(str);
            if (flag) {
                break;
            } else {
                System.out.println("当前的字符串不符合规则,请重新输入");
                continue;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // int number = c - '0'; // 48 对应ASCII '0'字符
            String s = parseLuoMaCaret(c);
            sb.append(s);
        }
        System.out.println(sb);
    }

    // public static String parseLuoMaCaret(int number) {
    //     String[] arr = {" ", "I", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
    //     return arr[number];
    // }
    public static String parseLuoMaCaret(char c) {
        String str = switch (c) {
            case '0' -> " ";
            case '1' -> "I";
            case '2' -> "Ⅱ";
            case '3' -> "Ⅲ";
            case '4' -> "Ⅳ";
            case '5' -> "Ⅴ";
            case '6' -> "Ⅵ";
            case '7' -> "Ⅶ";
            case '8' -> "Ⅷ";
            case '9' -> "Ⅸ";
            default -> "";
        };
        return str;
    }

    public static boolean isLuoMaNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
