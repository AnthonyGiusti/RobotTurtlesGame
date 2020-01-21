public class Jeu {

    public int[][] plateau = new int[8][8];

    public Jeu() {

        for (int colonne = 0; colonne < 8; colonne++) {
            for (int ligne = 0; ligne < 8; ligne++) {
                plateau[ligne][colonne] = 0;
            }
        }

        if (Menu.nb_joueurs == 2) {
            //plateau[1][0] = 1;
            //plateau[5][0] = 1;
            for (int colonne = 0; colonne < 8; colonne++) {
                for (int ligne = 0; ligne < 8; ligne++) {
                    System.out.print(plateau[ligne][colonne] + "\t"); // On affiche le plateau vide
                    if (ligne == 7){
                        System.out.println("\n");
                    }
                }
            }
        }
        else if(Menu.nb_joueurs == 3) {
            plateau[0][0] = 1;
            plateau[3][0] = 1;
            plateau[6][0] = 1;
        }
        else {
            plateau[0][0] = 1;
            plateau[2][0] = 1;
            plateau[5][0] = 1;
            plateau[7][0] = 1;
        }
    }
}

