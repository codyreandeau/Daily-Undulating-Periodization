import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Power extends JFrame {

	//Declare variables
	private JPanel contentPane;
	public double calculate; //hold the value of the weight calculation
	public static String weight; //hold the value of the weight in a string format
	public static String setsReps; //hold the value of Sets X Reps in a string format
	
	/**
	 * This method gets the value stored in weight in the DUPGUI main class
	 * @return the value stored in weight of the main class
	 */
	public double passValue()
	{
		return DUPGUI.weight;
	}
	
	/**
	 * This method gets the string stored in the unit variable from the DUPGUI main class
	 * @return the value stored in unit of the main class
	 */
	public String passUnit()
	{
		return DUPGUI.unit;
	}

	/**
	 * Create the frame.
	 */
	public Power() {
		setTitle("Power");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 336, 431);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSetsXReps = new JLabel("sets x reps");
		lblSetsXReps.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSetsXReps.setBounds(65, 48, 80, 14);
		contentPane.add(lblSetsXReps);
		
		JLabel label = new JLabel("sets x reps");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(175, 48, 80, 14);
		contentPane.add(label);
		
		JLabel lblChooseASetrep = new JLabel("Set up your 'Power' day:");
		lblChooseASetrep.setFont(new Font("Vani", Font.BOLD, 22));
		lblChooseASetrep.setBounds(20, 11, 294, 49);
		contentPane.add(lblChooseASetrep);
		
		JLabel lblSetsReps = new JLabel("");
		lblSetsReps.setForeground(new Color(204, 0, 204));
		lblSetsReps.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblSetsReps.setBounds(255, 272, 42, 70);
		contentPane.add(lblSetsReps);
		
		JLabel lblForA = new JLabel("for a:");
		lblForA.setFont(new Font("Vani", Font.BOLD, 16));
		lblForA.setBounds(208, 282, 60, 60);
		contentPane.add(lblForA);
		
		JLabel lblCalculation = new JLabel("");
		lblCalculation.setForeground(new Color(204, 0, 204));
		lblCalculation.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCalculation.setBounds(146, 272, 80, 70);
		contentPane.add(lblCalculation);
		
		JLabel lblYouShouldUse = new JLabel("You should use:");
		lblYouShouldUse.setFont(new Font("Vani", Font.BOLD, 16));
		lblYouShouldUse.setBounds(10, 282, 157, 60);
		contentPane.add(lblYouShouldUse);
		
		JButton btn3x2 = new JButton("3x2");
		btn3x2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Perform Calculation and display what the user has chosen
				calculate = passValue() * .9;
				lblCalculation.setText(String.format("%.0f", calculate) + " " + passUnit());
				lblSetsReps.setText("3x2.");
				}
		});
		btn3x2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn3x2.setBounds(56, 73, 89, 41);
		contentPane.add(btn3x2);
		
		JButton btn3x3 = new JButton("3x3");
		btn3x3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Perform Calculation and display what the user has chosen
				calculate = passValue() * .85;
				lblCalculation.setText(String.format("%.0f", calculate) + " " + passUnit());
				lblSetsReps.setText("3x3.");
			}
		});
		btn3x3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn3x3.setBounds(166, 73, 89, 41);
		contentPane.add(btn3x3);
		
		JButton btn4x2 = new JButton("4x2");
		btn4x2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Perform Calculation and display what the user has chosen
				calculate = passValue() * .85;
				lblCalculation.setText(String.format("%.0f", calculate) + " " + passUnit());
				lblSetsReps.setText("4x2.");
			}
		});
		btn4x2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn4x2.setBounds(56, 125, 89, 41);
		contentPane.add(btn4x2);
		
		JButton btn4x3 = new JButton("4x3");
		btn4x3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Perform Calculation and display what the user has chosen
				calculate = passValue() * .82;
				lblCalculation.setText(String.format("%.0f", calculate) + " " + passUnit());
				lblSetsReps.setText("4x3.");
			}
		});
		btn4x3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn4x3.setBounds(166, 125, 89, 41);
		contentPane.add(btn4x3);
		
		JButton btn5x1 = new JButton("5x1");
		btn5x1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Perform Calculation and display what the user has chosen
				calculate = passValue() * .9;
				lblCalculation.setText(String.format("%.0f", calculate) + " " + passUnit());
				lblSetsReps.setText("5x1.");
			}
		});
		btn5x1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn5x1.setBounds(56, 177, 89, 41);
		contentPane.add(btn5x1);
		
		JButton btn5x2 = new JButton("5x2");
		btn5x2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Perform Calculation and display what the user has chosen
				calculate = passValue() * .85;
				lblCalculation.setText(String.format("%.0f", calculate) + " " + passUnit());
				lblSetsReps.setText("5x2.");
			}
		});
		btn5x2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn5x2.setBounds(166, 177, 89, 41);
		contentPane.add(btn5x2);
		
		JButton btn5x3 = new JButton("5x3");
		btn5x3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Perform Calculation and display what the user has chosen
				calculate = passValue() * .8;
				lblCalculation.setText(String.format("%.0f", calculate) + " " + passUnit());
				lblSetsReps.setText("5x3.");
			}
		});
		btn5x3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn5x3.setBounds(56, 229, 89, 41);
		contentPane.add(btn5x3);
		
		JButton btn6x2 = new JButton("6x2");
		btn6x2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Perform Calculation and display what the user has chosen
				calculate = passValue() * .82;
				lblCalculation.setText(String.format("%.0f", calculate) + " " + passUnit());
				lblSetsReps.setText("6x2.");
			}
		});
		btn6x2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn6x2.setBounds(166, 229, 89, 41);
		contentPane.add(btn6x2);
		
		JButton btnChoose = new JButton("Choose");
		//Listen for "Enter" button
		contentPane.getRootPane().setDefaultButton(btnChoose);
		btnChoose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Store the string within the calculation label in the weight variable
				weight = lblCalculation.getText();
				//Store the string within the setsReps label in the setsReps variable
				setsReps = lblSetsReps.getText();
				//Check if user made a selection
				if (weight == "")
				{
					JOptionPane.showMessageDialog(null, "Please choose a Set/Rep range.");
				}
				else
				{
				//Close this window and show the Strength window
				dispose();
				Strength showStrength = new Strength();
				showStrength.setVisible(true);
				}
			}
		});
		btnChoose.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnChoose.setBackground(Color.GREEN);
		btnChoose.setBounds(107, 343, 89, 39);
		contentPane.add(btnChoose);
		
	}
}
