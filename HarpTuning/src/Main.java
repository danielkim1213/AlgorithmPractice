
import java.io.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kyw40
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = reader.readLine().split("");
        
        String output = "";
        
        for(int i=0; i<input.length; i++)
        {
            if(input[i].equals("+"))
            {
                String untilNum = "";
                for(int k=1; k<999999999;k++)
                {
                    char x;
                    try{
                       x  = input[i+k].charAt(0);
                    }catch(Exception e)
                    {
                        break;
                    }
                    if(Character.isDigit((x)))
                    {
                        untilNum = untilNum + x;
                    }
                    else
                    {
                        break;
                    }
                }
                System.out.println(output + " tighten " + untilNum);
                i+=untilNum.length();
                output = "";
            }
            else if(input[i].equals("-"))
            {
                String untilNum = "";
                for(int k=1; k<999999999;k++)
                {
                    char x;
                    try{
                       x  = input[i+k].charAt(0);
                    }catch(Exception e)
                    {
                        break;
                    }
                    if(Character.isDigit((x)))
                    {
                        untilNum = untilNum + x;
                    }
                    else
                    {
                        break;
                    }
                }
                System.out.println(output + " loosen " + untilNum);
                i+=untilNum.length();
                output = "";
            }
            else
            {
                output += input[i];
            }
        }
    }
}
