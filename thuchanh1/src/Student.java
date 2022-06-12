import java.util.Date;

public class Student extends ManagerStudent{
    private String name;
    private Date birthday;
    private String address;

    public Student() {
    }



    public Student(String lop, String khoahoc, int kyhoc, String name, Date birthday, String address) {
        super(lop, khoahoc, kyhoc);
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}' + super.toString();
    }
}
