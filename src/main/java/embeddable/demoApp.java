package embeddable;

import embeddable.entity.Certificate;
import embeddable.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class demoApp {
    public static void main(String[] args) {
        System.out.println("Program Started .....");
        Configuration cfg = new Configuration();
        cfg.configure("embeddable.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Student student = new Student();
        student.setId(1);
        student.setName("Swaraj");
        student.setCity("Nagpur");
        student.setCertificate(new Certificate("Java", "2 months"));

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(student);
        tx.commit();
        session.close();
        System.out.println("Program Ended .....");
    }
}
