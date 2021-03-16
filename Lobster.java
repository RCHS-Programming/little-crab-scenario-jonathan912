import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    
    {
        move();
        lookforCrab();
        randomTurn();
        Turnatedge();
    }
    public void move()
    {
          move(5);
       
    } 
    /*
     * Check weather we have gazed upon a crab if we have munch on it if not do keep looking.
     */
    public void lookforCrab()
   
    {
        if(isTouching(Crab.class));
        {
            removeTouching(Crab.class);
        }
    }
    /*
     * make da lobsta turn randomly left or right between 0 and 45 degrees.
     */
    public void randomTurn()
    {
        if (Greenfoot.getRandomNumber(100)<10)
        {
            turn(Greenfoot.getRandomNumber (91) - 45);
        }
    }
    /*
     * turns at edge
     */
    public void Turnatedge()
    {
        if(isAtEdge())
        {
            turn(17);
        }
    } 
    }    
