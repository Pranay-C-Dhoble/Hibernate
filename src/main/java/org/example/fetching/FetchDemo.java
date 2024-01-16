package org.example.fetching;

import org.example.entity.Address;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
    public static void main(String[] args) {
        //get vs load

        //get -> if the data is not present in the database then it will return null
        //Use if you are not sure that the data is present in the database or not
        //get() --> it involves database hit if object is not found in Session Cache and return fully initialized object
        //which may involve several database calls.

        //load -> if the data is not present in the database then it will throw an exception //ObjectNotFoundException
        //Use if you are sure that the data is present in the database
        //load() --> it never hit the database and return proxy object which is not fully initialized object
        //and it will hit the database only when you access any property of the object.

        //proxy object is an object which is not fully initialized

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        //getStudent(session);
        Student s = (Student) session.load(Student.class,1);
//        System.out.println(s);
        Student s1 = (Student) session.load(Student.class,1);
//        System.out.println(s1);

        //GetAddress(session);
//        Address address = (Address) session.get(Address.class,1);
//        System.out.println(address.getCity());


//        Address address1= (Address) session.get(Address.class,1);
//        System.out.println(address1.getCity());

        session.close();
        factory.close();
    }
}
