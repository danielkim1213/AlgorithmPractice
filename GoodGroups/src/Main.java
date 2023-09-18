
import java.io.*;
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
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int x = Integer.parseInt(reader.readLine());
        
        String[] sameGroup = new String[x]; 
        
        for(int i=0; i<x; i++)
        {
            sameGroup[i] = reader.readLine();
        }
        
        int y = Integer.parseInt(reader.readLine());
        
        String[] diffGroup = new String[y];
        
        for(int i=0; i<y; i++)
        {
            diffGroup[i] = reader.readLine();
        }
        
        int g = Integer.parseInt(reader.readLine());
        
        HashSet<String> name = new HashSet();
        
        for(int i=0; i<g; i++)
        {
            String[] input = reader.readLine().split(" ");
            name.add(input[0] + " " + input[1]);
            name.add(input[0] + " " + input[2]);
            name.add(input[1] + " " + input[2]);
            name.add(input[1] + " " + input[0]);
            name.add(input[2] + " " + input[0]);
            name.add(input[2] + " " + input[1]);
        }
        
        int vCount = 0;
        for(int i=0; i<x; i++)
        {
            if(!(name.contains(sameGroup[i])))
            {
                vCount++;
            }
        }
        
        for(int i=0; i<y; i++)
        {
            if(name.contains(diffGroup[i]))
            {
                vCount++;
            }
        }
        
        System.out.println(vCount);
        
    }
}
