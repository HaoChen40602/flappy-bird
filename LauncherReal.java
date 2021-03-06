import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;
import java.awt.*;
import javax.swing.JOptionPane;
/**
 * ask user for the username and the mode.
 *
 * @author Hao Chen
 * @version 7/24/2019
 */
public class LauncherReal extends JFrame implements ActionListener {
        
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    /**
     * store if there are two players 
     */
    public static boolean twoP;
    /**
     * store the mode they chose 
     */
    public static String levelS;
    /**
     * store the suername 
     */
    public static String userName;
    /**
     * show a window with buttons on it to choose the mode
     */
    public LauncherReal(){
        
        Dimension preferredSize = new Dimension(200,60);//设置尺寸
        
        setBounds(0, 0, 700, 392);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        
        button1 = new JButton("easy & single");
        button1.setPreferredSize(preferredSize);
        button1 .addActionListener(this);
        add(button1);
        
        button2 = new JButton("normal & single");
        button2.setPreferredSize(preferredSize );
        button2 .addActionListener(this);
        add(button2);
        
        button3 = new JButton("hard & single");
        button3.setPreferredSize(preferredSize );
        button3 .addActionListener(this);
        add(button3);
        
        button4 = new JButton("crazy & single");
        button4.setPreferredSize(preferredSize );
        button4 .addActionListener(this);
        add(button4);
        
        button5 = new JButton("impossible & single");
        button5.setPreferredSize(preferredSize );
        button5 .addActionListener(this);
        add(button5);
        
        button6 = new JButton("easy & double");
        button6.setPreferredSize(preferredSize );
        button6 .addActionListener(this);
        add(button6);
        
        button7 = new JButton("normal & double");
        button7.setPreferredSize(preferredSize );
        button7 .addActionListener(this);
        add(button7);
        
        button8 = new JButton("hard & double");
        button8.setPreferredSize(preferredSize );
        button8 .addActionListener(this);
        add(button8);
        
        button9 = new JButton("crazy & double");
        button9.setPreferredSize(preferredSize );
        button9 .addActionListener(this);
        add(button9);
        
        button10 = new JButton("impossible & double");
        button10.setPreferredSize(preferredSize );
        button10 .addActionListener(this);
        add(button10);
        
        setVisible(true);
        
    }
    /**
     * arrording to the action of the user, set variable to different values.
     */
    public void actionPerformed(ActionEvent e){
        while (true){
            if (e.getSource() == button1){
                levelS = "easy";
                twoP = false;
                break;
            }else if (e.getSource() == button2){
                levelS = "normal";
                twoP = false;
                break;
            }else if (e.getSource() == button3){
                levelS = "hard";
                twoP = false;
                break;
            }else if (e.getSource() == button4){
                levelS = "crazy";
                twoP = false;
                break;
            }else if (e.getSource() == button5){
                levelS = "impossible";
                twoP = false;
                break;
            }else if (e.getSource() == button6){
                levelS = "easy";
                twoP = true;
                break;
            }else if (e.getSource() == button7){
                levelS = "normal";
                twoP = true;
                break;
            }else if (e.getSource() == button8){
                levelS = "hard";
                twoP = true;
                break;
            }else if (e.getSource() == button9){
                levelS = "crazy";
                twoP = true;
                break;
            }else if (e.getSource() == button10){
                levelS = "impossible";
                twoP = true;
                break;
            }
        }
        
        setVisible(false);
        Music.main(null);
        return;
    }
    /**
     * ask the user for name and run the whole project.
     */
    public static void main(String[] args) {
        int g = -1;
        while (g < 0){
             userName = JOptionPane.showInputDialog("Please input your name: ");
             if (userName == null){
                 System.exit(0);
             }
             userName = userName.replaceAll(" ", "");
             if (userName.length() > 0){
                 g++;
             }
        }
        LauncherReal menu = new LauncherReal();
     }
}
