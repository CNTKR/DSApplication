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

public class Application5 extends JFrame {

	private JPanel contentPane;
	private JTextField txtfsize;
	private JTextField txtfe;
	private JTextField result;
	private int arr[];
	private int r=-1;
	private int f=0;
	private int size;
	private int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application5 frame = new Application5();
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
	public Application5() {
		setBackground(new Color(255, 128, 64));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 409);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 128, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Head = new JLabel("CIRCULAR QUEUE DATASTRUCTURE");
		Head.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Head.setForeground(new Color(0, 0, 0));
		Head.setBounds(106, 10, 366, 24);
		contentPane.add(Head);
		
		JLabel txtlsize = new JLabel("ENTER QUEUE SIZE");
		txtlsize.setForeground(new Color(0, 0, 0));
		txtlsize.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtlsize.setBounds(35, 87, 195, 24);
		contentPane.add(txtlsize);
		
		JLabel txtle = new JLabel("ENTER AN ELEMENT");
		txtle.setForeground(new Color(0, 0, 0));
		txtle.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtle.setBounds(40, 193, 216, 24);
		contentPane.add(txtle);
		
		txtfsize = new JTextField();
		txtfsize.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtfsize.setBounds(261, 84, 134, 30);
		contentPane.add(txtfsize);
		txtfsize.setColumns(10);
		
		txtfe = new JTextField();
		txtfe.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtfe.setColumns(10);
		txtfe.setBounds(263, 190, 134, 30);
		contentPane.add(txtfe);
		
		JButton createqueue = new JButton("CREATE QUEUE");
		createqueue.setFont(new Font("Times New Roman", Font.BOLD, 20));
		createqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size=Integer.valueOf(txtfsize.getText());
				arr=new int[size];
				JOptionPane.showMessageDialog(contentPane,"Successfully created");
			}
		});
		createqueue.setBackground(new Color(255, 255, 0));
		createqueue.setBounds(181, 137, 214, 33);
		contentPane.add(createqueue);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count==size) {
					JOptionPane.showMessageDialog(contentPane, "Insertion Not Possible");
				}
				else {
					r=(r+1)%size;
					int ele=Integer.valueOf(txtfe.getText());
					arr[r]=ele;
					count++;
					JOptionPane.showMessageDialog(contentPane, "Successfully inserted "+ele);
					txtfe.setText("");
					
					
				}
			}
		});
		insert.setFont(new Font("Times New Roman", Font.BOLD, 20));
		insert.setBackground(Color.YELLOW);
		insert.setBounds(407, 189, 120, 33);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else {
					JOptionPane.showInternalMessageDialog(contentPane, "Successfully deleted"+arr[f]);
					f=(f+1)%size;
					count--;
				}
			}
		});
		delete.setFont(new Font("Times New Roman", Font.BOLD, 20));
		delete.setBackground(Color.YELLOW);
		delete.setBounds(263, 246, 132, 33);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				int f1=f;
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane,"Display Not possible");
				}
				else {
					for(int i=1;i<=count;i++) {
						msg=msg+" "+arr[f1];
						f1=(f1+1)%size;
					}
					result.setText(msg);
				}
			}
		});
		display.setFont(new Font("Times New Roman", Font.BOLD, 20));
		display.setBackground(Color.YELLOW);
		display.setBounds(263, 291, 132, 33);
		contentPane.add(display);
		
		result = new JTextField();
		result.setBackground(new Color(255, 255, 0));
		result.setFont(new Font("Times New Roman", Font.BOLD, 20));
		result.setColumns(10);
		result.setBounds(35, 334, 479, 30);
		contentPane.add(result);
	}

}
