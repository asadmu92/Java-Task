
package bscs;


public class Bank {
    public static void main(String[] args) {
        
        Accounts a1 =new Accounts("Zakir","Zakir@gmail.com",12562525522222l);
    
        a1.display();
        a1.setAmount(25000.00);
        System.out.println("Amount:" + a1.getAmount());
    }
}
