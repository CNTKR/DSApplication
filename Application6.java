package windowap;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Application6 extends JFrame {
		class Node{
			int data;
			Node link;
		}
	private Node first;
	private JPanel ir;
	private JTextField textfe;
	private JTextField txtfe1;
	private JTextField result;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application6 frame = new Application6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Application6() {
		setBackground(new Color(255, 0, 128));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 530);
		ir = new JPanel();
		ir.setForeground(new Color(255, 255, 255));
		ir.setBackground(new Color(128, 64, 64));
		ir.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(ir);
		ir.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(154, 10, 394, 24);
		ir.add(lblNewLabel);
		JLabel txtle = new JLabel("ENTER THE ELEMENT");
		txtle.setForeground(Color.WHITE);
		txtle.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtle.setBounds(32, 96, 220, 24);
		ir.add(txtle);
		
		JLabel txtle1 = new JLabel("ENTER THE ELEMENT");
		txtle1.setForeground(Color.WHITE);
		txtle1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtle1.setBounds(32, 168, 220, 24);
		ir.add(txtle1);
		
		textfe = new JTextField();
		textfe.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textfe.setBounds(282, 93, 121, 30);
		ir.add(textfe);
		textfe.setColumns(10);
		
		txtfe1 = new JTextField();
		txtfe1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtfe1.setColumns(10);
		txtfe1.setBounds(282, 168, 121, 30);
		ir.add(txtfe1);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			private Component contentPane;

			public void actionPerformed(ActionEvent e) {
				Node temp;
				int val=Integer.valueOf(textfe.getText());
				Node nn=new Node();
				nn.data=val;
				nn.link=null;
				if(first==null) {
					first=nn;
				JOptionPane.showMessageDialog(contentPane, "Successfully inserted"+nn.data);
				textfe.setText("");
				}
				else {
					temp=first;
					while(temp.link!=null) {
						temp=temp.link;
					}
					temp.link=nn;
					JOptionPane.showMessageDialog(contentPane, "Successfully inserted"+temp.link.data);
					textfe.setText("");
				}
				
			}
		});
		insertrear.setBackground(new Color(255, 0, 128));
		insertrear.setForeground(new Color(255, 255, 255));
		insertrear.setFont(new Font("Times New Roman", Font.BOLD, 20));
		insertrear.setBounds(442, 92, 186, 33);
		ir.add(insertrear);
		
		JButton ifront = new JButton("INSERT FRONT");
		ifront.addActionListener(new ActionListener() {
			private Component contentPane;

			public void actionPerformed(ActionEvent e) {
				int data=Integer.valueOf(txtfe1.getText());
				Node nn=new Node();
				nn.data=data;
				nn.link=null;
				if(first==null) {
					first=nn;
					JOptionPane.showMessageDialog(contentPane, "Successfully inserted"+data);
					txtfe1.setText("");
				}
				else {
					nn.link=first;
					first=nn;
					JOptionPane.showMessageDialog(contentPane, "Successfully inserted"+nn.data);
					txtfe1.setText("");
				}
				
			}
		});
		ifront.setForeground(Color.WHITE);
		ifront.setFont(new Font("Times New Roman", Font.BOLD, 20));
		ifront.setBackground(new Color(255, 0, 128));
		ifront.setBounds(442, 172, 186, 33);
		ir.add(ifront);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			private Component contemtPane;

			public void actionPerformed(ActionEvent e) {
				Node temp;
				if(first==null) {
					JOptionPane.showMessageDialog(contemtPane, "Deletion Not possible");
				}
				else if(first.link==null) {
					JOptionPane.showMessageDialog(contemtPane, "Deleted element is"+first.data);
					first=null;
				}
				else {
					temp=first;
					while(temp.link.link!=null) {
						temp=temp.link;
						}
					JOptionPane.showMessageDialog(contemtPane, "Deleted element is"+temp.link.data);
						temp.link=null;
					}
			}
		});
		deleterear.setForeground(Color.WHITE);
		deleterear.setFont(new Font("Times New Roman", Font.BOLD, 20));
		deleterear.setBackground(new Color(255, 0, 128));
		deleterear.setBounds(282, 237, 220, 33);
		ir.add(deleterear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			private Component contentPane;

			public void actionPerformed(ActionEvent e) {
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.link==null) {
					JOptionPane.showMessageDialog(contentPane, "Successfully Deleted"+first.data);
					first=null;
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Successfully deleted"+first.data);
					first=first.link;
				}
			}
		});
		deletefront.setForeground(Color.WHITE);
		deletefront.setFont(new Font("Times New Roman", Font.BOLD, 20));
		deletefront.setBackground(new Color(255, 0, 128));
		deletefront.setBounds(282, 306, 220, 33);
		ir.add(deletefront);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			private Component contentpane;

			public void actionPerformed(ActionEvent e) {
				Node temp;
				String msg=""; 
				if(first==null) {
					JOptionPane.showMessageDialog(contentpane, "Not possible");
				}
				else {
					temp=first;
					while(temp!=null) {
						msg=msg+" "+temp.data;
						temp=temp.link;
					}
				result.setText(msg);
			}
			}
		});
		display.setForeground(Color.WHITE);
		display.setFont(new Font("Times New Roman", Font.BOLD, 20));
		display.setBackground(new Color(255, 0, 128));
		display.setBounds(282, 359, 161, 33);
		ir.add(display);
		
		result = new JTextField();
		result.setBackground(new Color(255, 0, 128));
		result.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		result.setColumns(10);
		result.setBounds(32, 442, 579, 30);
		ir.add(result);
	}

}
