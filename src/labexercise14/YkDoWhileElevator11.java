/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise14;

/**
 *
 * @author Yogi Arif Widodo <Yogi at scodeid.blogspot.com>
 */
public class YkDoWhileElevator11 
{
    public boolean doorOpen = false;
    public int currentFloor = 1;
    
    public final int TOP_FLOOR = 5;
    public final int BOTTOM_FLOOR = 1;
    
    public void openDoor()
    {
        System.out.println("Opening door");
        doorOpen = true;
        System.out.println("Door is open");
        
    }
    public void clossDoor()
    {
        System.out.println("Closing door");
        doorOpen = false;
        System.out.println("Door is close");
    }
    public void goUp()
    {
        System.out.println("Going up one floor");
        currentFloor++;
        System.out.println("Floor "+ currentFloor);
    }
    public void goDown()
    {
        System.out.println("Going down on floor");
        currentFloor--;
        System.out.println("Floor" + currentFloor);
    }
    public void setFloor()
    {
        int desiredFloor = 5;
        do 
        {
            if (currentFloor < desiredFloor)
            {
                goUp();
            }
            else if(currentFloor > desiredFloor)
            {
                goDown();
            }
        } while (currentFloor != desiredFloor);
        
    }
    public static void main(String[] args) 
    {
        YkDoWhileElevator11 elevator = new YkDoWhileElevator11();
        elevator.openDoor();
        elevator.clossDoor();
        elevator.setFloor();
    }
    
}
