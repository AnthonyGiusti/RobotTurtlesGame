import javax.swing.*;

public class Fenetre extends JFrame {
	public Fenetre() {
		this.setTitle("Robot Turtles Game");
		this.setSize(620, 802);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		this.setContentPane(new Panneau());
		this.setVisible(true);
	}
}
