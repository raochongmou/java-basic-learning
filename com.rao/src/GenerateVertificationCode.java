import java.util.Random;

public class GenerateVertificationCode {
    public static void main(String[] args) {
        /**
         * 生成验证码
         * 要求：由四位随机字母(A-Z/a-z)及一位随机数字组成
         */
        char[] chars = new char[52];
        // 放a-z
        for (int i = 0; i <= 25; i++) {
            chars[i] = (char)(i + 97);
        }
        for (int i = 26; i < chars.length; i++) {
            chars[i] = (char)(i + 65 - 26);
        }
        // 生成一个随机的四位字母
        Random random = new Random();
        String code = "";
        for (int i = 0; i < 4; i++) {
            code += chars[random.nextInt(chars.length + 1)];
        }
        int number = random.nextInt(10);
        code = code + number;
        System.out.println(code);
    }
}
