
package bscs;


public class Employee {
    // properties
    public int id;
    public String name;
    public String lname;
    public double salary;
    
    // constructor
    Employee(int id, String name)
    {
       this.name = name;
       this.id = id;
    }
    //action
    public void details()
    {
        System.out.println("Printing Employee Details");
        System.out.println("==========================");
        System.out.println("Id:" + id);
        System.out.println("Name:" + name);
        System.out.println("Last Name:" + lname);
        System.out.println("Salary:" + salary);
    }
}
