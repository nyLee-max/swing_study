package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.io.File;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JButtonEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private String imgPath = System.getProperty("user.dir") + File.separator + "images" + File.separator;
	private JToggleButton tglbtn;

	
	public JButtonEx() {
		initialize();
	}
	private void initialize() {
		setTitle("JButton && JToggleButton 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel pLeft = new JPanel();
		contentPane.add(pLeft);
		pLeft.setLayout(new BoxLayout(pLeft, BoxLayout.Y_AXIS));
		
		JButton btn01 = new JButton("call~~");
		btn01.setIcon(new ImageIcon(imgPath + "normal.gif"));
		btn01.setRolloverIcon(new ImageIcon(imgPath + "rolloverIcon.gif"));
		btn01.setPressedIcon(new ImageIcon(imgPath + "pressedIcon.gif"));
		pLeft.add(btn01);
		
		tglbtn = new JToggleButton("토글 버튼");
		tglbtn.addActionListener(this);
		pLeft.add(tglbtn);
		
		JPanel pRight = new JPanel();
		contentPane.add(pRight);
		pRight.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pTop = new JPanel();
		pTop.setBorder(new TitledBorder(null, "\uC218\uD3C9 \uC815\uB82C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pRight.add(pTop);
		pTop.setLayout(new GridLayout(0, 1, 0, 0));
		
		MyButton btn02 = new MyButton();
		btn02.setText("Left");
		btn02.setHorizontalAlignment(SwingConstants.LEFT);
		pTop.add(btn02);
		
		MyButton btn03 = new MyButton();
		btn03.setText("Center");
		pTop.add(btn03);
		
		MyButton btn04 = new MyButton();
		btn04.setText("RIght");
		btn04.setHorizontalAlignment(SwingConstants.RIGHT);
		pTop.add(btn04);
		
		JPanel pBottom = new JPanel();
		pBottom.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uC218\uC9C1 \uC815\uB82C", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pRight.add(pBottom);
		pBottom.setLayout(new GridLayout(0, 3, 0, 0));
		
		MyButton btnNewButton = new MyButton();
		btnNewButton.setText("Top");
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		pBottom.add(btnNewButton);
		
		MyButton btnNewButton_1 = new MyButton();
		btnNewButton_1.setText("Center");
		pBottom.add(btnNewButton_1);
		
		MyButton btnNewButton_2 = new MyButton();
		btnNewButton_2.setText("Bottom");
		btnNewButton_2.setVerticalAlignment(SwingConstants.BOTTOM);
		pBottom.add(btnNewButton_2);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tglbtn) {
			actionPerformedTglbtn(e);
		}
	}
	protected void actionPerformedTglbtn(ActionEvent e) {
		if (tglbtn.isSelected()) {
			tglbtn.setText("눌렀네");
		}else {
			tglbtn.setText("눌러봐");	
		}
	}
}
