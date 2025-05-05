public class EncryptedNumbers {
    public static void main(String[] args) {
        int[] number = {1, 0, 8, 3};
        for (int i = 0; i < number.length; i++) {
            number[i] = number[i] + 5;
        }
        for (int i = 0; i < number.length; i++) {
            number[i] = number[i] % 10;
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
        }
        System.out.println(" ");
        // 反转
        for (int i = 0, j = number.length - 1; i < j; i++, j--) {
            int temp = number[i];
            number[i] = number[j];
            number[j] = temp;
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
        }

        System.out.println(" ");
        int encrypted = 0;
        for (int i = 0; i < number.length; i++) {
            encrypted = encrypted * 10 + number[i];
        }
        System.out.println(encrypted);
    }
}
