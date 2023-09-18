/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dogtreats;

import java.util.Scanner;

/**
 *
 * @author kyw40
 */
public class DogTreats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int s = scan.nextInt();
        int m = scan.nextInt();
        int l = scan.nextInt();
        
        int happiness = s + 2*m + 3*l;
        
        if(happiness >= 10)
        {
            System.out.println("happy");
        }
        else
        {
            System.out.println("sad");
        }
    }
    
}
