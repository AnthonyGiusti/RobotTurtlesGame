/*
import java.util.*;

public class Jeu {
    public static Scanner scanner = new Scanner(System.in);
    public static int[][] plateau = new int[8][8];
    private static int i;
    private static int j;
    private static int k;

    public static int nbJoueur;

    private static Tortue tortueBleu;
    private static Tortue tortueJaune;
    private static Tortue tortueRouge;
    private static Tortue tortueViolet;

    private static Joyau joyau;
    private static Joyau joyau2;
    private static Joyau joyau3;

    public static void main(String[] args){

        Jeu jeu = new Jeu();
        afficherPlateau();
    }


    public Jeu(){
        System.out.println("A combien voulez-vous jouer ? ");
        nbJoueur = scanner.nextInt();
        switch(nbJoueur){    //Menu.nb_joueurs
            case 2 :

                tortueBleu  = new Tortue(0, 2, "bleu" , "sud");
                tortueRouge = new Tortue(0, 5, "rouge", "sud");

                joyau  = new Joyau(3, 7, 2);

                afficherPlateau();
                System.out.println(" ");
                break;

            case 3 :

                tortueBleu  = new Tortue(0, 0, "bleu",  "sud");
                tortueRouge = new Tortue(0, 3, "rouge", "sud");
                tortueJaune = new Tortue(0, 7, "jaune", "sud");

                joyau  = new Joyau(0, 7, 2);
                joyau2  = new Joyau(3, 7, 2);
                joyau3  = new Joyau(6, 7, 2);

                afficherPlateau();
                System.out.println(" ");
                break;

            case 4 :

                tortueBleu   = new Tortue(0, 0, "bleu",   "sud");
                tortueRouge  = new Tortue(0, 2, "rouge",  "sud");
                tortueJaune  = new Tortue(0, 5, "jaune",  "sud");
                tortueViolet = new Tortue(0, 7, "violet", "sud");

                joyau  = new Joyau(1, 7, 2);
                joyau2 = new Joyau(6, 7, 2);

                afficherPlateau();
                System.out.println(" ");
                break;
        }

    }

    public static  void afficherPlateau(){

        switch(nbJoueur){
            case 2 :
                plateau[tortueBleu.getPositionX()][tortueBleu.getPositionY()] = 1;
                plateau[tortueRouge.getPositionX()][tortueRouge.getPositionY()] = 1;

                plateau[joyau.getPositionX()][joyau.getPositionY()] = 2;
                
                for(i=0; i<7; i++){
                    for(j=0; j<7; j++ ){
                        plateau[i][j] = 0;
                        plateau[i][7] = 3;
                        System.out.print(plateau[i][j] + " ");
                    }
                }

                break;

            case 3 :

                for(i=0; i<7; i++){
                    for(j=0; j<7; j++ ){
                        plateau[i][j] = 0;
                        plateau[i][7] = 3;
                        System.out.print(plateau[i][j] + " ");
                    }
                    System.out.println();
                }
                plateau[tortueBleu.getPositionX()][tortueBleu.getPositionY()] = 1;
                plateau[tortueRouge.getPositionX()][tortueRouge.getPositionY()] = 1;
                plateau[tortueJaune.getPositionX()][tortueJaune.getPositionY()] = 1;

                plateau[joyau.getPositionX()][joyau.getPositionY()] = 2;
                plateau[joyau2.getPositionX()][joyau2.getPositionY()] = 2;
                plateau[joyau3.getPositionX()][joyau3.getPositionY()] = 2;

                break;

            case 4 :

                for(i=0; i<8; i++){
                    for(j=0; j<8; j++ ){
                        plateau[i][j] = 0;
                        System.out.print(plateau[i][j] + " ");
                    }
                    System.out.println();
                }
                plateau[tortueBleu.getPositionX()][tortueBleu.getPositionY()] = 1;
                plateau[tortueRouge.getPositionX()][tortueRouge.getPositionY()] = 1;
                plateau[tortueJaune.getPositionX()][tortueJaune.getPositionY()] = 1;
                plateau[tortueViolet.getPositionX()][tortueViolet.getPositionY()] = 1;

                plateau[joyau.getPositionX()][joyau.getPositionY()] = 2;
                plateau[joyau2.getPositionX()][joyau2.getPositionY()] = 2;
        }

    }
}
//windowsListener
//Initialiser tous les objets puis boucle while infini


*/
