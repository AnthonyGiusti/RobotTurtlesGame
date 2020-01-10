

public class Mur {
    public static int [] nouveauMur = new int[2];
    public int idMur;
    public static int nbMur;
    public Mur(String selectedType, int selectedLigneNb, int selectedColonneNb) {
    // Coder pour type mur en int
        nouveauMur = new int[]{selectedColonneNb,selectedLigneNb};

        this.idMur = nbMur;
        nbMur++;
        System.out.println("Nb murs = " + nbMur);
        System.out.println(idMur);
    }
}
