import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {
	public Fenetre() {
		
		
		final JButton bouton1 = new JButton("Débuter une partie à 2 joueurs");
		final JButton bouton2 = new JButton("Débuter une partie à 3 joueurs");
		final JButton bouton3 = new JButton("Débuter une partie à 4 joueurs");
		final JButton bouton4 = new JButton("Règles");
		
		this.setTitle("Robot Turtles Game");
		this.setSize(620, 802);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);	
				
		JPanel b1 = new JPanel();
		b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
		b1.add(bouton1);
		
		JPanel b2 = new JPanel();
		b2.setLayout(new BoxLayout(b2, BoxLayout.LINE_AXIS));
		b2.add(bouton2);
		
		JPanel b3 = new JPanel();
		b3.setLayout(new BoxLayout(b3, BoxLayout.LINE_AXIS));
		b3.add(bouton3);
		
		JPanel b4 = new JPanel();
		b4.setLayout(new BoxLayout(b4, BoxLayout.LINE_AXIS));
		b4.add(bouton4);
		
		JPanel boutons = new JPanel();
		boutons.setLayout(new BoxLayout(boutons, BoxLayout.PAGE_AXIS));
		boutons.add(b1);
		boutons.add(b2);
		boutons.add(b3);
		boutons.add(b4);

		
		Panneau pan = new Panneau();
		pan.add(boutons);
		
		this.setContentPane(pan);
		this.setVisible(true);
	}
}
