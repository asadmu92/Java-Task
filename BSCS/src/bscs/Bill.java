package bscs;

public class Bill {

    public static void main(String[] args) {
        int units = 402;
        System.out.println("====Bill=====");
        if(units<=100)
        {
        int d= units * 4;
        System.out.println(units + "x 4="+d );
        System.out.println("Total Bill:"+d );
        }
        else if(units>100 && units<=300)
        {
            int x,y,b;
            
            x = 100 *4; 
            
            System.out.println("100 x 4="+ x );
            
            units = units -100;
            
            y= units * 6;
            
            System.out.println(units + "x 6="+y );
            
            b = x + y;
            
            System.out.println("Total Bill:"+ b);
        }
        else if(units>300)
        {
            int x,y,z,b;
            
            x = 100 *4; 
            
            System.out.println("100 x 4="+ x );
            
           
            y= 200 * 6;
            
            System.out.println("200 x 6="+y );
            
            units  = units  - 300;
            
            z = units * 10;
            System.out.println(units+" x 10 ="+z);
            
            b = x + y +z;
            
            System.out.println("Total Bill:"+ b);
        }
        
        
    }
}
