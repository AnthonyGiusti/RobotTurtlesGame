import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class FondJeu extends JPanel {
	
  public void paintComponent(Graphics g){
//  Image de fond
	try {
      Image bg = ImageIO.read(new File("fondJeu.jpg"));
      g.drawImage(bg, 0, 0, this.getWidth(), this.getHeight(), this);
    } catch (IOException e) {
      e.printStackTrace();
    }
  	}
}