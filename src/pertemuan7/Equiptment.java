/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;

/**
 *
 * @author Yogi Arif Widodo <Yogi at scodeid.blogspot.com>
 */
public class Equiptment
{
    //main run
    public static void main(String[] args) 
    {
        
       
//Ocong.java 
       Ocong nakutin1 = new Ocong();
       //using constructor set value
       nakutin1.setName("Ocong Newbie");
       nakutin1.setFlyPocong("With a Golok");
       nakutin1.setHp(80);
       nakutin1.setAttackPoint(100);
       nakutin1.setShieldPoint(10);
       
       //just label data
       System.out.println("_________________________"
                + "\n"
                + "Easy Mode Type Monster "
                + "\n ___________________________");
       
       //calling chain to viewAttack and handle by Ocong.java
       nakutin1.viewAttack();
       
       //Class instanceName = new Class();
       Ocong nakutin2 = new Ocong("With Jetpack", "Ocong Modern", 100, 50,20);
       
        System.out.println("_________________________"
                + "\n"
                + "Expert Mode Type Monster "
                + "\n ___________________________");
       nakutin2.viewAttack();
/*
       ==================================================================================
*/
        Zombie type1 = new Zombie();
        type1.setName("John");
        type1.setHp(99);
        type1.setAttackPoint(99);
        type1.setShieldPoint(22);
        type1.setWalkingBehindYou("Yes");
        
        System.out.println("_________________________"
                + "\n"
                + "Easy Mode Type Monster "
                + "\n ___________________________");
        type1.viewAttack();
        
        
        Zombie type2 = new Zombie("No, They Walking Front Of You", "Smith", 100, 79, 99);
        System.out.println("_________________________"
                + "\n"
                + "Expert Mode Type Monster "
                + "\n ___________________________");
        type2.viewAttack();
    }
}
