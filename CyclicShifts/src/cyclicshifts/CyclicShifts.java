/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cyclicshifts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author kyw40
 */
public class CyclicShifts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        File file = new File("src\\cyclicshifts\\x.txt");
        Scanner scan = new Scanner(file);
        
        String t = scan.nextLine();
        String s = scan.nextLine();
        
        
        for(int i = 0; i<s.length(); i++)
        {
            String str = s.substring(i,s.length()) + s.substring(0,i);
            if(t.contains(str))
            {
                System.out.println("yes");
                break;
            }
            if(i == s.length()-1)
            {
                System.out.println("no");
            }
        }
    }
    
}
