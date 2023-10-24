package Architecture_op.HW_8;

public class Main {
    public static void main(String[] args) {

    EmployeeModel employeeModel = new EmployeeModel(10, "Marina", "Developer");
    EmployeeView employeeView = new EmployeeView();

    Controller controller = new Controller(employeeModel, employeeView);

    controller.updateView();

    //обновления, автоматически генерируемые контроллером
    System.out.println("---------------------------- ");
    controller.setEmployeeJob("Programmer");
    System.out.println("---------------------------- ");
    controller.setEmployeeJob("Manager");
    System.out.println("---------------------------- ");
    controller.setEmployeeId(200);

}
}
