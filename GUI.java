//Name: Carson Lee
//Date: July 31, 2021
//Description: Scientific calculator GUI

package calculator_project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class GUI {

	private JFrame frame;
	private JTextField textField;
	private JButton btnEight;
	private JButton btnNine;
	private JButton btnDivision;
	private JButton btnFour;
	private JButton btnOne;
	private JButton btnZero;
	private JButton btnFive;
	private JButton btnSix;
	private JButton btnTwo;
	private JButton btnDot;
	private JButton btnEqual;
	private JButton btnThree;
	private JButton btnMultiplication;
	private JButton btnSubtraction;
	private JButton btnAddition;
	private JButton btnBack;
	private JButton btnClear;
	private JButton btnDoubleZero;
	private JButton btnMod;
	
	double first;
	double second;
	double result;
	String operation; 
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 384, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 348, 58);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSeven = new JButton("7");
		btnSeven.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String number = textField.getText() + btnSeven.getText();
			textField.setText(number);
			}
		});
		btnSeven.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSeven.setBounds(10, 148, 86, 71);
		frame.getContentPane().add(btnSeven);
		
		btnEight = new JButton("8");
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnEight.getText();
				textField.setText(number);
			}
		});
		btnEight.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEight.setBounds(94, 148, 86, 71);
		frame.getContentPane().add(btnEight);
		
		btnNine = new JButton("9");
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNine.getText();
				textField.setText(number);
			}
		});
		btnNine.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNine.setBounds(182, 148, 86, 71);
		frame.getContentPane().add(btnNine);
		
		btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDivision.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivision.setBounds(272, 148, 86, 71);
		frame.getContentPane().add(btnDivision);
		
		btnFour = new JButton("4");
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnFour.getText();
				textField.setText(number);
			}
		});
		btnFour.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnFour.setBounds(10, 219, 86, 71);
		frame.getContentPane().add(btnFour);
		
		btnOne = new JButton("1");
		btnOne.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnOne.getText();
				textField.setText(number);
			}
		});
		btnOne.setBounds(10, 292, 86, 71);
		frame.getContentPane().add(btnOne);
		
		btnZero = new JButton("0");
		btnZero.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnZero.getText();
				textField.setText(number);
			}
		});
		btnZero.setBounds(10, 363, 86, 71);
		frame.getContentPane().add(btnZero);
		
		btnFive = new JButton("5");
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnFive.getText();
				textField.setText(number);
			}
		});
		btnFive.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnFive.setBounds(94, 219, 86, 71);
		frame.getContentPane().add(btnFive);
		
		btnSix = new JButton("6");
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnSix.getText();
				textField.setText(number);
			}
		});
		btnSix.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSix.setBounds(182, 219, 86, 71);
		frame.getContentPane().add(btnSix);
		
		btnTwo = new JButton("2");
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnTwo.getText();
				textField.setText(number);
			}
		});
		btnTwo.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnTwo.setBounds(94, 292, 86, 71);
		frame.getContentPane().add(btnTwo);
		
		btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setBounds(94, 363, 86, 71);
		frame.getContentPane().add(btnDot);
		
		btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second = Double.parseDouble(textField.getText());
				if(operation == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if(operation == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if(operation == "/") {
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if(operation == "x") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if(operation == "%") {
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(182, 363, 86, 71);
		frame.getContentPane().add(btnEqual);
		
		btnThree = new JButton("3");
		btnThree.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnThree.getText();
				textField.setText(number);
			}
		});
		btnThree.setBounds(182, 292, 86, 71);
		frame.getContentPane().add(btnThree);
		
		btnMultiplication = new JButton("x");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "x";
			}
		});
		btnMultiplication.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMultiplication.setBounds(272, 219, 86, 71);
		frame.getContentPane().add(btnMultiplication);
		
		btnSubtraction = new JButton("-");
		btnSubtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnSubtraction.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSubtraction.setBounds(272, 292, 86, 71);
		frame.getContentPane().add(btnSubtraction);
		
		btnAddition = new JButton("+");
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnAddition.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAddition.setBounds(272, 363, 86, 71);
		frame.getContentPane().add(btnAddition);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBack.setBounds(10, 80, 86, 71);
		frame.getContentPane().add(btnBack);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(94, 80, 86, 71);
		frame.getContentPane().add(btnClear);
		
		btnDoubleZero = new JButton("00");
		btnDoubleZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnDoubleZero.getText();
				textField.setText(number);
			}
		});
		btnDoubleZero.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDoubleZero.setBounds(182, 80, 86, 71);
		frame.getContentPane().add(btnDoubleZero);
		
		btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMod.setBounds(272, 80, 86, 71);
		frame.getContentPane().add(btnMod);
	}
}
