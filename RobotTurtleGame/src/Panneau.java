import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panneau extends JPanel {
	
  public void paintComponent(Graphics g){
//  Image de fond
	try {
      Image bg = ImageIO.read(new File("background.jpeg"));
      g.drawImage(bg, 0, 0, this.getWidth(), this.getHeight(), this);
    } catch (IOException e) {
      e.printStackTrace();
    }
//	Logo
	try {
		Image logo = ImageIO.read(new File("logo.png"));
		g.drawImage(logo, 50, 50, this);
	} catch (IOException e) {
		e.printStackTrace();
	}
  }
}
//Test pour commitAndPush