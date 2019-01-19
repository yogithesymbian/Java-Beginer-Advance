/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise14;

/**
 *
 * @author Yogi Arif Widodo
 * www.scodeid.blogspot.com
 * www.scode.id
 * 17615006
 */
public class YdLabeledBreak4 
{
    public static void main(String[] args) 
    {
      String names[] = {"Linus","Torvalds","Taro lay","Yogi","Rio Security"};
      int count =0;
      
        for (int i = 0; i < names.length; i++)
        {
            if (!names[i].equals("Yogi")) 
            {
                break; 
            }
            count++;
        }
        System.out.println("There are " +count+ " Torvalds in the list ");
    }
}
