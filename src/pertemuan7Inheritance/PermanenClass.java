/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7Inheritance;

/**
 *
 * @author Yogi Arif Widodo <Yogi at scodeid.blogspot.com>
 */
public class PermanenClass 
{
    public static void main(String[] args) 
    {
        Permanen p1 = new Permanen();
        Permanen p2 = new Permanen("P001", "12831092", "Deni");
        Permanen p3 = new Permanen("15-03-1999", "POO2", "Agus");
        System.out.println("Data permanen 1");
        p1.viewData();
        System.out.println("Data permanen 2");
        p2.viewData();
        System.out.println("Data permanen 3");
        p3.viewData();
    }
 
}
