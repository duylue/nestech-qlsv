package sinhvien.com.service;

import sinhvien.com.model.Student;

public interface StudentService {

    Student create(Student student);
    Student update(Student student);
    Student[] readAll();
    Student
    delete(String msv);


}
