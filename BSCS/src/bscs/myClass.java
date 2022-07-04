
package bscs;

public abstract class myClass {
    
public abstract void greetings(String msg);
 public void msg()
 {
     System.out.println("Concrete Method");   
 }
}

class class1 extends myClass{

    @Override
    public void greetings(String msg) {
        System.out.println(msg);
    }
    
}