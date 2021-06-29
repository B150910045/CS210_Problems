package Week3;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Problem25Window {

	private JFrame frame;
	private JTextField tooText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problem25Window window = new Problem25Window();
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
	public Problem25Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Problem25 prob = new Problem25();
		
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
		textArea.setBounds(10, 140, 160, 40);
		frame.getContentPane().add(textArea);
		
		JTextArea Bodlogo_oguulber = new JTextArea();
		Bodlogo_oguulber.setBounds(190, 60, 300, 800);
		frame.getContentPane().add(Bodlogo_oguulber);
		Bodlogo_oguulber.setText("RGB7235 - Квадратын урвуу үржвэр\r\n"
				+ "(1+1/12)*(1+1/22)*...*(1+1/n2) үржвэрийг ол.");
		
		JButton add_btn = new JButton("Цифрүүдийн нийлбэр");
		add_btn.setBounds(10, 55, 160, 40);
		frame.getContentPane().add(add_btn);
		add_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double too = Double.parseDouble(tooText.getText());
				
				textArea.setText("hariu: " + prob.function(too));
			}
		});
	}
}
