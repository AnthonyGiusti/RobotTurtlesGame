import java.util.ArrayList;

public class Mur {
    public int [] position = new int[2];
    public int idMur;
    public int selectedTypeNb;
    public static int nbMur;
    public static ArrayList<Mur> listeMurs = new ArrayList<Mur>();
    public Mur(String selectedType, int selectedLigneNb, int selectedColonneNb) {
        if (selectedType.equals("Mur de pierre")) {
            selectedTypeNb=3;
        }
        else {
            selectedTypeNb=4;
        }
        position = new int[]{selectedColonneNb,selectedLigneNb};
        this.idMur = nbMur;
        nbMur++;
        System.out.println("Nb murs = " + nbMur);
        System.out.println(idMur);
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] nouveauMur) {
        this.position = position;
    }

    public int getIdMur() {
        return idMur;
    }

    public void setIdMur(int idMur) {
        this.idMur = idMur;
    }

    public int getSelectedTypeNb() {
        return selectedTypeNb;
    }

    public void setSelectedTypeNb(int selectedTypeNb) {
        this.selectedTypeNb = selectedTypeNb;
    }

    public static int getNbMur() {
        return nbMur;
    }

    public static void setNbMur(int nbMur) {
        Mur.nbMur = nbMur;
    }


}
