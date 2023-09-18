/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialzero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author kyw40
 */
public class FactorialZero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(reader.readLine());
        
        int numZero = 0;
        
        int numTwo = 0;
        int numFive = 0;
        
        if(N == 0)
        {
            System.out.println(numZero);
            return;
        }
        
        for(int i=1; i<= N; i++)
        {
            int temp = i;
            while(temp%2 == 0)
            {
                temp /= 2;
                numTwo++;
            }
            while(temp%5 ==0)
            {
                temp /=5;
                numFive++;
            }
        }
        
        numZero = Math.min(numTwo, numFive);
        
        System.out.println(numZero);
    }
    
}
