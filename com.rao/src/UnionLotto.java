import java.util.Random;
import java.util.Scanner;

public class UnionLotto {
    public static void main(String[] args) {
        /**
         * 双色球: 系统生成7个球  6个红色球(数字1-31), 1个蓝色球(1-16)
         * 规则: 一等奖 红色 6 蓝色 1 1000wCNY
         *      二等货 红色 6 蓝色 0 500wCNY
         *      三等奖 红色 5 蓝色 1 3000CNY
         *      四等奖 红色 5 蓝色 0 或者 红色 4 蓝色 1 200CNY
         *      五等奖 红色 4 蓝色 0 或者 红色 3 蓝色 1 10CNY
         *      六等奖 红色 2 蓝色 1 或者 红色 1 蓝色 1 或者 红色 0 蓝色 1 5CNY
         */
        // 系统生成中奖号码
        int[] arr = createNumber();
        System.out.print("出奖号码:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(" ");
        // 用户输入彩票号码
        int[] userInputNumber = userInputNumber();

        int redNumber = 0;
        int blueNumber = 0;
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < userInputNumber.length -1; j++) {
                if(arr[i] == userInputNumber[j]) {
                    redNumber++;
                    break;
                }
            }
        }
        if(arr[arr.length -1] == userInputNumber[userInputNumber.length-1]) {
            blueNumber = 1;
        }
        if(redNumber == 6 && blueNumber == 1) {
            System.out.println("恭喜中一等奖,奖励1000w!");
        } else if(redNumber == 6 && blueNumber == 0) {
            System.out.println("恭喜中二等奖,奖励500w!");
        } else if(redNumber == 5 && blueNumber == 1) {
            System.out.println("恭喜中三等奖,奖励3000!");
        } else if((redNumber == 5 && blueNumber == 0) || redNumber == 4 && blueNumber == 1) {
            System.out.println("恭喜中四等奖,奖励200!");
        } else if((redNumber == 4 && blueNumber == 0) || (redNumber == 3 && blueNumber == 1)) {
            System.out.println("恭喜中五等奖,奖励10!");
        } else if((redNumber == 2 && blueNumber == 1) || (redNumber == 1 && blueNumber == 1) || (redNumber == 0 && blueNumber == 1)){
            System.out.println("恭喜中六等奖,奖励5!");
        }

    }

    private static int[] userInputNumber() {

        int[] arr = new int[7];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length - 1; ) {

            System.out.println("请输入第" + (i + 1) + "个号码:");

            int inputNumber = sc.nextInt();

            if (inputNumber >= 1 && inputNumber <= 31) {
                boolean flag = contains(arr, inputNumber);
                if (!flag) {
                    arr[i] = inputNumber;
                    i++;
                } else {
                    System.out.println("当前输入的号码已存在!请重新输入:");
                }
            } else {
                System.out.println("输入的号码不在1-31范围内，请重新输入:");
            }
        }
        while (true) {
            System.out.println("请输入蓝色球:");
            int blueBall = sc.nextInt();
            if (blueBall >= 1 && blueBall <= 16) {
                arr[arr.length - 1] = blueBall;
                break;
            } else {
                System.out.println("输入的号码不在1-16范围内，请重新输入:");
            }
        }
        return arr;
    }

    private static int[] createNumber() {
        // 定义一个长度为7的数组
        int[] arr = new int[7];
        // 先生成6个红色球
        Random random = new Random();
        for (int i = 0; i < arr.length - 1; ) {
            int randomIndex = random.nextInt(31) + 1;
            boolean flag = contains(arr, randomIndex);
            if (!flag) {
                arr[i] = randomIndex;
                i++;
            }
        }
        int blueBall = random.nextInt(16) + 1;
        arr[arr.length - 1] = blueBall;
        return arr;
    }

    private static boolean contains(int[] arr, int randomIndex) {
        boolean flag = false;
        for (int j : arr) { // 增强for
            if (j == randomIndex) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
