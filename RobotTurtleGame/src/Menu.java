import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JFrame{
	Color transparent = new Color(0,0,0,50);//(transparent)
	Color vertFonce = new Color(0,100,0);
	public Menu() {	
		super("Robot Turtles Game");							//Nom de la fenetre menu
		this.setSize(620, 802);									//Taile de la fenetre menu
		this.setResizable(false);
		this.setLocationRelativeTo(null);						//Place la fenetre au milieu de l'ecran
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Ferme quand on appuie sur la croix rouge
		this.setAlwaysOnTop(true);								//Place la fenetre au dessus de celles ouvertes
		
		FondMenu pan = new FondMenu();

		pan.setLayout(new BorderLayout());						//Definit le panneau comme un borderLayout 
		
		pan.add(createButtons(), BorderLayout.CENTER);			//Place les boutons du menu au centre de la fenetre
		
		pan.add(createCredits(), BorderLayout.SOUTH);			//Place les crédits en bas de la fenetre
		
		pan.add(emptyLeft(), BorderLayout.WEST);				//Place une layout vide à gauche de la fenetre
		
		pan.add(emptyRight(), BorderLayout.EAST);				//Place une layout vide à droite de la fenetre
		
		pan.add(emptyTop(), BorderLayout.NORTH);				//Place une layout vide en haut de la fenetre

		this.setContentPane(pan);
		this.setVisible(true);
	}
	
	
	private JPanel createButtons() {										//Cette fonction a pour but de créer les 4 boutons de notre menu
		JPanel boutons = new JPanel(new GridLayout(4, 1, 0, 30));
		boutons.setBackground(transparent);
		
		JButton jouerA2 = new JButton("Lancer une partie à 2 joueurs");
		jouerA2.setForeground(vertFonce);
		jouerA2.setFont(new Font("Arial",Font.CENTER_BASELINE,24));
		jouerA2.setPreferredSize(new Dimension(400, 45));
		jouerA2.setBackground(Color.lightGray);
		jouerA2.addActionListener(new ActionListener() {					//Quand on clique sur le bouton "Lancer une partie à 2 joueurs" execute la fonction jouerA2Listener 
			@Override
			public void actionPerformed(ActionEvent e1) {
				jouerA2Listener(e1);
				System.out.println("Commencer une partie à 2 joueurs");
			}
		});
		boutons.add(jouerA2);												//Ajoute boutonA2 au panneau boutons
		
		
		JButton jouerA3 = new JButton("Lancer une partie à 3 joueurs");
		jouerA3.setPreferredSize(new Dimension(400, 45));
		jouerA3.setForeground(vertFonce);
		jouerA3.setFont(new Font("Arial",Font.CENTER_BASELINE,24));//Definit la taille du bouton cliquable
		jouerA3.setBackground(Color.lightGray);								//Definit la couleur du fond
		jouerA3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e2) {
				jouerA3Listener(e2);
				System.out.println("Commencer une partie à 3 joueurs");	
			}
		});
		boutons.add(jouerA3);
		

		JButton jouerA4 = new JButton("Lancer une partie à 4 joueurs");
		jouerA4.setPreferredSize(new Dimension(400, 45));
		jouerA4.setForeground(vertFonce);
		jouerA4.setFont(new Font("Arial",Font.CENTER_BASELINE,24));
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
		regles.setForeground(vertFonce);
		regles.setFont(new Font("Arial",Font.CENTER_BASELINE,24));
		regles.setBackground(Color.lightGray);
		regles.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e4) {
				reglesListener(e4);
				System.out.println("Règles");
				
			}
		});
		boutons.add(regles);
		
		return boutons;
	}
	
	private void jouerA2Listener(ActionEvent e1) {		//Ne fait rien pour l'instant
		InterfaceJeuA2 interfaceJeuA2 = new InterfaceJeuA2();
	}
	
	private void jouerA3Listener(ActionEvent e2) {
		InterfaceJeuA3 interfaceJeuA3 = new InterfaceJeuA3();
	}
	
	private void reglesListener(ActionEvent e4 ) {		//Lorsqu'on clique sur le bouton "règles", ouvre une nouvelle fenetre qui affiche les règles
		JFrame fenetreRegles = new JFrame();
		PanneauRegles panRegles = new PanneauRegles();
		GraphicsEnvironment.getLocalGraphicsEnvironment();
		
		fenetreRegles.setTitle("Règles du jeu");
		fenetreRegles.setExtendedState(fenetreRegles.getExtendedState() | fenetreRegles.MAXIMIZED_BOTH);
		fenetreRegles.setLocationRelativeTo(null);
		fenetreRegles.setAlwaysOnTop(true);
		fenetreRegles.setContentPane(panRegles);
		fenetreRegles.setVisible(true);
		
	}
	
	private JPanel createCredits() {													//Panneau situé au sud de notre fenetre, indiquant qui a participé à ce projet
//		Color cBg = new Color(255, 255, 255, 100);
		
		JPanel credits = new JPanel(new FlowLayout(FlowLayout.LEFT));
		credits.setPreferredSize(new Dimension(802, 30));
		credits.setBackground(transparent);
		String texte = "Designed by : Anthony Giusti - Loup Samain - Maximilien Teil";
		
		JLabel msg = new JLabel(texte);
		msg.setPreferredSize(new Dimension(620, 30));
		msg.setForeground(Color.white);
		msg.setFont(new Font("Arial",Font.BOLD,16));
		credits.add(msg);
		
		return credits;
	}
	
	private JPanel emptyLeft() {						//Panneau transparent permettant un poqitionnement des boutons plus simple
		JPanel left = new JPanel();
		left.setPreferredSize(new Dimension(110, 0));
		left.setBackground(transparent);
				
		return left;
	}
		
	private JPanel emptyRight() {						//Panneau transparent permettant un poqitionnement des boutons plus simple
		JPanel right = new JPanel();
		right.setPreferredSize(new Dimension(110, 0));
		right.setBackground(transparent);
				
		return right;
	}
	
	private JPanel emptyTop() {							//Panneau transparent permettant un poqitionnement des boutons plus simple
		JPanel top = new JPanel();
		top.setPreferredSize(new Dimension(0, 230));
		top.setBackground(transparent);
				
		return top;
	}	              
}