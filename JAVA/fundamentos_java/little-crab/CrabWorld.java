import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    Crab crab1 = new Crab(1);
    Crab crab2 = new Crab(2);
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        //Crab crab = new Crab();
        //addObject(new Crab(), 250,250);
        populateWorld();
    }
    
    public void populateWorld()
    {
        
        addObject(crab1, 200,250);
        addObject(crab2, 300,250);
                
        addObject(new Lobster(), 10, 550);
        addObject(new Lobster(), 10, 550);
        addObject(new Lobster(), 10, 550);
        for(int i = 0; i < 10; i++)
            addObject(new Worm(), Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        for(int i = 0; i < 3; i++)
            addObject(new Potion(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
    }
}