/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coordconcentration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author kyw40
 */
public class CoordConcentration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(reader.readLine());
        
        int[] coord = new int[N];
        coord = Arrays.asList(reader.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
        
        int[] coord2 = Arrays.stream(coord).distinct().toArray();
        
        
        Arrays.sort(coord2);
        
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<N; i++)
        {
            int index = Arrays.binarySearch(coord2, coord[i]);
            sb.append(index + " ");            
        }
        
        System.out.println(sb);
        
        
    }
    
}
