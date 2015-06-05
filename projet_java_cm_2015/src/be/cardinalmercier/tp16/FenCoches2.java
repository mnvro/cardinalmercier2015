package be.cardinalmercier.tp16;

import java.awt.* ;
import java.awt.event.* ;

import javax.swing.* ;
import javax.swing.border.TitledBorder;
class FenCoches2 extends JFrame implements ActionListener, ItemListener{ 
	private JRadioButton radio1, radio2 ,radio3 ;
	private JPanel pan;
	private JButton État ;
	FenCoches2 (){ 
		pan = new JPanel();
		pan.setBorder (new TitledBorder("Choisissez une option")) ;
		setTitle ("Exemple de boutons radio") ;
		setSize (400, 100) ;
		Container contenu = getContentPane() ;
		contenu.add(pan);
		contenu.setLayout (new FlowLayout()) ;
		ButtonGroup groupe = new ButtonGroup() ;
		radio1 = new JRadioButton ("Radio 1") ;
		groupe.add(radio1) ;
		pan.add(radio1) ;
		radio1.addItemListener (this) ;
		radio1.addActionListener (this) ;
		radio1.setSelected (true) ;
		radio2 = new JRadioButton ("Radio 2") ;
		groupe.add(radio2) ;
		pan.add(radio2) ;
		radio2.addItemListener (this) ;
		radio2.addActionListener (this) ;
		radio3 = new JRadioButton ("Radio 3") ;
		groupe.add(radio3) ;
		pan.add(radio3) ;
		radio3.addItemListener (this) ;
		radio3.addActionListener (this) ;
		État = new JButton ("État") ;
		contenu.add(État) ;
		État.addActionListener (this) ;
	}
	public void itemStateChanged(ItemEvent ev){ 
		Object source = ev.getSource() ;
		if (source == radio1) System.out.println ("changement radio 1") ;
		if (source == radio2) System.out.println ("changement radio 2") ;
		if (source == radio3) System.out.println ("changement radio 3") ;
	}
	public void actionPerformed (ActionEvent ev){ 
		Object source = ev.getSource() ;
		if (source == État)
			System.out.println ("État RADIOS : " + radio1.isSelected() + " "
					+ radio2.isSelected() + " " + radio3.isSelected()) ;
		if (source == radio1) System.out.println ("action radio 1") ;
		if (source == radio2) System.out.println ("action radio 2") ;
		if (source == radio3) System.out.println ("action radio 3") ;
	}
	

	public static void main (String args[]){ 
		FenCoches2 fen = new FenCoches2() ;
		fen.setVisible(true) ;
		fen.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}



















