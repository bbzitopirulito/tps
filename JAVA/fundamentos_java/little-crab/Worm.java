import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worm extends Actor
{
    /**
     * Act - do whatever the Worm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5);
        turnAtEdge();
        randomTurn();
    }
    public void turnAtEdge(){
        if (isAtEdge()){
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
    }
    public void randomTurn(){
        if (Greenfoot.getRandomNumber(100)<10){
            turn(4);
        }
    }
}
