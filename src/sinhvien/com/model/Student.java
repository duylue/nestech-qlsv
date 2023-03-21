package sinhvien.com.model;

public class Student extends User {
    private String msv;
    private String classId;
    private String tenKhoa;

    public Student(String msv, String classId, String tenKhoa) {
        this.msv = msv;
        this.classId = classId;
        this.tenKhoa = tenKhoa;
    }

    public Student(String eId, String name, String age, String msv, String classId, String tenKhoa) {
        super(eId, name, age);
        this.msv = msv;
        this.classId = classId;
        this.tenKhoa = tenKhoa;
    }

    public Student() {

    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "eid='" + super.geteId() + '\'' +
                "name='" + super.getName() + '\'' +
                "age='" + super.getAge() + '\'' +
                "msv='" + msv + '\'' +
                ", classId='" + classId + '\'' +
                ", tenKhoa='" + tenKhoa + '\'' +
                '}';
    }
}
