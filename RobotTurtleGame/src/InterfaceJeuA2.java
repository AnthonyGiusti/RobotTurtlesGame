import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfaceJeuA2 extends JFrame {
	Color transparent = new Color(30,30,30,100);//(transparent)

	public InterfaceJeuA2() {
		GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.setTitle("Partie à 2 joueurs");
		this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
		this.setLocationRelativeTo(null);
		this.setAlwaysOnTop(true);
		
		FondJeu pan = new FondJeu();
				
		pan.setLayout(new BorderLayout());

		pan.add(centerPanel(), BorderLayout.CENTER);
		
		pan.add(rightPanel(), BorderLayout.EAST);

		pan.add(bottomnPanel(), BorderLayout.SOUTH);

		pan.add(topPanel(), BorderLayout.NORTH);
		
		pan.add(emptyLeft(), BorderLayout.WEST);
		
		this.setContentPane(pan);
		this.setVisible(true);
	}
	
	private JPanel centerPanel() {
		Plateau plateau = new Plateau();
		
		return plateau;
	}
	
	
	private JPanel rightPanel() {
		JPanel boutons = new JPanel(new GridLayout(3, 1, 0, 30));
		boutons.setBackground(transparent);
		boutons.setPreferredSize(new Dimension(560,0));
		
		JButton completerProgramme = new JButton("Compléter le programme");
		completerProgramme.setForeground(Color.white);
		completerProgramme.setFont(new Font("Arial",Font.CENTER_BASELINE,18));
		completerProgramme.setPreferredSize(new Dimension(300,30));
		completerProgramme.setBackground(Color.lightGray);
		completerProgramme.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e1) {
				completerProgrammeListener(e1);
			}
		});
		boutons.add(completerProgramme);
		
		JButton construireMur = new JButton("Construire un mur");
		construireMur.setForeground(Color.white);
		construireMur.setFont(new Font("Arial",Font.CENTER_BASELINE,18));
		construireMur.setPreferredSize(new Dimension(300,30));
		construireMur.setBackground(Color.lightGray);
		//actionlistener
		construireMur.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e2) {
				construireMurListener(e2);
			}
		});
		boutons.add(construireMur);
		
		JButton executerProgramme = new JButton("Exécuter le programme");
		executerProgramme.setForeground(Color.white);
		executerProgramme.setFont(new Font("Arial",Font.CENTER_BASELINE,18));
		executerProgramme.setPreferredSize(new Dimension(300,30));
		executerProgramme.setBackground(Color.lightGray);
		executerProgramme.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
			}
		});
		boutons.add(executerProgramme);
		
		return boutons;

	}
	
	private void completerProgrammeListener(ActionEvent e1) {
		//Classe permettant d'amener  à la completion du programme
		JFrame completionProgramme = new JFrame();
		completionProgramme.setTitle("Compléter le programme");
		completionProgramme.setSize(560,1000);
		completionProgramme.setLocation(1360, 0);
		completionProgramme.setAlwaysOnTop(true);
		completionProgramme.setVisible(true);
	}
	
	private void construireMurListener(ActionEvent e2) {
		//Classe permettant de construire un mur ou fonction permettant de construire un mur
		
	}
	
	private void executerProgrammeListener(ActionEvent e3){
		//Classe ou fonction permettant l'execution du programme
	}
	
	private JPanel bottomnPanel() {
		JPanel cartesJ1 = new JPanel();
		cartesJ1.setPreferredSize(new Dimension(0,100));
		cartesJ1.setBackground(transparent);
		//Implémenter la manière dont on affiche 
		return cartesJ1;
	}
	
	private JPanel topPanel() {
		JPanel cartesJ2 = new JPanel();
		cartesJ2.setPreferredSize(new Dimension(0,100));
		cartesJ2.setBackground(transparent);
		return cartesJ2;
	}
	
	private JPanel emptyLeft() {						//Panneau transparent permettant un poqitionnement des boutons plus simple
		JPanel left = new JPanel(new GridLayout(4,2,0,35));
		
		left.setPreferredSize(new Dimension(560, 0));
		left.setBackground(transparent);
		return left;
	}
}