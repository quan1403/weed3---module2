import java.util.Date;

public class Student {
  private String name;
  private  int MSV;
  private Date ngaysinh;
  private String lop;

    public Student() {
    }

    public Student(String name, int MSV, Date ngaysinh, String lop) {
        this.name = name;
        this.MSV = MSV;
        this.ngaysinh = ngaysinh;
        this.lop = lop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMSV() {
        return MSV;
    }

    public void setMSV(int MSV) {
        this.MSV = MSV;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", MSV=" + MSV +
                ", ngaysinh=" + ngaysinh +
                ", lop='" + lop + '\'' +
                '}';
    }
}

