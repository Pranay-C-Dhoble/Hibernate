package onetomany.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ans {
    @Id
    private int aid;
    private String answer;
     @ManyToOne
    private Que question;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Que getQuestion() {
        return question;
    }

    public void setQuestion(Que question) {
        this.question = question;
    }

    public Ans(int aid, String answer, Que question) {
        this.aid = aid;
        this.answer = answer;
        this.question = question;
    }
    public Ans(){
        super();
    }
}
