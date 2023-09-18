/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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
        int n = Integer.parseInt(reader.readLine());
        
        int[] tides = Arrays.asList(reader.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
        
        quickSort(tides, 0, (tides.length-1));
        
        if(n%2 == 0)
        {
            int x = (n/2);
        
            for(int i=(n/2)-1; i>=0; i--)
            {
                System.out.print(tides[i] + " ");
                System.out.print(tides[x] + " ");
                x++;
            }
        }
        else
        {
            int x = (n/2) + 1;
            
            for(int i=(n/2); i>= 0; i--)
            {
                if(x  == tides.length)
                {
                    System.out.print(tides[i] + " ");
                    break;
                }
                System.out.print(tides[i] + " ");
                System.out.print(tides[x] + " ");
                x++;
            }
        }
    }
    
    private static void quickSort(int tides[], int left, int right)
    {
        if (left >= right)
        {
            return;
        }
        
        int i = left;
        int j = right;
        
        int temp;
        
        int pivot = tides[(left + right)/2];
        while (i<j)
        {
            while (tides[i] < pivot)
            {
                i++;
            }
            while(tides[j] > pivot)
            {
                j--;
            }
            if(i<=j)
            {
                temp = tides[i];
                tides[i] = tides[j];
                tides[j] = temp;
                i++;
                j--;
            }
        }
        quickSort(tides, left, j);
        quickSort(tides, i, right);
    }
    
}

