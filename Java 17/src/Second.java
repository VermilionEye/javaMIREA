public class Second {
    public static void main(String[] args) {

        Employee employee = new Employee("John Doe", "Developer", 50000);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(employee, view);


        controller.updateView();


        controller.setEmployeeName("Jane Smith");
        controller.setEmployeePosition("Manager");
        controller.setEmployeeSalary(60000);


        controller.updateView();
    }
}