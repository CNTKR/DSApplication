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
public class Application4 extends JFrame {
	private JPanel contentPane;
	private JTextField txtfsize;
	private JTextField txtfe;
	private JTextField Result;
	private int rev=-1;
	private int f=0;
	private int size;
	private int arr[];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application4 frame = new Application4();
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
	public Application4() {
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 735, 465);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Head = new JLabel("QUEUE DATASTRUCTURE");
		Head.setForeground(new Color(0, 0, 0));
		Head.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Head.setBackground(new Color(255, 255, 255));
		Head.setBounds(222, 10, 268, 24);
		contentPane.add(Head);
		
		JLabel txtlsize = new JLabel("ENTER QUEUE SIZE");
		txtlsize.setForeground(Color.BLACK);
		txtlsize.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtlsize.setBackground(Color.WHITE);
		txtlsize.setBounds(26, 75, 195, 24);
		contentPane.add(txtlsize);
		
		JLabel txtle = new JLabel("ENTER AN ELEMENT");
		txtle.setForeground(Color.BLACK);
		txtle.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtle.setBackground(Color.WHITE);
		txtle.setBounds(26, 183, 208, 24);
		contentPane.add(txtle);
		
		txtfsize = new JTextField();
		txtfsize.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtfsize.setBounds(242, 72, 191, 30);
		contentPane.add(txtfsize);
		txtfsize.setColumns(10);
		
		txtfe = new JTextField();
		txtfe.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtfe.setColumns(10);
		txtfe.setBounds(244, 180, 189, 30);
		contentPane.add(txtfe);
		
		Result = new JTextField();
		Result.setBackground(new Color(128, 128, 128));
		Result.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Result.setColumns(10);
		Result.setBounds(26, 387, 657, 30);
		contentPane.add(Result);
		
		JButton delete = new JButton("DELETE");
		delete.setFont(new Font("Times New Roman", Font.BOLD, 20));
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rev==-1||f>rev) {
					JOptionPane.showMessageDialog(contentPane, "Not Possible");
				}
				else {
					String msg="Successfully deleted element is "+arr[f];
					JOptionPane.showMessageDialog(contentPane, msg);
					f++;
				}
			}
		});
		delete.setBackground(new Color(128, 128, 128));
		delete.setBounds(242, 240, 137, 33);
		contentPane.add(delete);
		
		JButton createqueue = new JButton("CREATE QUEUE");
		createqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size=Integer.valueOf(txtfsize.getText());
				arr=new int[size];
				JOptionPane.showMessageDialog(contentPane, "Successfully created");
			}
		});
		createqueue.setFont(new Font("Times New Roman", Font.BOLD, 20));
		createqueue.setBackground(Color.GRAY);
		createqueue.setBounds(229, 122, 221, 33);
		contentPane.add(createqueue);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rev==size-1) {
					JOptionPane.showMessageDialog(contentPane, "Not possible");
				}
				else {
					int ele=Integer.valueOf(txtfe.getText());
					++rev;
					arr[rev]=ele;
					JOptionPane.showMessageDialog(contentPane, "Successfully inserted"+ele);
					txtfe.setText("");
				}
			}
		});
		insert.setFont(new Font("Times New Roman", Font.BOLD, 20));
		insert.setBackground(Color.GRAY);
		insert.setBounds(466, 179, 121, 33);
		contentPane.add(insert);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String msg="";
			if(rev==-1) {
				JOptionPane.showMessageDialog(contentPane, "Display Not possible");
			}
			else {
				for(int i=f;i<=rev;i++) {
					msg=msg+" "+arr[i];
				}
				Result.setText(msg);	
			}
			}
			
		});
		display.setFont(new Font("Times New Roman", Font.BOLD, 20));
		display.setBackground(Color.GRAY);
		display.setBounds(242, 344, 137, 33);
		contentPane.add(display);
	}
}
