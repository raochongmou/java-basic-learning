import java.util.Random;

public class PrizeDraw {
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};
        // 用于存储奖池
        int[] newArr = new int[arr.length];
        Random r = new Random();
        for (int i = 0; i < 5; ) {
            int prize = arr[r.nextInt(arr.length)];
            boolean flag = contains(newArr, prize);
            if (!flag) {
                newArr[i] = prize;
                i++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + ",");
        }
    }

    // 判断奖池是否已经包含该奖项
    public static boolean contains(int[] newArr, int element) {
        boolean flag = false;
        for (int i = 0; i < newArr.length; i++) {
            if (element == newArr[i]) {
                flag = true;
            }
        }
        return flag;
    }
}
