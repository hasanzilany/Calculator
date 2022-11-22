import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton btnSin;
	private JButton btnLog;
	private JButton btnLn;
	private JButton btnDel;
	double firstnum=0.0, secondnum=0.0, result=0.0;
	String operations="", answer="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 422, 313);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 386, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(10, 72, 48, 95);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + button.getText();
				textField.setText(EnterNumber);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(63, 72, 54, 50);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_1.getText();
				textField.setText(EnterNumber);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_1.setBounds(127, 72, 54, 50);
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + button_2.getText();
				textField.setText(EnterNumber);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_2.setBounds(191, 72, 54, 50);
		frame.getContentPane().add(button_2);
		
		button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_3.getText();
				textField.setText(EnterNumber);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_3.setBounds(63, 125, 54, 50);
		frame.getContentPane().add(button_3);
		
		button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + button_4.getText();
				textField.setText(EnterNumber);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_4.setBounds(127, 125, 54, 50);
		frame.getContentPane().add(button_4);
		
		button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_5.getText();
				textField.setText(EnterNumber);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_5.setBounds(191, 125, 55, 50);
		frame.getContentPane().add(button_5);
		
		button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_6.getText();
				textField.setText(EnterNumber);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_6.setBounds(255, 125, 54, 50);
		frame.getContentPane().add(button_6);
		
		button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_7.getText();
				textField.setText(EnterNumber);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_7.setBounds(63, 178, 54, 50);
		frame.getContentPane().add(button_7);
		
		button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_8.getText();
				textField.setText(EnterNumber);
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_8.setBounds(127, 178, 54, 50);
		frame.getContentPane().add(button_8);
		
		button_9 = new JButton("0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_9.getText();
				textField.setText(EnterNumber);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_9.setBounds(191, 178, 54, 50);
		frame.getContentPane().add(button_9);
		
		button_10 = new JButton(".");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_10.getText();
				textField.setText(EnterNumber);
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_10.setBounds(255, 178, 54, 50);
		frame.getContentPane().add(button_10);
		
		button_11 = new JButton("=");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				if(operations=="sin") {
					result = Math.sin(firstnum);
					answer=String.format("%2f", result);
					textField.setText(answer);
				}
				
				
				
				
				
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_11.setBounds(10, 178, 48, 50);
		frame.getContentPane().add(button_11);
		
		btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations="sin";
				String answer;
				if(operations=="sin") {
					result = Math.sin(Math.toRadians(firstnum));
					
					answer=String.format("%.4f", result);
					textField.setText(answer);
				}

				
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSin.setBounds(313, 72, 83, 50);
		frame.getContentPane().add(btnSin);
		
		btnLog = new JButton("log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations="log";
				
				if(operations=="log") {
					result = Math.log10(firstnum);
					
					answer=String.format("%.4f", result);
					textField.setText(answer);
				}
				
				
				
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLog.setBounds(313, 125, 83, 50);
		frame.getContentPane().add(btnLog);
		
		btnLn = new JButton("ln");
		btnLn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations="ln";
				if(operations=="ln") {
					result = Math.log(firstnum)/Math.log(Math.E);
					
					answer=String.format("%.4f", result);
					textField.setText(answer);
				}
				
				
			}
		});
		btnLn.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLn.setBounds(313, 178, 83, 50);
		frame.getContentPane().add(btnLn);
		
		btnDel = new JButton("d");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				
				if(textField.getText().length()>0) {
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() -1);
					backspace=strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnDel.setToolTipText("<-\r\n");
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDel.setBounds(255, 72, 54, 50);
		frame.getContentPane().add(btnDel);
	}
}
