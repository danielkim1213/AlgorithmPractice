/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inspection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author kyw40
 */
public class Inspection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(reader.readLine());
        int[] input = new int[N];
        
        for(int i=0; i<N; i++)
        {
            int x = Integer.parseInt(reader.readLine());
            input[i] = x;
        }
        
        Arrays.sort(input);
        
        int gcdVal = input[1] - input[0];
                
        for(int i=2; i<N; i++)
        {
            gcdVal = GCD(gcdVal, input[i]-input[i-1]);
        }
        
        ArrayList<Integer> result = new ArrayList();
        for(int i=2; i<=gcdVal; i++)
        {
            if(gcdVal%i == 0)
            {
                result.add(i);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<result.size(); i++)
        {
            sb.append(result.get(i)).append(" ");
        }
        
        System.out.println(sb);
    }
    
    private static int GCD(int a, int b)
    {
        while(b != 0)
        {
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
    
}
