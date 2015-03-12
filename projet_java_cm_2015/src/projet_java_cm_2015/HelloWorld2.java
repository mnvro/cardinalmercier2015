package projet_java_cm_2015;

import javax.swing.JOptionPane;

public class HelloWorld2 {
	public static void main(String[] args) {
		System.out.println("Hello"+" "+"World!");
		JOptionPane.showMessageDialog(null, "message type 0", "title", 0);
		JOptionPane.showMessageDialog(null, "message type 1", "title", 1);
		JOptionPane.showMessageDialog(null, "message type 2", "title", 2);
		JOptionPane.showMessageDialog(null, "message type 3", "title", 3);
		JOptionPane.showConfirmDialog(null, "message type 0", "title", 0);
		JOptionPane.showConfirmDialog(null, "message type 1", "title", 1);
		JOptionPane.showConfirmDialog(null, "message type 2", "title", 2);
		String nom = JOptionPane.showInputDialog("Donnez-moi votre nom : ");
		
		
	}
}
