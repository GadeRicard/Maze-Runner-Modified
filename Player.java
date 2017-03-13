import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    public Player()
    {
        GreenfootImage playerImage = new GreenfootImage(40, 40);
        
        playerImage.setColor(Color.GREEN);
        playerImage.fillRect(0, 0, 40, 40);
        
        setImage(playerImage);
    }
    
    private void testWin()
    {
        MyWorld myWorld = (MyWorld)getWorld();
        if(isTouching(WinningSpace.class))
        {
            myWorld.checkWin();
        }
    }
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        testWin();
        
        movement();
    }    
    
    private void movement()
    {
        if(Greenfoot.isKeyDown("left") == true && getOneObjectAtOffset(-1, 0, Wall.class) == null)
        {
            setLocation( getX()-1, getY() );
        }
        
        if(Greenfoot.isKeyDown("right") == true && getOneObjectAtOffset(1, 0, Wall.class) == null)
        {
            setLocation(getX()+1, getY() );
        }
        
        if(Greenfoot.isKeyDown("up") == true && getOneObjectAtOffset(0, -1, Wall.class) == null)
        {
            setLocation(getX(), getY()-1 );
        }
        
        if(Greenfoot.isKeyDown("down") == true && getOneObjectAtOffset(0, 1, Wall.class) == null)
        {
            setLocation(getX(), getY()+1 );
        }
    }
}
