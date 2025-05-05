import java.util.Scanner;

public class AirplaneRidePlan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票价格:");
        int tickets = sc.nextInt();
        System.out.println("请输入月份:");
        int month = sc.nextInt();
        System.out.println("请输入仓位:");
        int seat = sc.nextInt();
        if (month >= 5 && month <= 10) {
            // 旺季
            tickets = getTickets(seat, tickets, 0.9, 0.85);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            // 淡季
            tickets = getTickets(seat, tickets, 0.7, 0.65);
        }
        System.out.println(tickets);
    }

    private static int getTickets(int seat, int tickets, double x, double x1) {
        if (seat == 0) {
            tickets = (int) (tickets * x);
        } else if (seat == 1) {
            tickets = (int) (tickets * x1);
        } else {
            System.out.println("没有这个舱位!");
        }
        return tickets;
    }
}
