import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
import java.util.List;
public class Key extends Actor
{
    private boolean isDown;
    private String key;
    private String sound;
    private String keyUp;
    private String keyDown;
    private int c;    
    /**
     * Create a new key.
     */
    public Key(int keyC, String keyName, String soundFile, String Up, String Down)
    {
        isDown = true;
        key = keyName;
        sound = soundFile;
        if (keyC == 1)
        {
            Up = keyUp = "white-key.png";
            Down = keyDown = "white-key-down.png";
        }else if (keyC == 2){            
            Up = keyUp = "black-key.png";
            Down = keyDown = "black-key-down.png";
        }
        c = keyC;    
    }
    
    /**
     * Do the action for this key.
     */
    public void act()
    {
        checkKeyPress();        
    }
    public void checkKeyPress()
    {        
        if (!isDown && Greenfoot.isKeyDown(this.key)){
            setImage(keyDown);
            play();
            isDown = true;
        }else if(isDown && !Greenfoot.isKeyDown(this.key)){
            setImage(keyUp);
            isDown = false;
        }
        if (Greenfoot.mouseClicked(null))
        {
            World world = getWorld();
            List<Key> keys = world.getObjects(Key.class);
            
            for(Key key : keys)
            {
                key.play();
                Greenfoot.delay(10);
            }
        }
    }
    public void play()
    {
        Greenfoot.playSound(sound);
    }
    public void setIsDown(boolean isDown)
    {
        this.isDown = isDown;
    }
    public boolean getIsDown()
    {
        return this.isDown;
    }    
}


