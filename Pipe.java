import java.awt.Graphics;
import java.awt.image.*;
import java.util.Random;
import java.awt.Rectangle;
/**
 * the class for creating the pipes
 *
 * @author Hao Chen
 * @version 7/24/2019
 */
public class Pipe
{
    /**
     * the x coordinate value.
     */
    public double spaceX;
    private double spaceY;
    private Random r = new Random();
    /**
     * the top collision detection rectangle.
     */
    public Rectangle top;
    /**
     * the bottom collision detection rectangle.
     */
    public Rectangle bottom;
    /**
     * the speed of the pipes.
     */
    public static double speed;
    private double difficult;
    /**
     * initialize the variables.
     */
    public Pipe(){
        spaceX = 700;
        spaceY = r.nextInt(170) - 340;
        top = new Rectangle((int) spaceX, (int) spaceY, 54, 405);
        bottom = new Rectangle((int) spaceX, (int) spaceY + 517, 54,405);
        if (LauncherReal.levelS.equals("easy")){
             speed = -2;
        }else if(LauncherReal.levelS.equals("normal")){
             speed = -3;
        }else if(LauncherReal.levelS.equals("hard")){
             speed = -4;
        }else if(LauncherReal.levelS.equals("crazy")){
             speed = -5;
        }else{
             speed = -6;
        }
    }
    
    /**
     * change the position of the pipe 
     */
    public void tick(){
         //speed -= 0.001;
         spaceX += speed;
         top.setRect(spaceX, top.getY(), top.getWidth(), top.getHeight());
         bottom.setRect(spaceX, bottom.getY(), bottom.getWidth(), bottom.getHeight());
    }
    /**
     * draw the pipe 
     * @param g the graphics object you want to draw on.
     */
    public void render(Graphics g){
        g.drawImage(Assets.pipe, (int) spaceX, (int) spaceY, null);
    }
    /**
     * return the top collision detection rectangle
     * @return top the top collision detection rectangle
     */
    public Rectangle getTopRect(){
        return top;
    }
    /**
     * return the bottom collision detection rectangle
     * @return bottom the bottom collision detection rectangle
     */
    public Rectangle getBottomRect(){
        return bottom;
    }
}
