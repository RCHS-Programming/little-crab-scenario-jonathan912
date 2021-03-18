import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        move();
        lookforWorm();
        checkKeyDown();
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
