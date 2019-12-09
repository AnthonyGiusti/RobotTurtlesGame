import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfaceJeuA2 extends JFrame {
	public Color cBg = new Color(255,255,255,100);

	public InterfaceJeuA2() {
		this.setTitle("Partie à 2 joueurs");
		this.setSize(1920,1080);
		this.setLocationRelativeTo(null);
		this.setAlwaysOnTop(true);
		
		FondJeu pan = new FondJeu();
		
//		pan.setBackground(cBg);
		
		pan.setLayout(new BorderLayout());

//		pan.add(centerPanel(), BorderLayout.CENTER);
		
		pan.add(rightPanel(), BorderLayout.EAST);

		pan.add(bottomnPanel(), BorderLayout.SOUTH);

		pan.add(topPanel(), BorderLayout.NORTH);
		
		this.setContentPane(pan);
		this.setVisible(true);
	}
	
//	private JPanel centerPanel() {
//		Plateau plateau = new Plateau();
//		
//		return plateau;
//	}
	
	
	private JPanel rightPanel() {
		JPanel boutons = new JPanel(new GridLayout(3, 1, 0, 30));
		boutons.setBackground(cBg);
		
		JButton completerProgramme = new JButton("Compléter le programme");
		completerProgramme.setPreferredSize(new Dimension(200,30));
		completerProgramme.setBackground(Color.lightGray);
		//actionlistener
		boutons.add(completerProgramme);
		
		JButton construireMur = new JButton("Construire un mur");
		construireMur.setPreferredSize(new Dimension(200,30));
		construireMur.setBackground(Color.lightGray);
		//actionlistener
		boutons.add(construireMur);
		
		JButton executerProgramme = new JButton("Exécuter le programme");
		executerProgramme.setPreferredSize(new Dimension(200,30));
		executerProgramme.setBackground(Color.lightGray);
		//ActionListener
		boutons.add(executerProgramme);
		
		return boutons;

	}
	
	private JPanel bottomnPanel() {
		JPanel cartesJ1 = new JPanel();
		cartesJ1.setPreferredSize(new Dimension(0,125));
		cartesJ1.setBackground(cBg);
		//Implémenter la manière dont on affiche 
		return cartesJ1;
	}
	
	private JPanel topPanel() {
		JPanel cartesJ2 = new JPanel();
		cartesJ2.setPreferredSize(new Dimension(0,125));
		cartesJ2.setBackground(cBg);
		return cartesJ2;
	}
	 
}