package fetchtechnique.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AnswerF {
    @Id
    private int aid;
    private String answer;
    @ManyToOne
    private QuestionF question;

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

    public QuestionF getQuestion() {
        return question;
    }

    public void setQuestion(QuestionF question) {
        this.question = question;
    }

    public AnswerF(int aid, String answer, QuestionF question) {
        this.aid = aid;
        this.answer = answer;
        this.question = question;
    }
    public AnswerF(){
        super();
    }
}
