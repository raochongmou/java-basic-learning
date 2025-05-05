import java.util.Random;

public class DisturbArrayOrder {
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
           int rIndex = r.nextInt(arr.length);
           int temp = arr[i];
           arr[i] = arr[rIndex];
           arr[rIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
