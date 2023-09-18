/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fashionking;

import java.util.*;

/**
 *
 * @author kyw40
 */
public class FashionKing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int T = Integer.parseInt(scan.nextLine());
        
        for(int i=0; i<T; i++)
        {
            int N = Integer.parseInt(scan.nextLine());
            ArrayList<String> fashion = new ArrayList();
            int[] type = new int[31];
            
            for(int a = 0; a<N; a++)
            {
                StringTokenizer st = new StringTokenizer(scan.nextLine());
                st.nextToken();
                String temp = st.nextToken();
                if(!fashion.contains(temp))
                {
                    fashion.add(temp);
                    type[fashion.indexOf(temp)]++;
                }
                else
                {
                    type[fashion.indexOf(temp)]++;
                }
            }
            
            int result = 1;
            
            for(int b = 0; b< type.length; b++)
            {
                result *= (type[b]+1);
            }
            
            System.out.println((result-1));
            
        }
        
        
    }
    
}
