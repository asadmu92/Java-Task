
package bscs;


public class Accounts {
        private long accountNo;
        private String Name,Email;
        private double Amount;
        
        Accounts(String n,String em,long acc)
        {
            this.Email=em;
            this.Name=n;
            this.accountNo=acc;
        }
        
        public void setAmount(double amt)
        {
            this.Amount=amt;
        }
        
        public double getAmount()
        {
            return this.Amount;
        }
        
        public void display()
        {
            System.out.println("Name: " + this.Name);
             System.out.println("Email: " + this.Email);
              System.out.println("Account No: " + this.accountNo);
        }
}
