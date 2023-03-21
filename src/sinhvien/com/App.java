package sinhvien.com;

import sinhvien.com.controller.Controller;
import sinhvien.com.model.Student;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();
        Student student;
        do {
            System.out.println("1. Xem danh sach sinh vien");
            System.out.println("2. Tạo Sinh viên");
            System.out.println("3. Sua Sinh viên");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Student[] students = controller.readAll();
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] == null) {
                            break;
                        }
                        student = students[i];
                        System.out.println(student.toString());
                    }
                    break;
                case 2:
                    controller.save();
                    break;
                case 3:
                    controller.update();
                    break;
                case 4:
                    controller.del();

            }

        } while (true);
    }
}
