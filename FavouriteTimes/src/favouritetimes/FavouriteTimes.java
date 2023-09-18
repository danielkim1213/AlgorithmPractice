/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package favouritetimes;

import java.util.Scanner;

/**
 *
 * @author kyw40
 */
public class FavouriteTimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int d = Integer.parseInt(scan.nextLine());
        
        int hour = d/60;
        int lastHour = hour%12;
        int min = d%60;
        int count12 = 0;
        int count = 0;
        int resultCount = 0;
        int a;
        
        
        for(int k=1; k< 10; k++)
        {
            a = -6;
            while(!(0< k+a && 0 <= k+2*a))
            {
                a++;
            }
            while(k+a < 6 && k+2*a <=9)
            {
                count12++;
                a++;
            }
        }
        
        for(int i=1; i<=lastHour; i++)
        {
            if(i >= 10)
            {
                break;
            }
            if(i == lastHour)
            {
                a = -6;
                while(!(0< i+a && 0 <= i+2*a))
                {
                    a++;
                }
                while(i+a < 6 && i+2*a <=9 && (i+a)*10 + (i+2*a) <= min)
                {
                    count++;
                    a++;
                }
            }
            else
            {
                a = -6;
                while(!(0< i+a && 0 <= i+2*a))
                {
                    a++;
                }
                while(i+a < 6 && i+2*a <=9)
                {
                    count++;
                    a++;
                }
            }
        }
        
        if(lastHour!= 0 || min>=34)
        {
            count++;
        }
        
        resultCount = count12*(hour/12) + 2*(hour/12) + count;
        System.out.println(resultCount);
    }
    
}
