package manytomany.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;
@Entity
public class Proj {
    @Id
    private int pid;
    private String pname;
    @ManyToMany(mappedBy = "projects") //mappedBy is used to map the foreign key in the Emp class
    private List<Emp> employees;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public List<Emp> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Emp> employees) {
        this.employees = employees;
    }

    public Proj(int pid, String pname, List<Emp> employees) {
        this.pid = pid;
        this.pname = pname;
        this.employees = employees;
    }
    public Proj(){
        super();
    }
}
