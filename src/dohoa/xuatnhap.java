package dohoa;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class xuatnhap extends JFrame {

	private JPanel contentPane;
	private JTextField txthoten;
	private JTextField txtsonguyen;
	private JTextField txtsothuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					xuatnhap frame = new xuatnhap();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public xuatnhap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nh\u1EADp h\u1ECD t\u00EAn:");
		lblNewLabel.setBounds(10, 11, 73, 26);
		contentPane.add(lblNewLabel);
		
		txthoten = new JTextField();
		txthoten.setBounds(93, 14, 341, 20);
		contentPane.add(txthoten);
		txthoten.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("S\u1ED1 nguy\u00EAn:");
		lblNewLabel_1.setBounds(10, 48, 63, 20);
		contentPane.add(lblNewLabel_1);
		
		txtsonguyen = new JTextField();
		txtsonguyen.setHorizontalAlignment(SwingConstants.RIGHT);
		txtsonguyen.setBounds(93, 48, 86, 20);
		contentPane.add(txtsonguyen);
		txtsonguyen.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("S\u1ED1 th\u1EF1c:");
		lblNewLabel_2.setBounds(10, 79, 63, 20);
		contentPane.add(lblNewLabel_2);
		
		txtsothuc = new JTextField();
		txtsothuc.setHorizontalAlignment(SwingConstants.RIGHT);
		txtsothuc.setBounds(93, 79, 86, 20);
		contentPane.add(txtsothuc);
		txtsothuc.setColumns(10);
		
		JTextArea txtketqua = new JTextArea();
		txtketqua.setBounds(10, 110, 414, 140);
		contentPane.add(txtketqua);
		
		JButton btnnhap = new JButton("Nh\u1EADp");
		btnnhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result = txthoten.getText();
				int a = Integer.parseInt(txtsonguyen.getText());
				double b = Double.parseDouble(txtsothuc.getText());
				result = result + "; Số nguyên = " + a + "; Số thực = " + b;
				txtketqua.append(result);
			}
		});
		btnnhap.setBounds(220, 45, 89, 54);
		contentPane.add(btnnhap);
		
		
	}
}
