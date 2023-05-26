package Singleton;

public class VersionSingleton {
    private static VersionSingleton instance;
    private String phienBan;
    private String nhaPhatHanh;
    private String namPhatHanh;

    private VersionSingleton(String phienBan,
                             String nhaPhatHanh,
                             String namPhatHanh) {
        this.phienBan = phienBan;
        this.nhaPhatHanh = nhaPhatHanh;
        this.namPhatHanh = namPhatHanh;
    }

    public static synchronized VersionSingleton getInstance(
            String phienBan,
            String nhaPhatHanh,
            String namPhatHanh){
        if (instance == null){
            instance = new VersionSingleton(phienBan,
                    nhaPhatHanh,
                    namPhatHanh);
            return instance;
        }
        return instance;
    }
    public static VersionSingleton getInstance(){
        return instance;
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
