package ntu_61133817;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField value2;
	private JTextField value1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManHinhTinhToan frame = new ManHinhTinhToan();
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
	public ManHinhTinhToan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 379, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(10, 10, 337, 88);
		contentPane.add(editorPane);
		
		JButton btnNewButton = new JButton("9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+9);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton.setBounds(10, 125, 77, 47);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("6");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+6);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_1.setBounds(10, 182, 77, 46);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+3);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_2.setBounds(10, 238, 77, 47);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("8");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+8);
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_4.setBounds(96, 125, 77, 47);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_1_1 = new JButton("5");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+5);
			}
		});
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_1_1.setBounds(96, 182, 77, 46);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("2");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+2);
			}
		});
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_2_1.setBounds(96, 238, 77, 47);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("0");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+0);
			}
		});
		btnNewButton_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_3_1.setBounds(10, 295, 163, 47);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_5 = new JButton("7");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+7);
			}
		});
		btnNewButton_5.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_5.setBounds(183, 125, 77, 47);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_1_2 = new JButton("4");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+4);
			}
		});
		btnNewButton_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_1_2.setBounds(183, 182, 77, 46);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("1");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+1);
			}
		});
		btnNewButton_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_2_2.setBounds(183, 238, 77, 47);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_3_2 = new JButton("=");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int one=Integer.parseInt(value1.getText());
				int two=Integer.parseInt(value2.getText());
				if(action.getText().equals("sub")) {
					int sub = one-two;
						value2.setText(String.valueOf(sub));
				}
			}
		});
		btnNewButton_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_3_2.setBounds(183, 295, 77, 47);
		contentPane.add(btnNewButton_3_2);
		
		JButton btnNewButton_6 = new JButton("-");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				action.setText("sub");
				value2.setText(null);
			}
		});
		btnNewButton_6.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_6.setBounds(270, 125, 77, 47);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_1_3 = new JButton("+");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				action.setText("add");
				value2.setText(null);
			}
		});
		btnNewButton_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_1_3.setBounds(270, 182, 77, 46);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_2_3 = new JButton("*");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				action.setText("mul");
				value2.setText(null);
			}
		});
		btnNewButton_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_2_3.setBounds(270, 238, 77, 47);
		contentPane.add(btnNewButton_2_3);
		
		JButton btnNewButton_3_3 = new JButton("/");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				action.setText("div");
				value2.setText(null);
			}
		});
		btnNewButton_3_3.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_3_3.setBounds(270, 295, 77, 47);
		contentPane.add(btnNewButton_3_3);
		
		value2 = new JTextField();
		value2.setHorizontalAlignment(SwingConstants.RIGHT);
		value2.setBounds(10, 59, 331, 39);
		contentPane.add(value2);
		value2.setColumns(10);
		
		value1 = new JTextField();
		value1.setHorizontalAlignment(SwingConstants.RIGHT);
		value1.setBounds(164, 20, 178, 29);
		contentPane.add(value1);
		value1.setColumns(10);
		
		action = new JLabel("");
		action.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		action.setBounds(10, 352, 110, 47);
		contentPane.add(action);
		
		JButton btnNewButton_3 = new JButton("C");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_3.setBounds(225, 352, 118, 47);
		contentPane.add(btnNewButton_3);
	}
	private JLabel action;
}
