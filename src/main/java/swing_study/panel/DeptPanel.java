package swing_study.panel;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DeptPanel extends JPanel {

	private JTextField tfDeptNo;
	private JTextField tfDeptName;
	private JTextField tfFloor;
	public DeptPanel() {

		initialize();
	}
	private void initialize() {
		setBorder(new TitledBorder(null, "부서정보", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(0, 2, 10, 10));
		JLabel lblDeptno = new JLabel("부서번호");
		add(lblDeptno);
		
		tfDeptNo = new JTextField();
		add(tfDeptNo);
		
		JLabel lblDeptName = new JLabel("부서이름");
		add(lblDeptName);
		
		tfDeptName = new JTextField();
		add(tfDeptName);
		
		JLabel lblFloor = new JLabel("위치");
		add(lblFloor);
		
		tfFloor = new JTextField();
		add(tfFloor);
	}
	
	public Department getDepartment() {
		int deptno = Integer.parseInt(tfDeptNo.getText().trim());
		String deptname = tfDeptName.getText().trim();
		int floor = Integer.parseInt(tfFloor.getText().trim());
		return new Department(deptno, deptname, floor);
	}
	
	public void setDepartment(Department department) {
	      tfDeptNo.setText(department.getDeptno() + "");
	      tfDeptName.setText(department.getDeptName());
	      tfFloor.setText(department.getFloor() + "");
	
	}
	public void clearTF() {
	      tfDeptNo.setText("");
	      tfDeptName.setText("");
	      tfFloor.setText("");
	
	}
	

}
