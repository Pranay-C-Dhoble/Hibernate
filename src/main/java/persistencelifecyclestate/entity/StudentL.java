package persistencelifecyclestate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentL {
    @Id
    private int sid;
    private String sname;
    private String city;
    private CertificateL certificate;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public CertificateL getCertificate() {
        return certificate;
    }

    public void setCertificate(CertificateL certificate) {
        this.certificate = certificate;
    }

    public StudentL(int sid, String sname, String city, CertificateL certificate) {
        this.sid = sid;
        this.sname = sname;
        this.city = city;
        this.certificate = certificate;
    }
    public StudentL(){
        super();
    }

    @Override
    public String toString() {
        return "StudentL{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", city='" + city + '\'' +
                ", certificate=" + certificate +
                '}';
    }
}
