/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agesort;

import java.io.*;
import java.util.Arrays;

/**
 *
 * @author kyw40
 */
public class AgeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(reader.readLine());
        
        String[][] client = new String[N][2];
        for(int i=0; i<N; i++)
        {
            client[i] = reader.readLine().split(" ");
        }
        
        Arrays.sort(client, (e1, e2) -> {
            return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
        });
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<N; i++)
        {
            sb.append(client[i][0] + " ").append(client[i][1] + "\n");
        }
        
        System.out.println(sb);
    }
    
}
