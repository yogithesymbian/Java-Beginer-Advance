/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author Yogi Arif Widodo
 * www.scodeid.blogspot.com
 * www.scode.id
 * 17615006
 */
public class GradeSample {
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
            System.out.println("Good Good");
        }
        else if((yogiGrade <80) && (yogiGrade >=60))
        {
            //well
            System.out.println("Study Harder!");
        }
        else
        {
            //noooo
            System.out.println("not good");
        }
        //harus ada rentan atas dan bawah
    }
}
