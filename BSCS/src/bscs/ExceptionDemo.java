
package bscs;

public class ExceptionDemo {

    public static void main(String[] args) {
        int a =10,b=10;
        int[] ar = new int[2];
        ar[0] =12;
        ar[1]=36;
        String name="Ali";
        try{
        System.out.println(a/b);
        System.out.println(name.length());
        System.out.println(ar[1]);
        }
        catch(ArithmeticException e)
        {   
            System.out.println("Divide by Zero not possible");
        }
        catch (NullPointerException e)
        {
            System.out.println("String is null");
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println( "err! index out of bound " );
        }
        finally{
            System.out.println("Finally Block");
        }
    
        System.out.println("Hello");
    }
    
}
