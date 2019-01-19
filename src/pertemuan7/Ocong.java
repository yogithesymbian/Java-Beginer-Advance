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
public class Ocong extends KearifanLokalGame
{
    //propertie nya
    String flyPocong;
    
    //method nya //by constructor
    public Ocong() 
    {
        //without param
        System.out.println("child tanpa param");
        flyPocong = "";
    }

    
    //method nya //by constructor with param
    public Ocong(String flyPocong, String name, int hp, int attackPoint, int shieldPoint) 
    {
        super(name, hp, attackPoint, shieldPoint);
        this.flyPocong = flyPocong;
    }

    //getter and setter
    public String getFlyPocong() 
    {
        return flyPocong;
    }

    public void setFlyPocong(String flyPocong)
    {
        this.flyPocong = flyPocong;
    }
    //end-of __ getter and setter

    //our calling the viewAttack from Parent (this , KearifanLokalGame.class);
    @Override
    public void viewAttack() 
    {
        //super always top of code
        super.viewAttack(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Jump Mode      = " +flyPocong);
    }
    
    
    
    
    
    
    
}
