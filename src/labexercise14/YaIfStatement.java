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
public class YaIfStatement {
    public static void main(String[] args) {
        double yogiGrade = 92.0;
        
        if(yogiGrade >= 90)
        {
            //cumlaude
            System.out.println("Execelent!");
        }
        else if((yogiGrade < 90) && (yogiGrade >=80)) // ==== 80 --> 89
        {
            //oh yea
            System.out.println("Verry Good");
        }
        else if((yogiGrade <80) && (yogiGrade >=60))
        {
            //well
            System.out.println("good!");
        }
        else
        {
            //noooo
            System.out.println("not good");
        }
        //harus ada rentan atas dan bawah
    }
}
