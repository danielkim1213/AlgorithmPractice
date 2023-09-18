/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dpsum;

import java.io.*;
import java.util.*;


public class DpSum {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(reader.readLine());
        
        int[] dp = Arrays.asList(reader.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
        
        int max = dp[0];
        
        int sum = dp[0];
        
        for(int i=1; i<N; i++)
        {
            sum = Math.max(sum + dp[i], dp[i]);
            max = Math.max(max, sum);
        }
        
        System.out.println(max);
        
        
    }
    
}
