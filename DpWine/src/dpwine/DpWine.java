/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dpwine;

import java.io.*;

/**
 *
 * @author kyw40
 */
public class DpWine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(reader.readLine());
        
        int[] arr = new int[N];
        
        int[] dp = new int[N];
        
        
        arr[0] = Integer.parseInt(reader.readLine());
        dp[0] = arr[0];
        
        if(N>1)
        {
            arr[1] = Integer.parseInt(reader.readLine());
            dp[1] = arr[0]+arr[1];
            
            if(N>2)
            {
                
            }
        }
    }
    
}
