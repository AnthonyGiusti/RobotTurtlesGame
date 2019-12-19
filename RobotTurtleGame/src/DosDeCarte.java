import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DosDeCarte extends JPanel{
	private Image dosCarte;
	private int width = 75;
	private int height = 100;
	
	public DosDeCarte(String nom_du_fichier) {
		try {
			this.dosCarte = ImageIO.read(new File(nom_du_fichier));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void paintComponent(Graphics g) {
		if(Menu.nb_joueurs == 2) {
			g.drawImage(this.dosCarte, 125, 125, width, height, (JPanel) this);

		}
		if(Menu.nb_joueurs == 3) {
			g.drawImage(this.dosCarte, 125, 75, width, height, (JPanel) this);

		}
		if(Menu.nb_joueurs == 4) {
			g.drawImage(this.dosCarte, 125, 25, width, height, (JPanel) this);
		}
			
	}
}
