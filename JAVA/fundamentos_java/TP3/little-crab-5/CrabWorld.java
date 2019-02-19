import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

/**
 * The CrabWorld is the place where crabs and other creatures live. 
 * It creates the initial population.
 */
public class CrabWorld extends World
{    
    Lobster lobster1 = new Lobster();
    Lobster lobster2 = new Lobster();
    Lobster lobster3 = new Lobster();
    private int time;    
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
        time = 2000;
        showTime();
        showPoints();
    }
    public void act()
    {
        countTime();
        endGame();
        showTime();
        showPoints();
    }
    public void showTime()
    {
        showText("Tempo: " + time,490, 10);
    }
    public void showPoints()
    {
        showText("Pontos: " + Crab.getPoints(), 60, 10);
    }
    public void countTime() 
    {   
        time --;
        if (time == 0){                   
            showText("O jogo acabou!", 280, 280);
            Greenfoot.stop();
        }
    }
    public void endGame()
    {
        if (Crab.getPoints() < 0 || (time == 0 && Crab.getPoints() < 100))
        {
            showText("Você perdeu!",280,280);
            Greenfoot.stop();            
        }
        if (Crab.getPoints() == 200 || (time == 0 && Crab.getPoints() >= 100))
        {
            showText("Você ganhou", 280,280);
            Greenfoot.stop();
        }
    }
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab, 231, 203);
        Worm worm = new Worm();
        addObject(worm, 445, 137);
        Worm worm2 = new Worm();
        addObject(worm2, 454, 369);
        Worm worm3 = new Worm();
        addObject(worm3, 368, 466);
        Worm worm4 = new Worm();
        addObject(worm4, 129, 488);
        Worm worm5 = new Worm();
        addObject(worm5, 254, 388);
        Worm worm6 = new Worm();
        addObject(worm6, 106, 334);
        Worm worm7 = new Worm();
        addObject(worm7, 338, 112);
        Worm worm8 = new Worm();
        addObject(worm8, 150, 94);
        Worm worm9 = new Worm();
        addObject(worm9, 373, 240);
        Worm worm10 = new Worm();
        addObject(worm10, 509, 55);        
        addObject(lobster1, 334, 65);        
        addObject(lobster2, 481, 481);        
        addObject(lobster3, 79, 270);
    }
}