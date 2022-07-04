
package bscs;

class parent{
    public void drive()
    {
        System.out.println("Drive Slow");
    }
}
class child extends parent{
    public void drive()
    {
        System.out.println("Drive Very Fast");
    }
}
class grandChild extends parent{
    public void drive()
    {
        System.out.println("Drive very slow");
    }
}
public class overridingDemo {
    public static void main(String[] args) {
        
        parent p1 =new parent();
        child c1 = new child();
        grandChild gc1 =new grandChild();
        
        p1.drive();
        c1.drive();
        gc1.drive();
    }
    
}
