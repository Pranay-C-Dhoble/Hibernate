package persistencelifecyclestate.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class CertificateL {
    private String course;
    private String duration;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public CertificateL(String course, String duration) {
        this.course = course;
        this.duration = duration;
    }
    public CertificateL(){
        super();
    }

    @Override
    public String toString() {
        return "CertificateL{" +
                "course='" + course + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
