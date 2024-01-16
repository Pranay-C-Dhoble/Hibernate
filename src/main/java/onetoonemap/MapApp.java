package onetoonemap;

import onetoonemap.entity.Answer;
import onetoonemap.entity.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapApp {
    public static void main(String[] args) {
        System.out.println("Program Started .....");

        //Creating Configuration Object
        Configuration cfg = new Configuration();
        cfg.configure("onetoonemap.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Question question = new Question();
        question.setQuestionId(1);
        question.setQuestion("What is Java?");

        Answer answer = new Answer();
        answer.setAnswerId(1);
        answer.setAnswer("Java is a programming language");
        answer.setQuestion(question);
        question.setAnswer(answer);


        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(question);
        session.save(answer);
        tx.commit();


        //fetching the data from the database
        Question newQ = (Question) session.get(Question.class, 1);
        System.out.println(newQ.getQuestion());
        System.out.println(newQ.getAnswer().getAnswer());

        session.close();
        factory.close();
        System.out.println("Program Ended .....");
    }
}
