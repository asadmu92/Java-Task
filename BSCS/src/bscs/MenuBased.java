
package bscs;
import java.util.Scanner;
public class MenuBased {
    
    static void Add(int n1,int n2)
    {
        System.out.println("Sum:"+ (n1+n2));
    }
      static void subtract(int n1,int n2)
    {
        System.out.println("Difference:"+ (n1-n2));
    }
        static void Multiply(int n1,int n2)
    {
        System.out.println("Product:"+ (n1*n2));
    }
          static void Division(int n1,int n2)
    {
        System.out.println("Quotient:"+ (n1/n2));
    }
    public static void main(String[] args) {
        int opt,num1,num2;
        boolean check =false;
        Scanner obj =new Scanner(System.in);
        
        do{
        System.out.println("---------Calculator Application---------");
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Division");
        System.out.println("5.Exit");
        
        System.out.print("Enter operation code: ");
        opt = obj.nextInt();
        
        if(opt==1){
            System.out.print("Enter Num1: ");
            num1 = obj.nextInt();
            System.out.print("Enter Num2: ");
            num2 =obj.nextInt();
            Add(num1, num2);
        }
        else if(opt==2){
         System.out.print("Enter Num1: ");
            num1 = obj.nextInt();
            System.out.print("Enter Num2: ");
            num2 =obj.nextInt();
            subtract(num1, num2);
        }
        else if(opt==3){
         System.out.print("Enter Num1: ");
            num1 = obj.nextInt();
            System.out.print("Enter Num2: ");
            num2 =obj.nextInt();
            Multiply(num1, num2);
        }
        else if(opt==4){
         System.out.print("Enter Num1: ");
            num1 = obj.nextInt();
            System.out.print("Enter Num2: ");
            num2 =obj.nextInt();
            Division(num1, num2);
        }
        else if(opt==5){
            System.exit(1);
        }
        else{
            System.out.println("Invalid Operation Code");
        }
        
            System.out.print("Do you want to continue (Y/N)");
            if(obj.next().equalsIgnoreCase("y"))
            {
                check = true;
            }
        
        }while(check);
    }
}
