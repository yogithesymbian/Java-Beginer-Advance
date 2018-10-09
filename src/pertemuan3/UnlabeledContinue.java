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
public class UnlabeledContinue {
    public static void main(String[] args) {
        String names[] = {"Yogi","Arif","Widodo"};
        
        int count = 0;
        
        for ( int i = 0; i < names.length;i++)
        {
            continue; //skip next statement
            
        }
        count++; // so the count will output 0+1 = 1
        System.out.println("There are "+count+" Beahs in the list");
    }
    
    
}
