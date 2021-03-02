package swing_study.layout;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;

public class PanelBorder extends JPanel {

	public PanelBorder() {

		initialize();
	}
	private void initialize() {
		setLayout(new BorderLayout(10, 10));
		
		JLabel lblNorth = new JLabel("North");
		lblNorth.setHorizontalAlignment(SwingConstants.CENTER);
		lblNorth.setOpaque(true);
		lblNorth.setBackground(Color.ORANGE);
		add(lblNorth, BorderLayout.NORTH);
		
		JLabel lblWest = new JLabel("West");
		lblWest.setHorizontalAlignment(SwingConstants.CENTER);
		lblWest.setBackground(Color.PINK);
		lblWest.setOpaque(true);
		add(lblWest, BorderLayout.WEST);
		
		JLabel lblEast = new JLabel("East");
		lblEast.setHorizontalAlignment(SwingConstants.CENTER);
		lblEast.setOpaque(true);
		lblEast.setBackground(Color.CYAN);
		add(lblEast, BorderLayout.EAST);
		
		JLabel lblSouth = new JLabel("South");
		lblSouth.setHorizontalAlignment(SwingConstants.CENTER);
		lblSouth.setOpaque(true);
		lblSouth.setBackground(Color.RED);
		add(lblSouth, BorderLayout.SOUTH);
		
		JLabel lblCenter = new JLabel("Center");
		lblCenter.setHorizontalAlignment(SwingConstants.CENTER);
		lblCenter.setOpaque(true);
		lblCenter.setBackground(Color.GREEN);
		add(lblCenter, BorderLayout.CENTER);
	}

}
