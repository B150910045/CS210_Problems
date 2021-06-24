package Week2;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Problem12Window {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problem12Window window = new Problem12Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Problem12Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Problem12 prob = new Problem12();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Сондгой цифрүүдийн тоо");
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 10, 150, 40);
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 140, 160, 40);
		frame.getContentPane().add(textArea);
		
		JTextArea Bodlogo_oguulber = new JTextArea();
		Bodlogo_oguulber.setBounds(190, 10, 300, 800);
		frame.getContentPane().add(Bodlogo_oguulber);
		Bodlogo_oguulber.setText("\r\n"
				+ "RGB7304 - Сондгой цифрүүдийн тоо\r\n"
				+ "Өгөгдсөн тоон дахь сондгой цифрүүдийн \n"
				+ " тоог ол.");
		
		JButton add_btn = new JButton("Сондгой цифрүүдийн тоо");
		add_btn.setBounds(10, 55, 160, 40);
		frame.getContentPane().add(add_btn);
		add_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int too = Integer.parseInt(textField.getText());
				textArea.setText("hariu: " + prob.function(too));
			}
		});
	}
}
