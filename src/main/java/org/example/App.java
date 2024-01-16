package org.example;

import org.example.entity.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.example.entity.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println("Program Started .....");

        //Creating Configuration Object
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        //Creating Student Object
        Student student = new Student();
//        student.setId(1);
        student.setName("Swaraj");
        student.setCity("Nagpur");
        System.out.println(student);

        //Creating Address Object
        Address address = new Address();
        address.setStreet("Street 1");
        address.setCity("Delhi");
        address.setIsopen(true);
        address.setX(123.123);
        address.setAddedDate(new Date());
        FileInputStream fis = new FileInputStream("src/main/resources/Pranay.jpg");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        address.setImage(data);



        //Saving Student Object
        Session session = factory.openSession(); //openSession() is used to open the session
        //here what is mean by session?
        //session is a interface which is used to save the data in the database.

        //why openSession() and not getCurrentSession()?
        //getCurrentSession() is used when we are using Spring Framework
        //openSession() is used when we are using Hibernate Framework

        //Why we need Session Object?
        //Session Object is used to save the data in the database

        //Transaction is used to make sure that the data is saved in the database
        Transaction tx = session.beginTransaction();
        session.save(student);
        session.save(address);
        tx.commit();
        session.close();
        System.out.println("Program Ended .....");
    }
}
