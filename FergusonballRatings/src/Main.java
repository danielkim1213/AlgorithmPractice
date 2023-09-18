
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kyw40
 */
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int N = Integer.parseInt(scan.nextLine());
        
        boolean isGold = true;
        int count = 0;
        
        for(int i=0; i<N; i++)
        {
            int points = Integer.parseInt(scan.nextLine());
            int fouls = Integer.parseInt(scan.nextLine());
            
            int rating = 5*points - (3*fouls);
            
            if(rating > 40)
            {
                count++;
            }
            else
            {
                isGold = false;
            }
        }
        String result = "";
        if(isGold)
        {
            result = count + "+";
        }
        else
        {
            result = count + "";
        }
        
        System.out.println(result);
    }
}
