package windowap;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Application2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtflength;
	private JTextField txtfe;
	private JTextField txtfp;
	private JTextField dtxtf;
	private JTextField result;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application2 frame = new Application2();
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
	public Application2() {
		setBackground(new Color(0, 0, 128));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 536);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(128, 255, 128));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel HEAD = new JLabel("ARRAY DATASTRUCTURE");
		HEAD.setFont(new Font("Times New Roman", Font.BOLD, 20));
		HEAD.setBounds(233, 10, 254, 24);
		contentPane.add(HEAD);
		
		JLabel txtllength = new JLabel("ENTER ARRAY LENGTH");
		txtllength.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtllength.setBounds(53, 84, 234, 24);
		contentPane.add(txtllength);
		
		JLabel itxte = new JLabel("ENTER AN INTEGER ELEMENT");
		itxte.setFont(new Font("Times New Roman", Font.BOLD, 20));
		itxte.setBounds(10, 213, 305, 24);
		contentPane.add(itxte);
		
		txtflength = new JTextField();
		txtflength.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtflength.setBounds(297, 81, 85, 30);
		contentPane.add(txtflength);
		txtflength.setColumns(10);
		
		txtfe = new JTextField();
		txtfe.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtfe.setColumns(10);
		txtfe.setBounds(312, 210, 76, 30);
		contentPane.add(txtfe);
		
		JButton createarray = new JButton("CREATE ARRAY");
		createarray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int len=Integer.valueOf(txtflength.getText());
				arr=new int[len];
				String msg="Array of length "+len+" Created";
				JOptionPane.showMessageDialog(contentPane, msg);
			}
		});
		createarray.setBackground(new Color(255, 255, 128));
		createarray.setFont(new Font("Tahoma", Font.BOLD, 20));
		createarray.setBounds(260, 144, 226, 33);
		contentPane.add(createarray);
		
		txtfp = new JTextField();
		txtfp.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtfp.setColumns(10);
		txtfp.setBounds(508, 210, 75, 30);
		contentPane.add(txtfp);
		
		JLabel position = new JLabel("POSITION");
		position.setFont(new Font("Times New Roman", Font.BOLD, 20));
		position.setBounds(396, 215, 111, 24);
		contentPane.add(position);
		
		JLabel dtxtl = new JLabel("ENTER THE POSITION");
		dtxtl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		dtxtl.setBounds(10, 278, 243, 24);
		contentPane.add(dtxtl);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ele=Integer.valueOf(txtfe.getText());
				int pos=Integer.valueOf(txtfp.getText());
				arr[pos]=ele;
				String msg="Element"+ele+"Inserted @ position "+pos;
				JOptionPane.showMessageDialog(contentPane,msg);
				txtfe.setText("");
				txtfp.setText("");
			}
		});
		insert.setFont(new Font("Tahoma", Font.BOLD, 20));
		insert.setBackground(new Color(255, 255, 128));
		insert.setBounds(586, 209, 118, 33);
		contentPane.add(insert);
		
		dtxtf = new JTextField();
		dtxtf.setFont(new Font("Times New Roman", Font.BOLD, 20));
		dtxtf.setColumns(10);
		dtxtf.setBounds(233, 275, 155, 30);
		contentPane.add(dtxtf);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pos=Integer.valueOf(dtxtf.getText());
				arr[pos]=0;
				String msg="Element deleted@ position"+pos;
				JOptionPane.showMessageDialog(contentPane,msg);
				dtxtf.setText("");
				
			}
		});
		delete.setFont(new Font("Tahoma", Font.BOLD, 20));
		delete.setBackground(new Color(255, 255, 128));
		delete.setBounds(396, 272, 118, 33);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				for(int i=0;i<=arr.length-1;i++) {
					msg=msg+" "+arr[i];
				}
				result.setText(msg);
			}
		});
		display.setFont(new Font("Tahoma", Font.BOLD, 20));
		display.setBackground(new Color(255, 255, 128));
		display.setBounds(233, 337, 155, 33);
		contentPane.add(display);
		
		result = new JTextField();
		result.setBackground(new Color(255, 255, 128));
		result.setFont(new Font("Times New Roman", Font.BOLD, 20));
		result.setColumns(10);
		result.setBounds(34, 403, 634, 30);
		contentPane.add(result);
	}
}
