package Week3;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Problem24Window {

	private JFrame frame;
	private JTextField zeregText, tooText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problem24Window window = new Problem24Window();
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
	public Problem24Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Problem24 prob = new Problem24();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Цифрүүдийн нийлбэр");
		frame.getContentPane().setLayout(null);
		
		zeregText = new JTextField();
		zeregText.setBounds(180, 10, 150, 40);
		zeregText.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(zeregText);
		zeregText.setColumns(10);

		tooText = new JTextField();
		tooText.setBounds(10, 10, 150, 40);
		tooText.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(tooText);
		tooText.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 140, 160, 40);
		frame.getContentPane().add(textArea);
		
		JTextArea Bodlogo_oguulber = new JTextArea();
		Bodlogo_oguulber.setBounds(190, 60, 300, 800);
		frame.getContentPane().add(Bodlogo_oguulber);
		Bodlogo_oguulber.setText("RGB7218 - Зэрэгтүүдийн нийлбэр\r\n"
				+ "Өгөгдсөн a тооны өгөгдсөн n тоо хүртэлх зэрэгтүүдийн\n"
				+ " нийлбэрийг ол. 1+a1+a2+a3+...+an.");
		
		JButton add_btn = new JButton("Цифрүүдийн нийлбэр");
		add_btn.setBounds(10, 55, 160, 40);
		frame.getContentPane().add(add_btn);
		add_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int zereg = Integer.parseInt(zeregText.getText());
				int too = Integer.parseInt(tooText.getText());
				
				textArea.setText("hariu: " + prob.function(too, zereg));
			}
		});
	}
}
