/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assigningpartners;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author kyw40
 */
public class AssigningPartners {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        
        String[][] partner = new String[2][n];
        
        partner[0] = (reader.readLine()).split(" ");
        partner[1] = (reader.readLine()).split(" ");
        
        for(int i=0; i<n; i++)
        {
            String first = partner[0][i];
            String second = "";
            for(int k=0; k<n; k++)
            {
                String x = partner[1][k];
                if(x.equals(first))
                {
                    if(i == k)
                    {
                        System.out.println("bad");
                        return;
                    }
                    second = partner[0][k];
                    break;
                }
            }
            if(!(partner[1][i].equals(second)))
            {
                System.out.println("bad");
                return;
            }
        }
        System.out.println("good");
    }
    
}
