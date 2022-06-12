public class ManagerStudent {
    private String lop;
    private String khoahoc;
    private int kyhoc;

    public ManagerStudent() {
    }

    public ManagerStudent(String lop, String khoahoc, int kyhoc) {
        this.lop = lop;
        this.khoahoc = khoahoc;
        this.kyhoc = kyhoc;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoahoc() {
        return khoahoc;
    }

    public void setKhoahoc(String khoahoc) {
        this.khoahoc = khoahoc;
    }

    public int getKyhoc() {
        return kyhoc;
    }

    public void setKyhoc(int kyhoc) {
        this.kyhoc = kyhoc;
    }

    @Override
    public String toString() {
        return "ManagerStudent{" +
                "lop='" + lop + '\'' +
                ", khoahoc='" + khoahoc + '\'' +
                ", kyhoc=" + kyhoc +
                '}';
    }
}
