package Architecture_op.HW_8;

public class Controller {
    private EmployeeModel employeeModel;
    private EmployeeView employeeView;

    public Controller(EmployeeModel employeeModel, EmployeeView employeeView) {
        super();
        this.employeeModel = employeeModel;
        this.employeeView = employeeView;
    }

    public void setEmployeeId (int id) {
        employeeModel.setId(id);
        updateView();
    }

    public int getEmployeeId () {
        return employeeModel.getId();
    }

    public void setEmployeeName (String name) {
        employeeModel.setName(name);
        updateView();
    }

    public String getEmployeeName () {
        return employeeModel.getName();
    }

    public void setEmployeeJob (String job) {
        employeeModel.setJob(job);
        updateView();
    }

    public String getEmployeeJob() {
        return employeeModel.getJob();
    }

    public void updateView(){
        employeeView.printEmployeeInformation(employeeModel);
    }


}
