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
public class YbSwitchStatement 
{
    public static void main(String[] args) 
    {
        int grade = 90;
        switch(grade)
        {
            case 100:
                System.out.println("Execelent");
                break;
            case 90:
                System.out.println("Good Job");
                break;
            case 80:
                System.out.println("Study Hardder");
            default:
                System.out.println("Sorry");
        }
    }
}
