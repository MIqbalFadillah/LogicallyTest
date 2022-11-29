/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidotest;

import java.util.Scanner;

/**
 *
 * @author fadil
 */
public class BinaryTest {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          
        System.out.println("Masukan rows: ");
          
        int rows = sc.nextInt();
          
        for (int i = 1; i <= rows; i++) 
        {
            int num;
              
            if(i%2 == 0)
            {
                num = 0;
                  
                for (int j = 1; j <= rows; j++)
                {
                    System.out.print(num);
                      
                    num = (num == 0)? 1 : 0;
                }
            }
            else
            {
                num = 1;
                  
                for (int j = 1; j <= rows; j++)
                {
                    System.out.print(num);
                      
                    num = (num == 0)? 1 : 0;
                }
            }
              
            System.out.println();
        }
          
        sc.close();
    }
    
}
