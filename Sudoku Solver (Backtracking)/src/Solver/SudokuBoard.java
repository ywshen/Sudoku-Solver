package Solver;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class SudokuBoard {
	
	public static int[][] board = new int[9][9];

	private JFrame frame;
	private Panel panel;
	private Panel panel_1;
	private JFormattedTextField Cell_0_0;
	private JFormattedTextField Cell_0_1;
	private JFormattedTextField Cell_0_2;
	private JFormattedTextField Cell_0_3;
	private JFormattedTextField Cell_0_4;
	private JFormattedTextField Cell_0_5;
	private JFormattedTextField Cell_0_6;
	private JFormattedTextField Cell_0_7;
	private JFormattedTextField Cell_0_8;
	private JFormattedTextField Cell_1_0;
	private JFormattedTextField Cell_1_1;
	private JFormattedTextField Cell_1_2;
	private JFormattedTextField Cell_1_3;
	private JFormattedTextField Cell_1_4;
	private JFormattedTextField Cell_1_5;
	private JFormattedTextField Cell_1_6;
	private JFormattedTextField Cell_1_7;
	private JFormattedTextField Cell_1_8;
	private JFormattedTextField Cell_2_0;
	private JFormattedTextField Cell_2_1;
	private JFormattedTextField Cell_2_2;
	private JFormattedTextField Cell_2_3;
	private JFormattedTextField Cell_2_4;
	private JFormattedTextField Cell_2_5;
	private JFormattedTextField Cell_2_6;
	private JFormattedTextField Cell_2_7;
	private JFormattedTextField Cell_2_8;
	private JFormattedTextField Cell_3_0;
	private JFormattedTextField Cell_3_1;
	private JFormattedTextField Cell_3_2;
	private JFormattedTextField Cell_3_3;
	private JFormattedTextField Cell_3_4;
	private JFormattedTextField Cell_3_5;
	private JFormattedTextField Cell_3_6;
	private JFormattedTextField Cell_3_7;
	private JFormattedTextField Cell_3_8;
	private JFormattedTextField Cell_4_0;
	private JFormattedTextField Cell_4_1;
	private JFormattedTextField Cell_4_2;
	private JFormattedTextField Cell_4_3;
	private JFormattedTextField Cell_4_4;
	private JFormattedTextField Cell_4_5;
	private JFormattedTextField Cell_4_6;
	private JFormattedTextField Cell_4_7;
	private JFormattedTextField Cell_4_8;
	private JFormattedTextField Cell_5_0;
	private JFormattedTextField Cell_5_1;
	private JFormattedTextField Cell_5_2;
	private JFormattedTextField Cell_5_3;
	private JFormattedTextField Cell_5_4;
	private JFormattedTextField Cell_5_5;
	private JFormattedTextField Cell_5_6;
	private JFormattedTextField Cell_5_7;
	private JFormattedTextField Cell_5_8;
	private JFormattedTextField Cell_6_0;
	private JFormattedTextField Cell_6_1;
	private JFormattedTextField Cell_6_2;
	private JFormattedTextField Cell_6_3;
	private JFormattedTextField Cell_6_4;
	private JFormattedTextField Cell_6_5;
	private JFormattedTextField Cell_6_6;
	private JFormattedTextField Cell_6_7;
	private JFormattedTextField Cell_6_8;
	private JFormattedTextField Cell_7_0;
	private JFormattedTextField Cell_7_1;
	private JFormattedTextField Cell_7_2;
	private JFormattedTextField Cell_7_3;
	private JFormattedTextField Cell_7_4;
	private JFormattedTextField Cell_7_5;
	private JFormattedTextField Cell_7_6;
	private JFormattedTextField Cell_7_7;
	private JFormattedTextField Cell_7_8;
	private JFormattedTextField Cell_8_0;
	private JFormattedTextField Cell_8_1;
	private JFormattedTextField Cell_8_2;
	private JFormattedTextField Cell_8_3;
	private JFormattedTextField Cell_8_4;
	private JFormattedTextField Cell_8_5;
	private JFormattedTextField Cell_8_6;
	private JFormattedTextField Cell_8_7;
	private JFormattedTextField Cell_8_8;
	private JFormattedTextField [][] field = new JFormattedTextField[9][9];
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SudokuBoard window = new SudokuBoard();
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
	public SudokuBoard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setSize(new Dimension(630, 700));
		frame.getContentPane().setPreferredSize(new Dimension(630, 700));
		frame.setBounds(100, 100, 640, 749);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		panel_1 = new Panel();
		panel_1.setSize(new Dimension(630, 630));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 9, 0, 0));
		
		Cell_0_0 = new JFormattedTextField();
		Cell_0_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[0][0] =Integer.parseInt(Cell_0_0.getText());
			}
		});
		panel_1.add(Cell_0_0);
		
		Cell_0_1 = new JFormattedTextField();
		Cell_0_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[0][1] =Integer.parseInt(Cell_0_1.getText());
			}
		});
		panel_1.add(Cell_0_1);
		
		Cell_0_2 = new JFormattedTextField();
		Cell_0_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[0][2] =Integer.parseInt(Cell_0_2.getText());
			}
		});
		panel_1.add(Cell_0_2);
		
		Cell_0_3 = new JFormattedTextField();
		Cell_0_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[0][3] =Integer.parseInt(Cell_0_3.getText());
			}
		});
		panel_1.add(Cell_0_3);
		
		Cell_0_4 = new JFormattedTextField();
		Cell_0_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[0][4] =Integer.parseInt(Cell_0_4.getText());
			}
		});
		panel_1.add(Cell_0_4);
		
		Cell_0_5 = new JFormattedTextField();
		Cell_0_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[0][5] =Integer.parseInt(Cell_0_5.getText());
			}
		});
		panel_1.add(Cell_0_5);
		
		Cell_0_6 = new JFormattedTextField();
		Cell_0_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[0][6] =Integer.parseInt(Cell_0_6.getText());
			}
		});
		panel_1.add(Cell_0_6);
		
		Cell_0_7 = new JFormattedTextField();
		Cell_0_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[0][7] =Integer.parseInt(Cell_0_7.getText());
			}
		});
		panel_1.add(Cell_0_7);
		
		Cell_0_8 = new JFormattedTextField();
		Cell_0_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[0][8] =Integer.parseInt(Cell_0_8.getText());
			}
		});
		panel_1.add(Cell_0_8);
		
		Cell_1_0 = new JFormattedTextField();
		Cell_1_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[1][0] =Integer.parseInt(Cell_1_0.getText());
			}
		});
		panel_1.add(Cell_1_0);
		
		Cell_1_1 = new JFormattedTextField();
		Cell_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[1][1] =Integer.parseInt(Cell_1_1.getText());
			}
		});
		panel_1.add(Cell_1_1);
		
		Cell_1_2 = new JFormattedTextField();
		Cell_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[1][2] =Integer.parseInt(Cell_1_2.getText());
			}
		});
		panel_1.add(Cell_1_2);
		
		Cell_1_3 = new JFormattedTextField();
		Cell_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[1][3] =Integer.parseInt(Cell_1_3.getText());
			}
		});
		panel_1.add(Cell_1_3);
		
		Cell_1_4 = new JFormattedTextField();
		Cell_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[1][4] =Integer.parseInt(Cell_1_4.getText());
			}
		});
		panel_1.add(Cell_1_4);
		
		Cell_1_5 = new JFormattedTextField();
		Cell_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[1][5] =Integer.parseInt(Cell_1_5.getText());
			}
		});
		panel_1.add(Cell_1_5);
		
		Cell_1_6 = new JFormattedTextField();
		Cell_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[1][6] =Integer.parseInt(Cell_1_6.getText());
			}
		});
		panel_1.add(Cell_1_6);
		
		Cell_1_7 = new JFormattedTextField();
		Cell_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[1][7] =Integer.parseInt(Cell_1_7.getText());
			}
		});
		panel_1.add(Cell_1_7);
		
		Cell_1_8 = new JFormattedTextField();
		Cell_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[1][8] =Integer.parseInt(Cell_1_8.getText());
			}
		});
		panel_1.add(Cell_1_8);
		
		Cell_2_0 = new JFormattedTextField();
		Cell_2_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[2][0] =Integer.parseInt(Cell_2_0.getText());
			}
		});
		panel_1.add(Cell_2_0);
		
		Cell_2_1 = new JFormattedTextField();
		Cell_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[2][1] =Integer.parseInt(Cell_2_1.getText());
			}
		});
		panel_1.add(Cell_2_1);
		
		Cell_2_2 = new JFormattedTextField();
		Cell_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[2][2] =Integer.parseInt(Cell_2_2.getText());
			}
		});
		panel_1.add(Cell_2_2);
		
		Cell_2_3 = new JFormattedTextField();
		Cell_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[2][3] =Integer.parseInt(Cell_2_3.getText());
			}
		});
		panel_1.add(Cell_2_3);
		
		Cell_2_4 = new JFormattedTextField();
		Cell_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[2][4] =Integer.parseInt(Cell_2_4.getText());
			}
		});
		panel_1.add(Cell_2_4);
		
		Cell_2_5 = new JFormattedTextField();
		Cell_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[2][5] =Integer.parseInt(Cell_2_5.getText());
			}
		});
		panel_1.add(Cell_2_5);
		
		Cell_2_6 = new JFormattedTextField();
		Cell_2_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[2][6] =Integer.parseInt(Cell_2_6.getText());
			}
		});
		panel_1.add(Cell_2_6);
		
		Cell_2_7 = new JFormattedTextField();
		Cell_2_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[2][7] =Integer.parseInt(Cell_2_7.getText());
			}
		});
		panel_1.add(Cell_2_7);
		
		Cell_2_8 = new JFormattedTextField();
		Cell_2_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[2][8] =Integer.parseInt(Cell_2_8.getText());
			}
		});
		panel_1.add(Cell_2_8);
		
		Cell_3_0 = new JFormattedTextField();
		Cell_3_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[3][0] =Integer.parseInt(Cell_3_0.getText());
			}
		});
		panel_1.add(Cell_3_0);
		
		Cell_3_1 = new JFormattedTextField();
		Cell_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[3][1] =Integer.parseInt(Cell_3_1.getText());
			}
		});
		panel_1.add(Cell_3_1);
		
		Cell_3_2 = new JFormattedTextField();
		Cell_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[3][2] =Integer.parseInt(Cell_3_2.getText());
			}
		});
		panel_1.add(Cell_3_2);
		
		Cell_3_3 = new JFormattedTextField();
		Cell_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[3][3] =Integer.parseInt(Cell_3_3.getText());
			}
		});
		panel_1.add(Cell_3_3);
		
		Cell_3_4 = new JFormattedTextField();
		Cell_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[3][4] =Integer.parseInt(Cell_3_4.getText());
			}
		});
		panel_1.add(Cell_3_4);
		
		Cell_3_5 = new JFormattedTextField();
		Cell_3_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[3][5] =Integer.parseInt(Cell_3_5.getText());
			}
		});
		panel_1.add(Cell_3_5);
		
		Cell_3_6 = new JFormattedTextField();
		Cell_3_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[3][6] =Integer.parseInt(Cell_3_6.getText());
			}
		});
		panel_1.add(Cell_3_6);
		
		Cell_3_7 = new JFormattedTextField();
		Cell_3_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[3][7] =Integer.parseInt(Cell_3_7.getText());
			}
		});
		panel_1.add(Cell_3_7);
		
		Cell_3_8 = new JFormattedTextField();
		Cell_3_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[3][8] =Integer.parseInt(Cell_3_8.getText());
			}
		});
		panel_1.add(Cell_3_8);
		
		Cell_4_0 = new JFormattedTextField();
		Cell_4_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[4][0] =Integer.parseInt(Cell_4_0.getText());
			}
		});
		panel_1.add(Cell_4_0);
		
		Cell_4_1 = new JFormattedTextField();
		Cell_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[4][1] =Integer.parseInt(Cell_4_1.getText());
			}
		});
		panel_1.add(Cell_4_1);
		
		Cell_4_2 = new JFormattedTextField();
		Cell_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[4][2] =Integer.parseInt(Cell_4_2.getText());
			}
		});
		panel_1.add(Cell_4_2);
		
		Cell_4_3 = new JFormattedTextField();
		Cell_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[4][3] =Integer.parseInt(Cell_4_3.getText());
			}
		});
		panel_1.add(Cell_4_3);
		
		Cell_4_4 = new JFormattedTextField();
		Cell_4_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[4][4] =Integer.parseInt(Cell_4_4.getText());
			}
		});
		panel_1.add(Cell_4_4);
		
		Cell_4_5 = new JFormattedTextField();
		Cell_4_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[4][5] =Integer.parseInt(Cell_4_5.getText());
			}
		});
		panel_1.add(Cell_4_5);
		
		Cell_4_6 = new JFormattedTextField();
		Cell_4_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[4][6] =Integer.parseInt(Cell_4_6.getText());
			}
		});
		panel_1.add(Cell_4_6);
		
		Cell_4_7 = new JFormattedTextField();
		Cell_4_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[4][7] =Integer.parseInt(Cell_4_7.getText());
			}
		});
		panel_1.add(Cell_4_7);
		
		Cell_4_8 = new JFormattedTextField();
		Cell_4_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[4][8] =Integer.parseInt(Cell_4_8.getText());
			}
		});
		panel_1.add(Cell_4_8);
		
		Cell_5_0 = new JFormattedTextField();
		Cell_5_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[5][0] =Integer.parseInt(Cell_5_0.getText());
			}
		});
		panel_1.add(Cell_5_0);
		
		Cell_5_1 = new JFormattedTextField();
		Cell_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[5][1] =Integer.parseInt(Cell_5_1.getText());
			}
		});
		panel_1.add(Cell_5_1);
		
		Cell_5_2 = new JFormattedTextField();
		Cell_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[5][2] =Integer.parseInt(Cell_5_2.getText());
			}
		});
		panel_1.add(Cell_5_2);
		
		Cell_5_3 = new JFormattedTextField();
		Cell_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[5][3] =Integer.parseInt(Cell_5_3.getText());
			}
		});
		panel_1.add(Cell_5_3);
		
		Cell_5_4 = new JFormattedTextField();
		Cell_5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[5][4] =Integer.parseInt(Cell_5_4.getText());
			}
		});
		panel_1.add(Cell_5_4);
		
		Cell_5_5 = new JFormattedTextField();
		Cell_5_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[5][5] =Integer.parseInt(Cell_5_5.getText());
			}
		});
		panel_1.add(Cell_5_5);
		
		Cell_5_6 = new JFormattedTextField();
		Cell_5_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[5][6] =Integer.parseInt(Cell_5_6.getText());
			}
		});
		panel_1.add(Cell_5_6);
		
		Cell_5_7 = new JFormattedTextField();
		Cell_5_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[5][7] =Integer.parseInt(Cell_5_7.getText());
			}
		});
		panel_1.add(Cell_5_7);
		
		Cell_5_8 = new JFormattedTextField();
		Cell_5_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[5][8] =Integer.parseInt(Cell_5_8.getText());
			}
		});
		panel_1.add(Cell_5_8);
		
		Cell_6_0 = new JFormattedTextField();
		Cell_6_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[6][0] =Integer.parseInt(Cell_6_0.getText());
			}
		});
		panel_1.add(Cell_6_0);
		
		Cell_6_1 = new JFormattedTextField();
		Cell_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[6][1] =Integer.parseInt(Cell_6_1.getText());
			}
		});
		panel_1.add(Cell_6_1);
		
		Cell_6_2 = new JFormattedTextField();
		Cell_6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[6][2] =Integer.parseInt(Cell_6_2.getText());
			}
		});
		panel_1.add(Cell_6_2);
		
		Cell_6_3 = new JFormattedTextField();
		Cell_6_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[6][3] =Integer.parseInt(Cell_6_3.getText());
			}
		});
		panel_1.add(Cell_6_3);
		
		Cell_6_4 = new JFormattedTextField();
		Cell_6_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[6][4] =Integer.parseInt(Cell_6_4.getText());
			}
		});
		panel_1.add(Cell_6_4);
		
		Cell_6_5 = new JFormattedTextField();
		Cell_6_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[6][5] =Integer.parseInt(Cell_6_5.getText());
			}
		});
		panel_1.add(Cell_6_5);
		
		Cell_6_6 = new JFormattedTextField();
		Cell_6_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[6][6] =Integer.parseInt(Cell_6_6.getText());
			}
		});
		panel_1.add(Cell_6_6);
		
		Cell_6_7 = new JFormattedTextField();
		Cell_6_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[6][7] =Integer.parseInt(Cell_6_7.getText());
			}
		});
		panel_1.add(Cell_6_7);
		
		Cell_6_8 = new JFormattedTextField();
		Cell_6_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[6][8] =Integer.parseInt(Cell_6_8.getText());
			}
		});
		panel_1.add(Cell_6_8);
		
		Cell_7_0 = new JFormattedTextField();
		Cell_7_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[7][0] =Integer.parseInt(Cell_7_0.getText());
			}
		});
		panel_1.add(Cell_7_0);
		
		Cell_7_1 = new JFormattedTextField();
		Cell_7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[7][1] =Integer.parseInt(Cell_7_1.getText());
			}
		});
		panel_1.add(Cell_7_1);
		
		Cell_7_2 = new JFormattedTextField();
		Cell_7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[7][2] =Integer.parseInt(Cell_7_2.getText());
			}
		});
		panel_1.add(Cell_7_2);
		
		Cell_7_3 = new JFormattedTextField();
		Cell_7_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[7][3] =Integer.parseInt(Cell_7_3.getText());
			}
		});
		panel_1.add(Cell_7_3);
		
		Cell_7_4 = new JFormattedTextField();
		Cell_7_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[7][4] =Integer.parseInt(Cell_7_4.getText());
			}
		});
		panel_1.add(Cell_7_4);
		
		Cell_7_5 = new JFormattedTextField();
		Cell_7_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[7][5] =Integer.parseInt(Cell_7_5.getText());
			}
		});
		panel_1.add(Cell_7_5);
		
		Cell_7_6 = new JFormattedTextField();
		Cell_7_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[7][6] =Integer.parseInt(Cell_7_6.getText());
			}
		});
		panel_1.add(Cell_7_6);
		
		Cell_7_7 = new JFormattedTextField();
		Cell_7_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[7][7] =Integer.parseInt(Cell_7_7.getText());
			}
		});
		panel_1.add(Cell_7_7);
		
		Cell_7_8 = new JFormattedTextField();
		Cell_7_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[7][8] =Integer.parseInt(Cell_7_8.getText());
			}
		});
		panel_1.add(Cell_7_8);
		
		Cell_8_0 = new JFormattedTextField();
		Cell_8_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[8][0] =Integer.parseInt(Cell_8_0.getText());
			}
		});
		panel_1.add(Cell_8_0);
		
		Cell_8_1 = new JFormattedTextField();
		Cell_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[8][1] =Integer.parseInt(Cell_8_1.getText());
			}
		});
		panel_1.add(Cell_8_1);
		
		Cell_8_2 = new JFormattedTextField();
		Cell_8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[8][2] =Integer.parseInt(Cell_8_2.getText());
			}
		});
		panel_1.add(Cell_8_2);
		
		Cell_8_3 = new JFormattedTextField();
		Cell_8_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[8][3] =Integer.parseInt(Cell_8_3.getText());
			}
		});
		panel_1.add(Cell_8_3);
		
		Cell_8_4 = new JFormattedTextField();
		Cell_8_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[8][4] =Integer.parseInt(Cell_8_4.getText());
			}
		});
		panel_1.add(Cell_8_4);
		
		Cell_8_5 = new JFormattedTextField();
		Cell_8_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[8][5] =Integer.parseInt(Cell_8_5.getText());
			}
		});
		panel_1.add(Cell_8_5);
		
		Cell_8_6 = new JFormattedTextField();
		Cell_8_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[8][6] =Integer.parseInt(Cell_8_6.getText());
			}
		});
		panel_1.add(Cell_8_6);
		
		Cell_8_7 = new JFormattedTextField();
		Cell_8_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[8][7] =Integer.parseInt(Cell_8_7.getText());
			}
		});
		panel_1.add(Cell_8_7);
		
		Cell_8_8 = new JFormattedTextField();
		Cell_8_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board[8][8] =Integer.parseInt(Cell_8_8.getText());
			}
		});
		panel_1.add(Cell_8_8);
		
		field[0][0] = Cell_0_0;
		field[0][1] = Cell_0_1;
		field[0][2] = Cell_0_2;
		field[0][3] = Cell_0_3;
		field[0][4] = Cell_0_4;
		field[0][5] = Cell_0_5;
		field[0][6] = Cell_0_6;
		field[0][7] = Cell_0_7;
		field[0][8] = Cell_0_8;
		field[1][0] = Cell_1_0;
		field[1][1] = Cell_1_1;
		field[1][2] = Cell_1_2;
		field[1][3] = Cell_1_3;
		field[1][4] = Cell_1_4;
		field[1][5] = Cell_1_5;
		field[1][6] = Cell_1_6;
		field[1][7] = Cell_1_7;
		field[1][8] = Cell_1_8;
		field[2][0] = Cell_2_0;
		field[2][1] = Cell_2_1;
		field[2][2] = Cell_2_2;
		field[2][3] = Cell_2_3;
		field[2][4] = Cell_2_4;
		field[2][5] = Cell_2_5;
		field[2][6] = Cell_2_6;
		field[2][7] = Cell_2_7;
		field[2][8] = Cell_2_8;
		field[3][0] = Cell_3_0;
		field[3][1] = Cell_3_1;
		field[3][2] = Cell_3_2;
		field[3][3] = Cell_3_3;
		field[3][4] = Cell_3_4;
		field[3][5] = Cell_3_5;
		field[3][6] = Cell_3_6;
		field[3][7] = Cell_3_7;
		field[3][8] = Cell_3_8;
		field[4][0] = Cell_4_0;
		field[4][1] = Cell_4_1;
		field[4][2] = Cell_4_2;
		field[4][3] = Cell_4_3;
		field[4][4] = Cell_4_4;
		field[4][5] = Cell_4_5;
		field[4][6] = Cell_4_6;
		field[4][7] = Cell_4_7;
		field[4][8] = Cell_4_8;
		field[5][0] = Cell_5_0;
		field[5][1] = Cell_5_1;
		field[5][2] = Cell_5_2;
		field[5][3] = Cell_5_3;
		field[5][4] = Cell_5_4;
		field[5][5] = Cell_5_5;
		field[5][6] = Cell_5_6;
		field[5][7] = Cell_5_7;
		field[5][8] = Cell_5_8;
		field[6][0] = Cell_6_0;
		field[6][1] = Cell_6_1;
		field[6][2] = Cell_6_2;
		field[6][3] = Cell_6_3;
		field[6][4] = Cell_6_4;
		field[6][5] = Cell_6_5;
		field[6][6] = Cell_6_6;
		field[6][7] = Cell_6_7;
		field[6][8] = Cell_6_8;
		field[7][0] = Cell_7_0;
		field[7][1] = Cell_7_1;
		field[7][2] = Cell_7_2;
		field[7][3] = Cell_7_3;
		field[7][4] = Cell_7_4;
		field[7][5] = Cell_7_5;
		field[7][6] = Cell_7_6;
		field[7][7] = Cell_7_7;
		field[7][8] = Cell_7_8;
		field[8][0] = Cell_8_0;
		field[8][1] = Cell_8_1;
		field[8][2] = Cell_8_2;
		field[8][3] = Cell_8_3;
		field[8][4] = Cell_8_4;
		field[8][5] = Cell_8_5;
		field[8][6] = Cell_8_6;
		field[8][7] = Cell_8_7;
		field[8][8] = Cell_8_8;
		
		for (int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				field[i][j].setHorizontalAlignment(JFormattedTextField.CENTER);
				field[i][j].setFont(field[i][j].getFont().deriveFont(Font.BOLD, 20f));
			}
		}
		
		panel = new Panel();
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Solve");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setAction(action);
		btnNewButton.setBounds(212, 647, 204, 62);
		
		panel.add(btnNewButton);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Solve");
			putValue(SHORT_DESCRIPTION, "Solve Sudoku");
		}
		public void actionPerformed(ActionEvent e) {
			solver.solve(board);
			for (int i=0; i<9; i++) {
				for (int j=0; j<9; j++) {
					field[i][j].setText(Integer.toString(board[i][j]));
					field[i][j].setEditable(false);
				}
			}
			solver.PrintBoard(board);
		}
	}
}
