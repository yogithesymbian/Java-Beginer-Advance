/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author Yogi Arif Widodo
 * www.scodeid.blogspot.com
 * www.scode.id
 * 17615006
 */
public class GetInputFromKeyboard 
{
    public static void main(String[] args) 
    {
        String nama = "";
        BufferedReader dataIn;
        dataIn = new BufferedReader (new InputStreamReader(System.in));
        
        
       System.out.print("Please enter your name = ");
        
       try
        {
          nama = dataIn.readLine();
                }
        catch(IOException e)
        {
            System.out.println("Error!");
        }
        System.out.println("Hello " +nama +" !");
       
        
    }
}
