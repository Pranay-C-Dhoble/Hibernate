package onetomany;

import onetomany.entity.Ans;
import onetomany.entity.Que;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class OneToManyApp {
    public static void main(String[] args) {
        System.out.println("Program Started .....");

        //Creating Configuration Object
        Configuration cfg = new Configuration();
        cfg.configure("onetomany.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Que que = new Que();
        que.setQid(1);
        que.setQuestion("What is Java?");

        Ans ans1 = new Ans();
        ans1.setAid(1);
        ans1.setAnswer("Java is a programming language");
        ans1.setQuestion(que);

        Ans ans2 = new Ans();
        ans2.setAid(2);
        ans2.setAnswer("Java is a platform");
        ans2.setQuestion(que);

        Ans ans3 = new Ans();
        ans3.setAid(3);
        ans3.setAnswer("Java has many frameworks");
        ans3.setQuestion(que);

        List<Ans> answers = List.of(ans1, ans2, ans3);
        que.setAnswers(answers);

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(que);
        session.save(ans1);
        session.save(ans2);
        session.save(ans3);


        //fetching the data from the database
        Que newQ = (Que) session.get(Que.class, 1);
        System.out.println(newQ.getQuestion());

        for(Ans a : newQ.getAnswers()){
            System.out.println(a.getAnswer());
        }

        tx.commit();
        session.close();
        factory.close();
    }
}
