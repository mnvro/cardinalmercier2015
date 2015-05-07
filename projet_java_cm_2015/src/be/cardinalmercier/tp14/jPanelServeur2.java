package be.cardinalmercier.tp14;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JTextArea;
import java.awt.GridBagConstraints;

public class jPanelServeur2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public jPanelServeur2() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JTextArea jTextAreaLog = new JTextArea();
		GridBagConstraints gbc_jTextAreaLog = new GridBagConstraints();
		gbc_jTextAreaLog.fill = GridBagConstraints.BOTH;
		gbc_jTextAreaLog.gridx = 0;
		gbc_jTextAreaLog.gridy = 0;
		add(jTextAreaLog, gbc_jTextAreaLog);

	}

}
