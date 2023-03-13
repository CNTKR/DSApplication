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

public class Application3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtfsize;
	private JTextField txtfe;
	private JTextField Result;
	private int arr[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application3 frame = new Application3();
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
	public Application3() {
		setBackground(new Color(128, 255, 128));
		setForeground(new Color(255, 128, 64));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new LineBorder(new Color(255, 128, 64), 1, true));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Head = new JLabel("STACK DATASTRUCTURE");
		Head.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Head.setForeground(new Color(0, 0, 0));
		Head.setBounds(231, 10, 256, 24);
		contentPane.add(Head);
		
		JLabel txtlsize = new JLabel("ENTER THE STACK SIZE");
		txtlsize.setForeground(Color.WHITE);
		txtlsize.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtlsize.setBounds(44, 72, 237, 24);
		contentPane.add(txtlsize);
		
		JLabel txtlelement = new JLabel("ENTER AN ELENENT");
		txtlelement.setForeground(Color.WHITE);
		txtlelement.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtlelement.setBounds(45, 196, 205, 24);
		contentPane.add(txtlelement);
		
		txtfsize = new JTextField();
		txtfsize.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtfsize.setBounds(311, 69, 81, 30);
		contentPane.add(txtfsize);
		txtfsize.setColumns(10);
		
		txtfe = new JTextField();
		txtfe.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtfe.setColumns(10);
		txtfe.setBounds(311, 193, 81, 30);
		contentPane.add(txtfe);
		
		Result = new JTextField();
		Result.setBackground(new Color(128, 255, 128));
		Result.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Result.setColumns(10);
		Result.setBounds(49, 404, 603, 30);
		contentPane.add(Result);
		
		JButton START = new JButton("CREATE STACK");
		START.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size=Integer.valueOf(txtfsize.getText());
				arr=new int[size];
				String msg="Stack of size "+size+" created";
				JOptionPane.showMessageDialog(contentPane, msg);
			}	
		});
		START.setBackground(new Color(128, 255, 128));
		START.setFont(new Font("Times New Roman", Font.BOLD, 20));
		START.setBounds(260, 113, 193, 33);
		contentPane.add(START);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(top==size-1) {
					JOptionPane.showMessageDialog(contentPane, "Push not possible");
				}
				else {
					int ele=Integer.valueOf(txtfe.getText());
					++top;
					arr[top]=ele;
					JOptionPane.showMessageDialog(contentPane,"Push Successfull");
					txtfe.setText("");
				}
			}
		});
		push.setFont(new Font("Times New Roman", Font.BOLD, 20));
		push.setBackground(new Color(128, 255, 128));
		push.setBounds(454, 192, 152, 33);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane,"Pop Not Possible");
				}
				else {
					String msg="Element deleted is "+arr[top];
					JOptionPane.showMessageDialog(contentPane, msg);
					--top;
				}
			}
		});
		pop.setFont(new Font("Times New Roman", Font.BOLD, 20));
		pop.setBackground(new Color(128, 255, 128));
		pop.setBounds(285, 254, 152, 33);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else {
					for(int i=top;i>=0;i--) {
					msg=msg+" "+arr[i];
				}
				Result.setText(msg);
			}
			}
		});
		display.setFont(new Font("Times New Roman", Font.BOLD, 20));
		display.setBackground(new Color(128, 255, 128));
		display.setBounds(285, 361, 152, 33);
		contentPane.add(display);
	}

}
