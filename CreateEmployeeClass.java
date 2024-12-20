package ex_20122024;

public class CreateEmployeeClass {

    String empName;
    String empRole;
    int EmpId;

    public void emp_data(){
        System.out.println("Employees Details!");
        System.out.println("Employee Id:\t"+EmpId);
        System.out.println("Employee Name:\t"+empName);
        System.out.println("Employee Role:\t"+empRole);
        
    }
    
    public static void main(String[] args) {
        CreateEmployeeClass obj1 = new CreateEmployeeClass();

        obj1.EmpId = 101;
        obj1.empName = "Balraj Ponnuswamy";
        obj1.empRole = "Trainer";

        obj1.emp_data();
        
    }
}
