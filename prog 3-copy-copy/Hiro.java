import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hiro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hiro extends Actor
{
    /**
     * Act - do whatever the Hiro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(2);
        
        if (getX()==590)
        setLocation(0,getY());
    }
}
