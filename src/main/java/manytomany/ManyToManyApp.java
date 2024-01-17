package manytomany;

import manytomany.entity.Emp;
import manytomany.entity.Proj;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ManyToManyApp {
    public static void main(String[] args) {
        System.out.println("Program Started .....");
        Configuration cfg = new Configuration();
        cfg.configure("manytomany.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        //Employee Object
        Emp emp1 = new Emp();
        emp1.setEid(1);
        emp1.setEname("Raj");

        Emp emp2 = new Emp();
        emp2.setEid(2);
        emp2.setEname("Rahul");

        Emp emp3 = new Emp();
        emp3.setEid(3);
        emp3.setEname("Ramesh");

        //Project Object
        Proj proj1 = new Proj();
        proj1.setPid(1);
        proj1.setPname("Transaction Management System");

        Proj proj2 = new Proj();
        proj2.setPid(2);
        proj2.setPname("Employee Management System");

        Proj proj3 = new Proj();
        proj3.setPid(3);
        proj3.setPname("Hospital Management System");

        //List of Employees
        List<Emp> elist1 = List.of(emp1, emp2);
        List<Emp> elist2 = List.of(emp2, emp3);

        //List of Projects
        List<Proj> plist1 = List.of(proj1, proj2);
        List<Proj> plist2 = List.of(proj2, proj3);

        //Setting the list of Employees to the Project
        emp1.setProjects(plist1);
        emp2.setProjects(plist2);

        //Setting the list of Projects to the Employee
        proj1.setEmployees(elist1);
        proj2.setEmployees(elist2);

        //Saving the data

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(emp1);
        session.save(emp2);
        session.save(emp3);
        session.save(proj1);
        session.save(proj2);
        session.save(proj3);
        tx.commit();
        session.close();
        factory.close();
    }
}
