
import java.io.*;
import java.util.Arrays;

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
        int e = Integer.parseInt(reader.readLine());
        
        int result = 0;
        
        for(int i=0; i<e; i++)
        {
            int side = reader.read();
            int[] input = Arrays.asList(reader.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
            int smallest = input[0];
            
            for(int k=1; k<side; k++)
            {
                if(smallest> input[k])
                {
                    smallest = input[k];
                }
            }
        }
    }
}
