import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Plateau extends JPanel{
    public int[][] plateau = new int[8][8];
    public int[] positionJoueur1 = {1,5};
    public int[] positionJoueur2 = {5,5};

    public void paintComponent(Graphics g){
        try{
            //Les tortues et le ruby

            Image plateau = ImageIO.read(new File("Plateau.png"));
            Image turtle1 = ImageIO.read(new File("turtle1.png"));
            Image turtle2 = ImageIO.read(new File("turtle2.png"));
            Image ruby = ImageIO.read(new File("RUBY.png"));
            Image wall = ImageIO.read(new File("WALL.png"));
            g.drawImage(plateau, 0, 0,800, 800, this);
            g.drawImage(turtle1, 100*positionJoueur1[0], 100*positionJoueur1[1], 95, 95,  this);
            g.drawImage(turtle2, 98*positionJoueur2[0], 100*positionJoueur2[1], 95, 95,  this);
            g.drawImage(ruby, 295, 660, 95, 95,  this);

            //Les murs

            g.drawImage(wall, 687,   0, 95, 95,  this);
            g.drawImage(wall, 687,  95, 95, 95,  this);
            g.drawImage(wall, 687, 190, 95, 95,  this);
            g.drawImage(wall, 687, 285, 95, 95,  this);
            g.drawImage(wall, 687, 380, 95, 95,  this);
            g.drawImage(wall, 687, 475, 95, 95,  this);
            g.drawImage(wall, 687, 570, 95, 95,  this);
            g.drawImage(wall, 687, 665, 95, 95,  this);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
