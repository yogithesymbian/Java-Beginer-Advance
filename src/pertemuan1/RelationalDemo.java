/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

/**
 *
 * @author Dani
 */
public class RelationalDemo {
    public static void main(String[] args) {
        int i = 37;
        int j = 42;
        int k = 43;
        System.out.println("Variable Vales . . .");
        System.out.println("i = " +i);
        System.out.println("j = "+j);
        System.out.println("K = " +k);
        
        //greater than
        System.out.println("Greater than . . .");
        // i > j , j > i , k > j
        System.out.println("i > j = " +(i>j)); //false
        System.out.println("j > i = " +(j>i)); //true
        System.out.println("k > j = " +(k>j)); //false  
        //======================================================
        
        System.out.println("Greater than or equal to . . .");
        System.out.println("i >= j" +(i>=j)); //false
        System.out.println("j >= i" +(j>=i)); //true
        System.out.println("k >= j" +(k>=j)); //true  
        
        System.out.println("Less than . . .");
        System.out.println("i < j = " +(i<j));
        System.out.println("j < i = " +(j<i));
        System.out.println("k < j = " +(k<j));
        
        System.out.println("Less than or equal to . . .");
        System.out.println("i <= j = "+(i<=j));
        System.out.println("j <= i = "+(j<=i));
        System.out.println("k <= j = "+(k<=j));
        
        //equal to
        System.out.println("i == j = " +(i==j)); //false
        System.out.println("k == j = " +(k==j)); //true
        //not equal to
        System.out.println("i != j = "+(i!=j));//true
        System.out.println("k != j = "+(k!=j));//false
    }
}
