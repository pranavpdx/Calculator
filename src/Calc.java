import java.awt.EventQueue;

import javax.swing.JFrame;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;

import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;

public class Calc {

	public JFrame frame;
	public String firstNumber = "";
	public String secondNumber = "";
	public String fNum = "";
	public String operator;
	public int num = 0;
	public boolean CanClick = true;
	public int times = 0;
	public boolean sign = true;
	public boolean show = true;
	public int color = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frame.setVisible(true);
	
				} catch (Exception e) {
					System.out.println("ERROR<< ERROR<< ERROR");
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 153, 102));
		frame.setBounds(100, 100, 450, 681);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		Label result = new Label("");
		result.setForeground(Color.WHITE);
		result.setBackground(Color.BLACK);
		result.setFont(new Font("Segoe UI", Font.BOLD, 24));
		result.setBounds(10, 88, 412, 159);
		frame.getContentPane().add(result);

		Button addButton = new Button("+");
		addButton.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		addButton.setForeground(Color.YELLOW);
		addButton.setBackground(new Color(153, 102, 204));
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					if (CanClick == true && times == 0 && !firstNumber.equals("")) {
						fNum = fNum.concat(firstNumber);
						fNum = fNum.concat(" + ");
						result.setText(fNum);
						num = 1;
						times = 1;
					}
				} catch (Exception e) {
					result.setText("Input value is not in integer format");
					return;
				}

			}
		});
		addButton.setBounds(353, 289, 79, 24);
		frame.getContentPane().add(addButton);

		Button subtractButton = new Button("-");
		subtractButton.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		subtractButton.setForeground(Color.YELLOW);
		subtractButton.setBackground(new Color(153, 102, 204));
		subtractButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					if (CanClick == true && times == 0 && !firstNumber.equals("")) {
						fNum = fNum.concat(firstNumber);
						fNum = fNum.concat(" - ");
						result.setText(fNum);
						num = 2;
						times = 1;
					}
				} catch (Exception f) {
					result.setText("Input value is not in integer format");
					return;
				}
			}
		});
		subtractButton.setBounds(353, 346, 79, 24);
		frame.getContentPane().add(subtractButton);

		Button multiplybutton = new Button("x");
		multiplybutton.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		multiplybutton.setForeground(Color.YELLOW);
		multiplybutton.setBackground(new Color(153, 102, 204));
		multiplybutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					if (CanClick == true && times == 0 && !firstNumber.equals("")) {
						fNum = fNum.concat(firstNumber);
						fNum = fNum.concat(" * ");
						result.setText(fNum);
						num = 3;
						times = 1;
					}

				} catch (Exception f) {
					result.setText("Input value is not in integer format");
					return;
				}

			}
		});
		multiplybutton.setBounds(353, 410, 79, 24);
		frame.getContentPane().add(multiplybutton);

		Button dividebutton = new Button("/");
		dividebutton.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		dividebutton.setForeground(Color.YELLOW);
		dividebutton.setBackground(new Color(153, 102, 204));
		dividebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					if (CanClick == true && times == 0 && !firstNumber.equals("")) {
						fNum = fNum.concat(firstNumber);
						fNum = fNum.concat(" / ");
						result.setText(fNum);
						num = 4;
						times = 1;
					}

				} catch (Exception f) {
					result.setText("Input value is not in integer format");
					return;
				}
			}
		});
		dividebutton.setBounds(353, 475, 79, 24);
		frame.getContentPane().add(dividebutton);

		JLabel lblCalculator = new JLabel("Calculator");
		lblCalculator.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblCalculator.setBounds(29, 24, 280, 32);
		frame.getContentPane().add(lblCalculator);

		Button button1 = new Button("1");
		button1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		button1.setForeground(Color.YELLOW);
		button1.setBackground(Color.BLUE);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num == 0) {
					firstNumber = firstNumber.concat("1");
					result.setText(firstNumber);
				} else {
					if (CanClick == true) {
						secondNumber = secondNumber.concat("1");
						result.setText(fNum + secondNumber);
					}
				}
			}
		});
		button1.setBounds(29, 322, 79, 24);
		frame.getContentPane().add(button1);

		Button button2 = new Button("2");
		button2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		button2.setForeground(Color.YELLOW);
		button2.setBackground(Color.BLUE);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num == 0) {
					firstNumber = firstNumber.concat("2");
					result.setText(firstNumber);
				} else {
					if (CanClick == true) {
						secondNumber = secondNumber.concat("2");
						result.setText(fNum + secondNumber);
					}
				}
			}
		});
		button2.setBounds(149, 322, 79, 24);
		frame.getContentPane().add(button2);

		Button button3 = new Button("3");
		button3.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		button3.setForeground(Color.YELLOW);
		button3.setBackground(Color.BLUE);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num == 0) {
					firstNumber = firstNumber.concat("3");
					result.setText(firstNumber);
				} else {
					if (CanClick == true) {
						secondNumber = secondNumber.concat("3");
						result.setText(fNum + secondNumber);
					}
				}
			}
		});
		button3.setBounds(268, 322, 79, 24);
		frame.getContentPane().add(button3);

		Button button4 = new Button("4");
		button4.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		button4.setForeground(Color.YELLOW);
		button4.setBackground(Color.BLUE);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num == 0) {
					firstNumber = firstNumber.concat("4");
					result.setText(firstNumber);
				} else {
					if (CanClick == true) {
						secondNumber = secondNumber.concat("4");
						result.setText(fNum + secondNumber);
					}
				}
			}
		});
		button4.setBounds(29, 380, 79, 24);
		frame.getContentPane().add(button4);

		Button button5 = new Button("5");
		button5.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		button5.setForeground(Color.YELLOW);
		button5.setBackground(Color.BLUE);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num == 0) {
					firstNumber = firstNumber.concat("5");
					result.setText(firstNumber);
				} else {
					if (CanClick == true) {
						secondNumber = secondNumber.concat("5");
						result.setText(fNum + secondNumber);
					}
				}
			}
		});
		button5.setBounds(149, 380, 79, 24);
		frame.getContentPane().add(button5);

		Button button6 = new Button("6");
		button6.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		button6.setForeground(Color.YELLOW);
		button6.setBackground(Color.BLUE);
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num == 0) {
					firstNumber = firstNumber.concat("6");
					result.setText(firstNumber);
				} else {
					if (CanClick == true) {
						secondNumber = secondNumber.concat("6");
						result.setText(fNum + secondNumber);
					}
				}
			}
		});
		button6.setBounds(268, 380, 79, 24);
		frame.getContentPane().add(button6);

		Button button7 = new Button("7");
		button7.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		button7.setForeground(Color.YELLOW);
		button7.setBackground(Color.BLUE);
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num == 0) {
					firstNumber = firstNumber.concat("7");
					result.setText(firstNumber);
				} else {
					if (CanClick == true) {
						secondNumber = secondNumber.concat("7");
						result.setText(fNum + secondNumber);
					}
				}
			}
		});
		button7.setBounds(29, 445, 79, 24);
		frame.getContentPane().add(button7);

		Button button8 = new Button("8");
		button8.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		button8.setForeground(Color.YELLOW);
		button8.setBackground(Color.BLUE);
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num == 0) {
					firstNumber = firstNumber.concat("8");
					result.setText(firstNumber);
				} else {
					if (CanClick == true) {
						secondNumber = secondNumber.concat("8");
						result.setText(fNum + secondNumber);
					}
				}
			}
		});
		button8.setBounds(151, 445, 79, 24);
		frame.getContentPane().add(button8);

		Button button9 = new Button("9");
		button9.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		button9.setForeground(Color.YELLOW);
		button9.setBackground(Color.BLUE);
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num == 0) {
					firstNumber = firstNumber.concat("9");
					result.setText(firstNumber);
				} else {
					if (CanClick == true) {
						secondNumber = secondNumber.concat("9");
						result.setText(fNum + secondNumber);
					}
				}
			}
		});
		button9.setBounds(268, 445, 79, 24);
		frame.getContentPane().add(button9);

		Button button0 = new Button("0");
		button0.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		button0.setForeground(Color.YELLOW);
		button0.setBackground(Color.BLUE);
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num == 0) {
					firstNumber = firstNumber.concat("0");
					result.setText(firstNumber);
				} else {
					if (CanClick == true) {
						secondNumber = secondNumber.concat("0");
						result.setText(fNum + secondNumber);
					}
				}
			}
		});
		button0.setBounds(151, 505, 79, 24);
		frame.getContentPane().add(button0);

		Button buttonE = new Button("=");
		buttonE.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		buttonE.setForeground(Color.YELLOW);
		buttonE.setBackground(new Color(153, 102, 204));
		buttonE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!secondNumber.equals("")) {
					if (num == 1) {
						int firstNum = Integer.parseInt(firstNumber);
						int secondNum = Integer.parseInt(secondNumber);
						int answer = firstNum + secondNum;
						result.setText(fNum + secondNum + " = " + answer);
						CanClick = false;

					} else if (num == 2) {
						int firstNum = Integer.parseInt(firstNumber);
						int secondNum = Integer.parseInt(secondNumber);
						int answer = firstNum - secondNum;
						result.setText(fNum + secondNum + " = " + answer);
						CanClick = false;
					} else if (num == 3) {
						int firstNum = Integer.parseInt(firstNumber);
						int secondNum = Integer.parseInt(secondNumber);
						int answer = firstNum * secondNum;
						result.setText(fNum + secondNum + " = " + answer);
						CanClick = false;
					} else if (num == 4) {
						int firstNum = Integer.parseInt(firstNumber);
						int secondNum = Integer.parseInt(secondNumber);
						if (secondNum == 0) {
							result.setText(fNum + secondNum + " = " + "UNDEFINED");
						} else {
							double answer = (double) firstNum / (double) secondNum;
							result.setText(fNum + secondNum + " = " + answer);
							CanClick = false;
						}
					}
				}
			}
		});
		buttonE.setBounds(353, 558, 79, 24);
		frame.getContentPane().add(buttonE);

		Button buttonAC = new Button("Clear");
		buttonAC.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		buttonAC.setForeground(Color.YELLOW);
		buttonAC.setBackground(new Color(153, 102, 204));
		buttonAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText("");
				firstNumber = "";
				secondNumber = "";
				fNum = "";
				num = 0;
				CanClick = true;
				times = 0;

			}
		});
		buttonAC.setBounds(10, 558, 79, 24);
		frame.getContentPane().add(buttonAC);

		Button buttonplus = new Button("+/-");
		buttonplus.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		buttonplus.setForeground(Color.YELLOW);
		buttonplus.setBackground(new Color(153, 102, 204));
		buttonplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CanClick == true) {
					if (num == 0) {
					if (!firstNumber.equals("")) {
						
							firstNumber = Integer.toString(Integer.parseInt(firstNumber) * -1);
							result.setText(firstNumber);
						}
					} else {
						if (!secondNumber.equals("")) {
							secondNumber = Integer.toString(Integer.parseInt(secondNumber) * -1);
							result.setText(fNum + secondNumber);
						}
					}
				}
			}

		});
		buttonplus.setBounds(0, 289, 79, 24);
		frame.getContentPane().add(buttonplus);

		Button buttonhelp = new Button("HELP");
		buttonhelp.setForeground(Color.YELLOW);
		buttonhelp.setBackground(new Color(153, 204, 153));
		buttonhelp.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 15));
		buttonhelp.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null,
						"Hello and welcome to Pranav's Calucator. Its pretty basic and you can only operate on 2 numbers with the four basic operations yet I hope you enjoy:) ");
			}
		});
		buttonhelp.setBounds(315, 10, 107, 24);
		frame.getContentPane().add(buttonhelp);

		Button button = new Button("Change Color");
		button.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		button.setForeground(Color.YELLOW);
		button.setBackground(new Color(153, 204, 153));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				if (color == 1) {
					frame.getContentPane().setBackground(Color.CYAN);
					color = color + 1;
				} else if (color == 2) {
					frame.getContentPane().setBackground(Color.ORANGE);
					color++;
				} else if (color == 3) {
					frame.getContentPane().setBackground(Color.LIGHT_GRAY);
					color++;
				} else {
					frame.getContentPane().setBackground(Color.GREEN);
					color = 1;
				}}catch(Exception f) {
					result.setText("ERROR");
				}

			}
		});
		System.out.println("Hello");
		button.setBounds(315, 40, 107, 24);
		frame.getContentPane().add(button);
	}

}
