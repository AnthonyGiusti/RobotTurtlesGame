import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Plateau extends JPanel{
    private int[][] plateau = new int[8][8];
	
    private int xMur = 700;
    public int widthObject = 100;
    public int heightObject = 100;
    
    private Image imagePlateau;
    private Image imageRuby;
    private Image imageMur;
    
    public Tortue turltles;
//    public Mur walls;
//    public MurGlace iceWalls;
//    public Carte cards;

	public Plateau(int nb_Joueurs, String image_plateau, String image_ruby, String image_wall, String image_tortue, String image_tortue2) {
    	if(nb_Joueurs == 2) {
    		try {
    	    	this.imagePlateau = ImageIO.read(new File(image_plateau));
    	    	this.imageRuby = ImageIO.read(new File(image_ruby));
    	    	this.imageMur = ImageIO.read(new File(image_wall));
//    	    	this.imageTortue = ImageIO.read(new File(image_tortue));
        	} catch(IOException e) {
        		e.printStackTrace();
        	}    		
    	}
    	else if(nb_Joueurs == 3) {
    		System.out.println("Jeu à 3");
    	}
    	else if(nb_Joueurs == 4) {
    		System.out.println("Jeu à 4");
    	}

    }
    
    public void paintComponent(Graphics g){
        g.drawImage(this.imagePlateau, 0, 0,800, 800, this);
       
        
        g.drawImage(this.imageRuby, 300, 700, widthObject, heightObject,  this);
//        g.drawImage(imageTortue, 100*positionJoueur1[0], 100*positionJoueur1[1], widthObject, heightObject,  this);
//        g.drawImage(imageTortue2, 100*positionJoueur2[0], 100*positionJoueur2[1], widthObject, heightObject,  this);

        //Les murs à droite du plateau pour 2 et 3 joueurs

        g.drawImage(imageMur, xMur,   0, widthObject, heightObject,  this);
        g.drawImage(imageMur, xMur, 100, widthObject, heightObject,  this);
        g.drawImage(imageMur, xMur, 200, widthObject, heightObject,  this);
        g.drawImage(imageMur, xMur, 300, widthObject, heightObject,  this);
        g.drawImage(imageMur, xMur, 400, widthObject, heightObject,  this);
        g.drawImage(imageMur, xMur, 500, widthObject, heightObject,  this);
        g.drawImage(imageMur, xMur, 600, widthObject, heightObject,  this);
        g.drawImage(imageMur, xMur, 700, widthObject, heightObject,  this);

    }
    
//  public int[][] getPlateau() {
//		return plateau;
//	}
//
//	public void setPlateau(int[][] plateau) {
//		if(plateau.length < -1) {
//			System.out.println("Incorrect input");
//		}
//		this.plateau = plateau;
//	}
//
//	public Tortue getTurtles() {
//		return turtles;
//	}
//
//	public void setTurtles(Tortue turtles) {
//		this.turtles = turtles;
//	}
//
//	public Image getImage_plateau() {
//		return imagePlateau;
//	}
//
//	public void setImage_plateau(Image image_plateau) {
//		this.imagePlateau = image_plateau;
//	}
//
//	public Image getImage_ruby() {
//		return imageRuby;
//	}
//
//	public void setImage_ruby(Image image_ruby) {
//		this.imageRuby = image_ruby;
//	}
//
//	public Image getImage_wall() {
//		return imageMur;
//	}
//
//	public void setImage_wall(Image image_wall) {
//		this.imageMur = image_wall;
//	}
//
//	public Image getImage_tortue() {
//		return imageTortue;
//	}
//
//	public void setImage_tortue(Image image_tortue) {
//		this.imageTortue = image_tortue;
//	}

}
