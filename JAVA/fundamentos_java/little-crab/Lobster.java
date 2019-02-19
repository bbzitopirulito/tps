import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Lobster extends Actor
{
    //Crab crab = new Crab();
    //boolean p = crab.getPotion();
    //public int Potion = Crab.Potion;
    
    public void act()
    {
       //Add your action code here!
       //Rotaciona quando chegamos no canto
       turnAtEdge();       
       randomTurn();
       eatCrab();    
       move(5);       
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
    /**
     * Método eatWorm()
     * Método que detecta a colisão com o Worm e retira o objeto do mundo
     */
    public void eatCrab(){
        if(isTouching(Crab.class)){
            if(Crab.isPowerfull() == false){
                removeTouching(Crab.class);
                Greenfoot.playSound("slurp.wav");
                Greenfoot.stop();                                
            }
        }        
    }
}
    
/**4
 * Teste de comentário(1)!
 */
// Teste de comentário(2)!


