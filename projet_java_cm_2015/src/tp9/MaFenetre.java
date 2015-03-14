package tp9;

import javax.swing.JFrame;

public class MaFenetre extends JFrame {
	public MaFenetre(){
		this.setVisible(true);
		this.setSize(300, 100);
		this.setTitle("Bonjour tout le monde");
	}

	public static void main(String[] args) {
		MaFenetre mf = new MaFenetre();

	}

}
