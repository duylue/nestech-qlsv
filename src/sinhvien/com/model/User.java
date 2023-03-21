package sinhvien.com.model;

public class User {
    private String eId;
    private String name;
    private String age;

    public User() {
    }

    public User(String eId, String name, String age) {
        this.eId = eId;
        this.name = name;
        this.age = age;
    }

    public String geteId() {
        return eId;
    }

    public void seteId(String eId) {
        this.eId = eId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
