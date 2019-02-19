import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor 
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private int wormsEaten;
    public static boolean Potion;
    private int time;
    
    
    int player = 0;    
    public void act()
    {
       //Add your action code here!
       //Rotaciona quando chegamos no canto
       //turnAtEdge();
       checkKeyPress();
       
       relocate();
       move(5);
       eatWorm();
       eatPotion();
       isPowerfull();
       switchImage();
    }
    public Crab(int player)
    {                    
        image1 = new GreenfootImage("crab.png");
        image2 = new GreenfootImage("crab2.png");
        image3 = new GreenfootImage("lobster.png");
        wormsEaten = 0;
        time = 200;
        Potion = false;
        setImage(image1);
        this.player = player;
        //returnCrab();
    }    
    /**
     * Método turnAtEdge()
     * Rotaciona quando detecta o canto
     */
    public void turnAtEdge(){
        if (isAtEdge()) {
           turn(Greenfoot.getRandomNumber(90)-45);
       }
    }
    /**
     * Método random turn
     * Rotaciona aleatoriamente o crab com probabilidade de 10%
     */
    public void randomTurn(){
    if(Greenfoot.getRandomNumber(100)<10){
           turn(4);
       }    
    }
    public void relocate()
    {
        int y = getY();
        int x = getX();        
        if (getX() == 559) {
            setLocation(1 , y);
        }
        if (getX() == 0){
            setLocation(560, y);
        }
        if (getY() == 0){
            setLocation(x, 558);
        }
        if (getY() == 559){
            setLocation(x, 1);
        }
    }
    
    /**
     * Método eatWorm()
     * Método que detecta a colisão com o Worm e retira o objeto do mundo
     */
    public void eatWorm(){
        if(isTouching(Worm.class)){
           removeTouching(Worm.class);
           Greenfoot.playSound("slurp.wav");
           wormsEaten += 1;
           if (wormsEaten == 8){
               Greenfoot.playSound("fanfare.wav");
               Greenfoot.stop();
           }     
       }
    }
    public static boolean isPowerfull(){        
        return Potion;
    }
    public void eatPotion(){        
        if(isTouching(Potion.class)){
            Potion = true;
            removeTouching(Potion.class);
            Greenfoot.playSound("horse.wav");                        
        }             
        if(time != 0){
            time--;
        }
        if(time == 0){
            time = 200;
            Potion = false;                    
        }                
    }
    
    public void checkKeyPress(){
        if (player == 1){
            if (Greenfoot.isKeyDown("left")){
                turn(-4);
            }
            if (Greenfoot.isKeyDown("right")){
                turn(4);
            }            
        }
        if (player == 2){
            if (Greenfoot.isKeyDown("1")){
                turn(-4);
            }
            if (Greenfoot.isKeyDown("2")){
                turn(4);
            }            
        }
    }
    public void switchImage()
    {
       if (Potion == true){
           setImage(image3);
       }
       else {
            if (getImage() == image1)
                setImage(image2);
           else
                setImage(image1);
       }     
    }
}

    
/**
 * Teste de comentário(1)!
 */
// Teste de comentário(2)!


