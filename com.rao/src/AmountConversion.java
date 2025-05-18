import java.util.Scanner;

public class AmountConversion {
    public static void main(String[] args) {
        // 判断输入金额是否符合范围要求
        Scanner scanner = new Scanner(System.in);
        int amount;
        while(true) {
            System.out.println("请输入金额:");
            amount = scanner.nextInt();
            if(amount >= 0 && amount < 9999999) {
                break;
            } else {
                System.out.println("输入的金额必须是0~9999999");
            }
        }
        String moneyStr = "";
        while(true) {
            int ge = amount % 10;
            String capitalNumber = getCapitalNumber(ge);
            moneyStr = capitalNumber + moneyStr;
            amount = amount / 10;
            if(amount == 0) break;
        }

        // 补零
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
        // System.out.println(moneyStr);
        // 零 零 零 肆 贰 伍 柒 中分别插入 佰 拾 万 仟 佰 拾 元
        String[] unit = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        String result = "";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result = result + c + unit[i];
        }
        System.out.println(result);
    }
    public static String getCapitalNumber(int number) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number];
    }
}
