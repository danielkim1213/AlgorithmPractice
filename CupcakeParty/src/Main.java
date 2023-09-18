
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
        
        int regular = Integer.parseInt(scan.nextLine());
        int small = Integer.parseInt(scan.nextLine());
        
        int tot = 8*regular + 3*small;
        
        int result = tot-28;
        System.out.println(result);
    }
}
