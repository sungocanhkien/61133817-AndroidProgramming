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

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton.setBounds(10, 125, 77, 47);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("6");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_1.setBounds(10, 182, 77, 46);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_2.setBounds(10, 238, 77, 47);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("8");
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_4.setBounds(96, 125, 77, 47);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_1_1 = new JButton("5");
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_1_1.setBounds(96, 182, 77, 46);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("2");
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_2_1.setBounds(96, 238, 77, 47);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("0");
		btnNewButton_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_3_1.setBounds(10, 295, 163, 47);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_5 = new JButton("7");
		btnNewButton_5.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_5.setBounds(183, 125, 77, 47);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_1_2 = new JButton("4");
		btnNewButton_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_1_2.setBounds(183, 182, 77, 46);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("1");
		btnNewButton_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_2_2.setBounds(183, 238, 77, 47);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_3_2 = new JButton("=");
		btnNewButton_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_3_2.setBounds(183, 295, 77, 47);
		contentPane.add(btnNewButton_3_2);
		
		JButton btnNewButton_6 = new JButton("-");
		btnNewButton_6.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_6.setBounds(270, 125, 77, 47);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_1_3 = new JButton("+");
		btnNewButton_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_1_3.setBounds(270, 182, 77, 46);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_2_3 = new JButton("*");
		btnNewButton_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_2_3.setBounds(270, 238, 77, 47);
		contentPane.add(btnNewButton_2_3);
		
		JButton btnNewButton_3_3 = new JButton("/");
		btnNewButton_3_3.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton_3_3.setBounds(270, 295, 77, 47);
		contentPane.add(btnNewButton_3_3);
		
		textField = new JTextField();
		textField.setBounds(10, 59, 330, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(164, 20, 178, 29);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
