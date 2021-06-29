package Week3;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Problem21Window {

	private JFrame frame;
	private JTextField arrayText, hemjeeText, tooText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problem21Window window = new Problem21Window();
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
	public Problem21Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Problem21 prob = new Problem21();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Цифрүүдийн нийлбэр");
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

		tooText = new JTextField();
		tooText.setBounds(350, 10, 150, 40);
		tooText.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(tooText);
		tooText.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 140, 160, 40);
		frame.getContentPane().add(textArea);
		
		JTextArea Bodlogo_oguulber = new JTextArea();
		Bodlogo_oguulber.setBounds(190, 60, 300, 800);
		frame.getContentPane().add(Bodlogo_oguulber);
		Bodlogo_oguulber.setText("RGB7509 - Массивт байгаа эсэх\r\n"
				+ "Өгагдсөн нэг хэмжээст бүхэл тоон массивт өгөгдсөн \n"
				+ " тоо байвал YES үгүй бол NO гэж хэвлэ. \n"
				+ "Таарангуут давталтыг зогсоох.\n");
		
		JButton add_btn = new JButton("Цифрүүдийн нийлбэр");
		add_btn.setBounds(10, 55, 160, 40);
		frame.getContentPane().add(add_btn);
		add_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int hemjee = Integer.parseInt(hemjeeText.getText());
				int too = Integer.parseInt(tooText.getText());
				int[] array = new int[hemjee];
				String string = arrayText.getText();
				String[] arrayString = string.split(" ");
				
				for(int i=0; i<hemjee ; i++)
					array[i] = Integer.parseInt(arrayString[i]);
				textArea.setText("hariu: " + prob.function(array, too));
			}
		});
	}
}
