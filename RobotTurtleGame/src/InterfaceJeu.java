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

public class InterfaceJeu extends JFrame {
	Color transparent = new Color(0,0,0,50);//(transparent)
	public static String type_de_fond;

	
	public InterfaceJeu() {
		GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.setTitle("Partie à 2 joueurs");
		this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
		this.setLocationRelativeTo(null);
		this.setAlwaysOnTop(true);
		
		Fond panJeu = new Fond("fondJeu.jpg", "jeu");
		
		panJeu.setLayout(new BorderLayout());
		panJeu.add(centerPanel(), BorderLayout.CENTER);	
		panJeu.add(rightPanel(), BorderLayout.EAST);
		panJeu.add(bottomPanel(), BorderLayout.SOUTH);
		panJeu.add(topPanel(), BorderLayout.NORTH);
		panJeu.add(leftPanel(), BorderLayout.WEST);
		
		this.setContentPane(panJeu);
		this.setVisible(true);
	}
	//Completer 
	private JPanel centerPanel() {
//		Plateau plateau = new Plateau(2, "Plateau.png", "RUBY.png", "WALL.png", "turtle1.png", "turtle2.png");
		if(Menu.nb_joueurs == 2) {
			Plateau plateau = new Plateau(2, "Plateau.png", "RUBY.png", "WALL.png", "turtle1.png", "turtle2.png");
			return plateau;
		}
		if(Menu.nb_joueurs == 3) {
			Plateau plateau = new Plateau(3, "Plateau.png", "RUBY.png", "WALL.png", "turtle1.png", "turtle2.png"); //, "turtle3.png");
			return plateau;
		}
		else {
			Plateau plateau = new Plateau(4, "Plateau.png", "RUBY.png", "WALL.png", "turtle1.png", "turtle2.png"); //,"turtle3.png", "turtle4.png");
			return plateau;
		}
	}
	
//////////////////////////////////////////////////////////////////////////////
// Intérieur du Panel droit
	private JPanel intoRightPanel(){
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
	private JPanel emptyBottomR() {
		JPanel bottom = new JPanel();
		bottom.setPreferredSize(new Dimension(0,270));
		bottom.setBackground(transparent);
		return bottom;
	}
	private JPanel emptyTopR() {
		JPanel top = new JPanel();
		top.setPreferredSize(new Dimension(0,270));
		top.setBackground(transparent);
		return top;
	}
	private JPanel emptyLeftR() {
		JPanel left = new JPanel();
		left.setPreferredSize(new Dimension(130,0));
		left.setBackground(transparent);
		return left;
	}
	private JPanel emptyRightR() {
		JPanel right = new JPanel();
		right.setPreferredSize(new Dimension(130,0));
		right.setBackground(transparent);
		return right;
	}
//////////////////////////////////////////////////////////////////////////////
	
	private JPanel rightPanel() {
		JPanel rightP = new JPanel();
		
		rightP.setPreferredSize(new Dimension(560,0));
		rightP.setBackground(transparent);
		rightP.setLayout(new BorderLayout());
		
		rightP.add(intoRightPanel(), BorderLayout.CENTER);
		rightP.add(emptyTopR(), BorderLayout.NORTH);
		rightP.add(emptyBottomR(), BorderLayout.SOUTH);
		rightP.add(emptyLeftR(), BorderLayout.WEST);
		rightP.add(emptyRightR(), BorderLayout.EAST);

		return rightP;
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
	
	private JPanel bottomPanel() {
		JPanel emptyBottom = new JPanel();
		emptyBottom.setPreferredSize(new Dimension(0,100));
		emptyBottom.setBackground(transparent);
		//Implémenter la manière dont on affiche 
		return emptyBottom;
	}
	
	private JPanel topPanel() {
		JPanel emptyTop = new JPanel();
		emptyTop.setPreferredSize(new Dimension(0,100));
		emptyTop.setBackground(transparent);
		return emptyTop;
	}
	
	private JPanel leftPanel() {						//Panneau transparent permettant un poqitionnement des boutons plus simple
		JPanel cartes = new JPanel(new GridLayout(2,2,0,35));
		
		cartes.setPreferredSize(new Dimension(560, 0));
		cartes.setBackground(transparent);
		return cartes;
	}
}