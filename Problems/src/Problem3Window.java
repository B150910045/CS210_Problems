import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Problem3Window {

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
					Problem3Window window = new Problem3Window();
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
	public Problem3Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Problem3 prob = new Problem3();
		
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
		
		JTextArea Bodlogo_oguulber = new JTextArea();
		Bodlogo_oguulber.setBounds(10, 190, 800, 100);
		frame.getContentPane().add(Bodlogo_oguulber);
		Bodlogo_oguulber.setText("RGB7237 - Арифметик дундаж\r\n"
				+ "Өгөгдсөн бодит тоон дарааллын арифметик дунджийг ол.");
		
		JButton button = new JButton("Arithmetic Dundaj Oloh");
		button.setBounds(10, 55, 160, 40);
		frame.getContentPane().add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int hemjee = Integer.parseInt(hemjeeText.getText());
				Double[] array = new Double[hemjee];
				String string = arrayText.getText();
				String[] arrayString = string.split(" ");
				
				for(int i=0; i<hemjee ; i++)
					array[i] = Double.parseDouble(arrayString[i]);
				textArea.setText("hariu: " + prob.arithmetic_dundaj(array, hemjee));
			}
		});
	}

}
