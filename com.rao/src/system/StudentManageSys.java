package system;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManageSys {
    public static void main(String[] args) {
        ArrayList<Student> stuList = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("------------------欢迎来到学生管理系统------------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请输入操作按钮:");
            Scanner sc = new Scanner(System.in);

            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(stuList);
                case "2" -> deleteStudent(stuList);
                case "3" -> uodateStudent(stuList);
                case "4" -> queryStudent(stuList);
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                    // System.exit(0); // 停止虚拟机运行
                }
                default -> System.out.println("请输入正确的操作");
            }
        }
    }

    // 添加学生信息
    public static void addStudent(ArrayList<Student> stuList) {
        Student student1 = new Student();
        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) {
            System.out.println("请输入学生id:");
            id = sc.next();
            boolean flag = contains(stuList, id);
            if (flag) {
                System.out.println("当前系统已经包含该学生id，请重新输入:");
            } else {
                student1.setId(id);
                break;
            }
        }

        System.out.println("请输入学生姓名:");
        String name = sc.next();
        student1.setName(name);

        System.out.println("请输入学生年龄:");
        int age = sc.nextInt();
        student1.setAge(age);

        System.out.println("请输入学生家庭地址:");
        String address = sc.next();
        student1.setAddress(address);

        stuList.add(student1);
        System.out.println("学生信息添加成功");
    }

    // 删除学生信息
    public static void deleteStudent(ArrayList<Student> stuList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生id");
        String id = sc.next();
        int index = getIndexById(stuList, id);
        if (index >= 0) {
            stuList.remove(index);
            System.out.println("删除成功");
        } else {
            System.out.println("id不存在，删除失败");
        }
    }

    // 修改学生信息
    public static void uodateStudent(ArrayList<Student> stuList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生id");
        String id = sc.next();
        int index = getIndexById(stuList, id);
        if (index < 0) {
            System.out.println("你输入的id不存在，请重新输入:");
        } else {
            Student stu =  stuList.get(index);
            System.out.println("请输入要修改的学生姓名");
            String newName = sc.next();
            stu.setName(newName);
            System.out.println("请输入要修改的学生年龄");
            int newAge = sc.nextInt();
            stu.setAge(newAge);
            System.out.println("请输入要修改的学生地址");
            String newAddress = sc.next();
            stu.setAddress(newAddress);
            System.out.println("学生信息修改成功");
        }
    }

    // 查询学生信息
    public static void queryStudent(ArrayList<Student> stuList) {
        if (stuList.size() == 0) {
            System.out.println("当前五学生信息，请添加后再查询!");
            return;
        }
        System.out.println("id\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < stuList.size(); i++) {
            Student student = stuList.get(i);
            System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getAddress());
        }
    }

    // 判断id在集合中是否存在
    public static boolean contains(ArrayList<Student> stuList, String id) {
        // for (Student stu : stuList) {
        //     String _id = stu.getId();
        //     if (_id.equals(id)) {
        //         return true;
        //     }
        // }
        // return false;
        return getIndexById(stuList, id) >= 0;
    }

    // 查找id，如果存在就返回索引值 否则返回-1
    public static int getIndexById(ArrayList<Student> stuList, String id) {
        for (int i = 0; i < stuList.size(); i++) {
            Student stu = stuList.get(i);
            String sid = stu.getId();
            if (sid.equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
