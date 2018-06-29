/*
This is a JFrame responsible for the first set of maze game with a white 
character or can be called as bone character. Here a jpanel name My Panel set
timer variable to a timer that refresh the panel every 50ms. map is set equals
to m to get the image file from map.java. Character is set to c to get the image
from the character class. Font is set to Calibri 48 for the message that will be
print at the end. A paint method is set up to look for every column and every
row within Map.txt, if there are letters representing walls, floors or finish
line, then get images from Map.java and Character classes and draw them on this
frame. An actionperformed method was set up to print out "Complete" message when
the game have got and painted the image of a end game tile, which occurs when
the controlled character is moving above it. A KeyAdapter called Al is added and
a method called keyPressed is added. Int keyletter is declared to get the code
of keys being pressed. All if statements are focus on if character is moving to
a tile that is not a wall, then it can pass through, but can't if it's a wall.
*/
package maze;

import java.awt.*;
import java.awt.event.*;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

public class Maze extends JFrame{
}

class MyPanel extends JPanel implements ActionListener{
    private final Timer timer;
    private final Map m;
    private final Character c;
    private String Message = "";
    private final Font font = new Font("Calibri", Font.BOLD, 48);
    
    @Override
    public void paint(Graphics g) {
        for(int y = 0; y < 14; y++){
            for(int x = 0; x < 14; x++){
                if(m.getMap(x, y).equals("e")){
                    g.drawImage(m.makeExit(),x * 32,y * 32, null);
                }
                if(m.getMap(x, y).equals("f")){
                    g.drawImage(m.makeFloor(),x * 32,y * 32, null);
                }
                if(m.getMap(x, y).equals("w")){
                    g.drawImage(m.makeWall(),x * 32,y * 32, null);
                }
            }
        }
        g.drawImage(c.getCharacter(), c.getBlockX() * 32, c.getBlockY() * 32, null);
        g.setFont(font);
        g.setColor(Color.white);
        g.drawString(Message, 130, 210);
    }
    
    public MyPanel(){
        
        m = new Map();
        c = new Character();
        addKeyListener(new Al());
        setFocusable(true);
        timer = new Timer(50, this);
        timer.start();
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(m.getMap(c.getBlockX(), c.getBlockY()).equals("e")){
            Message = "Complete";
        }
        repaint();
    }
    
    public class Al extends KeyAdapter{
        
        @Override
        public void keyPressed(KeyEvent e){
            int keyletter = e.getKeyCode();
            
            if (keyletter == KeyEvent.VK_W){
                if(!m.getMap(c.getBlockX(), c.getBlockY()-1).equals("w"))
                    c.move(0, -1);
            }
            
            if (keyletter == KeyEvent.VK_S){
                if(!m.getMap(c.getBlockX(), c.getBlockY()+1).equals("w"))
                    c.move(0, 1);
            }
            
            if (keyletter == KeyEvent.VK_A){
                if(!m.getMap(c.getBlockX()-1, c.getBlockY()).equals("w"))
                    c.move(-1, 0);
            }
            
            if (keyletter == KeyEvent.VK_D){
                if(!m.getMap(c.getBlockX()+1, c.getBlockY()).equals("w"))
                    c.move(1, 0);
            }
        }
        
        @Override
        public void keyReleased(KeyEvent e){
            
        }
        
        @Override
        public void keyTyped(KeyEvent e){
            
        }
    }
}
