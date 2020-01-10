import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
		
		Fond panJeu = new Fond("images/fondJeu.jpg", "jeu");
		
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
		if(Menu.nb_joueurs == 2) {
			Plateau plateau = new Plateau(2, "images/Plateau.png", "images/RUBY.png", "images/WALL.png", "images/turtle1.png", "images/turtle2.png", null, null);
			return plateau;
		}
		if(Menu.nb_joueurs == 3) {
			Plateau plateau = new Plateau(3, "images/Plateau.png", "images/RUBY.png", "images/WALL.png", "images/turtle1.png", "images/turtle2.png", "images/turtle4.png", null);
			return plateau;
		}
		else {
			Plateau plateau = new Plateau(4, "images/Plateau.png", "images/RUBY.png", "images/WALL.png", "images/turtle1.png", "images/turtle2.png", "images/turtle4.png", "images/turtle3.png");
			return plateau;
		}
	}
	
//////////////////////////////////////////////////////////////////////////////
// Int�rieur du Panel droit
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
		completionProgramme.setContentPane(new Fond("images/fondJeu.jpg", "jeu"));
		completionProgramme.setAlwaysOnTop(true);
		completionProgramme.setVisible(true);

		Deplacement deplacement = new Deplacement();



	}
	
	@SuppressWarnings("static-access")
	private void construireMurListener(ActionEvent e2) {
		try {
		//Fonction permettant de construire un mur
		String[] type = {"Mur de pierre", "Mur de glace"};
		String[] ligne = {"1","2","3","4","5","6","7","8"};
		String[] colonne = {"1","2","3","4","5","6","7","8"};
		JOptionPane construMur = new JOptionPane();
		String selectedType = (String) construMur.showInputDialog(this, "Choisissez le type de mur :", "Contruire un mur",
				JOptionPane.INFORMATION_MESSAGE, null, type, type[0]);
		String selectedLigne = (String) construMur.showInputDialog(this,
				"Choisissez la ligne sur laquelle vous voulez le poser :", "Contruire un mur",
				JOptionPane.INFORMATION_MESSAGE, null, ligne, ligne[0]);
		String selectedColonne = (String) construMur.showInputDialog(this,
				"Choisissez la colonne sur laquelle vous voulez le poser :", "Contruire un mur",
				JOptionPane.INFORMATION_MESSAGE, null, colonne, colonne[0]);

		int selectedLigneNb = (Integer.parseInt(selectedLigne))-1;
		int selectedColonneNb = (Integer.parseInt(selectedColonne))-1;

		int[] emplacement = {selectedColonneNb,selectedLigneNb};

		if (Deplacement.isCaseFree(emplacement) == true) {
			System.out.println("Construction du mur"+selectedColonneNb+selectedLigneNb);
		}
		else {
			JOptionPane.showMessageDialog(this, "Il y a déjà quelque chose sur cette case !", "Erreur", JOptionPane.ERROR_MESSAGE);
		}
		}catch(HeadlessException e) {
			e.printStackTrace();
		}
	}
		
	
	private void executerProgrammeListener(ActionEvent e3){
		//Classe ou fonction permettant l'execution du programme
	}
	
	private JPanel bottomPanel() {
		JPanel emptyBottom = new JPanel();
		emptyBottom.setPreferredSize(new Dimension(0,100));
		emptyBottom.setBackground(transparent);
		//Impl�menter la manière dont on affiche 
		return emptyBottom;
	}
	
	private JPanel topPanel() {
		JPanel emptyTop = new JPanel();
		emptyTop.setPreferredSize(new Dimension(0,100));
		emptyTop.setBackground(transparent);
		return emptyTop;
	}
	
	private JPanel leftPanel() {						
		JPanel cartes = new JPanel();
		if(Menu.nb_joueurs == 2) {
			cartes.setLayout(new GridLayout(2,1,0,50));
			DosDeCarte bleu = new DosDeCarte("images/DosCarteBleu.png");
			cartes.add(bleu);
			DosDeCarte rouge = new DosDeCarte("images/DosCarteRouge.png");
			cartes.add(rouge);
		}
		if(Menu.nb_joueurs == 3) {
			cartes.setLayout(new GridLayout(3,1,0,50));
			DosDeCarte bleu = new DosDeCarte("images/DosCarteBleu.png");
			cartes.add(bleu);
			DosDeCarte rouge = new DosDeCarte("images/DosCarteRouge.png");
			cartes.add(rouge);
			DosDeCarte violet = new DosDeCarte("images/DosCarteViolet.png");
			cartes.add(violet);
		}
		if(Menu.nb_joueurs == 4) {
			cartes.setLayout(new GridLayout(4,1,0,50));
			DosDeCarte bleu = new DosDeCarte("images/DosCarteBleu.png");
			cartes.add(bleu);				
			DosDeCarte rouge = new DosDeCarte("images/DosCarteRouge.png");
			cartes.add(rouge);
			DosDeCarte violet = new DosDeCarte("images/DosCarteViolet.png");
			cartes.add(violet);
			DosDeCarte orange = new DosDeCarte("images/DosCarteJaune.png");
			cartes.add(orange);
		}
		cartes.setPreferredSize(new Dimension(560, 0));
		cartes.setBackground(transparent);
		return cartes;
	}
}