public class Tortue {
	public static int [] positionTortue1 = new int [2];
	public static int [] positionTortue2 = new int [2];
	public static int [] positionTortue3 = new int [2];
	public static int [] positionTortue4 = new int [2];
	private String nom;
	int positionLigne;
	int positionColonne;

    String direction = "Sud";
	
	public Tortue() {
		if (Menu.nb_joueurs == 2) {
    		positionTortue1 = new int[] {1,0};
    		positionTortue2 = new int[] {5,0};
    	}
    	else if(Menu.nb_joueurs == 3) {
    		positionTortue1 = new int[] {0,0};
    		positionTortue2 = new int[] {3,0};
    		positionTortue3 = new int[] {6,0};
    	}
    	else {
    		positionTortue1 = new int[] {0,0};
    		positionTortue2 = new int[] {2,0};
    		positionTortue3 = new int[] {5,0};
    		positionTortue4 = new int[] {7,0};
    	}
	}

	public int getPositionColonne() {
		return positionColonne;
	}

	public int getPositionLigne() {
		return positionLigne;
	}
}
