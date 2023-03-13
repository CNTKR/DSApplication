package windowap;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;

public class Application extends JFrame {

	private JPanel contentpanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application frame = new Application();
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
	public Application() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 432);
		contentpanel = new JPanel();
		contentpanel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 128, 128), new Color(128, 128, 64), new Color(0, 0, 0), new Color(192, 192, 192)));
		contentpanel.setBackground(new Color(255, 255, 128));

		setContentPane(contentpanel);
		contentpanel.setLayout(null);
		
		JLabel Head = new JLabel("CHOOSE A DATASTRUCTURE");
		Head.setForeground(new Color(128, 128, 128));
		Head.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Head.setBounds(188, 10, 285, 24);
		contentpanel.add(Head);
		
		JButton stack = new JButton("STACK");
		stack.setBackground(new Color(128, 128, 128));
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Application3().setVisible(true );
			}
		});
		stack.setFont(new Font("Times New Roman", Font.BOLD, 20));
		stack.setBounds(398, 135, 117, 33);
		contentpanel.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.setBackground(new Color(128, 128, 128));
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Application4().setVisible(true);
			}
		});
		queue.setFont(new Font("Times New Roman", Font.BOLD, 20));
		queue.setBounds(105, 135, 117, 33);
		contentpanel.add(queue);
		
		JButton cqueue = new JButton("CIRCULAR QUEUE");
		cqueue.setBackground(new Color(128, 128, 128));
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Application5().setVisible(true);
			}
		});
		cqueue.setFont(new Font("Times New Roman", Font.BOLD, 20));
		cqueue.setBounds(10, 217, 228, 33);
		contentpanel.add(cqueue);
		
		JButton dllist = new JButton("DOUBLYLINKEDLIST");
		dllist.setBackground(new Color(128, 128, 128));
		dllist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Application7().setVisible(true);
			}
		});
		dllist.setFont(new Font("Times New Roman", Font.BOLD, 20));
		dllist.setBounds(176, 300, 266, 33);
		contentpanel.add(dllist);
		
		JButton sllist = new JButton("SINGLY LINKEDLIST");
		sllist.setBackground(new Color(128, 128, 128));
		sllist.setAlignmentY(Component.TOP_ALIGNMENT);
		sllist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Application6().setVisible(true);
			}
		});
		sllist.setFont(new Font("Times New Roman", Font.BOLD, 20));
		sllist.setBounds(383, 217, 254, 33);
		contentpanel.add(sllist);
		
		JButton array = new JButton("ARRAY");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Application2 a=new Application2();
				// a.setVisible(true);
				new Application2().setVisible(true);
			}
		});
		array.setBackground(new Color(128, 128, 128));
		array.setFont(new Font("Times New Roman", Font.BOLD, 20));
		array.setForeground(new Color(0, 0, 0));
		array.setBounds(250, 61, 123, 33);
		contentpanel.add(array);
	}
}
