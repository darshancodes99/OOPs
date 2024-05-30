package Twenty_one_march_Assignment;

public class Assignment_Q_1 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("kartik", JobTitle.Peon, 20000.0);
        employees[1] = new Employee("kishan", JobTitle.Prof, 40000.0);
        employees[2] = new Employee("maulik", JobTitle.HOD, 60000.0);
        employees[3] = new Employee("gautam", JobTitle.Principal, 80000.0);
        employees[4] = new Employee("harsh", JobTitle.Peon, 40000.0);
        employees[5] = new Employee("dhruv", JobTitle.Prof, 40000.0);
        employees[6] = new Employee("jay", JobTitle.Prof, 40000.0);
        employees[7] = new Employee("het", JobTitle.Prof, 40000.0);
        employees[8] = new Employee("kishan", JobTitle.Peon, 20000.0);
        employees[9] = new Employee("kishan", JobTitle.Peon, 15000.0);

        //total salary of employee
        Employee.EmployeeData(employees);

    }
}

class Employee {
    int empId;
    String name;
    double salary;
    JobTitle empjobTitle;
    static int unique;

    Employee(String name, JobTitle empjobTitle, double salary) {
        this.empId = ++unique;
        this.name = name;
        this.empjobTitle = empjobTitle;
        this.salary = salary;
    }

    public static void EmployeeData(Employee[] employees){
        double Peon = 0;
        double Prof = 0;
        double HOD = 0;
        double Principal = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].empjobTitle == JobTitle.Prof) {
                Prof += employees[i].salary;
            } else if (employees[i].empjobTitle == JobTitle.Peon) {
                Peon += employees[i].salary;
            } else if (employees[i].empjobTitle == JobTitle.HOD) {
                HOD += employees[i].salary;
            } else if (employees[i].empjobTitle == JobTitle.Principal) {
                Principal += employees[i].salary;
            }
        }

        System.out.println("Peon : " + Peon);
        System.out.println("Prof : " + Prof);
        System.out.println("HOD : " + HOD);
        System.out.println("Principal : " + Principal);
    }
}
