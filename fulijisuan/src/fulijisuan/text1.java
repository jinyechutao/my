package fulijisuan;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
import org.dyno.visual.swing.layouts.Trailing;

//VS4E -- DO NOT REMOVE THIS LINE!
public class text1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton jButton1;
	private JButton jButton0;
	private JLabel jLabel0;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JTextField jTextField0;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JButton jButton2;
	private JTextField jTextField3;
	private JTextField jTextField4;
	private JRadioButton jRadioButton0;
	public text1() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJLabel0(), new Constraints(new Leading(34, 12, 12), new Leading(18, 10, 10)));
		add(getJLabel1(), new Constraints(new Leading(33, 12, 12), new Leading(64, 12, 12)));
		add(getJLabel2(), new Constraints(new Leading(32, 12, 12), new Leading(113, 10, 10)));
		add(getJButton0(), new Constraints(new Leading(9, 12, 12), new Leading(259, 29, 10, 10)));
		add(getJButton2(), new Constraints(new Leading(126, 10, 10), new Leading(259, 12, 12)));
		add(getJButton1(), new Constraints(new Leading(239, 10, 10), new Leading(259, 12, 12)));
		add(getJLabel4(), new Constraints(new Leading(30, 12, 12), new Leading(200, 10, 10)));
		add(getJLabel3(), new Constraints(new Leading(30, 12, 12), new Leading(158, 10, 10)));
		add(getJRadioButton0(), new Constraints(new Trailing(12, 109, 171), new Leading(62, 12, 12)));
		add(getJRadioButton1(), new Constraints(new Leading(246, 10, 10), new Leading(131, 10, 10)));
		add(getJTextField0(), new Constraints(new Leading(91, 95, 10, 10), new Leading(18, 10, 10)));
		add(getJTextField2(), new Constraints(new Leading(91, 94, 12, 12), new Leading(109, 12, 12)));
		add(getJTextField1(), new Constraints(new Leading(93, 90, 88, 88), new Leading(64, 12, 12)));
		add(getJTextField3(), new Constraints(new Leading(91, 94, 12, 12), new Leading(154, 12, 12)));
		add(getJTextField4(), new Constraints(new Leading(90, 96, 12, 12), new Leading(198, 12, 12)));
		setSize(320, 388);
	}

	private JRadioButton getJRadioButton1() {
		if (jRadioButton1 == null) {
			jRadioButton1 = new JRadioButton();
			jRadioButton1.setSelected(false);
			jRadioButton1.setText("算本金");
			jRadioButton1.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jRadioButton1MouseMouseClicked(event);
				}
			});
		}
		return jRadioButton1;
	}

	private JRadioButton getJRadioButton0() {
		if (jRadioButton0 == null) {
			jRadioButton0 = new JRadioButton();
			jRadioButton0.setSelected(false);
			jRadioButton0.setText("算存款");
			jRadioButton0.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jRadioButton0MouseMouseClicked(event);
				}
			});
		}
		return jRadioButton0;
	}

	private JTextField getJTextField4() {
		if (jTextField4 == null) {
			jTextField4 = new JTextField();
		}
		return jTextField4;
	}

	private JTextField getJTextField3() {
		if (jTextField3 == null) {
			jTextField3 = new JTextField();
		}
		return jTextField3;
	}

	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("单利计算");
			jButton2.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton2MouseMouseClicked(event);
				}
			});
		}
		return jButton2;
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
			jLabel3.setText("存款：");
		}
		return jLabel3;
	}

	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
		}
		return jTextField2;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
		}
		return jTextField1;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
		}
		return jTextField0;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("年限：");
		}
		return jLabel2;
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

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("复利计算");
			jButton0.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton0MouseMouseClicked(event);
				}
			});
		}
		return jButton0;
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

	private static void installLnF() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL + " on this platform:" + e.getMessage());
		}
	}

	/**
	* Main entry of the class.
	* Note: This class is only created so that you can easily preview the result at runtime.
	* It is not expected to be managed by the designer.
	* You can modify it as you like.
	*/
	boolean suanfa = true ;
	private JRadioButton jRadioButton1;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				text1 frame = new text1();
				frame.setDefaultCloseOperation(text1.EXIT_ON_CLOSE);
				frame.setTitle("text1");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

	private void jButton0MouseMouseClicked(MouseEvent event) {
		double p=0,i=0,f=0,j=0; 
		double s=1; 
		 int n=0; 		 
		 i = Double.parseDouble(jTextField1.getText()); 
		 n = Integer.parseInt(jTextField2.getText());
		 if(suanfa == false)
		 {
			 p = Double.parseDouble(jTextField0.getText()); 

		 for(int a = 0;a < n;a++){ 
		 s = s * (1 + i); 
		 } 
		 f =  p * s; 
		 j = f - p;  
		 this.jTextField3.setText(String.format("%.2f", f)); 
		 this.jTextField4.setText(String.format("%.2f", j));
		 }
		 else{
			 f = Double.parseDouble(jTextField3.getText()); 
			 for(int a = 0;a<n;a++){
				 s= (i+1)*s;
			 }
			 p=f*(1/s);	
			 j=f-p;
			 
			this.jTextField0.setText(String.format("%.2f", p)); 
		 this.jTextField4.setText(String.format("%.2f", j));
		 }
	}

	private void jButton1MouseMouseClicked(MouseEvent event) {
		this.jTextField0.setText(null); 
		 this.jTextField1.setText(null); 
		 this.jTextField2.setText(null); 
		 this.jTextField3.setText(null); 
		 this.jTextField4.setText(null); 
	}

	private void jButton2MouseMouseClicked(MouseEvent event) {
		double p=0,i=0,j=0,f=0;;
		 int n=0; 

		 i = Double.parseDouble(jTextField1.getText()); 
		 n = Integer.parseInt(jTextField2.getText());
		 if(suanfa == false){
		 p = Double.parseDouble(jTextField0.getText()); 
		 j=p*i*n;
		 f=j+p;  
		 this.jTextField3.setText(String.format("%.2f", f)); 
		 this.jTextField4.setText(String.format("%.2f", j));
		 }
		 else{
			 f = Double.parseDouble(jTextField3.getText()); 
			 p = f *(1/(1+i*n));
			 j=f-p;
			 
			this.jTextField0.setText(String.format("%.2f", p)); 
		 this.jTextField4.setText(String.format("%.2f", j));
		 }
	}

	private void jRadioButton0MouseMouseClicked(MouseEvent event) {
		suanfa = false;
		jRadioButton1.setSelected(false);
	}

	private void jRadioButton1MouseMouseClicked(MouseEvent event) {
		jRadioButton0.setSelected(false);
		suanfa = true;
	}

}
