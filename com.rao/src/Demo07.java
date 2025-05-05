public class Demo07 {
    public static void main(String[] args) {
        /**
         * 数组元素交换位置
         * {1, 2, 3, 4, 5} => {5, 4, 3, 2, 1}
         */
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
