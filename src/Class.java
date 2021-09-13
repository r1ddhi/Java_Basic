import java.util.Scanner;
class Employee//SE4 25 RIDDHI KUMBHANI
{
        int empID;
        String empname ;
        float basicSalary;
        float DA; float HRA; int incomeTax;

    void dataOfTheEmployee()
        {
            Scanner INPUT = new Scanner(System.in);
            System.out.println(" ENTER THE empID,empname,basicSalary,DA,HRA,incomeTax  : ");
            empID= INPUT.nextInt();
            empname = INPUT.next();
            basicSalary = INPUT.nextFloat();
            DA = INPUT.nextFloat();HRA= INPUT.nextFloat();incomeTax= INPUT.nextInt();
        }
void DisplayData()
    {
        System.out.println("THE GROSS SALARY IS : " + (basicSalary+DA+HRA+incomeTax));
        System.out.println( empID+ " " + empname  +" "+  basicSalary);
    }
 }
class Class
{
     public static void main(String[] args)
    {
        Employee data[]= new Employee[1];
        {
            for (int i = 0;i < 1; i++) {
                data[i] = new Employee();
                data[i].dataOfTheEmployee();
            }System.out.println("~~~~~~~~~~~~~~~~~~EMPLOYEE DATA~~~~~~~~~~~~~~~~~~");
           for (int i = 0;i < 1; i++) {
                data[i].DisplayData();
            }
        }
    }
}