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
public class YhWhileRectangle8 
{
    public int height = 3;
    public int width = 10;
    
    public void displayRectangle()
    {
        int colCount = 0;
        int rowCount = 0;
        
        while (rowCount < height)
        {            
            colCount = 0;
            while (colCount < width) 
            {                
                System.out.print("@");
                colCount++;
            }
            System.out.println();
            rowCount++;
        }
    }
}
