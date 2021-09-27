import java.util.Scanner;
class Employee
{
    int empid;
    String empname;
    float Salary;
    float DA;
    float HRA;
    float IncomeTax;
    float gross_salary;
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID :");
        empid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee Name :");
        empname = sc.nextLine();
        System.out.println("Enter Basic Salary :");
        Salary = sc.nextInt();
        System.out.println("Enter DA :");
        DA = sc.nextInt();
        System.out.println("Enter HRA :");
        HRA = sc.nextInt();
        System.out.println("Enter Income Tax :");
        IncomeTax = sc.nextInt();

    }
    void grossSalary()
    {
        gross_salary = Salary+DA+HRA+IncomeTax;
    }
    void display()
    {
        System.out.println("Name of Employee "+empname);
        System.out.println("Employee ID :"+empid);
        System.out.println("Gross Salary :"+gross_salary);
    }
}
class EXPT2 {
        public static void main(String[] args) {
            Employee emp = new Employee();
            emp.accept();
            emp.grossSalary();
            emp.display();
        }
    }
