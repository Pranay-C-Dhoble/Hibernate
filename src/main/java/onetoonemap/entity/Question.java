package onetoonemap.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
    @Id
    private int questionId;
    private String question;
    @OneToOne //This is used to specify that this is a one to one mapping
    @JoinColumn(name = "answerId") //This is used to specify the name of the column in the Question table
    private Answer answer;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public Question(int questionId, String question, Answer answer) {
        this.questionId = questionId;
        this.question = question;
        this.answer = answer;
    }
    public Question(){
        super();
    }
}
