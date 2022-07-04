
package bscs;

public class staticDemo {
    public String name;
    public double price;
    public static double discount;
    
    staticDemo(String name,double price)
    {
        this.name = name;
        this.price = price;
    }
    public void getDiscount()
    {
        double dp = this.price * discount;
        System.out.println("Discount Percentage" + discount);
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Discount: " + dp);
        System.out.println("Discouted Price: " + (this.price - dp));
    }
}
