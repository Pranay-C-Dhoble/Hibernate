package manytomany.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;
@Entity
public class Emp {
    @Id
    private int eid;
    private String ename;
    @ManyToMany
    private List<Proj> projects;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public List<Proj> getProjects() {
        return projects;
    }

    public void setProjects(List<Proj> projects) {
        this.projects = projects;
    }

    public Emp(int eid, String ename, List<Proj> projects) {
        this.eid = eid;
        this.ename = ename;
        this.projects = projects;
    }
    public Emp(){
        super();
    }
}
