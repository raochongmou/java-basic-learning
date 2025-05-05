public class DecryptNumbers {
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 6};
        // 反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        } // 6 5 3 8
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]);
        // }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0 && arr[i] <=4) {
                arr[i] = arr[i] + 10;
            }
        } // 6 5 13 8
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        } // 1 0 8 3
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
