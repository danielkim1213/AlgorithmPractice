/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coordsort;

import java.io.*;
import java.util.*;

/**
 *
 * @author kyw40
 */
public class CoordSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(reader.readLine());
        
        int[][] coord = new int[N][2];
        
        for(int i=0; i<N; i++)
        {
            String[] input = reader.readLine().split(" ");
            int[] intInput = Arrays.asList(input).stream().mapToInt(Integer::parseInt).toArray();
            coord[i] = intInput;
        }
        
        Arrays.sort(coord, (e1, e2) -> {
			if(e1[1] == e2[1]) {
				return e1[0] - e2[0];
			} else {
				return e1[1] - e2[1];
			}
		});
        
        StringBuilder str = new StringBuilder();
        for(int i=0; i<N; i++)
        {
            str.append(coord[i][0]).append(" ").append(coord[i][1]).append("\n");
        }
        
        System.out.println(str);
    }
    
}
