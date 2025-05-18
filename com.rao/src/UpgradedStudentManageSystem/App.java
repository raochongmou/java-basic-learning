package UpgradedStudentManageSystem;

import system.Student;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到用户管理系统");
            System.out.println("请选择操作：1.登录 2.注册 3.忘记密码 4.退出系统");
            String choose = sc.next();
            switch (choose) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "4" -> {
                    System.out.println("谢谢使用，再见");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }

    }

    private static void forgetPassword(ArrayList<User> list) {
        System.out.println("忘记密码");
    }

    private static void register(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        String username = null;
        while (true) {
            System.out.println("请输入要注册的用户名，注意：用户名必须是3-15位的字母+数字组合");
            username = sc.next();
            // 合法性检查  先校验不需要查数据的  避免占用资源
            boolean flag1 = validateUsername(username);
            if (!flag1) {
                System.out.println("你输入的用户名没有通过校验，请重新输入");
                continue;
            }
            boolean flag2 = contain(list, username);
            if (flag2) {
                System.out.println("用户名" + username + "已存在， 请重新输入");
            } else {
                System.out.println("用户名" + username + "可用");
                break;
            }
        }

        // 键盘录入密码
        // 密码键盘输入两次，两次一致才可以进行注册
        String password = null;
        while (true) {
            System.out.println("请输入密码");
            password = sc.next();
            System.out.println("请输入确认密码");
            String againPassword = sc.next();
            if (!password.equals(againPassword)) {
                System.out.println("你两次输入的密码不一致，请重新输入");
            } else {
                break;
            }
        }

        // 键盘录入身份证号码
        String personID = null;
        while (true) {
            System.out.println("请输入身份证号码");
            personID = sc.next();
            boolean checked = checkPersonID(personID);
            if (!checked) {
                System.out.println("你输入的身份证号码格式不正确，请重新输入");
            } else {
                System.out.println("身份证号码可用");
                break;
            }
        }
        // 键盘录入手机号
        String phoneNumber = null;
        while (true) {
            System.out.println("请输入手机号");
            phoneNumber = sc.next();
            boolean checked = checkPhoneNumber(phoneNumber);
            if (checked) {
                System.out.println("手机号码格式正确");
                break;
            } else {
                System.out.println("手机号码格式错误，请重新输入");
                continue;
            }
        }
        // 用户名，密码，身份证号码，手机号码放到用户对象中
        User u = new User(username, password, personID, phoneNumber);
        list.add(u);
        System.out.println("添加用户成功");
        printList(list);
    }

    private static void printList(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            System.out.println(u.getUserName() + ", " + u.getPassword() + ", " + u.getPersonID() + ", " + u.getPhone());
        }
    }

    private static boolean checkPhoneNumber(String phoneNumber) {
        // 长度位11位
        if (phoneNumber.length() != 11) {
            return false;
        }
        // 不能以0开头
        if (phoneNumber.startsWith("0")) {
            return false;
        }
        // 必须都是数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }

        return true;
    }

    private static boolean checkPersonID(String personID) {
        // 不能以0开头
        boolean flag = personID.startsWith("0");
        if (flag) {
            System.out.println("身份证号码不能以0开头");
            return false;
        }
        // 长度必须是18位
        if (personID.length() != 18) {
            System.out.println("身份证号码长度必须是18位");
            return false;
        }
        // 前17位 必须是数字
        for (int i = 0; i < personID.length() - 1; i++) {
            char c = personID.charAt(i);
            if (c < '0' || c > '9') {
                System.out.println("身份证号码前17位必须是数字");
                return false;
            }
        }
        char endChar = personID.charAt(personID.length() - 1);
        if (!((endChar >= '0' && endChar <= '9') || endChar == 'X' || endChar == 'x')) {
            System.out.println("身份证号码最后一位只能是数字或者X/x");
            return false;
        }
        return true;
    }

    private static boolean contain(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String name = u.getUserName();
            if (name.equals((username))) {
                return true;
            }
        }
        return false;
    }

    private static boolean validateUsername(String username) {
        int len = username.length();
        int count = 0;
        if (len < 3 || len > 15) {
            System.out.println("输入的用户名不符合用户名规则");
            return false;
        }
        for (int i = 0; i < len; i++) {
            char c = username.charAt(i);
            // 判断必须是a-z A-Z 0-9中的字符  其他字符不通过
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                return false;
            }
        }
        // 判单不能全部是数字
        for (int i = 0; i < len; i++) {
            char c = username.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count++;
                break;
            }
        }
        return count > 0;
    }

    private static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        String username = null;
        while (true) {
            System.out.println("请输入用户名");
            username = sc.next();
            boolean isExist = checkUsername(list, username);
            if (isExist) {
                break;
            } else {
                System.out.println("用户名不存在，请先注册");
            }
        }
        passwordLoop: while (true) {
            System.out.println("请输入密码");
            String password = sc.next();
            // 将输入的用户信息保存到一个对象中
            User userInfo = new User(username, password, null, null);
            boolean checked = checkPasswordAndUsername(list, userInfo);
            if (checked) {
                codeLoop:
                while (true) {
                    String code = getCode();
                    System.out.println("请输入验证码: " + code);
                    String userCode = sc.next();
                    // 忽略大小写进行比较
                    if (userCode.equalsIgnoreCase(code)) {
                        break codeLoop;
                    } else {
                        System.out.println("验证码输入错误，请重新输入");
                        continue;
                    }
                }
                System.out.println("登录成功,欢迎进入用户管理系统");
                break passwordLoop;
            } else {
                System.out.println("用户名或密码输入错误，请重新输入");
            }
        }
    }

    // 判断密码和用户名是否正确
    private static boolean checkPasswordAndUsername(ArrayList<User> list, User userInfo) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUserName().equals(userInfo.getUserName()) && user.getPassword().equals(userInfo.getPassword())) {
                return true;
            }
        }
        return false;
    }


    // 判断用户名是否存在
    private static boolean checkUsername(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUserName().equals(username)) {
                return true;
            }
        }
        return false;
    }

    // 生成一个验证码
    private static String getCode() {
        // 创建一个集合添加所有的大写和小写字母
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            char b = (char) ('A' + i);
            list.add(c);
            list.add(b);
        }
        System.out.println(list);
        // 随机生成四个大小写字母
        Random random = new Random();
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            char c = list.get(random.nextInt(52));
            code.append(c);
        }
        // 随机生成一个数字添加到code字符串中
        int number = random.nextInt(10);
        code.append(number);
        // 数字要求随机位置
        char[] arr = code.toString().toCharArray();
        int pos = random.nextInt(arr.length);
        char temp = arr[arr.length - 1];
        arr[arr.length - 1] = arr[pos];
        arr[pos] = temp;

        return new String(arr);
    }
}
