import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delay=0;
    public void act()
    {
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-10);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+10);
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-10,getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+10,getY());
        }
        
    }

}
