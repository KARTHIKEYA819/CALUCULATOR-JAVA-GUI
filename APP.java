package CALUCULATION;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.xml.bind.ParseConversionEvent;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class APP {

	private JFrame frame;
	private JTextField ANSERBAR;
	private JTextField ANSWERBAR1;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	double num,ans;
	int calucation;
	public void arithmetic_operation() {
		switch (calucation) {
		case 1: // ADDITION
			ans = num + Double.parseDouble(ANSERBAR.getText());
			ANSERBAR.setText(Double.toString(ans));
			break;
		case 2: // SUBRACTION
			ans = num - Double.parseDouble(ANSERBAR.getText());
			ANSERBAR.setText(Double.toString(ans));
			break;
		case 3: // MULTIPLICATION
			ans = num * Double.parseDouble(ANSERBAR.getText());
			ANSERBAR.setText(Double.toString(ans));
			break;
		case 4: // DIVISION
			ans = num / Double.parseDouble(ANSERBAR.getText());
			ANSERBAR.setText(Double.toString(ans));
			break;	
		
		}
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					APP window = new APP();
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
	
	public APP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 315, 447);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("          CALCULATOR");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setBounds(10, 11, 312, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 50, 312, 2);
		frame.getContentPane().add(separator);
		
		ANSERBAR = new JTextField();
		ANSERBAR.setFont(new Font("Tahoma", Font.BOLD, 30));
		ANSERBAR.setBounds(10, 73, 279, 46);
		frame.getContentPane().add(ANSERBAR);
		ANSERBAR.setColumns(10);
		
		ANSWERBAR1 = new JTextField();
		ANSWERBAR1.setBounds(224, 50, 75, 20);
		frame.getContentPane().add(ANSWERBAR1);
		ANSWERBAR1.setColumns(10);
		
		JButton BUTTON_7 = new JButton("7");
		BUTTON_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ANSERBAR.setText(ANSERBAR.getText()+"7");
			}
		});
		BUTTON_7.setFont(new Font("Tahoma", Font.BOLD, 30));
		BUTTON_7.setBounds(10, 187, 54, 46);
		frame.getContentPane().add(BUTTON_7);
		
		JButton BUTTON_4 = new JButton("4");
		BUTTON_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ANSERBAR.setText(ANSERBAR.getText()+"4");
			}
		});
		BUTTON_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		BUTTON_4.setBounds(10, 244, 54, 46);
		frame.getContentPane().add(BUTTON_4);
		
		JButton BUTTON_1 = new JButton("1");
		BUTTON_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ANSERBAR.setText(ANSERBAR.getText()+"1");
			}
		});
		BUTTON_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		BUTTON_1.setBounds(10, 301, 54, 46);
		frame.getContentPane().add(BUTTON_1);
		
		JButton BUTTON_0 = new JButton("0");
		BUTTON_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ANSERBAR.setText(ANSERBAR.getText()+"0");
			}
		});
		BUTTON_0.setFont(new Font("Tahoma", Font.BOLD, 30));
		BUTTON_0.setBounds(10, 358, 54, 46);
		frame.getContentPane().add(BUTTON_0);
		
		JButton BUTTON_AC = new JButton("AC");
		BUTTON_AC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ANSERBAR.setText(null);
				ANSWERBAR1.setText(null);
			}
		});
		BUTTON_AC.setFont(new Font("Tahoma", Font.BOLD, 23));
		BUTTON_AC.setBounds(77, 130, 72, 46);
		frame.getContentPane().add(BUTTON_AC);
		
		JButton BUTTON_8 = new JButton("8");
		BUTTON_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ANSERBAR.setText(ANSERBAR.getText()+"8");
			}
		});
		BUTTON_8.setFont(new Font("Tahoma", Font.BOLD, 30));
		BUTTON_8.setBounds(84, 187, 54, 46);
		frame.getContentPane().add(BUTTON_8);
		
		JButton BUTTON_5 = new JButton("5");
		BUTTON_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ANSERBAR.setText(ANSERBAR.getText()+"5");
			}
		});
		BUTTON_5.setFont(new Font("Tahoma", Font.BOLD, 30));
		BUTTON_5.setBounds(84, 244, 54, 46);
		frame.getContentPane().add(BUTTON_5);
		
		JButton BUTTON_2 = new JButton("2");
		BUTTON_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ANSERBAR.setText(ANSERBAR.getText()+"2");
			}
		});
		BUTTON_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		BUTTON_2.setBounds(84, 301, 54, 46);
		frame.getContentPane().add(BUTTON_2);
		
		JButton BUTTON_S5 = new JButton(".");
		BUTTON_S5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ANSERBAR.setText(ANSERBAR.getText()+".");
			}
		});
		BUTTON_S5.setFont(new Font("Tahoma", Font.BOLD, 35));
		BUTTON_S5.setBounds(84, 358, 54, 46);
		frame.getContentPane().add(BUTTON_S5);
		
		JButton BUTTON_C = new JButton("C");
		BUTTON_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int lenght = ANSERBAR.getText().length();
				int back = ANSERBAR.getText().length()-1;
				if(lenght>0) {
					StringBuilder karthik = new StringBuilder(ANSERBAR.getText());
					karthik.deleteCharAt(back);
					ANSERBAR.setText(karthik.toString());
					
				}
			}
		});
		BUTTON_C.setFont(new Font("Tahoma", Font.BOLD, 30));
		BUTTON_C.setBounds(159, 130, 54, 46);
		frame.getContentPane().add(BUTTON_C);
		
		JButton BUTTON_9 = new JButton("9");
		BUTTON_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ANSERBAR.setText(ANSERBAR.getText()+"9");
			}
		});
		BUTTON_9.setFont(new Font("Tahoma", Font.BOLD, 30));
		BUTTON_9.setBounds(159, 187, 54, 46);
		frame.getContentPane().add(BUTTON_9);
		
		JButton BUTTON_6 = new JButton("6");
		BUTTON_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ANSERBAR.setText(ANSERBAR.getText()+"6");
			}
		});
		BUTTON_6.setFont(new Font("Tahoma", Font.BOLD, 30));
		BUTTON_6.setBounds(159, 244, 54, 46);
		frame.getContentPane().add(BUTTON_6);
		
		JButton BUTTON_3 = new JButton("3");
		BUTTON_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ANSERBAR.setText(ANSERBAR.getText()+"3");
			}
		});
		BUTTON_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		BUTTON_3.setBounds(159, 301, 54, 46);
		frame.getContentPane().add(BUTTON_3);
		
		JButton BUTTON_S1 = new JButton("+");
		BUTTON_S1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(ANSERBAR.getText());
				calucation=1;
				ANSERBAR.setText(null);
				ANSWERBAR1.setText(num+"+");
				
			}
		});
		BUTTON_S1.setFont(new Font("Tahoma", Font.BOLD, 25));
		BUTTON_S1.setBounds(236, 130, 54, 46);
		frame.getContentPane().add(BUTTON_S1);
		
		JButton BUTTON_S2 = new JButton("-");
		BUTTON_S2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(ANSERBAR.getText());
				calucation=2;
				ANSERBAR.setText(null);
				ANSWERBAR1.setText(num+"-");
			}
		});
		BUTTON_S2.setFont(new Font("Tahoma", Font.BOLD, 35));
		BUTTON_S2.setBounds(235, 187, 54, 46);
		frame.getContentPane().add(BUTTON_S2);
		
		JButton BUTTON_S3 = new JButton("*");
		BUTTON_S3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(ANSERBAR.getText());
				calucation=3;
				ANSERBAR.setText(null);
				ANSWERBAR1.setText(num+"*");
			}
		});
		BUTTON_S3.setFont(new Font("Tahoma", Font.BOLD, 30));
		BUTTON_S3.setBounds(235, 244, 54, 46);
		frame.getContentPane().add(BUTTON_S3);
		
		JButton BUTTON_S4 = new JButton("/");
		BUTTON_S4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(ANSERBAR.getText());
				calucation=4;
				ANSERBAR.setText(null);
				ANSWERBAR1.setText(num+"/");
			}
		});
		BUTTON_S4.setFont(new Font("Tahoma", Font.BOLD, 30));
		BUTTON_S4.setBounds(235, 301, 54, 46);
		frame.getContentPane().add(BUTTON_S4);
		
		JButton BUTTON_TOTAL = new JButton("TOTAL");
		BUTTON_TOTAL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				arithmetic_operation();
				ANSWERBAR1.setText(null);
			}
		});
		BUTTON_TOTAL.setFont(new Font("Tahoma", Font.BOLD, 30));
		BUTTON_TOTAL.setBounds(148, 358, 141, 46);
		frame.getContentPane().add(BUTTON_TOTAL);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ANSERBAR.enable(true);
				ANSWERBAR1.enable(true);
				BUTTON_0.setEnabled(true);
				BUTTON_1.setEnabled(true);
				BUTTON_2.setEnabled(true);
				BUTTON_3.setEnabled(true);
				BUTTON_4.setEnabled(true);
				BUTTON_5.setEnabled(true);
				BUTTON_6.setEnabled(true);
				BUTTON_7.setEnabled(true);
				BUTTON_8.setEnabled(true);
				BUTTON_9.setEnabled(true);
				BUTTON_S1.setEnabled(true);
				BUTTON_S2.setEnabled(true);
				BUTTON_S3.setEnabled(true);
				BUTTON_S4.setEnabled(true);
				BUTTON_S5.setEnabled(true);
				BUTTON_TOTAL.setEnabled(true);
				BUTTON_AC.setEnabled(true);
				BUTTON_C.setEnabled(true);
				
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton.setBounds(10, 126, 61, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("OFF");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ANSERBAR.setText(null);
				ANSWERBAR1.setText(null);
				ANSERBAR.enable(false);
				ANSWERBAR1.enable(false);
				BUTTON_0.setEnabled(false);
				BUTTON_1.setEnabled(false);
				BUTTON_2.setEnabled(false);
				BUTTON_3.setEnabled(false);;
				BUTTON_4.setEnabled(false);
				BUTTON_5.setEnabled(false);
				BUTTON_6.setEnabled(false);
				BUTTON_7.setEnabled(false);
				BUTTON_8.setEnabled(false);
				BUTTON_9.setEnabled(false);
				BUTTON_S1.setEnabled(false);
				BUTTON_S2.setEnabled(false);
				BUTTON_S3.setEnabled(false);
				BUTTON_S4.setEnabled(false);
				BUTTON_S5.setEnabled(false);
				BUTTON_TOTAL.setEnabled(false);
				BUTTON_AC.setEnabled(false);
				BUTTON_C.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_1.setBounds(10, 157, 58, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
	}
}
