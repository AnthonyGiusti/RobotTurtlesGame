import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Plateau extends JPanel{
    private int[][] plateau = new int[8][8];
    Tortue turtles = new Tortue();
    private Image imagePlateau;
    private Image imageRuby;
    private Image imageMur;
	private Image imageTortue;
	private Image imageTortue2;
    
    public int[][] getPlateau() {
		return plateau;
	}

	public void setPlateau(int[][] plateau) {
		if(plateau.length < -1) {
			System.out.println("Incorrect input");
		}
		this.plateau = plateau;
	}

	public Tortue getTurtles() {
		return turtles;
	}

	public void setTurtles(Tortue turtles) {
		this.turtles = turtles;
	}

	public Image getImage_plateau() {
		return imagePlateau;
	}

	public void setImage_plateau(Image image_plateau) {
		this.imagePlateau = image_plateau;
	}

	public Image getImage_ruby() {
		return imageRuby;
	}

	public void setImage_ruby(Image image_ruby) {
		this.imageRuby = image_ruby;
	}

	public Image getImage_wall() {
		return imageMur;
	}

	public void setImage_wall(Image image_wall) {
		this.imageMur = image_wall;
	}

	public Image getImage_tortue() {
		return imageTortue;
	}

	public void setImage_tortue(Image image_tortue) {
		this.imageTortue = image_tortue;
	}

	public Plateau(String image_plateau, String image_ruby, String image_wall, String image_tortue, String image_tortue2) {
    	try {
	    	this.imagePlateau = ImageIO.read(new File(image_plateau));
	    	this.imageRuby = ImageIO.read(new File(image_ruby));
	    	this.imageMur = ImageIO.read(new File(image_wall));
	    	this.imageTortue = ImageIO.read(new File(image_tortue));
    	} catch(IOException e) {
    		e.printStackTrace();
    	}
    }
    
    public void paintComponent(Graphics g){
        g.drawImage(this.imagePlateau, 0, 0,800, 800, this);
        
        
//        g.drawImage(imageTortue, 100*positionJoueur1[0], 100*positionJoueur1[1], 95, 95,  this);
//        g.drawImage(image, 98*positionJoueur2[0], 100*positionJoueur2[1], 95, 95,  this);
        g.drawImage(this.imageRuby, 300, 700, 100, 100,  this);

        //Les murs
        int xMur = 700;
        int widthMur = 100;        
        int heightMur = 100;
        g.drawImage(imageMur, xMur,   0, widthMur, heightMur,  this);
        g.drawImage(imageMur, xMur,  100, widthMur, heightMur,  this);
        g.drawImage(imageMur, xMur, 200, widthMur, heightMur,  this);
        g.drawImage(imageMur, xMur, 300, widthMur, heightMur,  this);
        g.drawImage(imageMur, xMur, 400, widthMur, heightMur,  this);
        g.drawImage(imageMur, xMur, 500, widthMur, heightMur,  this);
        g.drawImage(imageMur, xMur, 600, widthMur, heightMur,  this);
        g.drawImage(imageMur, xMur, 700, widthMur, heightMur,  this);

    }
}
