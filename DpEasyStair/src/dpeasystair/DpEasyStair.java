/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dpeasystair;

import java.io.*;

/**
 *
 * @author kyw40
 */
public class DpEasyStair {

    private static Long[][] stairNum;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(reader.readLine());
                
        stairNum = new Long[N][10];
        
        for(int i=0; i<10; i++)
        {
            stairNum[0][i] = Long.valueOf(1);
        }
        
        for(int i=1; i<N; i++)
        {
            stairNum[i][0] = stairNum[i-1][1]%1000000000;
            stairNum[i][9] = stairNum[i-1][8]%1000000000;
            for(int k=1; k<=8; k++)
            {
                stairNum[i][k] = (stairNum[i-1][k-1]%1000000000 + stairNum[i-1][k+1]%1000000000)%1000000000;
            }
        }
        long totNum = 0;
        for(int i = 1; i<10; i++)
        {
            totNum = (totNum%1000000000 + stairNum[N-1][i]%1000000000)%1000000000;
        }
        
        System.out.println(totNum);
    }
}
