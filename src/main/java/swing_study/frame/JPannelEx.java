package swing_study.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import swing_study.panel.Department;
import swing_study.panel.DeptPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPannelEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnsetDept;
	private JButton btnNewButton_1;
	private DeptPanel pDept;
	private JButton btnclear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JPannelEx() {
		initialize();
	}
	private void initialize() {
		setTitle("JPannel2");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(500, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pDept = new DeptPanel();
		contentPane.add(pDept, BorderLayout.CENTER);
		
		JPanel Pbtn = new JPanel();
		contentPane.add(Pbtn, BorderLayout.SOUTH);
		
		btnsetDept = new JButton("부서 설정");
		btnsetDept.addActionListener(this);
		Pbtn.add(btnsetDept);
		
		btnNewButton_1 = new JButton("부서 가져오기");
		btnNewButton_1.addActionListener(this);
		Pbtn.add(btnNewButton_1);
		
		btnclear = new JButton("초기화");
		btnclear.addActionListener(this);
		Pbtn.add(btnclear);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnclear) {
			actionPerformedBtnclear(e);
		}
		if (e.getSource() == btnNewButton_1) {
			actionPerformedBtnNewButton_1(e);
		}
		if (e.getSource() == btnsetDept) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		Department dept = new Department(1, "기획", 9);
		pDept.setDepartment(dept);
	}
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
		Department dept = pDept.getDepartment();
		JOptionPane.showMessageDialog(this, dept);
	}
	protected void actionPerformedBtnclear(ActionEvent e) {
		pDept.clearTF();
	}
}
