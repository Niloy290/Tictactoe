package tictactoe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class tictactoes {

	private JFrame frame;
	private String startGame="X";
	private int xCount=0;
	private int oCount=0;
	private JLabel btn1;
	private JLabel btn2;
	private JLabel btn3;
	private JLabel btn4;
	private JLabel btn5;
	private JLabel btn6;
	private JLabel btn8;
	private JLabel btn9;
	private JLabel btn7;
	private JTextField txtCountX;
	private JTextField txtCount0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tictactoes window = new tictactoes();
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
	public tictactoes() {
		initialize();

	}
	
	private void gameScore() {
		txtCountX.setText(String.valueOf(xCount));
		txtCount0.setText(String.valueOf(oCount));
	}
	
	private void choosePlayer() {
		
		if(startGame.equalsIgnoreCase("X"))
		{
			startGame="0";
		}
		
		else
		{
			startGame="X";
		}
	}
	
	private void winningGame() {
		String b1=btn1.getText();
		String b2=btn2.getText();
		String b3=btn3.getText();
		String b4=btn4.getText();
		String b5=btn5.getText();
		String b6=btn6.getText();
		String b7=btn7.getText();
		String b8=btn8.getText();
		String b9=btn9.getText();

		if(b1==("X") && b2==("X") && b3==("X"))
		{
			JOptionPane.showMessageDialog(frame,"X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			gameScore();
		}
		

		if(b4==("X") && b5==("X") && b6==("X"))
		{
			JOptionPane.showMessageDialog(frame,"X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			gameScore();
		}
		

		if(b7==("X") && b8==("X") && b9==("X"))
		{
			JOptionPane.showMessageDialog(frame,"X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			gameScore();
		}
		

		if(b1==("X") && b4==("X") && b7==("X"))
		{
			JOptionPane.showMessageDialog(frame,"X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			gameScore();
		}
		

		if(b2==("X") && b5==("X") && b8==("X"))
		{
			JOptionPane.showMessageDialog(frame,"X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			gameScore();
		}
		

		if(b3==("X") && b6==("X") && b9==("X"))
		{
			JOptionPane.showMessageDialog(frame,"X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			gameScore();
		}
		

		if(b1==("X") && b5==("X") && b9==("X"))
		{
			JOptionPane.showMessageDialog(frame,"X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			gameScore();
		}
		

		if(b3==("X") && b5==("X") && b7==("X"))
		{
			JOptionPane.showMessageDialog(frame,"X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			gameScore();
		}
		
		////player 0
		
		if(b1==("0") && b2==("0") && b3==("0"))
		{
			JOptionPane.showMessageDialog(frame,"0 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			gameScore();
		}
		

		if(b4==("0") && b5==("0") && b6==("0"))
		{
			JOptionPane.showMessageDialog(frame,"0 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			gameScore();
		}
		

		if(b7==("0") && b8==("0") && b9==("0"))
		{
			JOptionPane.showMessageDialog(frame,"0 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			gameScore();
		}
		

		if(b1==("0") && b4==("0") && b7==("0"))
		{
			JOptionPane.showMessageDialog(frame,"0 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			gameScore();
		}
		

		if(b2==("0") && b5==("0") && b8==("0"))
		{
			JOptionPane.showMessageDialog(frame,"0 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			gameScore();
		}
		

		if(b3==("0") && b6==("0") && b9==("0"))
		{
			JOptionPane.showMessageDialog(frame,"0 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			gameScore();
		}
		

		if(b1==("0") && b5==("0") && b9==("0"))
		{
			JOptionPane.showMessageDialog(frame,"0 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			gameScore();
		}
		

		if(b3==("0") && b5==("0") && b7==("0"))
		{
			JOptionPane.showMessageDialog(frame,"0 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			gameScore();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JButton btn1 = new JButton("");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn1.setForeground(Color.RED);
				}
				
				else
				{
					btn1.setForeground(Color.blue);
				}
				choosePlayer();
				winningGame();
			}
		});
		panel.add(btn1, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn2.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn2.setForeground(Color.RED);
				}
				
				else
				{
					btn2.setForeground(Color.blue);
				}
				choosePlayer();
				winningGame();

			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_1.add(btn2, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn3.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn3.setForeground(Color.RED);
				}
				
				else
				{
					btn3.setForeground(Color.blue);
				}
				choosePlayer();
				winningGame();

			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_2.add(btn3, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPlayerX = new JLabel("Player X");
		lblPlayerX.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_3.add(lblPlayerX, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		txtCountX = new JTextField();
		txtCountX.setHorizontalAlignment(SwingConstants.CENTER);
		txtCountX.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtCountX.setText("0");
		panel_4.add(txtCountX, BorderLayout.CENTER);
		txtCountX.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JButton btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn4.setForeground(Color.RED);
				}
				
				else
				{
					btn4.setForeground(Color.blue);
				}
				choosePlayer();
				winningGame();

			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_5.add(btn4, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn5.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn5.setForeground(Color.RED);
				}
				
				else
				{
					btn5.setForeground(Color.blue);
				}
				choosePlayer();
				winningGame();

			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_6.add(btn5, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn6.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn6.setForeground(Color.RED);
				}
				
				else
				{
					btn6.setForeground(Color.blue);
				}
				choosePlayer();
				winningGame();

			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_7.add(btn6, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPlayerY = new JLabel("Player 0");
		lblPlayerY.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_10.add(lblPlayerY, BorderLayout.CENTER);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		txtCount0 = new JTextField();
		txtCount0.setText("0");
		txtCount0.setHorizontalAlignment(SwingConstants.CENTER);
		txtCount0.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_11.add(txtCount0, BorderLayout.CENTER);
		txtCount0.setColumns(10);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JButton btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn7.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn7.setForeground(Color.RED);
				}
				
				else
				{
					btn7.setForeground(Color.blue);
				}
				choosePlayer();
				winningGame();

			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_12.add(btn7, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JButton btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn8.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn8.setForeground(Color.RED);
				}
				
				else
				{
					btn8.setForeground(Color.blue);
				}
				choosePlayer();
				winningGame();

			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_13.add(btn8, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JButton btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn9.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn9.setForeground(Color.RED);
				}
				
				else
				{
					btn9.setForeground(Color.blue);
				}
				choosePlayer();
				winningGame();

			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_14.add(btn9, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton Reset = new JButton("Reset");
		Reset.setFont(new Font("Times New Roman", Font.BOLD, 30));
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(null);
				btn2.setText(null);
				btn3.setText(null);
				btn4.setText(null);
				btn5.setText(null);
				btn6.setText(null);
				btn7.setText(null);
				btn8.setText(null);
				btn9.setText(null);
				
				//btn1.setBackground(Color.LIGHT_GRAY);
			}
		});
		panel_8.add(Reset, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JButton btnexit = new JButton("Exit");
		btnexit.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame= new JFrame("EXIT");
				if(JOptionPane.showConfirmDialog(frame, "confine if you want to exit","Tic Tac Toe",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					 System.exit(0);
				}
				
			}
		});
		panel_9.add(btnexit, BorderLayout.CENTER);
	}

}
