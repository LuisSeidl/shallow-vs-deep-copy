public class Employee implements Cloneable{
    private int employeeId;
    private String employeeName;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Department department;


    public Employee(int employeeId, String employeeName, Department department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
    }


    public void print() {
        System.out.println("Object ID: " + this);
        System.out.println("Department ID: " + this.department);
    }


    public Employee shallow_clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning failed");
        }
        return null;
    }


    public Employee(Employee employee) {
        this.employeeId = employee.employeeId;
        this.employeeName = employee.employeeName;
        this.department = new Department(employee.department.getId(),employee.department.getName());
    }
}
