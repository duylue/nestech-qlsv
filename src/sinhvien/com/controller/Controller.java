package sinhvien.com.controller;

import sinhvien.com.impl.StudentImpl;
import sinhvien.com.model.Student;
import sinhvien.com.service.StudentService;

import java.util.Scanner;

public class Controller {
    StudentService service = new StudentImpl();

    public Student[] readAll(){
        return service.readAll();
    }

    public void save(){
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("eid");
        student.seteId(scanner.nextLine());
        System.out.println("ten");
        student.setName(scanner.nextLine());
        System.out.println("tuoi");
        student.setAge(scanner.nextLine());
        System.out.println("msv");
        student.setMsv(scanner.nextLine());
        student.setClassId("24K51");
        student.setTenKhoa("K51");
         service.create(student);
        System.out.println("Tao thanh cong");
    }

    public void update(){
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("eid");
        student.seteId(scanner.nextLine());
        System.out.println("ten");
        student.setName(scanner.nextLine());
        System.out.println("tuoi");
        student.setAge(scanner.nextLine());
        System.out.println("msv");
        student.setMsv(scanner.nextLine());
        student.setClassId("24K51");
        student.setTenKhoa("K51");
        service.update(student);
        System.out.println("Tao thanh cong");
    }

public void del(){
        Scanner scanner = new Scanner(System.in) ;
    System.out.println("Nhap ma sinh vien");
        String msv = scanner.nextLine();
        service.delete(msv);
}
}
