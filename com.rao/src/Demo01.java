public class Demo01 {
    public static void main(String[] args) {
        // 计算一个数字是否是回文数字
        int x = 12345432;
        int temp = x;
        int num = 0;
        while(x != 0) {
            // 获取个位
            int ge = x % 10;
            x = x / 10;
            num = num * 10 + ge;
        }
        System.out.println("反转后的数字为:" + num);
        System.out.println("原来的数字为:" + temp);
        if(num == temp) {
            System.out.println("temp:" + temp + "是回文数字!");
        } else {
            System.out.println("temp:" + temp + "不是回文数字!");
        }
    }
}
