
import java.io.*;
import java.util.ArrayList;

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
        
        int[] frequency = new int[1001];
        
        int N = Integer.parseInt(reader.readLine());
        
        int input;
        for(int i=0; i<N; i++)
        {
            input = Integer.parseInt(reader.readLine());
            frequency[input]++;
        }
        
        ArrayList<Integer> highest = new ArrayList();
        ArrayList<Integer> second = new ArrayList();
        int highestFreq = 1;
        int secondFreq = 1;
        
        for(int i=0; i<frequency.length; i++)
        {
            if(frequency[i] > highestFreq)
            {
                highestFreq = frequency[i];
            }
            else if(frequency[i] > secondFreq)
            {
                secondFreq = frequency[i];
            }
        }
        
        for(int i=0; i<frequency.length; i++)
        {
            if(frequency[i] == highestFreq)
            {
                highest.add(i);
            }
            if(frequency[i] == secondFreq)
            {
                second.add(i);
            }
        }
        int result1 = 0;
        
        int result2 = 0;
        int maxDiff = 0;
        
        if(highest.size() == 1)
        {
            result1 = highest.get(0);
            
            if(second.size() == 1)
            {
                result2 = second.get(0);
                maxDiff = Math.abs(result1 - result2);
            }
            else
            {
                for(int i=0; i<second.size(); i++)
                {
                    if(Math.abs(result1 - second.get(i)) > maxDiff)
                    {
                        maxDiff = Math.abs(result1 - second.get(i));
                    }
                }
            }
        }
        else
        {
            for(int i=0; i<highest.size(); i++)
            {
                for(int k = 0; k<highest.size(); k++)
                {
                    if(Math.abs(highest.get(i) - highest.get(k)) > maxDiff)
                    {
                        maxDiff = Math.abs(highest.get(i) - highest.get(k));
                    }
                }
            }
        }
        System.out.println(maxDiff);
    }
}
