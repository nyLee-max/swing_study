package swing_study.layout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelAbsolute extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PanelAbsolute() {

		initialize();
	}
	private void initialize() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(360, 52, 57, 15);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(191, 138, 97, 23);
		add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(12, 255, 116, 21);
		add(textField);
		textField.setColumns(10);
	}
}
