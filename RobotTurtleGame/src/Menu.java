import java.awt.BorderLayout; 
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Menu extends JFrame{

	
	public Menu() {	
		super("Robot Turtles Game");
		this.setSize(620, 802);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);	
		
		Panneau pan = new Panneau();
		pan.setLayout(new BorderLayout());
		
		pan.add(createButtons(), BorderLayout.CENTER);
		
		pan.add(createCredits(), BorderLayout.SOUTH);
		
		pan.add(emptyLeft(), BorderLayout.WEST);
		
		pan.add(emptyRight(), BorderLayout.EAST);
		
		pan.add(emptyTop(), BorderLayout.NORTH);

		
		this.setContentPane(pan);
		this.setVisible(true);
	}
	
	
	private JPanel createButtons() {
		Color cBg = new Color(0,0,0,100);
//		Color cB = new Color(192, 192, 192, 25);
		JPanel boutons = new JPanel(new GridLayout(4, 1, 0, 30));
		boutons.setBackground(cBg);
		
		JButton jouerA2 = new JButton("Lancer une partie à 2 joueurs");
		jouerA2.setPreferredSize(new Dimension(400, 45));
		jouerA2.setBackground(Color.lightGray);
		jouerA2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Commencer une partie à 2 joueurs");
			}
		});
		boutons.add(jouerA2);
		
		
		JButton jouerA3 = new JButton("Lancer une partie à 3 joueurs");
		jouerA3.setPreferredSize(new Dimension(400, 45));
		jouerA3.setBackground(Color.lightGray);
		jouerA3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Commencer une partie à 3 joueurs");	
			}
		});
		boutons.add(jouerA3);
		

		JButton jouerA4 = new JButton("Lancer une partie à 4 joueurs");
		jouerA4.setPreferredSize(new Dimension(400, 45));
		jouerA4.setBackground(Color.lightGray);
		jouerA4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Commencer une partie à 4 joueurs");	
			}
		});
		boutons.add(jouerA4);

		JButton regles = new JButton("Règles du jeu");
		regles.setPreferredSize(new Dimension(400, 45));
		regles.setBackground(Color.lightGray);
		regles.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e4) {
				reglesListener(e4);
				
			}
		});
		boutons.add(regles);

		return boutons;
	}
	
	private void reglesListener(ActionEvent e4 ) {
		Color cBg = new Color(255,222,173,75);
		JFrame fenetreRegles = new JFrame();
		JTextArea explications = new JTextArea("Voici toutes les règles de robot turtles");
		
		explications.setBackground(cBg);
		
		fenetreRegles.setTitle("Règles du jeu");
		fenetreRegles.setSize(300, 300);
		fenetreRegles.setLocationRelativeTo(null);
		fenetreRegles.setAlwaysOnTop(true);
		
		fenetreRegles.add(explications);
		fenetreRegles.setVisible(true);
		
	}
	
	private JPanel createCredits() {
		Color cBg = new Color(255, 255, 255, 75);
		
		JPanel credits = new JPanel(new FlowLayout(FlowLayout.LEFT));
		credits.setPreferredSize(new Dimension(802, 30));
		credits.setBackground(cBg);
		
		String texte = "Designed by : Anthony Giusti - Loup Samain - Maximilien Teil";
		
		JLabel msg = new JLabel(texte);
		msg.setPreferredSize(new Dimension(340, 30));
		credits.add(msg);
		
		return credits;
	}
	
	private JPanel emptyLeft() {
		Color cBg = new Color(0, 0, 0, 100);
		JPanel left = new JPanel();
		left.setPreferredSize(new Dimension(110, 0));
		left.setBackground(cBg);
				
		return left;
	}
	
	private JPanel emptyRight() {
		Color cBg = new Color(0, 0, 0, 100);
		JPanel right = new JPanel();
		right.setPreferredSize(new Dimension(110, 0));
		right.setBackground(cBg);
				
		return right;
	}
	
	private JPanel emptyTop() {
		Color cBg = new Color(0, 0, 0, 100);
		JPanel top = new JPanel();
		top.setPreferredSize(new Dimension(0, 230));
		top.setBackground(cBg);
				
		return top;
	}	              
}
