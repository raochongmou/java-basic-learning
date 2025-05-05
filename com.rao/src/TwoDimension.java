public class TwoDimension {
    public static void main(String[] args) {
        /**
         * 二维数组学习
         */
        // 创建二维数组
        int[][] arr = {
                {22, 64, 44},
                {77, 33, 88},
                {25, 45, 56},
                {11, 66, 99},
        };
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            int[] quarterArr = arr[i];
            int sum = getSum(quarterArr);
            System.out.print("第" + (i + 1) + "季度的总和为:" + sum);
            System.out.println();
            total += sum;
        }
        System.out.println("全年总和为:" + total);
    }
    private static int getSum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
