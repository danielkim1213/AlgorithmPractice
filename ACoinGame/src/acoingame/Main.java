/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.io.*;
import java.util.*;

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
        int n = 1;
        for(;;)
        {
            n = Integer.parseInt(reader.readLine());
            if(n == 0)
            {
                break;
            }
            int[] stack = Arrays.asList(reader.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
            if(n == 1)
            {
                System.out.println("0");
            }
            else if(n == 2)
            {
                if(checkCorrect(stack))
                {
                    System.out.println("0");
                }
                else
                {
                    System.out.println("IMPOSSIBLE");
                }
            }
            else if(n == 3)
            {
                if(checkCorrect(stack))
                {
                    System.out.println("0");
                }
                else
                {
                    if(stack[0] == 2)
                    {
                        if(stack[1] == 3)
                            System.out.println("8");
                        else
                            System.out.println("4");
                    }
                    else if(stack[0] == 3)
                    {
                        if(stack[1] == 1)
                            System.out.println("16");
                        else
                            System.out.println("20");
                    }
                    else  //stack[0] == 1
                    {
                        System.out.println("12");
                    }
                }
            }
            else //n == 4
            {
                if(checkCorrect(stack))
                {
                    System.out.println("0");
                    continue;
                }
                else
                {
                    if(stack[0] == 4)
                    {
                        if(stack[1] == 1)
                        {
                            System.out.println("18");
                        }
                        else if(stack[1] == 3)
                        {
                            if(stack[2] == 2)
                            {
                                System.out.println("22");
                            }
                        }
                    }
                    else if(stack[0] == 3)
                    {
                        if(stack[1] == 1)
                        {
                            if(stack[2] == 4)
                            {
                                System.out.println("12");
                            }
                        }
                    }
                    else if(stack[0] == 1)
                    {
                        if(stack[1] == 3)
                        {
                            if(stack[2] == 4)
                            {
                                System.out.println("8");
                            }
                        }
                        else if(stack[1] == 4)
                        {
                            if(stack[2] == 2)
                            {
                                System.out.println("16");
                            }
                        }
                        else
                        {
                            System.out.println("12");
                        }
                    }
                    else
                    {
                        System.out.println("10");
                    }
                }
            }
        }
    }
    
    private static boolean checkCorrect(int[] stack)
    {
        for(int i=0; i<stack.length-1; i++)
        {
            if(stack[i] > stack[i+1])
            {
                return false;
            }
        }
        return true;
    }
}
