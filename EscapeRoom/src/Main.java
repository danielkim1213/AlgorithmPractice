
import java.io.*;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kyw40
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        
        int[][] room = new int[m][n];
        String[] str;
        
        
        for(int i=0; i<m; i++)
        {
            str = reader.readLine().split(" ");
            for(int x=0; x<n; x++)
            {
                 room[i][x] = Integer.parseInt(str[x]);
            }
        }
        
        int x = n;
        int y = m;
        int num =x*y;
        boolean escape = false;
        HashSet<Integer> two = new HashSet();
        HashSet<Integer> againHash = new HashSet();
        againHash.add(num);
        
        boolean[][] ig = new boolean[m][n];
        ig[m-1][n-1] = true;
        
        boolean isBreak = false;
        
        for(;;)
        {
            for(int k=0; k<m; k++)
            {
                for(int a=0; a<n; a++)
                {
                    if(againHash.contains(room[k][a]) && !(ig[k][a]) && !(two.contains((a+1)*(k+1))))
                    {
                        if(num == room[0][0])
                        {
                            System.out.print("yes");
                            isBreak = true;
                            break;
                        }
                        ig[k][a] = true;
                        x = a+1;
                        y = k+1;
                        num = x*y; 
                        two.add(num);
                    }
                }
                if(isBreak)
                {
                    break;
                }
            }
            if(isBreak)
            {
                break;
            }
           againHash = (HashSet<Integer>) two.clone();
           if(againHash.isEmpty())
           {
               System.out.print("no");
               break;
           }
           two.clear();
        }
        
    }
}
