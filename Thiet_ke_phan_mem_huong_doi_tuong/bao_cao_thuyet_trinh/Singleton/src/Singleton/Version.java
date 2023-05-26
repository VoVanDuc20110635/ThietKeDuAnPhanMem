package Singleton;

public class Version {
    private String phienBan;
    private String nhaPhatHanh;
    private String namPhatHanh;

    public Version(String phienBan,
                   String nhaPhatHanh,
                   String namPhatHanh) {
        this.phienBan = phienBan;
        this.nhaPhatHanh = nhaPhatHanh;
        this.namPhatHanh = namPhatHanh;
    }

    public String getPhienBan() {
        return phienBan;
    }

    public void setPhienBan(String phienBan) {
        this.phienBan = phienBan;
    }

    public String getNhaPhatHanh() {
        return nhaPhatHanh;
    }

    public void setNhaPhatHanh(String nhaPhatHanh) {
        this.nhaPhatHanh = nhaPhatHanh;
    }

    public String getNamPhatHanh() {
        return namPhatHanh;
    }

    public void setNamPhatHanh(String namPhatHanh) {
        this.namPhatHanh = namPhatHanh;
    }

    public void print(){
        System.out.println("Phien ban: " + phienBan + "\nNha Phat Hanh: " + nhaPhatHanh + "\nNam Phat Hanh: " + namPhatHanh);
    }
}
