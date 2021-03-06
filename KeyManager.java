import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
/**
 * listen to and record the input from the user.
 *
 * @author Hao Chen
 * @version 7/24/2019
 */

public class KeyManager implements KeyListener
{
    
    private boolean[] keys;
    /**
     * store if up, down, left, right or space are pressed 
     */
    public boolean up, down, left, right, space;
    
    // constructor
    
    /**
     * initialize a boolean array.
     */
    public KeyManager(){
        keys = new boolean[300];
    }
    
    
    // methods
    /**
     * change the value of whether W, S, A, D and space is pressed
     */
    public void tick(){
        up = keys[KeyEvent.VK_W];
        down = keys[KeyEvent.VK_S];
        left = keys[KeyEvent.VK_A];
        right = keys[KeyEvent.VK_D];
        space = keys[KeyEvent.VK_SPACE];
    }
    
    /**
     * change the value of key pressed to true
     * @param which key is pressed
     */
    public void keyPressed(KeyEvent e){
        keys[e.getKeyCode()] = true;
    }
    
    
    /**
     * change the value of key released to false
     * @param which key is released
     */
    public void keyReleased(KeyEvent e){
        keys[e.getKeyCode()] = false;    
    }
    
    /**
     * do nothing, just override the abstract class
     */
    public void keyTyped(KeyEvent e){
    }
}
