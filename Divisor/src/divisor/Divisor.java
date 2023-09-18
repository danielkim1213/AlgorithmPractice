/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divisor;

import java.util.Scanner;

/**
 *
 * @author kyw40
 */
public class Divisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while(true)
        {
            int first = scan.nextInt();
            int second = scan.nextInt();
            
            if(first == 0 && second == 0)
            {
                System.exit(0);
            }
            
            if(first % second == 0)
            {
                System.out.println("multiple");
            }
            else if(second % first == 0)
            {
                System.out.println("factor");
            }
            else
            {
                System.out.println("neither");
            }
        }
    }
    
}
