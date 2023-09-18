/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binomialcoefficient;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 *
 * @author kyw40
 */
public class BinomialCoefficient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = 0, K = 0;
        while(st.hasMoreTokens())
        {
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
        }
        
        BigInteger tot = combination(N,K);
        
        
        String val = (tot.remainder(BigInteger.valueOf(10007))).toString();
        System.out.println(val);
    }
    
    private static BigInteger combination(int n, int k){
        if(n==0 || n==1)
        {
            return BigInteger.ONE;
        }
        BigInteger result = BigInteger.ONE;
        for(int i=0; i<k; i++)
        {
            result = result.multiply(BigInteger.valueOf(n-i));
            result = result.divide(BigInteger.valueOf((i+1)));
        }
        return result;
    }
}
