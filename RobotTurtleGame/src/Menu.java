import java.util.*;
import java.awt.*;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;


public class Menu extends JFrame {
	public static void main(String [] args) {
		Menu menu = new Menu();
	}

	public Menu() {
	      Image input = ImageIO.read(new File("images.jpg"));

		//Donne un nom à la fenetre
				this.setTitle("Robot Turtles Game");
//			Definitlataille de lafenetre (n px de haut et y px de large)
			    this.setSize(800, 800);
		    //Positionne la fenetre au centre de l'écran
			    this.setLocationRelativeTo(null);
		    //Termine le processus lorsqu'on clique sur la croix rouge
			    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		    //Garde la fenetre toujours au premier plan
			    this.setAlwaysOnTop(true);		
		    //Instanciation d'un objet de JPanel
				JPanel pan = new JPanel();
			//Definition de sa couleur
				pan.setBackground(ImageIO.read(input));
			//On prévient notre JFrame que notre JPanel sera son content pane
				this.setContentPane(pan);
		    //Affiche la fenetre
			    this.setVisible(true);
	}
}