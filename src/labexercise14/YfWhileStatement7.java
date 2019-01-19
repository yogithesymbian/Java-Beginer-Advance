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
public class YfWhileStatement7 
{
    private boolean bukaPintu = false;
    public int pintuSekarang  = 1;
    public final int PINTU_ATAS = 5;
    public final int PINTU_BAWAH = 1;
    
    public void openDoor()
    {
        System.out.println("Opening the door");
        setBukaPintu(true); //doorOpen
        System.out.println("Door is open");
    }
    
    public void closeDoor()
    {
        System.out.println("Closing Door");
        setBukaPintu(false);
        System.out.println("Door is closed");
    }
    
    public void goUp()
    {
        System.out.println("Going up one floor");
        pintuSekarang++;
        System.out.println("Floor "+pintuSekarang);
    }
    public void goDown()
    {
        System.out.println("Going down one floor");
        pintuSekarang--;
        System.out.println("Floor "+pintuSekarang);
    }
    public void setFloor()
    {
       int desiredFloor = 5;
        while (pintuSekarang != desiredFloor)
        {            
            if (pintuSekarang < desiredFloor)
            {
                goUp();
            }
            else
            {
                goDown();
            }
        }
    }

    /**
     * @return the bukaPintu
     */
    public boolean isBukaPintu() {
        return bukaPintu;
    }

    /**
     * @param bukaPintu the bukaPintu to set
     */
    public void setBukaPintu(boolean bukaPintu) {
        this.bukaPintu = bukaPintu;
    }
    
}
