package Architecture_op.HW_8;

public class EmployeeModel {
    private int id;
    private String name;
    private String job;

    public EmployeeModel(int id, String name, String job) {
        super();
        this.id = id;
        this.name = name;
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

}
