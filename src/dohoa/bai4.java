package dohoa;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import donglenhchuong1.retangle;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bai4 extends JFrame {

	private JPanel contentPane;
	private JTextField textupper_x;
	private JTextField textupper_y;
	private JTextField textlower_x;
	private JTextField textlower_y;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai4 frame = new bai4();
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
	public bai4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u00EDnh chu vi v\u00E0 di\u1EC7n t\u00EDch h\u00ECnh ch\u1EEF nh\u1EADt");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 414, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Upper_x");
		lblNewLabel_1.setBounds(10, 55, 59, 27);
		contentPane.add(lblNewLabel_1);
		
		textupper_x = new JTextField();
		textupper_x.setHorizontalAlignment(SwingConstants.RIGHT);
		textupper_x.setBounds(79, 62, 86, 20);
		contentPane.add(textupper_x);
		textupper_x.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Upper_y");
		lblNewLabel_1_1.setBounds(207, 55, 59, 27);
		contentPane.add(lblNewLabel_1_1);
		
		textupper_y = new JTextField();
		textupper_y.setHorizontalAlignment(SwingConstants.RIGHT);
		textupper_y.setColumns(10);
		textupper_y.setBounds(276, 62, 86, 20);
		contentPane.add(textupper_y);
		
		JLabel lblNewLabel_1_2 = new JLabel("Lower_x");
		lblNewLabel_1_2.setBounds(10, 93, 59, 27);
		contentPane.add(lblNewLabel_1_2);
		
		textlower_x = new JTextField();
		textlower_x.setHorizontalAlignment(SwingConstants.RIGHT);
		textlower_x.setColumns(10);
		textlower_x.setBounds(79, 100, 86, 20);
		contentPane.add(textlower_x);
		
		JLabel lblNewLabel_1_3 = new JLabel("Lower_y");
		lblNewLabel_1_3.setBounds(207, 93, 59, 27);
		contentPane.add(lblNewLabel_1_3);
		
		textlower_y = new JTextField();
		textlower_y.setHorizontalAlignment(SwingConstants.RIGHT);
		textlower_y.setColumns(10);
		textlower_y.setBounds(276, 100, 86, 20);
		contentPane.add(textlower_y);
		
		JTextArea textketqua = new JTextArea();
		textketqua.setBounds(10, 164, 414, 132);
		contentPane.add(textketqua);
		
		JButton btnNewButton = new JButton("T\u00EDnh chu vi v\u00E0 di\u1EC7n t\u00EDch h\u00ECnh ch\u1EEF nh\u1EADt");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retangle hinhchunhat = new retangle(Integer.parseInt(textupper_x.getText()),
													Integer.parseInt(textupper_y.getText()),
													Integer.parseInt(textlower_x.getText()),
													Integer.parseInt(textupper_y.getText()));
				String result = "Diện tích của hình chữ nhật: " + hinhchunhat.calcArea();
				result += ";Chu vi hình chữ nhật là: " + hinhchunhat.calcPerimeter();
				textketqua.append(result);
			}
		});
		btnNewButton.setBounds(10, 131, 414, 20);
		contentPane.add(btnNewButton);
	}

}
