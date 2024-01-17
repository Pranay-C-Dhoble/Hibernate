package fetchtechnique;

import fetchtechnique.entity.AnswerF;
import fetchtechnique.entity.QuestionF;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class FetchApp {
    public static void main(String[] args) {
        System.out.println("Program Started .....");
        Configuration cfg = new Configuration();
        cfg.configure("fetchtechnique.xml");
        SessionFactory factory = cfg.buildSessionFactory();


//        //Question Object
//        QuestionF q1 = new QuestionF();
//        q1.setQid(1);
//        q1.setQuestion("What is Java?");
//
//        //Answer Object
//        AnswerF a1 = new AnswerF();
//        a1.setAid(1);
//        a1.setAnswer("Java is a Programming Language");
//        a1.setQuestion(q1);
//
//        //Answer Object
//        AnswerF a2 = new AnswerF();
//        a2.setAid(2);
//        a2.setAnswer("Java is a Platform");
//        a2.setQuestion(q1);
//
//        //Setting the list of Answers to the Question
//        List<AnswerF> alist = List.of(a1, a2);
//        q1.setAnswers(alist);


        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
//        session.save(q1);
//        session.save(a1);
//        session.save(a2);
        transaction.commit();

        //Fetching the data
        QuestionF question = session.get(QuestionF.class, 1);
        System.out.println(question.getQid());
        System.out.println(question.getQuestion());
//        System.out.println(question.getAnswers().size());

        session.close();
        factory.close();
    }
}
