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
public class Zombie extends KearifanLokalGame
{
    //propertie
    String walkingBehindYou;
    
    //constructor

    public Zombie() 
    {
        walkingBehindYou = "";
    }
    
    //constructor with param

    public Zombie(String walkingBehindYou, String name, int hp, int attackPoint, int shieldPoint) 
    {
        super(name, hp, attackPoint, shieldPoint);
        this.walkingBehindYou = walkingBehindYou;
    }
    
    //end-of constructor 

    //getter setter for zombie
    public String getWalkingBehindYou() 
    {
        return walkingBehindYou;
    }

    public void setWalkingBehindYou(String walkingBehindYou) 
    {
        this.walkingBehindYou = walkingBehindYou;
    }

    @Override
    public void viewAttack()
    {
        super.viewAttack(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Walking Behind You = "+walkingBehindYou);
    }
}
