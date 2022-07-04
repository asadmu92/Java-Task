/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bscs;
import java.util.Scanner;

public class loops2 {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        
        System.out.println("Enter Range:");
        int r = obj.nextInt();
        System.out.println("Enter Percentage:");
        double p = obj.nextInt();
        
      /*  for (int i = r; i >= 1; i--) {
            for (int j = r; j >=1; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }
        */
        if(r % 2 == 0)
        {
            System.out.println("Its a Even Number");
        }
        else{
            System.out.println("Its a odd Number");
        }
        
        double per;
        per = r * (p/100);
        System.out.println(per);
    }
}
