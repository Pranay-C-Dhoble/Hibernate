package persistencelifecyclestate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import persistencelifecyclestate.entity.CertificateL;
import persistencelifecyclestate.entity.StudentL;

public class LifeCycleApp {
    public static void main(String[] args) {
        //Persistence lifecycle states
        //1. New/Transient
        //2. Persistent/Managed
        //3. Detached
        //4. Removed
        System.out.println("Program Started .....");

        SessionFactory factory = new Configuration().configure("persistencelifecycle.xml").buildSessionFactory();

        //Creating Student Object
        StudentL student = new StudentL();
        student.setSid(1);
        student.setSname("Swaraj");
        student.setCity("Nagpur");
        student.setCertificate(new CertificateL("Java", "2 months"));
        //student object is in new/transient state

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        //student object is in persistent/managed state :session,database
        student.setCity("Pune"); //here update query will be fired

//        session.remove(student);
//        //Student object is in removed state
//        //here delete query will be fired

        transaction.commit();


        session.close();
        //student object is in detached state

        student.setCity("Mumbai"); //here update query will not be fired
        System.out.println(student);


        factory.close();
    }
}
