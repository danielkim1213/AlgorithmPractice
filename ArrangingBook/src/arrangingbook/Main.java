/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.io.*;

/**
 *
 * @author kyw40
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String input = reader.readLine();
        int L = 0;
        int M = 0;
        int S = 0;
        
        for(int i=0; i<input.length(); i++) //각 구역 개수 세기
        {
            if(input.substring(i, i+1).equals("L"))
            {
                L++;
            }
            else if(input.substring(i, i+1).equals("M"))
            {
                M++;
            }
            else
            {
                S++;
            }
        }
        
        int LM = 0; //L 구역 속 M 개수
        int LS = 0; //L 구역 속 S 개수
        int ML = 0; //M 구역 속 L 개수
        int MS = 0; //M 구역 속 S 개수
        
        for(int i=0; i<L; i++)
        {
            if(input.substring(i, i+1).equals("L"))
            {
                continue;
            }
            if(input.substring(i, i+1).equals("M"))
            {
                LM++;
            }
            else
            {
                LS++;
            }
        }
        for(int i=L; i<L+M; i++)
        {
            if(input.substring(i, i+1).equals("M"))
            {
                continue;
            }
            if(input.substring(i, i+1).equals("L"))
            {
                ML++;
            }
            else
            {
                MS++;
            }
        }
        
        int result = LM + LS + ML + MS - Math.min(LM, ML);
        System.out.println(result);
    }
    
}
