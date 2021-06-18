import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Problem5Window {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problem5Window window = new Problem5Window();
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
	public Problem5Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Problem5 prob = new Problem5();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Amrstrong too eseh");
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
				+ "RGB7371 - Армстронгийн тоо\r\n"
				+ "\r\n"
				+ "Тооны цифр тус бүрийг оронгийнх нь тоогоор \n зэрэгт дэвшүүлж нэмэнхэд гарсан тоо нь уг \n "
				+ "тоотойгоо тэнцүү байвал уг Армстрогийн тоо \n гэнэ.   Өгөгдсөн тоо Армстронгийн тоо бол \n"
				+ "YES, үгүй бол NO гэж хэвлэ.");
		
		JButton add_btn = new JButton("Armstrong too Eseh");
		add_btn.setBounds(10, 55, 160, 40);
		frame.getContentPane().add(add_btn);
		add_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int too = Integer.parseInt(textField.getText());
				textArea.setText("hariu: " + prob.armstrong_too(too));
			}
		});
	}

}
