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
        KontrolKeyboad();
    }
    
    public void KontrolKeyboad(){
        if(Greenfoot.isKeyDown("up"))
        {
            move(5);
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            move(-5);
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            belok+=2;
            setRotation(belok);
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            belok-=2;
            setRotation(belok);
        }

    }
}
