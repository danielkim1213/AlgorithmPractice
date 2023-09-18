/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divisor2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kyw40
 */
public class Divisor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = Integer.parseInt(scan.nextLine());
        
        ArrayList<Integer> number = new ArrayList();
        
        for(int i=0; i<N; i++)
        {
            number.add(scan.nextInt());
        }
        
        for(int i=0; i<N; i++)
        {
            for(int k=0; k<N; k++)
            {
                if(i == k)
                {
                    continue;
                }
                else
                {
                    if(number.get(i) % number.get(k) == 0)
                    {
                        number.set(k, 1000003);
                    }
                }
            }
        }
        
        number.removeIf(n -> (n == 1000003));
        
        int result = 1;
        
        for(int i=0; i<number.size(); i++)
        {
            result *= (number.get(i));
        }
        
        if(number.size() == 1)
        {
            result *= 2;
        }
        
        System.out.println(result);
    }
    
}
