/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise14;

/**
 *
 * @author Yogi Arif Widodo <Yogi at scodeid.blogspot.com>
 */
public class YjNesterFor10 
{
    public int heightYogi=3;
    public int widthYogi = 10;
    
    public void rectangleDisplay()
    {
        for (int row = 0; row < heightYogi; row++) 
        {
            for (int col = 0; col < widthYogi; col++) 
            {
                System.out.print("@");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        YjNesterFor10 rect = new YjNesterFor10();
        rect.rectangleDisplay();
    }
}
