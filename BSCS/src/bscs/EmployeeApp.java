
package bscs;

import java.util.Scanner;

public class EmployeeApp 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        
        // object intialization
        Employee e1 =new Employee(1,"Asad");
        Employee e2 =new Employee(2,"Khalid");
        
        //System.out.print("Enter Employee Id:");
      //  e1.id =obj.nextInt();
        
       // System.out.print("Enter Employee Name:");
      //  e1.name =obj.next();
        
        System.out.print("Enter Employee LastName:");
        e1.lname = obj.next();
        
        System.out.print("Enter Employee Salary:");
        e1.salary=obj.nextDouble();
        
        //e2.id =2;
        //e2.name ="Ali";
        e2.lname = "Shaikh";
        e2.salary=15000.00;
        
        e1.details();
        e2.details();
    }
}
