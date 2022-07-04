/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bscs;

/**
 *
 * @author asadm
 */
public class multiArrayTask {
    public static void main(String[] args) {
        
        int[][] a1 = {{23,43},{34,45}};
        int[][] a2 = {{32,41},{56,23}};
        int[][] a3 = new int[2][2];
        
        String tem;
         
        // a b  res  =>  res = a + b
        
        for (int row = 0; row < 2; row++) 
        {
            for (int col = 0; col < 2; col++) {
         a3[row][col] = a1[row][col] + a2[row][col];      
            }
        }
            System.out.println("Printing Array Results");
             for (int r = 0; r < 2; r++) 
             {
            for ( int c = 0; c < 2; c++) {
                System.out.print(a1[r][c]+"\t");
            }
             for ( int c2 = 0; c2 < 2; c2++) {
                System.out.print(a2[r][c2]+"\t");
            }
             for ( int c3 = 0; c3 < 2; c3++) {
                System.out.print(a3[r][c3]+"\t");
            }
            System.out.println("");
        
            
            
            
        }
    }
}
