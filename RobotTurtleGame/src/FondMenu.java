import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class FondMenu extends JPanel {
	
  public void paintComponent(Graphics g){
	  Image bgMenu;
	try {
		bgMenu = ImageIO.read(new File("backgroundAndLogo.png"));
		g.drawImage(bgMenu, 0, 0, this.getWidth(), this.getHeight(), this);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  	}
}