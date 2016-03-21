package fulijisuan;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

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
	public text1() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJRadioButton0(), new Constraints(new Leading(259, 10, 10), new Leading(120, 12, 12)));
		add(getJComboBox0(), new Constraints(new Leading(266, 10, 10), new Leading(50, 12, 12)));
		add(getJTextField0(), new Constraints(new Leading(139, 95, 10, 10), new Leading(20, 12, 12)));
		add(getJTextField1(), new Constraints(new Leading(140, 92, 12, 12), new Leading(64, 12, 12)));
		add(getJTextField4(), new Constraints(new Leading(140, 96, 12, 12), new Leading(200, 12, 12)));
		add(getJTextField3(), new Constraints(new Leading(140, 94, 12, 12), new Leading(156, 12, 12)));
		add(getJTextField2(), new Constraints(new Leading(141, 94, 12, 12), new Leading(111, 10, 10)));
		add(getJLabel3(), new Constraints(new Leading(8, 12, 12), new Leading(158, 12, 12)));
		add(getJLabel2(), new Constraints(new Leading(90, 12, 12), new Leading(113, 12, 12)));
		add(getJLabel4(), new Constraints(new Leading(51, 12, 12), new Leading(202, 12, 12)));
		add(getJLabel1(), new Constraints(new Leading(89, 12, 12), new Leading(68, 13, 12, 12)));
		add(getJLabel0(), new Constraints(new Leading(33, 12, 12), new Leading(20, 12, 12)));
		add(getJButton0(), new Constraints(new Leading(30, 10, 10), new Leading(281, 29, 10, 10)));
		add(getJButton1(), new Constraints(new Leading(139, 12, 12), new Leading(282, 12, 12)));
		add(getJButton2(), new Constraints(new Leading(219, 10, 10), new Leading(281, 12, 12)));
		add(getJLabel9(), new Constraints(new Leading(143, 12, 12), new Leading(182, 12, 12)));
		add(getJLabel10(), new Constraints(new Leading(143, 12, 12), new Leading(228, 12, 12)));
		add(getJLabel8(), new Constraints(new Leading(141, 12, 12), new Leading(134, 12, 12)));
		add(getJLabel7(), new Constraints(new Leading(141, 12, 12), new Leading(89, 12, 12)));
		add(getJLabel6(), new Constraints(new Leading(141, 12, 12), new Leading(44, 12, 12)));
		setSize(395, 364);
	}

	private JLabel getJLabel10() {
		if (jLabel10 == null) {
			jLabel10 = new JLabel();
			jLabel10.setText(null);
		}
		return jLabel10;
	}

	private JLabel getJLabel9() {
		if (jLabel9 == null) {
			jLabel9 = new JLabel();
			jLabel9.setText(null);
		}
		return jLabel9;
	}

	private JLabel getJLabel8() {
		if (jLabel8 == null) {
			jLabel8 = new JLabel();
			jLabel8.setText(null);
		}
		return jLabel8;
	}

	private JLabel getJLabel7() {
		if (jLabel7 == null) {
			jLabel7 = new JLabel();
			jLabel7.setText(null);
		}
		return jLabel7;
	}

	private JLabel getJLabel6() {
		if (jLabel6 == null) {
			jLabel6 = new JLabel();
			jLabel6.setText(null);
		}
		return jLabel6;
	}

	private JRadioButton getJRadioButton0() {
		if (jRadioButton0 == null) {
			jRadioButton0 = new JRadioButton();
			jRadioButton0.setText("每年投入年金");
			jRadioButton0.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jRadioButton0MouseMouseClicked(event);
				}
			});
		}
		return jRadioButton0;
	}

	private JComboBox getJComboBox0() {
		if (jComboBox0 == null) {
			jComboBox0 = new JComboBox();
			jComboBox0.setModel(new DefaultComboBoxModel(new Object[] { "算存款", "算本金", "算利率", "算年限" ,"算还款金额"}));
			jComboBox0.setDoubleBuffered(false);
			jComboBox0.setBorder(null);
			jComboBox0.addMouseListener(new MouseAdapter() {
			});
		}
		return jComboBox0;
	}

	private JTextField getJTextField4() {
		if (jTextField4 == null) {
			jTextField4 = new JTextField();
		}	
		jTextField4.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e){
				jLabel10.setText(null);
				int keyChar = e.getKeyChar();
				if(keyChar >=KeyEvent.VK_0&&keyChar <= KeyEvent.VK_9||keyChar =='.'){
					
				}
				else{
					e.consume();
					jLabel10.setText("请输入数字！");
				}
			}
		});
		return jTextField4;
	}

	private JTextField getJTextField3() {
		if (jTextField3 == null) {
			jTextField3 = new JTextField();
		}
		jTextField3.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e){
				jLabel9.setText(null);
				int keyChar = e.getKeyChar();
				if(keyChar >=KeyEvent.VK_0&&keyChar <= KeyEvent.VK_9||keyChar =='.'){
					
				}
				else{
					e.consume();
					jLabel9.setText("请输入数字！");
				}
			}
		});
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
			jLabel4.setText("（总）利息：");
		}
		return jLabel4;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("余额\\须还款（月）：");
		}
		return jLabel3;
	}

	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
		}
		jTextField2.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e){
				jLabel8.setText(null);
				int keyChar = e.getKeyChar();
				if(keyChar >=KeyEvent.VK_0&&keyChar <= KeyEvent.VK_9||keyChar =='.'){
					
				}
				else{
					e.consume();
					jLabel8.setText("请输入数字！");
				}
			}
		});
		return jTextField2;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
		}
		jTextField1.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e){
				jLabel7.setText(null);
				int keyChar = e.getKeyChar();
				if(keyChar >=KeyEvent.VK_0&&keyChar <= KeyEvent.VK_9||keyChar =='.'){
					
				}
				else{
					e.consume();
					jLabel7.setText("请输入数字！");
				}
			}
		});
		return jTextField1;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
		jTextField0.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e){
				jLabel6.setText(null);
				int keyChar = e.getKeyChar();
				if(keyChar >=KeyEvent.VK_0&&keyChar <= KeyEvent.VK_9||keyChar =='.'){
					
				}
				else{
					e.consume();
					jLabel6.setText("请输入数字！");
				}
			}
		});
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
			jLabel0.setText("本金\\贷款金额：");
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
	boolean y = false;
	private JComboBox jComboBox0;
	private JTextField jTextField5;
	private JLabel jLabel5;
	private JRadioButton jRadioButton0;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private JLabel jLabel10;
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
		String key;
		double p=0,i=0,f=0,j=0; 
		double s=1; 
		double n=0;  
		 key = (String) jComboBox0.getSelectedItem();
		 if(key == "算存款")
		 {
			 i = Double.parseDouble(jTextField1.getText()); 
		 n = Double.parseDouble(jTextField2.getText());
			 p = Double.parseDouble(jTextField0.getText()); 
			 if(y==true){
				 double p2=p;
		 for(int a = 0;a < n;a++){
			 p = p+f;
		 f = p * (1 + i); 
		 } 
		 j = f - (n*p2);  
			 }
			 else{
				 for(int a = 0;a < n;a++){ 
			
		 s = s * (1 + i); 
		 } 
		 f =  p * s; 
		 j = f - p;
		 }
		 this.jTextField3.setText(String.format("%.2f", f)); 
		 this.jTextField4.setText(String.format("%.2f", j));
		 }
		 else if(key == "算本金"){	
			 i = Double.parseDouble(jTextField1.getText()); 
		 n = Double.parseDouble(jTextField2.getText());
			 f = Double.parseDouble(jTextField3.getText()); 
			 for(int a = 0;a<n;a++){
				 s= (i+1)*s;
			 }
			 p=f*(1/s);	
			 j=f-p;
			 
			this.jTextField0.setText(String.format("%.2f", p)); 
		 this.jTextField4.setText(String.format("%.2f", j));
		 }			
		 else if(key == "算利率"){	
			 p = Double.parseDouble(jTextField0.getText()); 
		 n = Double.parseDouble(jTextField2.getText());
			 f = Double.parseDouble(jTextField3.getText()); 
			i = Math.pow(f/p, 1.0/n)-1;
			 j=f-p;			 
			this.jTextField1.setText(String.format("%.2f", i)); 
		 this.jTextField4.setText(String.format("%.2f", j));
		 }
		 else if(key == "算年限"){	
			 p = Double.parseDouble(jTextField0.getText()); 
			 i = Double.parseDouble(jTextField1.getText());
			 f = Double.parseDouble(jTextField3.getText()); 
			 n = Logarithm.log(f/p,1+i); 
			 j=f-p;			 
			this.jTextField2.setText(String.format("%.2f", n)); 
		 this.jTextField4.setText(String.format("%.2f", j));
		 }	
		 else if(key == "算还款金额"){	
			 p = Double.parseDouble(jTextField0.getText()); 
			 i = Double.parseDouble(jTextField1.getText());
			 n = Double.parseDouble(jTextField2.getText()); 
			 i = i/12;
			 n = n*12;
			 f = p*i*Math.pow(1+i,n)/(Math.pow(1+i, n)-1);
			 j= f*n - p;		 
			this.jTextField3.setText(String.format("%.2f", f)); 
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
		double p=0,i=0,j=0,f=0,n=0;  
		 String key;
		 key = (String) jComboBox0.getSelectedItem();
		 if(key == "算存款"){
			 i = Double.parseDouble(jTextField1.getText()); 
		 n = Double.parseDouble(jTextField2.getText());
		 p = Double.parseDouble(jTextField0.getText()); 
		 if(y==true)
		 {
			 j=p*n*i*n;	
			 f=j+p*n; 
		 }
		 else
			 {
			 j=p*i*n;
		 f = j+p;
			 }
		 this.jTextField3.setText(String.format("%.2f", f)); 
		 this.jTextField4.setText(String.format("%.2f", j));
		 }
		 else if(key == "算本金"){	
			 i = Double.parseDouble(jTextField1.getText()); 
		 n = Double.parseDouble(jTextField2.getText());
			 f = Double.parseDouble(jTextField3.getText()); 
			 p = f *(1/(1+i*n)); 
			 j=f-p;
			 
			this.jTextField0.setText(String.format("%.2f", p)); 
		 this.jTextField4.setText(String.format("%.2f", j));
		 }	
		 else if(key == "算利率"){	
			 p = Double.parseDouble(jTextField0.getText()); 
		 n = Double.parseDouble(jTextField2.getText());
			 f = Double.parseDouble(jTextField3.getText()); 
			 i = (f-p)/ (p*n);
			 j=f-p;			 
			this.jTextField1.setText(String.format("%.2f", i)); 
			this.jTextField4.setText(String.format("%.2f", j));
		 }
		 else if(key == "算年限"){	
			 p = Double.parseDouble(jTextField0.getText()); 
			 i = Double.parseDouble(jTextField1.getText());
			 f = Double.parseDouble(jTextField3.getText()); 
			 n = (f-p)/(p*i);
			 j=f-p;			 
			this.jTextField2.setText(String.format("%.2f", n)); 
			this.jTextField4.setText(String.format("%.2f", j));
		 }

	}

	private void jRadioButton0MouseMouseClicked(MouseEvent event) {
		if(y==false)
			y = true;
		else
			y=false;
	}
}
