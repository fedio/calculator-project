package Calculatrice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Calculator {

	private JFrame frame;
	private JTextField textField;

	/*** Launch the application.*/
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 379, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setBounds(42, 41, 292, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton one = new JButton("1");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String val = one.getText();
				String temp=textField.getText();
				textField.setText(temp+=val);
			}
		});
		one.setBounds(58, 161, 51, 50);
		frame.getContentPane().add(one);
		
		JButton two = new JButton("2");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String val = two.getText();
				String temp=textField.getText();
				textField.setText(temp+=val);
			}
		});
		two.setBounds(127, 161, 51, 50);
		frame.getContentPane().add(two);
		
		JButton four = new JButton("4");
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String val = four.getText();
				String temp=textField.getText();
				textField.setText(temp+=val);
			}
		});
		four.setBounds(267, 161, 51, 50);
		frame.getContentPane().add(four);
		
		JButton three = new JButton("3");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String val = three.getText();
				String temp=textField.getText();
				textField.setText(temp+=val);
			}
		});
		three.setBounds(198, 161, 51, 50);
		frame.getContentPane().add(three);
		
		JButton five = new JButton("5");
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String val = five.getText();
				String temp=textField.getText();
				textField.setText(temp+=val);
			}
		});
		five.setBounds(58, 233, 51, 50);
		frame.getContentPane().add(five);
		
		JButton six = new JButton("6");
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String val = six.getText();
				String temp=textField.getText();
				textField.setText(temp+=val);
			}
		});
		six.setBounds(127, 233, 51, 50);
		frame.getContentPane().add(six);
		
		JButton seven = new JButton("7");
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String val = seven.getText();
				String temp=textField.getText();
				textField.setText(temp+=val);
			}
		});
		seven.setBounds(198, 233, 51, 50);
		frame.getContentPane().add(seven);
		
		JButton eight = new JButton("8");
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String val = eight.getText();
				String temp=textField.getText();
				textField.setText(temp+=val);
			}
		});
		eight.setBounds(267, 233, 51, 50);
		frame.getContentPane().add(eight);
		
		JButton nine = new JButton("9");
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String val = nine.getText();
				String temp=textField.getText();
				textField.setText(temp+=val);
			}
		});
		nine.setBounds(58, 309, 51, 50);
		frame.getContentPane().add(nine);
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String val = zero.getText();
				String temp=textField.getText();
				textField.setText(temp+=val);
			}
		});
		zero.setBounds(127, 309, 51, 50);
		frame.getContentPane().add(zero);
		
		JButton point = new JButton(".");
		point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String val = point.getText();
				String temp=textField.getText();
				textField.setText(temp+=val);
			}
		});
		point.setBounds(198, 309, 51, 50);
		frame.getContentPane().add(point);
		
		JButton equals = new JButton("=");
		equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String val = textField.getText();
				float total = 0;
				System.out.flush();
				StringTokenizer plus = new StringTokenizer(val,"+");
				while(plus.hasMoreTokens()) {
					String plusVal = plus.nextToken();
					try {
						total+=Float.parseFloat(plusVal);
						System.out.println("Done a plus: "+plusVal);
					}catch(NumberFormatException plusError) {
						System.out.println("Going to minus");
						StringTokenizer minus = new StringTokenizer(plusVal,"-");
						boolean firstInMinus = true;
						while(minus.hasMoreTokens()) {
							int countMinus = minus.countTokens();
							String minusVal = minus.nextToken();
							try {
								if(firstInMinus) {
									firstInMinus = false;
									total+=Float.parseFloat(minusVal);
									System.out.println("first in minus: "+minusVal);
								}else {
									total-=Float.parseFloat(minusVal);
									System.out.println("in minus: "+minusVal);
								}
							}catch(NumberFormatException minusError) {
								boolean totalchanged = false;
								System.out.println("Going to times");
								float timesAndDivisionTotal = 0;
								StringTokenizer times = new StringTokenizer(minusVal,"*");
								boolean firstInTimes = true;
								while(times.hasMoreTokens()) {
									String timesVal = times.nextToken();
									try {
										if(firstInTimes) {
											timesAndDivisionTotal+=Float.parseFloat(timesVal);
											System.out.println("first in times: "+timesVal);
											firstInTimes = false;
										}else {
											timesAndDivisionTotal*=Float.parseFloat(timesVal);
											System.out.println("in times: "+timesVal);
										}
									}catch(NumberFormatException timesError) {
										System.out.println("Going to division");
										StringTokenizer division = new StringTokenizer(timesVal,"/");
										boolean firstInDivision = true;
										while(division.hasMoreTokens()) {
											String divisionVal = division.nextToken();
											if(firstInDivision) {
												timesAndDivisionTotal+=Float.parseFloat(divisionVal);
												System.out.println("first in division: "+divisionVal);
												firstInDivision = false;
											}else {
												timesAndDivisionTotal/=Float.parseFloat(divisionVal);
												System.out.println("in division: "+divisionVal);
											}
										}
									}
								}
								if(countMinus==1 && total!=0 || totalchanged) {
									System.out.println("doing minus total:" +total+"and timesAndDivsionTotal: "+timesAndDivisionTotal);
									total-=timesAndDivisionTotal;
									totalchanged = true;
								}else {
									System.out.println("doing plus total:" +total+"and timesAndDivsionTotal: "+timesAndDivisionTotal);
									total+=timesAndDivisionTotal;
									totalchanged = true;
								}	
							}
						}
					}
				}
				textField.setText(""+total);
			}
		});
		equals.setBounds(267, 309, 51, 50);
		frame.getContentPane().add(equals);
		
		JButton divide = new JButton("/");
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String val = divide.getText();
				String temp=textField.getText();
				textField.setText(temp+=val);
			}
		});
		divide.setBounds(267, 101, 51, 50);
		frame.getContentPane().add(divide);
		
		JButton times = new JButton("*");
		times.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String val = times.getText();
				String temp=textField.getText();
				textField.setText(temp+=val);
			}
		});
		times.setBounds(198, 101, 51, 50);
		frame.getContentPane().add(times);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String val = minus.getText();
				String temp=textField.getText();
				textField.setText(temp+=val);
			}
		});
		minus.setBounds(127, 101, 51, 50);
		frame.getContentPane().add(minus);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String val = plus.getText();
				String temp=textField.getText();
				textField.setText(temp+=val);
			}
		});
		plus.setBounds(58, 101, 51, 50);
		frame.getContentPane().add(plus);
		
		JButton clear = new JButton("clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
			}
		});
		clear.setFont(new Font("Tahoma", Font.PLAIN, 13));
		clear.setBounds(139, 388, 92, 50);
		frame.getContentPane().add(clear);
	}
}