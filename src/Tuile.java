/*
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Tuile extends JPanel {
	public static int [] positionTortue1 = new int [2];
	public static int [] positionTortue2 = new int [2];
	public static int [] positionTortue3 = new int [2];
	public static int [] positionTortue4 = new int [2];
	public Image mur;
	
	public Tuile(String typeDeTuiles) throws IOException {
		if(typeDeTuiles == "Mur") {
			this.mur = ImageIO.read(new File("WALL.png"));
		}
		if(typeDeTuiles == "MurDeGlace") {
			
		}
		if(typeDeTuiles == "Rubis") {
			
		}
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(this.mur, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, this);
	}
	

}
*/
