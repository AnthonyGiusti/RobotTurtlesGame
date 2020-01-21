import java.awt.Graphics;
		import java.awt.Image;
		import java.io.File;
		import java.io.IOException;

		import javax.imageio.ImageIO;
		import javax.swing.JPanel;

public class Fond extends JPanel {
	private Image background;
	private String typeDuFond;

	public Fond(String nom_du_fichier, String type_du_fond) {
		try {
			this.background = ImageIO.read(new File(nom_du_fichier));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.typeDuFond = type_du_fond;
	}

	@Override
	public void paintComponent(Graphics g){
		g.drawImage(this.background, 0, 0, this.getWidth(), this.getHeight(), (JPanel) this);
	}

	@Override
	public String toString() {
		return this.typeDuFond;
	}
}