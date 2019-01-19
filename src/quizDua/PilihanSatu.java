/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizDua;

/**
 *
 * @author Yogi Arif Widodo <Yogi at scodeid.blogspot.com>
 */
public class PilihanSatu
{
    public static void main(String[] args) 
    {
        int n = 1;
        
        for (int i = 5; i >= n; i--) 
        {
            for (int j = 5; j >= i; j--) {
                System.out.print(j+"");
            }
            System.out.println("");
        }
    }
}
