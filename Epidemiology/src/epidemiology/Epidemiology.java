/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package epidemiology;

import java.util.Scanner;

/**
 *
 * @author kyw40
 */
public class Epidemiology {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int p = scan.nextInt();
        int n = scan.nextInt();
        int r = scan.nextInt();
        
        int dailyCase = n;
        int tot = 0;
        int day = 0;
        
        while(tot <= p)
        {
            dailyCase *= r;
            tot += dailyCase;
            day++;
        }
        
        System.out.println(day);
    }
    
}
