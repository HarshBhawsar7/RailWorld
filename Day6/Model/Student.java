package Day6.Model;

public class Student {
    private int sid;
    private String name;
    private String batch;
    private String add;

    private Physics ps;
    private Chemistry cms;
    private Maths ms;

    public Student(){

    }

//    public Student(int sid, String name, String batch, Physics ps, String add, Chemistry cms, Maths ms) {
//        this.sid = sid;
//        this.name = name;
//        this.batch = batch;
//        this.ps = ps;
//        this.add = add;
//        this.cms = cms;
//        this.ms = ms;
//    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public Physics getPs() {
        return ps;
    }

    public void setPs(Physics ps) {
        this.ps = ps;
    }

    public Chemistry getCms() {
        return cms;
    }

    public void setCms(Chemistry cms) {
        this.cms = cms;
    }

    public Maths getMs() {
        return ms;
    }

    public void setMs(Maths ms) {
        this.ms = ms;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", batch='" + batch + '\'' +
                ", add='" + add + '\'' +
                ", ps=" + ps +
                ", cms=" + cms +
                ", ms=" + ms +
                '}';
    }
}
