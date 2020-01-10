import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Deplacement extends JFrame {

    private int width = 75;
    private int height = 100;


    Color transparent = new Color(0,0,0,50);//(transparent)
    public static String type_de_fond;

    ArrayDeque<String> pileInstructions = new ArrayDeque<>();

    /*public Deplacement(){
        Fond panConstruireMur = new Fond("images/backgroundAndLogo.png", "Menu");
        System.out.println(panConstruireMur.toString());
        panConstruireMur.setLayout(new BorderLayout());						//Definit le panneau comme un borderLayout

        panConstruireMur.add(, BorderLayout.CENTER);			//Place les boutons du menu au centre de la fenetre

        panConstruireMur.add(createCredits(), BorderLayout.SOUTH);			//Place les cr�dits en bas de la fenetre

        panConstruireMur.add(emptyLeft(), BorderLayout.WEST);				//Place une layout vide � gauche de la fenetre

        panConstruireMur.add(emptyRight(), BorderLayout.EAST);				//Place une layout vide � droite de la fenetre

        panConstruireMur.add(emptyTop(), BorderLayout.NORTH);
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
    }*/

    public static boolean isCaseFree(int[] emplacement) {
        if (Arrays.equals(emplacement, Tortues.positionTortue1) || Arrays.equals(emplacement, Tortues.positionTortue2)) {
            return false;
        }
        if (Menu.nb_joueurs==2) {
            if ((emplacement[0]==3 && emplacement[1]==7) || emplacement[0]==7) { // rubis et colonne de murs
                return false;
            }
        }
        else if (Menu.nb_joueurs==3) {
            if (Arrays.equals(emplacement, Tortues.positionTortue3)) {
                return false;
            }
            else if (((emplacement[0]==3 || emplacement[0]==0 || emplacement[0]==6) && emplacement[1]==7) || emplacement[0]==7) { // rubis et colonne de murs
                return false;
            }
        }
        else if (Menu.nb_joueurs==4) {
            if (Arrays.equals(emplacement, Tortues.positionTortue3)) {
                return false;
            }
            else if (Arrays.equals(emplacement, Tortues.positionTortue4)) {
                return false;
            }
            else if ((emplacement[0]==1 || emplacement[0]==6) && emplacement[1]==7) { // rubis
                return false;
            }
        }
        return true;
    }
}
