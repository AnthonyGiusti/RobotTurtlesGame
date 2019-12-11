import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class DosDeCarte extends JPanel{
	public void paintComponent(Graphics g) {
		Image img;
		try {
			 img = ImageIO.read(new File(""));
		      g.drawImage(img, 0, 0, this);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
