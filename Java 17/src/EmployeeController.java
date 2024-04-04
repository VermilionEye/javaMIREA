public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }



    public void setEmployeePosition(String position) {
        model.setPosition(position);
    }



    public void setEmployeeSalary(double salary) {
        model.setSalary(salary);
    }



    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.getPosition(), model.getSalary());
    }
}