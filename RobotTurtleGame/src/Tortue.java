import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Tortue {

	public int [] positionTortue1 = new int [2];
	public int [] positionTortue2 = new int [2];
	public int [] positionTortue3 = new int [2];
	public int [] positionTortue4 = new int [2];
	
	public void paintComponent(Graphics g) {
        try{
        	if (Menu.nb_joueurs==2) {
        		positionTortue1 = new int[] {1,0};
        		positionTortue2 = new int[] {5,0};
        		Image turtle1 = ImageIO.read(new File("turtle1.png"));
        		Image turtle2 = ImageIO.read(new File("turtle2.png"));
        		g.drawImage(turtle1, 100*positionTortue1[0], 100*positionTortue1[1], 95, 95, (ImageObserver) this);
        		g.drawImage(turtle2, 98*positionTortue2[0], 100*positionTortue2[1], 95, 95,  (ImageObserver) this);
        	}
        	else if(Menu.nb_joueurs == 3) {
        		positionTortue1 = new int[] {};
        		positionTortue2 = new int[] {};
        		positionTortue3 = new int[] {};
        		Image turtle1 = ImageIO.read(new File("turtle1.png"));
        		Image turtle2 = ImageIO.read(new File("turtle2.png"));
        		Image turtle3 = ImageIO.read(new File("turtle3.png"));
        		g.drawImage(turtle1, 100*positionTortue1[0], 100*positionTortue1[1], 95, 95, (ImageObserver) this);
        		g.drawImage(turtle2, 98*positionTortue2[0], 100*positionTortue2[1], 95, 95,  (ImageObserver) this);
        		g.drawImage(turtle3, 100*positionTortue3[0], 100*positionTortue3[1], 95, 95, (ImageObserver) this);
        	}
        	else {
        		positionTortue1 = new int[] {};
        		positionTortue2 = new int[] {};
        		positionTortue3 = new int[] {};
        		positionTortue4 = new int[] {};
        		Image turtle1 = ImageIO.read(new File("turtle1.png"));
        		Image turtle2 = ImageIO.read(new File("turtle2.png"));
        		Image turtle3 = ImageIO.read(new File("turtle3.png"));
        		Image turtle4 = ImageIO.read(new File("turtle4.png"));
        		g.drawImage(turtle1, 100*positionTortue1[0], 100*positionTortue1[1], 95, 95, (ImageObserver) this);
        		g.drawImage(turtle2, 98*positionTortue2[0], 100*positionTortue2[1], 95, 95,  (ImageObserver) this);
        		g.drawImage(turtle3, 100*positionTortue3[0], 100*positionTortue3[1], 95, 95, (ImageObserver) this);
        		g.drawImage(turtle4, 100*positionTortue4[0], 100*positionTortue4[1], 95, 95, (ImageObserver) this);

        		System.out.println("erreur pour l'instant");
        	}
        } catch (IOException e){
            e.printStackTrace();
        }
	}
}
