
package bscs;

public class staticApp {
    public static void main(String[] args) {
        
        staticDemo.discount = 0.10;
        staticDemo.discount = 0.15;
       
        staticDemo d1= new staticDemo("Product 1", 25000.00);
        d1.getDiscount();
        
        
         staticDemo d2= new staticDemo("Product 2", 35000.00);
        d2.getDiscount();
    }
}