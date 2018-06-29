/*
This class is response for getting images to make the maze from the game's
resource folder. Within class Map, Scanner is declared as m to read letters
within Map.text to load up images within the same folder. An array is made to
hold more than one varible, since 14 tiles is the limit. Image variables like
floor, exit and wall are declared, and will be set with an image value collected
from the resource folder. Then using images method to return each variable.  
The program will try to new the open Map.txt, but will displace an error message
if the file is failed to be open. To read the file, a for loop was made to loop
through every 14 characters within a row, and as value of i increases by one,
the next row is up to read, until all 14 rows are read through.
*/
package maze;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.ImageIcon;

public final class Map {
    
    private Scanner m;
    private final String Map[] = new String[14];
    private final Image floor;
    private final Image exit;
    private final Image wall;
    
    public Map(){
        
        ImageIcon image = new ImageIcon("C://Hy_2018_netbeans//Maze//resources//floor.png");
        floor = image.getImage();
        image = new ImageIcon("C://Hy_2018_netbeans//Maze//resources//wall.png");
        wall = image.getImage();
        image = new ImageIcon("C://Hy_2018_netbeans//Maze//resources//exit.jpg");
        exit = image.getImage();
        
        
        openFile();
        readFile();
        closeFile();
    }
    
    public Image makeFloor(){
        return floor;
    }
    
    public Image makeWall(){
        return wall;
    }
    
    public Image makeExit(){
        return exit;
    }
    
    public String getMap(int x, int y){
        String index = Map[y].substring(x,x + 1);
        return index;
    }
    
    public void openFile(){
        try{
            m = new Scanner(new File("C://Hy_2018_netbeans//Maze//resources//Map.txt"));
        }catch(FileNotFoundException e){
            System.out.println("Error");
        }
        
    }
    
    public void readFile(){
        while(m.hasNext()){
            for(int i = 0; i < 14; i++){
                Map[i] = m.next();
            }
        }
    }
    
    public void closeFile(){
        
    }
    
    
}
