
package bscs;


public class ConditionalDemo {
    public static void main(String[] args) {
        
        int percentage =95;
        
        if(percentage>=80 && percentage<=100)
        {
            System.out.println("A1 Grade");
        }
        else if(percentage>=70 && percentage<80)
        {
            System.out.println("A Grade");
        }
        else if(percentage>=60 && percentage<70)
        {
            System.out.println("B Grade");
        }
        else
        {
            System.out.println("Invalid Percentage");
        }
    }
}
