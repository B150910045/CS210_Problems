import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Problem2Window {

	private JFrame frame;
	private JTextField too1Text;
	private JTextField too2Text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problem2Window window = new Problem2Window();
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
	public Problem2Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Problem2 prob = new Problem2();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("2 toonii dundaj oloh");
		frame.getContentPane().setLayout(null);
		
		too1Text = new JTextField();
		too1Text.setBounds(10, 10, 150, 40);
		too1Text.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(too1Text);
		too1Text.setColumns(10);
		
		too2Text = new JTextField();
		too2Text.setBounds(180, 10, 150, 40);
		too2Text.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(too2Text);
		too2Text.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 140, 160, 40);
		frame.getContentPane().add(textArea);
		
		JTextArea Bodlogo_oguulber = new JTextArea();
		Bodlogo_oguulber.setBounds(10, 190, 800, 100);
		frame.getContentPane().add(Bodlogo_oguulber);
		Bodlogo_oguulber.setText("\r\n"
				+ "RGB7034 - 2 тооны дундаж\r\n"
				+ "Өгөгдсөн 2 бодит  эерэг тооны арифметик болон геометр дунджийг ол");
		
		JButton button = new JButton("Dundaj Oloh");
		button.setBounds(10, 55, 160, 40);
		frame.getContentPane().add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double too1 = Double.parseDouble(too1Text.getText());
				Double too2 = Double.parseDouble(too2Text.getText());
				textArea.setText("hariu: " + prob.dundaj_oloh(too1, too2));
			}
		});
	}

}
