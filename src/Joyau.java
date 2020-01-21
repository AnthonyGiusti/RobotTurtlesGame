public class Joyau {
    private int apparence;
    private int positionX;
    private int positionY;


    public Joyau(int positionInitX, int positionInitY, int valeurMatrice){
        this.positionX = positionInitX;
        this.positionY = positionInitY;
        this.apparence = valeurMatrice;
    }


    public int getApparence() {
        return apparence;
    }

    public void setApparence(int apparence) {
        this.apparence = apparence;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }


}

