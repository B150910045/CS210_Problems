package Week3;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Problem23Window {

	private JFrame frame;
	private JTextField tooText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problem23Window window = new Problem23Window();
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
	public Problem23Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Problem23 prob = new Problem23();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Цифрүүдийн нийлбэр");
		frame.getContentPane().setLayout(null);
		
		tooText = new JTextField();
		tooText.setBounds(10, 10, 150, 40);
		tooText.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(tooText);
		tooText.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 100, 160, 200);
		frame.getContentPane().add(textArea);
		
		JTextArea Bodlogo_oguulber = new JTextArea();
		Bodlogo_oguulber.setBounds(190, 10, 300, 800);
		frame.getContentPane().add(Bodlogo_oguulber);
		Bodlogo_oguulber.setText("\r\n"
				+ "RGB7212 - Факториалын хүрд\r\n"
				+ "Өгөгдсөн тоо хүртэлх натурал тоонуудын \n"
				+ " факториалыг жишээн дээрх форматаар хэвлэ.");
		
		JButton add_btn = new JButton("Цифрүүдийн нийлбэр");
		add_btn.setBounds(10, 55, 160, 40);
		frame.getContentPane().add(add_btn);
		add_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int too = Integer.parseInt(tooText.getText());
				textArea.setText("hariu : " + prob.function(too) );
			}
		});
	}
}
