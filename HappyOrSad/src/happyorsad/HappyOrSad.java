/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package happyorsad;

import java.util.Scanner;

/**
 *
 * @author kyw40
 */
public class HappyOrSad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String str = scan.nextLine();
        String[] input = str.split("");
        int happy = 0;
        int sad = 0;
        
        for(int i=0; i<str.length()-2; i++)
        {
            if(input[i].equals(":"))
            {
                if(input[i+1].equals("-"))
                {
                    if(input[i+2].equals(")"))
                    {
                        happy++;
                    }
                    else if(input[i+2].equals("("))
                    {
                        sad++;
                    }
                }
            }
        }
        
        if(happy == sad)
        {
            if(happy == 0)
            {
                System.out.println("none");
            }
            else
            {
                System.out.println("unsure");
            }
        }
        else if(happy>sad)
        {
            System.out.println("happy");
        }
        else
        {
            System.out.println("sad");
        }
    }
    
}
