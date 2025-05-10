import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            Car car = new Car();
            System.out.println("请输入汽车品牌:");
            String brand = scanner.next(); // 用于存字符串
            System.out.println("请输入汽车颜色:");
            String color = scanner.next();
            System.out.println("请输入汽车价格:");
            int price = scanner.nextInt();
            car.setBrand(brand);
            car.setColor(color);
            car.setPrice(price);
            arr[i] = car;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("汽车品牌" + arr[i].getBrand() + ", " + "颜色" + arr[i].getColor() + ", " + "价格" + arr[i].getPrice());
        }
    }
}
