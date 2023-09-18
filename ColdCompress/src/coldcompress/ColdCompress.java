/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coldcompress;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kyw40
 */
public class ColdCompress {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num = Integer.parseInt(scan.nextLine());
        
        
        for(int i=0; i< num; i++)
        {
            String str = scan.nextLine();
            String[] s = str.split("");
            ArrayList<String> result = new ArrayList();
            result.add(s[0]);
            ArrayList<Integer> resultInt = new ArrayList();
            resultInt.add(1);
            for(int x = 1; x<s.length; x++)
            {
                if(s[x].equals(result.get(result.size()-1)))
                {
                    resultInt.set(resultInt.size()-1, resultInt.get(resultInt.size()-1)+1);
                }
                else
                {
                    result.add(s[x]);
                    resultInt.add(1);
                }
            }
            
            for(int k=0; k<result.size(); k++)
            {
                System.out.print(resultInt.get(k) + " " + result.get(k) + " ");
            }
            System.out.println();
        }
        
        
    }
    
}
