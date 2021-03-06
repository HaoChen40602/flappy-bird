
import java.awt.Graphics;
import java.awt.image.*;
import java.awt.Rectangle;
/**
 * the class for creating the players
 *
 * @author Hao Chen
 * @version 7/24/2019
 */
public class Player
{
    /**
     * store the collision detection rectangle
     */
    public Rectangle me;
    private Game game;
    private double v0;
    private boolean selfFirst = true;
    /**
     * store if the player object is first.
     */
    private static boolean first = true;
    /**
     * store the x coordinate value.
     */
    public float x;
    /**
     * store the x coordinate value.
     */
    public float y;
    /**
     * store the width.
     */
    public int width;
    /**
     * store the height.
     */
    public int height;
    private double difficult;
    private double a;
    private double g;
    /**
     * initialize the variables.
     * @param game the game object the player is in.
     * @param x the x coordinate value of the player
     * @param y the y coordinate value of the player
     * @param width the width of the player
     * @param height the height of the player
     */
    public Player(Game game, float x, float y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        difficult = 0;
        this.game = game;
        me = new Rectangle((int) x, (int) y, width, height);
        v0 = 0;
        selfFirst = first;
        first = false;
        if (LauncherReal.levelS.equals("easy")){
            a = 0.75;
            g = 8;
        }else if(LauncherReal.levelS.equals("normal")){
            a = 0.1;
            g = 15;
        }else if(LauncherReal.levelS.equals("hard")){
            a = 1.25;
            g = 20;
        }else if(LauncherReal.levelS.equals("crazy")){
            a = 1.5;
            g = 25;
        }else{
            a = 1.75;
            g = 30;
        }
    }
    
    /**
     * change the position of the player
     */
    public void tick(){
        if (selfFirst){
            if (game.getKeyManager().space && y >= 0){
                v0 = a * -3;
            }
        }else{
            if (game.getKeyManager().up && y >= 0){
                v0 = a * -3;
          }
        }
        v0 += g / 60;
        y += v0;
        me = new Rectangle((int) x, (int) y, width, height);
    }
    
    /**
     * draw the pipe 
     * @param g the graphics object you want to draw on.
     */
    public void render(Graphics g){
        if (selfFirst){
            g.drawImage(Assets.player1, (int) x, (int) y, null);
        }else{
            g.drawImage(Assets.player2, (int) x, (int) y, null);
        }
    }
    /**
     * return the collision detection rectangle
     * @return me the collision detection rectangle
     */
    public Rectangle getMe(){
        return me;
    }
}
