package windowap;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Application7 extends JFrame {
	class Node{
		int data;
		Node nxtlink;
		Node prelink;
	}
	private Node first;
	private JPanel contentPane;
	private JTextField txtfe;
	private JTextField txtfe1;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application7 frame = new Application7();
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
	public Application7() {
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 517);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(130, 10, 403, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterTheElement = new JLabel("ENTER THE ELEMENT");
		lblEnterTheElement.setForeground(Color.WHITE);
		lblEnterTheElement.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblEnterTheElement.setBounds(10, 84, 246, 24);
		contentPane.add(lblEnterTheElement);
		
		JLabel lblEnterTheElement_1 = new JLabel("ENTER THE ELEMENT");
		lblEnterTheElement_1.setForeground(Color.WHITE);
		lblEnterTheElement_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblEnterTheElement_1.setBounds(10, 168, 246, 24);
		contentPane.add(lblEnterTheElement_1);
		
		txtfe = new JTextField();
		txtfe.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtfe.setBounds(255, 81, 192, 30);
		contentPane.add(txtfe);
		txtfe.setColumns(10);
		
		txtfe1 = new JTextField();
		txtfe1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtfe1.setColumns(10);
		txtfe1.setBounds(255, 165, 192, 30);
		contentPane.add(txtfe1);
		
		JButton btnNewButton = new JButton("INSERT REAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int ele=Integer.valueOf(txtfe.getText());
			Node nn=new Node();
			nn.data=ele;
			nn.nxtlink=null;
		    nn.prelink=null;
			if(first==null) {
				first=nn;
				JOptionPane.showMessageDialog(contentPane, "Successfully inserted");
				txtfe.setText("");
			}
			else {
				Node temp=first;
				while(temp.nxtlink!=null) {
					temp=temp.nxtlink;
				}
				temp.nxtlink=nn;
				nn.prelink=temp;
				JOptionPane.showMessageDialog(contentPane, "Successfully inserted");
				txtfe.setText("");
			}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(493, 84, 192, 33);
		contentPane.add(btnNewButton);
		
		JButton btnInsertFront = new JButton("INSERT FRONT");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ele=Integer.valueOf(txtfe1.getText());
				Node nn=new Node();
				nn.data=ele;
				nn.nxtlink=null;
			    nn.prelink=null;
				if(first==null) {
					first=nn;
					JOptionPane.showMessageDialog(contentPane, "Successfully inserted");
					txtfe1.setText("");
				}
				else {
					nn.nxtlink=first;
					first.prelink=nn;
					first=nn;
					JOptionPane.showMessageDialog(contentPane, "Successfully inserted");
					txtfe1.setText("");
				}
				
			}
		});
		btnInsertFront.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnInsertFront.setBounds(493, 164, 192, 33);
		contentPane.add(btnInsertFront);
		
		JButton btnDeleteRear = new JButton("DELETE REAR");
		btnDeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "DEletion not possible");
				}
				else if(first.nxtlink==null) {
					JOptionPane.showMessageDialog(contentPane, "Deleted element is"+first.data);
				}
				else {
					Node temp=first;
					while(temp.nxtlink.nxtlink!=null) {
						temp=temp.nxtlink;
					}
					JOptionPane.showMessageDialog(contentPane, "Deleted element is"+temp.nxtlink.data);
					temp.nxtlink=null;
				}
			}
		});
		btnDeleteRear.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnDeleteRear.setBounds(255, 232, 192, 33);
		contentPane.add(btnDeleteRear);
		
		JButton btnInsertFront_1_1 = new JButton("DELETE FRONT");
		btnInsertFront_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null) {
					JOptionPane.showInternalMessageDialog(contentPane, "Deletion Not possible");
				}
				else if(first.nxtlink==null) {
					JOptionPane.showMessageDialog(contentPane, "Deleted element is"+first.data);
				}
				else {
					first=first.nxtlink;
					JOptionPane.showMessageDialog(contentPane, "Deleted element is"+first.data);
					first.prelink=null;
				}
			}
		});
		btnInsertFront_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnInsertFront_1_1.setBounds(255, 290, 192, 33);
		contentPane.add(btnInsertFront_1_1);
		
		JButton btnInsertFront_1_1_1 = new JButton("DISPLAY FORWARD");
		btnInsertFront_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Display Not possible");
				}
				else {
					String msg="";
					Node temp=first;
					while(temp!=null) {
						msg=msg+" "+temp.data;
						temp=temp.nxtlink;
					}
					result.setText(msg);
				}
			}
		});
		btnInsertFront_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnInsertFront_1_1_1.setBounds(10, 346, 246, 33);
		contentPane.add(btnInsertFront_1_1_1);
		
		JButton btnInsertFront_1_1_1_1 = new JButton("DISPLAY REVERSE");
		btnInsertFront_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Display Not possible");
				}
				else {
					String msg="";
					Node temp=first;
					while(temp.nxtlink!=null) {
						temp=temp.nxtlink;
					}
					while(temp!=null) {
						msg=msg+" "+temp.data;
						temp=temp.prelink;
					}
					result.setText(msg);
				}
				
			}
		});
		btnInsertFront_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnInsertFront_1_1_1_1.setBounds(454, 346, 231, 33);
		contentPane.add(btnInsertFront_1_1_1_1);
		
		result = new JTextField();
		result.setFont(new Font("Times New Roman", Font.BOLD, 20));
		result.setColumns(10);
		result.setBounds(10, 418, 675, 30);
		contentPane.add(result);
	}

}
