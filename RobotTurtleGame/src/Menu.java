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

public class Menu extends JFrame{

	
	public Menu() {	
		super("Robot Turtles Game");							//Nom de la fenetre menu
		this.setSize(620, 802);									//Taile de la fenetre menu
		this.setLocationRelativeTo(null);						//Place la fenetre au milieu de l'ecran
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Ferme quand on appuie sur la croix rouge
		this.setAlwaysOnTop(true);								//Place la fenetre au dessus de celles ouvertes
		
		Panneau pan = new Panneau();							//Créé le fond 
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
		Color cBg = new Color(0,0,0,100);//(transparent)
		Color cB = new Color(192, 192, 192, 25); //(Gris translucides)
		JPanel boutons = new JPanel(new GridLayout(4, 1, 0, 30));
		boutons.setBackground(cBg);
		
		JButton jouerA2 = new JButton("Lancer une partie à 2 joueurs");
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
		jouerA3.setPreferredSize(new Dimension(400, 45));					//Definit la taille du bouton cliquable
		jouerA3.setBackground(Color.lightGray);								//Definit la couleur du fond
		jouerA3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e2) {
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
				System.out.println("Règles");
				
			}
		});
		boutons.add(regles);

		return boutons;
	}
	
	private void jouerA2Listener(ActionEvent e1) {		//Ne fait rien pour l'instant
		JFrame fenetreJeu2 = new JFrame();

		Panneau pan = new Panneau();
				
		fenetreJeu2.setTitle("Partie à 2 joueurs");
		fenetreJeu2.setSize(800,800);
		fenetreJeu2.setLocationRelativeTo(null);
		fenetreJeu2.setAlwaysOnTop(true);
		
		fenetreJeu2.setContentPane(pan);
		fenetreJeu2.setVisible(true);
	}
	
	private void reglesListener(ActionEvent e4 ) {		//Lorsqu'on clique sur le bouton "règles", ouvre une nouvelle fenetre qui affiche les règles
		JFrame fenetreRegles = new JFrame();
		PanneauRegles panRegles = new PanneauRegles();

		fenetreRegles.setTitle("Règles du jeu");
		fenetreRegles.setSize(1920, 1080);
		fenetreRegles.setLocationRelativeTo(null);
		fenetreRegles.setAlwaysOnTop(true);
		
		fenetreRegles.setContentPane(panRegles);
		fenetreRegles.setVisible(true);
		
	}
	
	private JPanel createCredits() {													//Panneau situé au sud de notre fenetre, indiquant qui a participé à ce projet
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
	
	private JPanel emptyLeft() {						//Panneau transparent permettant un poqitionnement des boutons plus simple
		Color cBg = new Color(0, 0, 0, 100);
		JPanel left = new JPanel();
		left.setPreferredSize(new Dimension(110, 0));
		left.setBackground(cBg);
				
		return left;
	}
		
	private JPanel emptyRight() {						//Panneau transparent permettant un poqitionnement des boutons plus simple
		Color cBg = new Color(0, 0, 0, 100);
		JPanel right = new JPanel();
		right.setPreferredSize(new Dimension(110, 0));
		right.setBackground(cBg);
				
		return right;
	}
	
	private JPanel emptyTop() {							//Panneau transparent permettant un poqitionnement des boutons plus simple
		Color cBg = new Color(0, 0, 0, 100);
		JPanel top = new JPanel();
		top.setPreferredSize(new Dimension(0, 230));
		top.setBackground(cBg);
				
		return top;
	}	              
}