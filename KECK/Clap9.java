import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snare1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clap9 extends Claps
{
    boolean playOnce=true;
    /**
     * Act - do whatever the snare1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        Button();
        if((Taktgeber.NotePlaying==9)&&(playOnce)){
            snare(isClicked);
            playOnce=false;
        }
        if(Taktgeber.NotePlaying!=9){
            playOnce=true;
        }
        
        //System.out.println("NotePlaying="+Taktgeber.NotePlaying);
    }    
}
