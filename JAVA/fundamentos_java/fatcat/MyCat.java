import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act(int howLong)
    {
        
        if(isSleepy()){
            sleep(howLong);
            walkRight(5);
        }
        if(isBored()){
            dance();
            walkRight(5);
        }
        if(isHungry()){
            eat();
            walkRight(5);
        }
        if(isAtEdge()){
            shoutHooray();
            walkLeft(5);
        }
        
    }    
}
