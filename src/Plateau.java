import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Plateau extends JPanel{
    private int[][] plateau = new int[8][8];
	
    private int xMur = 700;
    public int widthObject = 100;
    public int heightObject = 100;
    
    private Image imagePlateau;
    private Image imageRuby;
    private Image imageTortue1;
    private Image imageTortue2;
    private Image imageTortue3;
    private Image imageTortue4;
    private Image imageMurBois;
    private Image imageMurGlace;

//    public Mur walls;
//    public Carte cards;

	public Plateau(int nb_Joueurs, String image_plateau, String image_ruby, String image_wall, String image_ice, String image_tortue1, String image_tortue2,String image_tortue3, String image_tortue4) {
    	if(nb_Joueurs == 2) {
    		try {
    			System.out.println("Jeu à 2");
    	    	this.imagePlateau = ImageIO.read(new File(image_plateau));
    	    	this.imageRuby = ImageIO.read(new File(image_ruby));
    	    	this.imageMurBois = ImageIO.read(new File(image_wall));
				this.imageMurGlace = ImageIO.read(new File(image_ice));
    	    	this.imageTortue1 = ImageIO.read(new File(image_tortue1));
    	    	this.imageTortue2 = ImageIO.read(new File(image_tortue2));
        	} catch(IOException e) {
        		e.printStackTrace();
        	}    		
    	}
    	else if(nb_Joueurs == 3) {
    		try {
    			System.out.println("Jeu à 3");
    	    	this.imagePlateau = ImageIO.read(new File(image_plateau));
    	    	this.imageRuby = ImageIO.read(new File(image_ruby));
    	    	this.imageMurBois = ImageIO.read(new File(image_wall));
				this.imageMurGlace = ImageIO.read(new File(image_ice));
    	    	this.imageTortue1 = ImageIO.read(new File(image_tortue1));
    	    	this.imageTortue2 = ImageIO.read(new File(image_tortue2));
    	    	this.imageTortue3 = ImageIO.read(new File(image_tortue3));
        	} catch(IOException e) {
        		e.printStackTrace();
        	}
    	}
    	else {
    		try {
    			System.out.println("Jeu à 4");
    	    	this.imagePlateau = ImageIO.read(new File(image_plateau));
    	    	this.imageRuby = ImageIO.read(new File(image_ruby));
				this.imageMurBois = ImageIO.read(new File(image_wall));
				this.imageMurGlace = ImageIO.read(new File(image_ice));
    	    	this.imageTortue1 = ImageIO.read(new File(image_tortue1));
    	    	this.imageTortue2 = ImageIO.read(new File(image_tortue2));
    	    	this.imageTortue3 = ImageIO.read(new File(image_tortue3));
    	    	this.imageTortue4 = ImageIO.read(new File(image_tortue4));
        	} catch(IOException e) {
        		e.printStackTrace();
        	}
    	}

    }
    
    public void paintComponent(Graphics g){
    	g.drawImage(this.imagePlateau, 0, 0,800, 800, this);
    	if (Mur.nbMur!=0) {
    		for(int i=0;i<=Mur.nbMur;i++) {
    			Mur mur = Mur.listeMurs.get(i);
    			mur.position=mur.getPosition();
    			mur.selectedTypeNb=mur.getSelectedTypeNb();
    			if (mur.selectedTypeNb==3) {
					g.drawImage(imageMurBois, 100*mur.position[0],  100*mur.position[1], widthObject, heightObject,  this);
					System.out.println("mur en bois dessiné");//test
				}
    			else {
					g.drawImage(imageMurGlace, 100*mur.position[0],   100*mur.position[1], widthObject, heightObject,  this);
					System.out.println("mur en glace dessiné");//test
				}
    		}
    	}
    	Tortues.initialisationTortues();
    		if (Menu.nb_joueurs<=3) {
    			for(int i = 0; i<=700; i= i+100) {
    				g.drawImage(imageMurBois, xMur,   i, widthObject, heightObject,  this);
    			}

    		}
    		if (Menu.nb_joueurs==2) {
    			g.drawImage(imageTortue1, 100*Tortues.positionTortue1[0], 100*Tortues.positionTortue1[1], widthObject, heightObject,  this);
    	        g.drawImage(imageTortue2, 100*Tortues.positionTortue2[0], 100*Tortues.positionTortue2[1], widthObject, heightObject,  this);
    	        g.drawImage(imageRuby, 300, 700, widthObject, heightObject,  this);
    		}
    		if (Menu.nb_joueurs==3) {
    			g.drawImage(imageTortue1, 100*Tortues.positionTortue1[0], 100*Tortues.positionTortue1[1], widthObject, heightObject,  this);
    	        g.drawImage(imageTortue2, 100*Tortues.positionTortue2[0], 100*Tortues.positionTortue2[1], widthObject, heightObject,  this);
    	        g.drawImage(imageTortue3, 100*Tortues.positionTortue3[0], 100*Tortues.positionTortue3[1], widthObject, heightObject,  this);
    	        g.drawImage(imageRuby, 0, 700, widthObject, heightObject,  this);
    	        g.drawImage(imageRuby, 300, 700, widthObject, heightObject,  this);
    	        g.drawImage(imageRuby, 600, 700, widthObject, heightObject,  this);
    		}
    		if (Menu.nb_joueurs==4) {
    			g.drawImage(imageTortue1, 100*Tortues.positionTortue1[0], 100*Tortues.positionTortue1[1], widthObject, heightObject,  this);
    	        g.drawImage(imageTortue2, 100*Tortues.positionTortue2[0], 100*Tortues.positionTortue2[1], widthObject, heightObject,  this);
    	        g.drawImage(imageTortue3, 100*Tortues.positionTortue3[0], 100*Tortues.positionTortue3[1], widthObject, heightObject,  this);
    	        g.drawImage(imageTortue4, 100*Tortues.positionTortue4[0], 100*Tortues.positionTortue4[1], widthObject, heightObject,  this);
    	        g.drawImage(imageRuby, 100, 700, widthObject, heightObject,  this);
    	        g.drawImage(imageRuby, 600, 700, widthObject, heightObject,  this);
    		}
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
