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
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

//VS4E -- DO NOT REMOVE THIS LINE!
public class fulijisuan_4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton jButton1;
	private JButton jButton0;
	private JLabel jLabel0;
	private JLabel jLabel1;
	private JLabel jLabel2;
	protected JTextField jTextField0;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JButton jButton2;
	protected JTextField jTextField3;
	private JTextField jTextField4;

	public fulijisuan_4() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
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
		add(getJLabel9(), new Constraints(new Leading(143, 12, 12), new Leading(182, 12, 12)));
		add(getJLabel10(), new Constraints(new Leading(143, 12, 12), new Leading(228, 12, 12)));
		add(getJLabel8(), new Constraints(new Leading(141, 12, 12), new Leading(134, 12, 12)));
		add(getJLabel7(), new Constraints(new Leading(141, 12, 12), new Leading(89, 12, 12)));
		add(getJLabel6(), new Constraints(new Leading(141, 12, 12), new Leading(44, 12, 12)));
		add(getJComboBox1(), new Constraints(new Leading(265, 94, 12, 12), new Leading(89, 12, 12)));
		add(getJComboBox0(), new Constraints(new Leading(265, 12, 12), new Leading(37, 10, 10)));
		add(getJRadioButton0(), new Constraints(new Leading(263, 10, 10), new Leading(166, 10, 10)));
		add(getJButton1(), new Constraints(new Leading(236, 10, 10), new Leading(281, 12, 12)));
		add(getJButton0(), new Constraints(new Leading(118, 10, 10), new Leading(280, 29, 12, 12)));
		setSize(395, 364);
	}

	private JComboBox getJComboBox1() {
		if (jComboBox1 == null) {
			jComboBox1 = new JComboBox();
			jComboBox1.setModel(new DefaultComboBoxModel(new Object[] { "��������", "��������" }));
			jComboBox1.setDoubleBuffered(false);
			jComboBox1.setBorder(null);
		}
		return jComboBox1;
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
			jRadioButton0.setText("ÿ��Ͷ�����");
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
			jComboBox0.setModel(new DefaultComboBoxModel(new Object[] { "����", "�㱾��", "������", "������", "�㻹����" }));
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
		jTextField4.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				jLabel10.setText(null);
				int keyChar = e.getKeyChar();
				if (keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9 || keyChar == '.') {

				} else {
					e.consume();
					jLabel10.setText("���������֣�");
				}
			}
		});
		return jTextField4;
	}

	private JTextField getJTextField3() {
		if (jTextField3 == null) {
			jTextField3 = new JTextField();
		}
		jTextField3.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				jLabel9.setText(null);
				int keyChar = e.getKeyChar();
				if (keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9 || keyChar == '.') {

				} else {
					e.consume();
					jLabel9.setText("���������֣�");
				}
			}
		});
		return jTextField3;
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("���ܣ���Ϣ��");
		}
		return jLabel4;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("���\\�뻹��£���");
		}
		return jLabel3;
	}

	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
		}
		jTextField2.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				jLabel8.setText(null);
				int keyChar = e.getKeyChar();
				if (keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9 || keyChar == '.') {

				} else {
					e.consume();
					jLabel8.setText("���������֣�");
				}
			}
		});
		return jTextField2;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
		}
		jTextField1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				jLabel7.setText(null);
				int keyChar = e.getKeyChar();
				if (keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9 || keyChar == '.') {

				} else {
					e.consume();
					jLabel7.setText("���������֣�");
				}
			}
		});
		return jTextField1;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
			jTextField0.addKeyListener(new KeyAdapter() {
				public void keyTyped(KeyEvent e) {
					jLabel6.setText(null);
					int keyChar = e.getKeyChar();
					if (keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9 || keyChar == '.') {

					} else {
						e.consume();
						jLabel6.setText("���������֣�");
					}
				}
			});
		}
		return jTextField0;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("���ޣ�");
		}
		return jLabel2;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("���ʣ�");
		}
		return jLabel1;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("����\\�����");
		}
		return jLabel0;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("����");
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
			jButton1.setText("���");
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
	String key2;
	private JComboBox jComboBox0;
	private JTextField jTextField5;
	private JLabel jLabel5;
	private JRadioButton jRadioButton0;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private JLabel jLabel10;
	private JComboBox jComboBox1;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";

	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				fulijisuan_4 frame = new fulijisuan_4();
				frame.setDefaultCloseOperation(fulijisuan_4.EXIT_ON_CLOSE);
				frame.setTitle("text1");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

	public void jButton0MouseMouseClicked(MouseEvent event) {
		String key1;
		boolean canplay = false;
		String b, c, d;
		double i=0,n=0,p=0,f=0;
		key1 = (String) jComboBox0.getSelectedItem();
		key2 = (String) jComboBox1.getSelectedItem();
		if (key1 == "����") {
			b = String.valueOf(jTextField1.getText());
			c = String.valueOf(jTextField2.getText());
			d = String.valueOf(jTextField0.getText());
			if (b.length() > 0 && c.length() > 0 && d.length() > 0) {
			i = Double.parseDouble(jTextField1.getText());
			n = Double.parseDouble(jTextField2.getText());
			p = Double.parseDouble(jTextField0.getText());
			canplay = deposit(i, n, p);
			}
			
		} else if (key1 == "�㱾��") {
					b = String.valueOf(jTextField1.getText());
			c = String.valueOf(jTextField2.getText());
			d = String.valueOf(jTextField3.getText());
			if (b.length() > 0 && c.length() > 0 && d.length() > 0) {
			i = Double.parseDouble(jTextField1.getText());
			n = Double.parseDouble(jTextField2.getText());
			f = Double.parseDouble(jTextField3.getText());
			canplay = principal(i,n,f);
			}
		} else if (key1 == "������") {
			b = String.valueOf(jTextField0.getText());
			c = String.valueOf(jTextField2.getText());
			d = String.valueOf(jTextField3.getText());
			if (b.length() > 0 && c.length() > 0 && d.length() > 0) {
			p = Double.parseDouble(jTextField0.getText());
			n = Double.parseDouble(jTextField2.getText());
			f = Double.parseDouble(jTextField3.getText());
			canplay = interest(p, n, f);
			}
		} else if (key1 == "������") {
			b = String.valueOf(jTextField0.getText());
			c = String.valueOf(jTextField1.getText());
			d = String.valueOf(jTextField3.getText());
			if (b.length() > 0 && c.length() > 0 && d.length() > 0) {
			p = Double.parseDouble(jTextField0.getText());
			i = Double.parseDouble(jTextField1.getText());
			f = Double.parseDouble(jTextField3.getText());
			canplay = year(p, i, f);
			}
		} else if (key1 == "�㻹����") {
			b = String.valueOf(jTextField0.getText());
			c = String.valueOf(jTextField1.getText());
			d = String.valueOf(jTextField2.getText());
			if (b.length() > 0 && c.length() > 0 && d.length() > 0) {
			p = Double.parseDouble(jTextField0.getText());
			i = Double.parseDouble(jTextField1.getText());
			n = Double.parseDouble(jTextField2.getText());
			canplay = loan(p,i,n);
			}
		}
		if (canplay == false) {
			JOptionPane.showMessageDialog(null, "��������ȷ���֣�");
		}
	}

	public void jButton1MouseMouseClicked(MouseEvent event) {
		this.jTextField0.setText(null);
		this.jTextField1.setText(null);
		this.jTextField2.setText(null);
		this.jTextField3.setText(null);
		this.jTextField4.setText(null);
	}

	public void jRadioButton0MouseMouseClicked(MouseEvent event) {
		if (y == false)
			y = true;
		else
			y = false;
	}

	public boolean deposit(double i, double n, double p) {
		double j = 0, f = 0;
		if(i>0&&n>0&&p>0){
			if(n>200) return false;
			if (key2 == "��������") {
				if (y == true) {
					double p2 = p;
					for (int a = 0; a < n; a++) {
						p = p + f;
						f = p * (1 + i);
					}
					j = f - (n * p2);
				} else {
					double s = 1;
					for (int a = 0; a < n; a++) {

						s = s * (1 + i);
					}
					f = p * s;
					j = f - p;
				}
			} else {
				if (y == true) {
					j = p * n * i * n;
					f = j + p * n;
				} else {
					j = p * i * n;
					f = j + p;
				}
			}
			this.jTextField3.setText(String.format("%.2f", f));
			this.jTextField4.setText(String.format("%.2f", j));
			return true;
		}else
			return false;
	}

	public boolean principal(double i, double n, double f) {
		double j = 0,p = 0, s = 1;
		if(i>0&&n>0&&f>0){
			if(n>200) return false;
			if (key2 == "��������") {
				for (int a = 0; a < n; a++) {
					s = (i + 1) * s;
				}
				p = f * (1 / s);
				j = f - p;
			} else {
				p = f * (1 / (1 + i * n));
				j = f - p;
			}
			this.jTextField0.setText(String.format("%.2f", p));
			this.jTextField4.setText(String.format("%.2f", j));
			return true;
		}
		else return false;
	}

	public boolean interest(double p, double n, double f) {
		double j = 0,i = 0;
		if(f>0&&n>0&&p>0){
			if(n>200) return false;
			if (key2 == "��������") {
				i = Math.pow(f / p, 1.0 / n) - 1;
				j = f - p;
			} else {
				i = (f - p) / (p * n);
				j = f - p;
			}
			this.jTextField1.setText(String.format("%.2f", i));
			this.jTextField4.setText(String.format("%.2f", j));
			return true;
		}
		else return false;
	}

	public boolean year(double p, double i, double f) {
		double j = 0, n = 0;
	
		if(i>0&&f>0&&p>0){
			if (key2 == "��������") {
				n = Logarithm.log(f / p, 1 + i);
				j = f - p;
			} else {
				n = (f - p) / (p * i);
				j = f - p;
			}
			this.jTextField2.setText(String.format("%.2f", n));
			this.jTextField4.setText(String.format("%.2f", j));
			return true;
		}
		else return false;
	}

	public boolean loan(double p, double i, double n) {
		double j = 0, f = 0;
		if(n>200) return false;
		if(i>0&&n>0&&p>0){
			i = i / 12;
			n = n * 12;
			f = p * i * Math.pow(1 + i, n) / (Math.pow(1 + i, n) - 1);
			j = f * n - p;
			this.jTextField3.setText(String.format("%.2f", f));
			this.jTextField4.setText(String.format("%.2f", j));
			return true;
		}
		else return false;

	}
}
