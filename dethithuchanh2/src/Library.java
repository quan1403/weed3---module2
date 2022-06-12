import java.util.Date;

public class Library extends Student {
    private int sophieumuon;
    private Date ngaymuon;
    private Date hantra;
    private String sohieusach;

    public Library(String name, int MSV, Date date, int sophieumuon, Date date1, Date date2, String sohieusacsh) {
    }

    public Library(String name, int MSV, Date ngaysinh, String lop, int sophieumuon, Date ngaymuon, Date hantra, String sohieusach) {
        super(name, MSV, ngaysinh, lop);
        this.sophieumuon = sophieumuon;
        this.ngaymuon = ngaymuon;
        this.hantra = hantra;
        this.sohieusach = sohieusach;
    }

    public Library(String name, int MSV, int ngaysinh, int thangsinh, int namsinh, int sophieumuon, int ngaymuon, int thangmuon, int ngaytra, int thangtra, String sohieusacsh) {
    }

    public int getSophieumuon() {
        return sophieumuon;
    }

    public void setSophieumuon(int sophieumuon) {
        this.sophieumuon = sophieumuon;
    }

    public Date getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(Date ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public Date getHantra() {
        return hantra;
    }

    public void setHantra(Date hantra) {
        this.hantra = hantra;
    }

    public String getSohieusach() {
        return sohieusach;
    }

    public void setSohieusach(String sohieusach) {
        this.sohieusach = sohieusach;
    }

    @Override
    public String toString() {
        return "Library{" +
                "sophieumuon=" + sophieumuon +
                ", ngaymuon=" + ngaymuon +
                ", hantra=" + hantra +
                ", sohieusach='" + sohieusach + '\'' +
                '}';
    }
}
