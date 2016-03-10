package fulijisuan;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

//VS4E -- DO NOT REMOVE THIS LINE!
public class 复利计算器 extends JFrame {

	private static final long serialVersionUID = 1L;
	private static JTextField jTextField0;
	private static JTextField jTextField1;
	private static JTextField jTextField2;
	private JLabel jLabel2;
	private JLabel jLabel0;
	private JLabel jLabel1;
	private JButton jButton0;
	public 复利计算器() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJTextField0(), new Constraints(new Leading(95, 93, 10, 10), new Leading(72, 24, 10, 10)));
		add(getJLabel2(), new Constraints(new Leading(24, 12, 12), new Leading(162, 12, 12)));
		add(getJLabel0(), new Constraints(new Leading(24, 12, 12), new Leading(72, 12, 12)));
		add(getJLabel1(), new Constraints(new Leading(24, 12, 12), new Leading(120, 12, 12)));
		add(getJLabel3(), new Constraints(new Leading(216, 10, 10), new Leading(75, 12, 12)));
		add(getJLabel4(), new Constraints(new Leading(218, 10, 10), new Leading(150, 12, 12)));
		add(getJTextField1(), new Constraints(new Leading(95, 93, 12, 12), new Leading(117, 24, 12, 12)));
		add(getJTextField2(), new Constraints(new Leading(95, 93, 12, 12), new Leading(159, 24, 12, 12)));
		add(getJButton0(), new Constraints(new Leading(66, 10, 10), new Leading(225, 10, 10)));
		add(getJButton1(), new Constraints(new Leading(210, 10, 10), new Leading(225, 12, 12)));
		setSize(350, 300);
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("清除");
			jButton1.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton1MouseMouseClicked(event);
				}
			});
		}
		return jButton1;
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("利息：");
		}
		return jLabel4;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("存款余额：");
		}
		return jLabel3;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("确定");
			jButton0.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton0MouseMouseClicked(event);
				}
			});
		}
		return jButton0;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("利率：");
		}
		return jLabel1;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("本金：");
		}
		return jLabel0;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("计息期数：");
		}
		return jLabel2;
	}

	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
			jTextField2.setText("");
		}
		return jTextField2;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setText("");
		}
		return jTextField1;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
			jTextField0.setText("");
		}
		return jTextField0;
	}

	private static void installLnF() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL
					+ " on this platform:" + e.getMessage());
		}
	}

	/**
	 * Main entry of the class.
	 * Note: This class is only created so that you can easily preview the result at runtime.
	 * It is not expected to be managed by the designer.
	 * You can modify it as you like.
	 */
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JButton jButton1;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				复利计算器 frame = new 复利计算器();
				frame.setDefaultCloseOperation(复利计算器.EXIT_ON_CLOSE);
				frame.setTitle("复利计算器");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

	private void jButton0MouseMouseClicked(MouseEvent event) {
		double p=0,i=0;
		int n=0;
			p = Double.parseDouble(jTextField0.getText());
			i = Double.parseDouble(jTextField1.getText());
			n = Integer.parseInt(jTextField2.getText());
		float f=0;
		double s=1;
			for(int a = 0;a < n;a++){
				s = s * (1 + i);
			}
			f = (float) (p * s);
			float j = (float) (f - p);
			f=((int)(f*100))/100; 
			j=((int)(j*100))/100;  
			this.jLabel3.setText("存款："+f);
			this.jLabel4.setText("利息："+j);
		}

	private void jButton1MouseMouseClicked(MouseEvent event) {
		this.jTextField0.setText(null);
		this.jTextField1.setText(null);
		this.jTextField2.setText(null);
	}
}
