package sinhvien.com.impl;

import sinhvien.com.model.Student;
import sinhvien.com.service.StudentService;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentImpl implements StudentService {
    private static Student[] students = new Student[50];

    @Override
    public Student create(Student student) {

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }

        }
        return null;
    }

    @Override
    public Student update(Student student) {

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].geteId().equals(student.geteId())) {
                students[i] = student;
                break;
            }

        }
        return null;
    }

    @Override
    public Student[] readAll() {
        if (students[0] == null) {
            students[0] = new Student("1", "Duy", "18", "01", "24K51", "K51");
            students[1] = new Student("2", "Vinh", "18", "02", "24K51", "K51");
            students[2] = new Student("3", "Tien", "18", "03", "24K51", "K51");
            students[3] = new Student("4", "Minh", "18", "04", "24K51", "K51");
            students[4] = new Student("5", "Hang", "18", "05", "24K51", "K51");
        }
        return students;

    }

    ArrayList<Student> marg() {
        readAll();
        ArrayList<Student> arrayList = new ArrayList<>();
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                arrayList.add(students[i]);

            }
        }
            return arrayList;
        };

        @Override
        public Student delete (String msv){
            ArrayList<Student> arrayList = marg();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (students[i2] != null && students[i2].getMsv().equals(msv)) {
                        arrayList.remove(i2);

                    }
                    students[i2] = arrayList.get(i2);

                }
            return null;
            }


    }
