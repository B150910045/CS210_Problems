import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Problem4Window {

	private JFrame frame;
	private JTextField hemjeeText;
	private JTextField arrayText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problem4Window window = new Problem4Window();
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
	public Problem4Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Problem4 prob = new Problem4();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Arithmetic dundaj oloh");
		frame.getContentPane().setLayout(null);
		
		hemjeeText = new JTextField();
		hemjeeText.setBounds(10, 10, 150, 40);
		hemjeeText.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(hemjeeText);
		hemjeeText.setColumns(10);
		
		arrayText = new JTextField();
		arrayText.setBounds(180, 10, 150, 40);
		arrayText.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(arrayText);
		arrayText.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 140, 160, 40);
		frame.getContentPane().add(textArea);
		
		JButton add_btn = new JButton("Usuh Eseh");
		add_btn.setBounds(10, 55, 160, 40);
		frame.getContentPane().add(add_btn);
		add_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int hemjee = Integer.parseInt(hemjeeText.getText());
				int[] array = new int[hemjee];
				String string = arrayText.getText();
				String[] arrayString = string.split(" ");
				
				for(int i=0; i<hemjee ; i++)
					array[i] = Integer.parseInt(arrayString[i]);
				textArea.setText("hariu: " + prob.usuh_eseh(array, hemjee));
			}
		});
	}

}
