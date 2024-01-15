package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.example.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Program Started .....");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        //Creating Student Object
        Student student = new Student();
        student.setId(2);
        student.setName("Pranay");
        student.setCity("Nagpur");
        System.out.println(student);

        //Saving Student Object
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
        System.out.println("Program Ended .....");


    }
}
