/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package art;

import java.util.Scanner;

/**
 *
 * @author kyw40
 */
public class Art {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numCoordinates = Integer.parseInt(scan.nextLine());
        
        int biggestX = 0;
        int biggestY = 0;
        int smallestX = 100;
        int smallestY = 100;
        
        for(int i = 0; i< numCoordinates; i++)
        {
            String[] str = (scan.nextLine()).split(",", 2);
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            if(biggestX < x)
            {
                biggestX = x;
            }
            if(smallestX > x)
            {
                smallestX = x;
            }
            if(biggestY < y)
            {
                biggestY = y;
            }
            if(smallestY > y)
            {
                smallestY = y;
            }
        }
        System.out.println((smallestX-1) + "," + (smallestY-1));
        System.out.println((biggestX+1) + "," + (biggestY+1));
    }
    
}
