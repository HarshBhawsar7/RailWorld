package Day12.Collection;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
    private int eid;
    private String ename;
    private String edept;

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

    public String getEdept() {
        return edept;
    }

    public void setEdept(String edept) {
        this.edept = edept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", edept='" + edept + '\'' +
                '}';
    }

    public Employee(int eid, String ename, String edept) {
        this.eid = eid;
        this.ename = ename;
        this.edept = edept;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.eid<o2.eid)
        return o2.getEid();
        else
            return o1.getEid();
    }

   public Employee(){

   }
}
