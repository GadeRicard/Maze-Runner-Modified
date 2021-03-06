import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class MazeWalker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeWalker extends Actor
{
    private final int NORTH = 270;
    private final int EAST = 0;
    private final int SOUTH = 90;
    private final int WEST = 180;

    public MazeWalker()
    {
        GreenfootImage mazeWalkerImage = new GreenfootImage(40, 40);
        
        mazeWalkerImage.setColor(Color.PINK);
        mazeWalkerImage.fillRect(0, 0, 40, 40);
        
        setImage(mazeWalkerImage);
        setRotation(EAST);
    }
    
    /**
     * checkWin will check if MazeWalker has reached WinningSpace and show a message to say
     * the maze has been completed
     * 
     * @param there are no parameters
     * @return there is no return type
     */
    private void testWin()
    {
        MyWorld myWorld = (MyWorld)getWorld();
        if(isTouching(WinningSpace.class))
        {
            myWorld.checkLose();
        }
    }
    
    /**
     * Act - do whatever the MazeWalker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        testWin();
        
        if(wallOnLeft() == true)
        {
            if(canMoveForward() == true)
            {
                move(1);
            }
            else
            {
                setRotation(getRotation() + 90);
            }
        }
        else
        {
            setRotation(getRotation() - 90);

            move(1);
        }
    }
    
    /**
     * wallOnLeft checks whether there is a wall on the MazeWalker's left
     * 
     * @param there are no parameters
     * @return Returns a boolean stating whether or not there is a wall on the left
     */
    private boolean wallOnLeft()
    {
        int xOffset = 0;
        int yOffset = 0;
        
        boolean wallLeft = false;
        
        if( getRotation() == NORTH)
        {
            xOffset = -1;
        }
        else if(getRotation() == EAST)
        {
            yOffset = -1;
        }
        else if(getRotation() == SOUTH)
        {
            xOffset = 1;
        }
        else if(getRotation() == WEST)
        {
            yOffset = 1;
        }
        
        if(getOneObjectAtOffset( xOffset, yOffset, Wall.class ) != null)
        {
            wallLeft = true;
        }
        
        return wallLeft;
    }
    
    /**
     * canMoveForward checks whether MazeWalker can move forward
     * 
     * @param there are no parameters
     * @return a boolean stating whether or not we can move forward
     */
    private boolean canMoveForward()
    {
        int xOffset = 0;
        int yOffset = 0;
        
        boolean moveForward = false;
        
        if( getRotation() == NORTH)
        {
            yOffset = -1;
        }
        else if(getRotation() == EAST)
        {
            xOffset = 1;
        }
        else if(getRotation() == SOUTH)
        {
            yOffset = 1;
        }
        else if(getRotation() == WEST)
        {
            xOffset = -1;
        }
        
        if(getOneObjectAtOffset( xOffset, yOffset, Wall.class ) == null)
        {
            moveForward = true;
        }
        
        return moveForward;
    }
    
}
