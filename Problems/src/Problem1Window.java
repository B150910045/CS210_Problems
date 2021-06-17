import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Problem1Window {

	private JFrame frame;
	private JTextField tooText;
	private JTextField zeregText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problem1Window window = new Problem1Window();
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
	public Problem1Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Problem1 prob = new Problem1();
		
		frame = new JFrame();
		frame.setTitle("Zereg Oloh");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tooText = new JTextField();
		tooText.setBounds(10, 10, 150, 40);
		tooText.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(tooText);
		tooText.setColumns(10);
		
		zeregText = new JTextField();
		zeregText.setBounds(180, 10, 150, 40);
		zeregText.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(zeregText);
		zeregText.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 140, 160, 40);
		frame.getContentPane().add(textArea);
		
		JButton button = new JButton("Zereg Oloh");
		button.setBounds(10, 55, 160, 40);
		frame.getContentPane().add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int too = Integer.parseInt(tooText.getText());
				int zereg = Integer.parseInt(zeregText.getText());
				textArea.setText("hariu: " + prob.zereg_oloh(too, zereg));
			}
		});
	}

}
