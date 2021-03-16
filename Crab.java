import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        if(isAtEdge())
        {
            turn(17);
        } 
       
        if (Greenfoot.getRandomNumber(100)<10)
        {
            turn(Greenfoot.getRandomNumber (91) - 45);
        }
        move();
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
        if(isTouching(Worm.class));
        {
            removeTouching(Worm.class);
        }
    }
} 
