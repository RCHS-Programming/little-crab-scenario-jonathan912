import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int Wormseaten;
    public void act()
    {
        move();
        checkKeyDown();
        lookforWorm();
    }
    public void move()
    {
          move(5);
    } 
    /*
     * Check weather we have gazed upon a worm if we have munch on it if not do keep looking.
     */
    public void lookforWorm()
   
    {
        Wormseaten = Wormseaten + 1; 
        if(isTouching(Worm.class));
        {
            removeTouching(Worm.class);
        }
        }
        public void checkKeyDown()
    {
               if (Greenfoot.isKeyDown("a"))
        {
            turn (-8);            
        } 
        if (Greenfoot.isKeyDown("d"))
        {
            turn (8);
        }
    }
} 
