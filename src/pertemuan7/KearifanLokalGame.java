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
public class KearifanLokalGame 
{
    //properties
    String name;
    int hp;
    int attackPoint;
    int shieldPoint;

    
    //constructor // method1
    public KearifanLokalGame() 
    {
//      Log.d("asd","asd");
       System.out.println("Parent without param");
        name = "";
        hp = 0;
        attackPoint = 0;
        shieldPoint = 0;
    }

    public KearifanLokalGame(String name, int hp, int attackPoint, int shieldPoint) 
    {
        this.name = name;
        this.hp = hp;
        this.attackPoint = attackPoint;
        this.shieldPoint = shieldPoint;
    }
    //end-constructor //method1
    
    
    //getsetter -- s t a r t

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getHp()
    {
        return hp;
    }

    public void setHp(int hp)
    {
        this.hp = hp;
    }

    public int getAttackPoint()
    {
        return attackPoint;
    }

    public void setAttackPoint(int attackPoint) 
    {
        this.attackPoint = attackPoint;
    }

    public int getShieldPoint()
    {
        return shieldPoint;
    }

    public void setShieldPoint(int shieldPoint) 
    {
        this.shieldPoint = shieldPoint;
    }
    //end-off getter and setter
    
    //data
    public void viewAttack()
    {
        //all use 
        System.out.println(""
                + "\nName           ="+name
                + "\nHp             ="+hp
                + "\nAttackPoint    ="+attackPoint+"%"
                + "\nShieldPoint    ="+shieldPoint+"%");
    }
}
