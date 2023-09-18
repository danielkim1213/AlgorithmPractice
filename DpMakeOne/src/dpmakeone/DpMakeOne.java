/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dpmakeone;

import java.util.Scanner;

public class DpMakeOne {

    private static int[] dpCount;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        
        dpCount = new int[N+1];
        
        System.out.println(dp(N));
    }
    
    private static int dp(int n)
    {
        if(n==1)
        {
            return 0;
        }
        if(dpCount[n]==0)
        {
            int a= (int)Math.pow(10, 6),b= (int)Math.pow(10, 6),c = (int)Math.pow(10, 6);
            if(n%3 == 0)
            {
                a = dp(n/3);
            }
            if(n%2==0)
            {
                b = dpCount[n] = dp(n/2);
            }

            c = dp(n-1);
            dpCount[n] = Math.min(Math.min(a, b), c)+1;
        }
        
        return dpCount[n];
    }
    
}
