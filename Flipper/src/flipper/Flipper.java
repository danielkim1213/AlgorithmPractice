/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flipper;

import java.util.Scanner;

/**
 *
 * @author kyw40
 */
public class Flipper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] input = scan.nextLine().split("");
        int[][] num = new int[2][2];
        num[0][0] = 1;
        num[0][1] = 2;
        num[1][0] = 3;
        num[1][1] = 4;
        
        
        for(int i=0; i<input.length; i++)
        {
            int k;
            int temp;
            if(input[i].equals("H"))
            {
                k = num[0][0];
                temp = num[0][1];
                
                num[0][0] = num[1][0];
                num[0][1] = num[1][1];
                
                num[1][0] = k;
                num[1][1] = temp;
            }
            else if(input[i].equals("V"))
            {
                k = num[0][0];
                temp = num[1][0];
                
                num[0][0] = num[0][1];
                num[1][0] = num[1][1];
                
                num[0][1] = k;
                num[1][1] = temp;
            }
        }
        
        System.out.println(num[0][0] + " " + num[0][1]);
        System.out.println(num[1][0] + " " + num[1][1]);
    }
    
}
