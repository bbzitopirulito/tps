import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    /**
     * Make the piano.
     */
    private static String[] whiteKeys = {"q","w","e","r","t","y","u","i","o","p","[","]"};
    private static String[] wnotes = {"3c","3d","3e","3f","3g","3a","3b","4c","4d","4e","4f","4g"};
    private static String[] blackKeys = {"1","2","3","4","5","6","7","8"};
    private static String[] bnotes = {"3c#","3d#","3f#","3g#","3a#","4c#","4d#","4f#"};
    private GreenfootImage image;
    private int imgw;
    private int imgh;
    public static String nameU;    
    public static String nameN;
    public static int key;
    
    public Piano() 
    {
        super(800, 340, 1);
        addKeys();
    }
    public void act()
    {        
        getObjects(Key.class);
    }
    public void addKeys()
    {
        int i = 0;
        while(i < whiteKeys.length)
        {
            nameU = "white-key-down.png";
            nameN = "white-key.png";
            Key newWKey = new Key(1,whiteKeys[i],wnotes[i] + ".wav",nameU, nameN);            
            image = newWKey.getImage();
            imgw = image.getWidth();
            imgh = image.getHeight();
            int x = 54 + i * imgw;
            int y = imgh - 140;
            addObject(newWKey,x,y);            
            i++;
        }
        int a = 0;
        while(a < blackKeys.length)
        {                 
            nameU = "black-key-down.png";
            nameN = "black-key.png";
            Key newBKey = new Key(2,blackKeys[a],bnotes[a] + ".wav",nameU,nameN);            
            image = newBKey.getImage();
            imgw = image.getWidth();
            imgh = image.getHeight();            
            int x = 84 + a * imgw;
            int y = imgh - 200;
            if (a >= 2) {
                if (a == 2) {
                    addObject(newBKey,x+imgw,y);
                }
                else if (a > 2 && a < 5) {
                    addObject(newBKey,x+imgw,y);
                }
                else if (a == 5) {
                    addObject(newBKey,x+(2*imgw),y);
                }
                else if (a == 6) {
                    addObject(newBKey,x+(2*imgw),y);
                }
                else if (a == 7) {
                    addObject(newBKey,x+(3*imgw),y);
                }
            }            
            else{
                addObject(newBKey,x,y);
            }
            a++;
        }
    }        
}