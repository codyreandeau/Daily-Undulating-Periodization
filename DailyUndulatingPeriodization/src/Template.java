import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTable;

public class Template extends JFrame {

	//declare variables
	private JPanel contentPane;
	/*These variables will hold the text of each appropriate label to
	 * ensure that data isn't lost when switching between JFrames
	 */
	public static String holdSquatStrength;
	public static String holdSquatPower;
	public static String holdSquatHypertrophy;
	public static String holdBenchStrength;
	public static String holdBenchPower;
	public static String holdBenchHypertrophy;
	public static String holdDeadliftStrength;
	public static String holdDeadliftPower;
	public static String holdDeadliftHypertrophy;
	
	/**
	 * Create the frame.
	 */
	public Template() {
		setTitle("Your Template");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 541);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDay = new JLabel("Day 1:");
		lblDay.setForeground(new Color(102, 0, 0));
		lblDay.setFont(new Font("Vani", Font.BOLD, 22));
		lblDay.setBounds(10, 29, 84, 49);
		contentPane.add(lblDay);
		
		JLabel lblDay_1 = new JLabel("Day 2:");
		lblDay_1.setForeground(new Color(102, 0, 0));
		lblDay_1.setFont(new Font("Vani", Font.BOLD, 22));
		lblDay_1.setBounds(10, 150, 84, 49);
		contentPane.add(lblDay_1);
		
		JLabel lblDay_2 = new JLabel("Day 3:");
		lblDay_2.setForeground(new Color(102, 0, 0));
		lblDay_2.setFont(new Font("Vani", Font.BOLD, 22));
		lblDay_2.setBounds(10, 281, 84, 49);
		contentPane.add(lblDay_2);
		
		JLabel lblSquat = new JLabel("- Squat:");
		lblSquat.setFont(new Font("Vani", Font.BOLD, 16));
		lblSquat.setBounds(33, 54, 74, 60);
		contentPane.add(lblSquat);
		
		JLabel lblSquat_1 = new JLabel("- Squat:");
		lblSquat_1.setFont(new Font("Vani", Font.BOLD, 16));
		lblSquat_1.setBounds(33, 177, 74, 60);
		contentPane.add(lblSquat_1);
		
		JLabel lblSquat_2 = new JLabel("- Squat:");
		lblSquat_2.setFont(new Font("Vani", Font.BOLD, 16));
		lblSquat_2.setBounds(33, 308, 74, 60);
		contentPane.add(lblSquat_2);
		
		JLabel lblBench = new JLabel("- Bench:");
		lblBench.setFont(new Font("Vani", Font.BOLD, 16));
		lblBench.setBounds(33, 85, 74, 60);
		contentPane.add(lblBench);
		
		JLabel lblBench_1 = new JLabel("- Bench:");
		lblBench_1.setFont(new Font("Vani", Font.BOLD, 16));
		lblBench_1.setBounds(33, 210, 86, 60);
		contentPane.add(lblBench_1);
		
		JLabel lblBench_2 = new JLabel("- Bench:");
		lblBench_2.setFont(new Font("Vani", Font.BOLD, 16));
		lblBench_2.setBounds(33, 341, 86, 60);
		contentPane.add(lblBench_2);
		
		JLabel lblDeadlift = new JLabel("- Deadlift:");
		lblDeadlift.setFont(new Font("Vani", Font.BOLD, 16));
		lblDeadlift.setBounds(21, 117, 95, 60);
		contentPane.add(lblDeadlift);
		
		JLabel lblDeadlift_1 = new JLabel("- Deadlift:");
		lblDeadlift_1.setFont(new Font("Vani", Font.BOLD, 16));
		lblDeadlift_1.setBounds(21, 237, 95, 71);
		contentPane.add(lblDeadlift_1);
		
		JLabel lblDeadlift_2 = new JLabel("- Deadlift:");
		lblDeadlift_2.setFont(new Font("Vani", Font.BOLD, 16));
		lblDeadlift_2.setBounds(21, 371, 95, 60);
		contentPane.add(lblDeadlift_2);
		
		JLabel lblSquatPower = new JLabel("");
		lblSquatPower.setForeground(new Color(204, 0, 204));
		lblSquatPower.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblSquatPower.setBounds(104, 54, 148, 52);
		contentPane.add(lblSquatPower);
		
		JLabel lblBenchStrength = new JLabel("");
		lblBenchStrength.setForeground(new Color(255, 51, 0));
		lblBenchStrength.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblBenchStrength.setBounds(114, 91, 138, 39);
		contentPane.add(lblBenchStrength);
		
		JLabel lblDeadliftHypertrophy = new JLabel("");
		lblDeadliftHypertrophy.setForeground(new Color(0, 102, 0));
		lblDeadliftHypertrophy.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblDeadliftHypertrophy.setBounds(114, 117, 148, 49);
		contentPane.add(lblDeadliftHypertrophy);
		
		JLabel lblSquatHypertrophy = new JLabel("");
		lblSquatHypertrophy.setForeground(new Color(204, 0, 204));
		lblSquatHypertrophy.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblSquatHypertrophy.setBounds(104, 177, 162, 49);
		contentPane.add(lblSquatHypertrophy);
		
		JLabel lblBenchPower = new JLabel("");
		lblBenchPower.setForeground(new Color(255, 51, 0));
		lblBenchPower.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblBenchPower.setBounds(114, 218, 162, 39);
		contentPane.add(lblBenchPower);
		
		JLabel lblDeadliftStrength = new JLabel("");
		lblDeadliftStrength.setForeground(new Color(0, 102, 0));
		lblDeadliftStrength.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblDeadliftStrength.setBounds(114, 247, 162, 39);
		contentPane.add(lblDeadliftStrength);
		
		JLabel lblSquatStrength = new JLabel("");
		lblSquatStrength.setForeground(new Color(204, 0, 204));
		lblSquatStrength.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblSquatStrength.setBounds(104, 308, 162, 52);
		contentPane.add(lblSquatStrength);
		
		JLabel lblBenchHypertrophy = new JLabel("");
		lblBenchHypertrophy.setForeground(new Color(255, 51, 0));
		lblBenchHypertrophy.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblBenchHypertrophy.setBounds(114, 347, 148, 39);
		contentPane.add(lblBenchHypertrophy);
		
		JLabel lblDeadliftPower = new JLabel("");
		lblDeadliftPower.setForeground(new Color(0, 102, 0));
		lblDeadliftPower.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblDeadliftPower.setBounds(118, 371, 148, 49);
		contentPane.add(lblDeadliftPower);
		
		//If the "Squat" button was clicked, fill the appropriate labels.
		if (Intensity.squatClick >= 1 )
		{
			lblSquatPower.setText(Power.setsReps + " @" + Power.weight);
			holdSquatPower = lblSquatPower.getText();
			lblSquatHypertrophy.setText(Hypertrophy.setsReps + " @" + Hypertrophy.weight);
			holdSquatHypertrophy = lblSquatHypertrophy.getText();
			lblSquatStrength.setText(Strength.setsReps + " @" + Strength.weight);
			holdSquatStrength = lblSquatStrength.getText();
			Intensity.squatClick = 0;
		}
		
		//If the "Bench" button was clicked, fill the appropriate labels. 
		if (Intensity.benchClick >= 1)
		{
			lblBenchHypertrophy.setText(Power.setsReps + " @" + Power.weight);
			holdBenchPower = lblBenchHypertrophy.getText();
			lblBenchPower.setText(Hypertrophy.setsReps + " @" + Hypertrophy.weight);
			holdBenchHypertrophy = lblBenchPower.getText();
			lblBenchStrength.setText(Strength.setsReps + " @" + Strength.weight);
			holdBenchStrength = lblBenchStrength.getText();
			Intensity.benchClick = 0;
		}
		
		//If the "Deadlift" button was clicked, fill the appropriate labels.
		if (Intensity.deadliftClick >= 1)
		{
			lblDeadliftStrength.setText(Power.setsReps + " @" + Power.weight);
			holdDeadliftPower = lblDeadliftStrength.getText();
			lblDeadliftHypertrophy.setText(Hypertrophy.setsReps + " @" + Hypertrophy.weight);
			holdDeadliftHypertrophy = lblDeadliftHypertrophy.getText();
			lblDeadliftPower.setText(Strength.setsReps + " @" + Strength.weight);
			holdDeadliftStrength = lblDeadliftPower.getText();
			Intensity.deadliftClick = 0;
		}
		
		//Set text to appropriate labels when the page loads
		lblSquatPower.setText(holdSquatPower);
		lblSquatStrength.setText(holdSquatStrength);
		lblSquatHypertrophy.setText(holdSquatHypertrophy);
		lblBenchHypertrophy.setText(holdBenchPower);
		lblBenchStrength.setText(holdBenchStrength);
		lblBenchPower.setText(holdBenchHypertrophy);
		lblDeadliftStrength.setText(holdDeadliftPower);
		lblDeadliftPower.setText(holdDeadliftStrength);
		lblDeadliftHypertrophy.setText(holdDeadliftHypertrophy);
		
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setBackground(new Color(102, 255, 51));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Allow user to return to the home page to enter another one rep max for another lift
				dispose();
				DUPGUI homePage = new DUPGUI();
				homePage.frmDailyUndulatingPeriodization.setVisible(true);
			}
		});
		btnNewButton.setBounds(300, 337, 111, 61);
		contentPane.add(btnNewButton);
		
		JLabel lblTo = new JLabel("<html>To enter a one rep max for another lift, and to set up a Set/Rep scheme for that lift, click here.</html>");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTo.setVerticalAlignment(SwingConstants.TOP);
		lblTo.setToolTipText("");
		lblTo.setBounds(278, 262, 162, 83);
		contentPane.add(lblTo);
		
		JLabel lblNote = new JLabel("<html>-Note* Your days do not necessarily need to be set up in this way. Feel free to switch up this template and experiment to find out what works best for you.</html>");
		lblNote.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNote.setVerticalAlignment(SwingConstants.TOP);
		lblNote.setToolTipText("");
		lblNote.setBounds(267, 16, 173, 183);
		contentPane.add(lblNote);
		
		JLabel lblOptions = new JLabel("<html>Take a screen shot, or save template in a .txt file by clicking this button ---></html>");
		lblOptions.setForeground(new Color(102, 0, 0));
		lblOptions.setFont(new Font("Vani", Font.BOLD, 18));
		lblOptions.setBounds(10, 428, 354, 64);
		contentPane.add(lblOptions);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Allow user to save their template to a text file
				String filename = "DUP.txt";
				
				PrintWriter writer;
				try {
					writer = new PrintWriter(filename);
					writer.println("Your DUP Template");
					writer.println("-----------------");
					writer.println("Day 1:");
					writer.println(holdSquatPower + " - Squat");
					writer.println(holdBenchStrength + " - Bench");
					writer.println(holdDeadliftHypertrophy + " - Deadlift");
					writer.println();
					writer.println("Day 2:");
					writer.println(holdSquatHypertrophy + " - Squat");
					writer.println(holdBenchPower + " - Bench");
					writer.println(holdDeadliftStrength + " - Deadlift");
					writer.println();
					writer.println("Day 3:");
					writer.println(holdSquatStrength + " - Squat");
					writer.println(holdBenchHypertrophy + " - Bench");
					writer.println(holdDeadliftPower + " - Deadlift");
					writer.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnSave.setBackground(new Color(255, 153, 102));
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSave.setBounds(366, 431, 74, 61);
		contentPane.add(btnSave);
		
	}
}
