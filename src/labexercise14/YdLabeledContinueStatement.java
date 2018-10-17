/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise14;

/**
 *
 * @author Dani
 */
public class YdLabeledContinueStatement 
{
    public static void main(String[] args) {
        
        outerloop:
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.println("Inside for (jaguar) loop ");//message 1
                if (j == 2) 
                {
                    continue outerloop;
                }
                System.out.println("Inside for (iguana) loop ");//message 2
            }
        }
    }
}
