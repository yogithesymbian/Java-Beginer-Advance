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
public class YcBreakStatement 
{
    public static void main(String[] args) 
    {
        String names[] = {"Linus","Torvald","Taro Lay","Yogi"};
        String searchNames ="Taro Lay";
        
        boolean foundNames = false;
        
        for(int i=0; i<names.length; i++)
        {
            if (names[i].equals(searchNames))
            {
                foundNames = true;
                break;                
            }
            
        }
        if (foundNames) 
            {
                System.out.println(searchNames + " Found");
            }
            else
            {
                System.out.println(searchNames +" Not Found");
            }
    }
}
