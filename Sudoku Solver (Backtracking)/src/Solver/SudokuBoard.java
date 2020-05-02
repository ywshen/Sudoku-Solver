package Solver;

import java.awt.EventQueue;

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

public class SudokuBoard {

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
		frame.setBounds(100, 100, 630, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		panel_1 = new Panel();
		panel_1.setSize(new Dimension(630, 630));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 9, 0, 0));
		
		Cell_0_0 = new JFormattedTextField();
		panel_1.add(Cell_0_0);
		Cell_0_0.setValue(1);
		
		Cell_0_1 = new JFormattedTextField();
		panel_1.add(Cell_0_1);
		
		Cell_0_2 = new JFormattedTextField();
		panel_1.add(Cell_0_2);
		
		Cell_0_3 = new JFormattedTextField();
		panel_1.add(Cell_0_3);
		
		Cell_0_4 = new JFormattedTextField();
		panel_1.add(Cell_0_4);
		
		Cell_0_5 = new JFormattedTextField();
		panel_1.add(Cell_0_5);
		
		Cell_0_6 = new JFormattedTextField();
		panel_1.add(Cell_0_6);
		
		Cell_0_7 = new JFormattedTextField();
		panel_1.add(Cell_0_7);
		
		Cell_0_8 = new JFormattedTextField();
		panel_1.add(Cell_0_8);
		
		Cell_1_0 = new JFormattedTextField();
		panel_1.add(Cell_1_0);
		
		Cell_1_1 = new JFormattedTextField();
		panel_1.add(Cell_1_1);
		
		Cell_1_2 = new JFormattedTextField();
		panel_1.add(Cell_1_2);
		
		Cell_1_3 = new JFormattedTextField();
		panel_1.add(Cell_1_3);
		
		Cell_1_4 = new JFormattedTextField();
		panel_1.add(Cell_1_4);
		
		Cell_1_5 = new JFormattedTextField();
		panel_1.add(Cell_1_5);
		
		Cell_1_6 = new JFormattedTextField();
		panel_1.add(Cell_1_6);
		
		Cell_1_7 = new JFormattedTextField();
		panel_1.add(Cell_1_7);
		
		Cell_1_8 = new JFormattedTextField();
		panel_1.add(Cell_1_8);
		
		Cell_2_0 = new JFormattedTextField();
		panel_1.add(Cell_2_0);
		
		Cell_2_1 = new JFormattedTextField();
		panel_1.add(Cell_2_1);
		
		Cell_2_2 = new JFormattedTextField();
		panel_1.add(Cell_2_2);
		
		Cell_2_3 = new JFormattedTextField();
		panel_1.add(Cell_2_3);
		
		Cell_2_4 = new JFormattedTextField();
		panel_1.add(Cell_2_4);
		
		Cell_2_5 = new JFormattedTextField();
		panel_1.add(Cell_2_5);
		
		Cell_2_6 = new JFormattedTextField();
		panel_1.add(Cell_2_6);
		
		Cell_2_7 = new JFormattedTextField();
		panel_1.add(Cell_2_7);
		
		Cell_2_8 = new JFormattedTextField();
		panel_1.add(Cell_2_8);
		
		Cell_3_0 = new JFormattedTextField();
		panel_1.add(Cell_3_0);
		
		Cell_3_1 = new JFormattedTextField();
		panel_1.add(Cell_3_1);
		
		Cell_3_2 = new JFormattedTextField();
		panel_1.add(Cell_3_2);
		
		Cell_3_3 = new JFormattedTextField();
		panel_1.add(Cell_3_3);
		
		Cell_3_4 = new JFormattedTextField();
		panel_1.add(Cell_3_4);
		
		Cell_3_5 = new JFormattedTextField();
		panel_1.add(Cell_3_5);
		
		Cell_3_6 = new JFormattedTextField();
		panel_1.add(Cell_3_6);
		
		Cell_3_7 = new JFormattedTextField();
		panel_1.add(Cell_3_7);
		
		Cell_3_8 = new JFormattedTextField();
		panel_1.add(Cell_3_8);
		
		Cell_4_0 = new JFormattedTextField();
		panel_1.add(Cell_4_0);
		
		Cell_4_1 = new JFormattedTextField();
		panel_1.add(Cell_4_1);
		
		Cell_4_2 = new JFormattedTextField();
		panel_1.add(Cell_4_2);
		
		Cell_4_3 = new JFormattedTextField();
		panel_1.add(Cell_4_3);
		
		Cell_4_4 = new JFormattedTextField();
		panel_1.add(Cell_4_4);
		
		Cell_4_5 = new JFormattedTextField();
		panel_1.add(Cell_4_5);
		
		Cell_4_6 = new JFormattedTextField();
		panel_1.add(Cell_4_6);
		
		Cell_4_7 = new JFormattedTextField();
		panel_1.add(Cell_4_7);
		
		Cell_4_8 = new JFormattedTextField();
		panel_1.add(Cell_4_8);
		
		Cell_5_0 = new JFormattedTextField();
		panel_1.add(Cell_5_0);
		
		Cell_5_1 = new JFormattedTextField();
		panel_1.add(Cell_5_1);
		
		Cell_5_2 = new JFormattedTextField();
		panel_1.add(Cell_5_2);
		
		Cell_5_3 = new JFormattedTextField();
		panel_1.add(Cell_5_3);
		
		Cell_5_4 = new JFormattedTextField();
		panel_1.add(Cell_5_4);
		
		Cell_5_5 = new JFormattedTextField();
		panel_1.add(Cell_5_5);
		
		Cell_5_6 = new JFormattedTextField();
		panel_1.add(Cell_5_6);
		
		Cell_5_7 = new JFormattedTextField();
		panel_1.add(Cell_5_7);
		
		Cell_5_8 = new JFormattedTextField();
		panel_1.add(Cell_5_8);
		
		Cell_6_0 = new JFormattedTextField();
		panel_1.add(Cell_6_0);
		
		Cell_6_1 = new JFormattedTextField();
		panel_1.add(Cell_6_1);
		
		Cell_6_2 = new JFormattedTextField();
		panel_1.add(Cell_6_2);
		
		Cell_6_3 = new JFormattedTextField();
		panel_1.add(Cell_6_3);
		
		Cell_6_4 = new JFormattedTextField();
		panel_1.add(Cell_6_4);
		
		Cell_6_5 = new JFormattedTextField();
		panel_1.add(Cell_6_5);
		
		Cell_6_6 = new JFormattedTextField();
		panel_1.add(Cell_6_6);
		
		Cell_6_7 = new JFormattedTextField();
		panel_1.add(Cell_6_7);
		
		Cell_6_8 = new JFormattedTextField();
		panel_1.add(Cell_6_8);
		
		Cell_7_0 = new JFormattedTextField();
		panel_1.add(Cell_7_0);
		
		Cell_7_1 = new JFormattedTextField();
		panel_1.add(Cell_7_1);
		
		Cell_7_2 = new JFormattedTextField();
		panel_1.add(Cell_7_2);
		
		Cell_7_3 = new JFormattedTextField();
		panel_1.add(Cell_7_3);
		
		Cell_7_4 = new JFormattedTextField();
		panel_1.add(Cell_7_4);
		
		Cell_7_5 = new JFormattedTextField();
		panel_1.add(Cell_7_5);
		
		Cell_7_6 = new JFormattedTextField();
		panel_1.add(Cell_7_6);
		
		Cell_7_7 = new JFormattedTextField();
		panel_1.add(Cell_7_7);
		
		Cell_7_8 = new JFormattedTextField();
		panel_1.add(Cell_7_8);
		
		Cell_8_0 = new JFormattedTextField();
		panel_1.add(Cell_8_0);
		
		Cell_8_1 = new JFormattedTextField();
		panel_1.add(Cell_8_1);
		
		Cell_8_2 = new JFormattedTextField();
		panel_1.add(Cell_8_2);
		
		Cell_8_3 = new JFormattedTextField();
		panel_1.add(Cell_8_3);
		
		Cell_8_4 = new JFormattedTextField();
		panel_1.add(Cell_8_4);
		
		Cell_8_5 = new JFormattedTextField();
		panel_1.add(Cell_8_5);
		
		Cell_8_6 = new JFormattedTextField();
		panel_1.add(Cell_8_6);
		
		Cell_8_7 = new JFormattedTextField();
		panel_1.add(Cell_8_7);
		
		Cell_8_8 = new JFormattedTextField();
		panel_1.add(Cell_8_8);
		
		panel = new Panel();
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Solve");
		btnNewButton.setBounds(212, 648, 204, 62);
		
		panel.add(btnNewButton);
	}
}
