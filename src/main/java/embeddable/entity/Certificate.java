package embeddable.entity;

import javax.persistence.Embeddable;

@Embeddable //@Embeddable is used to mark the class as an embeddable class
//Which means that this class will be embedded in another class
//In this case, this class will be embedded in Student class
public class Certificate {
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

    public Certificate(String course, String duration) {
        this.course = course;
        this.duration = duration;
    }
    public Certificate(){
        super();
    }
}
