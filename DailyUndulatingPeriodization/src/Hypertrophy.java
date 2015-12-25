import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hypertrophy extends JFrame {

	//declare variables
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
	 * This method gets the value stored in weight in the DUPGUI main class
	 * @return the value stored in weight of the main class
	 */
	public String passUnit()
	{
		return DUPGUI.unit;
	}

	/**
	 * Create the frame.
	 */
	public Hypertrophy() {
		setTitle("Hypertrophy");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 382);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("sets x reps");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(68, 48, 80, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("sets x reps");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(178, 48, 80, 14);
		contentPane.add(label_1);
		
		JLabel lblChooseSetsReps = new JLabel("Choose a set/rep range:");
		lblChooseSetsReps.setFont(new Font("Vani", Font.BOLD, 22));
		lblChooseSetsReps.setBounds(20, 13, 294, 49);
		contentPane.add(lblChooseSetsReps);
		
		JLabel label_3 = new JLabel("for a:");
		label_3.setFont(new Font("Vani", Font.BOLD, 16));
		label_3.setBounds(214, 234, 60, 60);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("You should use:");
		label_4.setFont(new Font("Vani", Font.BOLD, 16));
		label_4.setBounds(10, 234, 157, 60);
		contentPane.add(label_4);
		
		JLabel lblCalculation = new JLabel("");
		lblCalculation.setForeground(new Color(204, 0, 204));
		lblCalculation.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCalculation.setBounds(145, 224, 80, 70);
		contentPane.add(lblCalculation);
		
		JLabel lblSetsReps = new JLabel("");
		lblSetsReps.setForeground(new Color(204, 0, 204));
		lblSetsReps.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblSetsReps.setBounds(262, 224, 42, 70);
		contentPane.add(lblSetsReps);
		
		JButton btn3x10 = new JButton("3x10");
		btn3x10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Perform Calculation and display what the user has chosen
				calculate = passValue() * .70;
				lblCalculation.setText(String.format("%.0f", calculate) + " " + passUnit());
				lblSetsReps.setText("3x10.");
			}
		});
		btn3x10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn3x10.setBounds(59, 73, 89, 41);
		contentPane.add(btn3x10);
		
		JButton btn3x12 = new JButton("3x12");
		btn3x12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Perform Calculation and display what the user has chosen
				calculate = passValue() * .6;
				lblCalculation.setText(String.format("%.0f", calculate) + " " + passUnit());
				lblSetsReps.setText("3x12.");
			}
		});
		btn3x12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn3x12.setBounds(169, 73, 89, 41);
		contentPane.add(btn3x12);
		
		JButton btn4x8 = new JButton("4x8");
		btn4x8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Perform Calculation and display what the user has chosen
				calculate = passValue() * .7;
				lblCalculation.setText(String.format("%.0f", calculate) + " " + passUnit());
				lblSetsReps.setText("4x8.");
			}
		});
		btn4x8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn4x8.setBounds(59, 125, 89, 41);
		contentPane.add(btn4x8);
		
		JButton btn4x10 = new JButton("4x10");
		btn4x10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Perform Calculation and display what the user has chosen
				calculate = passValue() * .6;
				lblCalculation.setText(String.format("%.0f", calculate) + " " + passUnit());
				lblSetsReps.setText("4x10.");
			}
		});
		btn4x10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn4x10.setBounds(169, 125, 89, 41);
		contentPane.add(btn4x10);
		
		JButton btn4x12 = new JButton("4x12");
		btn4x12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Perform Calculation and display what the user has chosen
				calculate = passValue() * .55;
				lblCalculation.setText(String.format("%.0f", calculate) + " " + passUnit());
				lblSetsReps.setText("4x12.");
			}
		});
		btn4x12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn4x12.setBounds(59, 177, 89, 41);
		contentPane.add(btn4x12);
		
		JButton btn5x6 = new JButton("5x6");
		btn5x6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Perform Calculation and display what the user has chosen
				calculate = passValue() * .75;
				lblCalculation.setText(String.format("%.0f", calculate) + " " + passUnit());
				lblSetsReps.setText("5x6.");
			}
		});
		btn5x6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn5x6.setBounds(169, 177, 89, 41);
		contentPane.add(btn5x6);
		
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
				//Close this window and show the Template window
				{
				dispose();
				Template showTemplate = new Template();
				showTemplate.setVisible(true);
				}
			}
		});
		btnChoose.setBackground(new Color(0, 255, 0));
		btnChoose.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnChoose.setBounds(113, 294, 89, 39);
		contentPane.add(btnChoose);
		
		
	}

}
