package fetchtechnique.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
@Entity
public class QuestionF {
    @Id
    private int qid;
    private String question;
    @OneToMany (mappedBy = "question", fetch = FetchType.EAGER) //fetch = FetchType.EAGER is used to fetch the data from the database
    //EAGER is a design pattern in which data loading occurs on the spot. It is a data loading mechanism where data is loaded all at once.
    //LAZY is a design pattern in which data loading does not occur on the spot. It is a data loading mechanism where data is loaded on demand.
    private List<AnswerF> answers;

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<AnswerF> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AnswerF> answers) {
        this.answers = answers;
    }

    public QuestionF(int qid, String question, List<AnswerF> answers) {
        this.qid = qid;
        this.question = question;
        this.answers = answers;
    }
    public QuestionF(){
        super();
    }
}
