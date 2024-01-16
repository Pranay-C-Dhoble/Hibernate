package onetomany.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Que {
    @Id
    private int qid;
    private String question;
    @OneToMany(mappedBy = "question") //mappedBy is used to map the foreign key in the Ans class
    //to the primary key in the Que class
    //when we use mappedBy then table of que-ans will not be created
    //instead the foreign key will be created in the ans table
    private List<Ans> answers;

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

    public List<Ans> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Ans> answers) {
        this.answers = answers;
    }

    public Que(int qid, String question, List<Ans> answers) {
        this.qid = qid;
        this.question = question;
        this.answers = answers;
    }
    public Que(){
        super();
    }
}
