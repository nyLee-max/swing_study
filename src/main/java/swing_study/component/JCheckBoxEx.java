package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.BoxLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class JCheckBoxEx extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JCheckBox chckbxapple;
	private JLabel lblRes;
	private int sum;
	private String resStr = "현재  0원입니다.";
	private JCheckBox chckbxpear;
	private JCheckBox chckbxcherry;

	

	
	public JCheckBoxEx() {
		initialize();
		chckbxcherry.setSelected(true);
	}
	private void initialize() {
		setTitle("체크박스 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pNorth = new JPanel();
		contentPane.add(pNorth);
		pNorth.setLayout(new BoxLayout(pNorth, BoxLayout.Y_AXIS));
		
		JLabel lblTItle = new JLabel("사과 100원 배 500원 체리 2000원");
		pNorth.add(lblTItle);
		
		JPanel pItem = new JPanel();
		pNorth.add(pItem);
		
		chckbxapple = new JCheckBox("사과");
		chckbxapple.addItemListener(this);
		pItem.add(chckbxapple);
		
		chckbxpear = new JCheckBox("배");
		chckbxpear.addItemListener(this);
		pItem.add(chckbxpear);
		
		chckbxcherry = new JCheckBox("체리");
		chckbxcherry.addItemListener(this);
		pItem.add(chckbxcherry);
		
		JPanel pSouth = new JPanel();
		contentPane.add(pSouth);
		
		lblRes = new JLabel(resStr);
		pSouth.add(lblRes);
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == chckbxcherry) {
			itemStateChangedChckbxcherry(e);
		}
		if (e.getSource() == chckbxpear) {
			itemStateChangedChckbxpear(e);
		}
		if (e.getSource() == chckbxapple) {
			itemStateChangedChckbxapple(e);
		}
		 resStr = String.format("현재 %d 원입니다.", sum);
		 lblRes.setText(resStr);
	}
	protected void itemStateChangedChckbxapple(ItemEvent e) {
		 if(e.getStateChange() == ItemEvent.SELECTED) {
			 sum += 100;
		 }else {
			 sum -= 100;
		 }


	}
	protected void itemStateChangedChckbxpear(ItemEvent e) {
		 if(e.getStateChange() == ItemEvent.SELECTED) {
			 sum += 500;
		 }else {
			 sum -= 500;
		 }

	}
	protected void itemStateChangedChckbxcherry(ItemEvent e) {
		 if(e.getStateChange() == ItemEvent.SELECTED) {
			 sum += 2000;
		 }else {
			 sum -= 2000;
		 }

	}
}
