
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kyw40
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(reader.readLine());
        int t = Integer.parseInt(reader.readLine());
        
        int largest = 0;
        
        boolean[][] yard = new boolean[n][n];
        
        for(int i=0; i<t; i++)
        {
            int[] input = Arrays.asList(reader.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
            yard[input[0]-1][input[1]-1] = true;
        }
        
        int[][] realYard = new int[n][n];
        for(int i=0; i<n; i++)
        {
            if(!yard[0][i])
            {
                realYard[0][i] = 1;
            }
        }
        for(int i=0; i<n; i++)
        {
            if(!yard[i][0])
            {
                realYard[i][0] = 1;
            }
        }
        
        for(int i=1; i<n; i++)
        {
            for(int k=1; k<n; k++)
            {
                if(yard[i][k])
                {
                    continue;
                }
                else
                {
                    int value = Math.min(Math.min(realYard[i-1][k-1], realYard[i][k-1]), realYard[i-1][k]) + 1;
                    realYard[i][k] = value;
                    if(value> largest)
                    {
                        largest = value;
                    }
                }
            }
        }
        
        System.out.println(largest);
    }
}
