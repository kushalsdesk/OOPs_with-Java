
import java.util.*;

/**
 * exercise
 */
class Employee {
    private String Employee_name;
    private int Employee_id;

    Employee(String name, int id) {
        this.Employee_name = name;
        this.Employee_id = id;
    }

    public int getid() {
        return this.Employee_id;
    }

    public String getname() {
        return this.Employee_name;
    }

    public String showEmployee() {
        String s = String.valueOf(this.Employee_id) + ": " + this.Employee_name;
        return s;
    }
}

class Registration {

    private Employee[] emp_array;
    private int maxEmpid;

    public Registration() {
        this.emp_array = new Employee[103];
        this.maxEmpid = -1;
    }

    // creating a register
    public Boolean register(String name, int id) {
        maxEmpid++;
        Employee emp = new Employee(name, id);
        emp_array[maxEmpid] = emp;
        return true;

    }

    public void showRegister() {
        for (Employee ele : emp_array) {
            if (ele != null) {
                String s = ele.showEmployee();
                System.out.println(s);
            }
        }
    }

    public String findEmployee(String name) {
        String s = name;
        for (Employee ele : emp_array) {
            if (ele == null) {
                return "N/A";
            } else if (ele.getname().equals(name)) {
                s = ele.showEmployee();
                return s;
            }
        }

        return s;
    }
}

public class Employee_Register {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        String flush;
        Scanner sc = new Scanner(System.in);
        Registration register = new Registration();
        int n = sc.nextInt();
        flush = sc.nextLine();
        for (int i = 1; i <= n; i++) {
            String Emp_name = sc.nextLine();
            register.register(Emp_name, i);
        }

        String search_emp = sc.nextLine();
        register.showRegister();
        String searched_emp = register.findEmployee(search_emp);
        System.out.println(searched_emp);
        sc.close();

    }

}