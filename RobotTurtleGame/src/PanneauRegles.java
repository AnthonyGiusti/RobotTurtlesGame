import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class PanneauRegles extends JPanel {
	public void paintComponent(Graphics g){
	// regles
	try {
		Image regles = ImageIO.read(new File("regles.png"));
		g.drawImage(regles, 0, 0, this.getWidth(), this.getHeight(), this);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}

