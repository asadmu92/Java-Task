
package bscs;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        
        Scanner obj =new Scanner(System.in);
        
        //creating objects
        Student s1 =new Student();
        Student s2 =new Student();
        //accessing property
        s1.id=1;
        System.out.println("Enter Student Name:");
        s1.Name=obj.nextLine();
        
        s1.Lname="Khan";
        
        s2.id=2;
        s2.Name="Amjad";
        s2.Lname="Khan";
        
        //accessing method
        s1.Details();
        s2.Details();
    }
}
