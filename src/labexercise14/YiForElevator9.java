/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise14;

/**
 *
 * @author Yogi
 */
public class YiForElevator9 
{
    public boolean doorOpen = false;
    public int currentFloo = 5;
    
    
    public final int TOP_FLOOR = 5;
    public final int BOTTOM_FLOOR = 1;
    
    public void openDoor()
    {
        System.out.println("Opening the door");
        doorOpen = true;
        System.out.println("Door is open");
    }
    
    public void clossDoor()
    {
        System.out.println("Closing the door");
        doorOpen = false;
        System.out.println("Door is closed");
    }
    
    public void goUp()
    {
        System.out.println("Going up one floor");
        currentFloo++;
        System.out.println("Floor "+currentFloo);
    }
    public void goDown()
    {
        System.out.println("Going down on floor");
        currentFloo--;
        System.out.println("Floor "+currentFloo);
    }
    public void setFloor()
    {
     int desiredFloor = 5; //lantai yang di inginkan
        if (currentFloo > desiredFloor)
        {
            for (int down = currentFloo; down != desiredFloor; down--)
            {
                goDown();
            }
        }
        else
        {
            for (int up = currentFloo; up != desiredFloor; up++) 
            {
                goUp();
            }
        }
    }
}
