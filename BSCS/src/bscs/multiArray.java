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
public class multiArray {

    public static void main(String[] args) {
        
        int[][] ar = new int[3][2];
        int[][][] ar1 =new int[2][2][2];
        
        ar[0][0] = 12;
        ar[0][1] = 65;
        
        ar[1][0] = 21;
        ar[1][1] = 56;
        
        ar[2][0] = 21;
        ar[2][1] = 56;
        String tem;
        
        ar1[0][0][0]=25;
        ar1[0][0][1]=15;
        ar1[0][1][0]=55;
        ar1[0][1][1]=5;
        
        ar1[1][0][0]=50;
        ar1[1][0][1]=11;
        ar1[1][1][0]=89;
        ar1[1][1][1]=41;
        
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 2; col++) {
                tem = "["+row + "][" + col +"]:";
                System.out.print(tem + ar[row][col]+"\t");
            }
            System.out.println("");
        }
        System.out.println("Printing 3d Array");
        for (int i = 0; i < 2;i++) {
            for (int j = 0; j < 2; j++) {
             for (int k = 0; k < 2; k++) {
                 tem = "["+i + "][" + j +"]["+k+"]:";
                 System.out.print(tem+ar1[i][j][k]+"\t"); 
            } 
            }
            System.out.println("");
            
        }
        
       
    }
}
