package Solver;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;

public class SudokuBoard {

	private JFrame frame;
	private JFormattedTextField formattedTextField;
	private JFormattedTextField formattedTextField_1;
	private JFormattedTextField formattedTextField_2;
	private JFormattedTextField formattedTextField_3;
	private JFormattedTextField formattedTextField_4;
	private JFormattedTextField formattedTextField_5;
	private JFormattedTextField formattedTextField_6;
	private JFormattedTextField formattedTextField_7;
	private JFormattedTextField formattedTextField_8;
	private JFormattedTextField formattedTextField_9;
	private JFormattedTextField formattedTextField_10;
	private JFormattedTextField formattedTextField_11;
	private JFormattedTextField formattedTextField_12;
	private JFormattedTextField formattedTextField_13;
	private JFormattedTextField formattedTextField_14;
	private JFormattedTextField formattedTextField_15;
	private JFormattedTextField formattedTextField_16;
	private JFormattedTextField formattedTextField_17;
	private JFormattedTextField formattedTextField_18;
	private JFormattedTextField formattedTextField_19;
	private JFormattedTextField formattedTextField_20;
	private JFormattedTextField formattedTextField_21;
	private JFormattedTextField formattedTextField_22;
	private JFormattedTextField formattedTextField_23;
	private JFormattedTextField formattedTextField_24;
	private JFormattedTextField formattedTextField_25;
	private JFormattedTextField formattedTextField_26;
	private JFormattedTextField formattedTextField_27;
	private JFormattedTextField formattedTextField_28;
	private JFormattedTextField formattedTextField_29;
	private JFormattedTextField formattedTextField_30;
	private JFormattedTextField formattedTextField_31;
	private JFormattedTextField formattedTextField_32;
	private JFormattedTextField formattedTextField_33;
	private JFormattedTextField formattedTextField_34;
	private JFormattedTextField formattedTextField_35;
	private JFormattedTextField formattedTextField_36;
	private JFormattedTextField formattedTextField_37;
	private JFormattedTextField formattedTextField_38;
	private JFormattedTextField formattedTextField_39;
	private JFormattedTextField formattedTextField_40;
	private JFormattedTextField formattedTextField_41;
	private JFormattedTextField formattedTextField_42;
	private JFormattedTextField formattedTextField_43;
	private JFormattedTextField formattedTextField_44;
	private JFormattedTextField formattedTextField_45;
	private JFormattedTextField formattedTextField_46;
	private JFormattedTextField formattedTextField_47;
	private JFormattedTextField formattedTextField_48;
	private JFormattedTextField formattedTextField_49;
	private JFormattedTextField formattedTextField_50;
	private JFormattedTextField formattedTextField_51;
	private JFormattedTextField formattedTextField_52;
	private JFormattedTextField formattedTextField_53;
	private JFormattedTextField formattedTextField_54;
	private JFormattedTextField formattedTextField_55;
	private JFormattedTextField formattedTextField_56;
	private JFormattedTextField formattedTextField_57;
	private JFormattedTextField formattedTextField_58;
	private JFormattedTextField formattedTextField_59;
	private JFormattedTextField formattedTextField_60;
	private JFormattedTextField formattedTextField_61;
	private JFormattedTextField formattedTextField_62;
	private JFormattedTextField formattedTextField_63;
	private JFormattedTextField formattedTextField_64;
	private JFormattedTextField formattedTextField_65;
	private JFormattedTextField formattedTextField_66;
	private JFormattedTextField formattedTextField_67;
	private JFormattedTextField formattedTextField_68;
	private JFormattedTextField formattedTextField_69;
	private JFormattedTextField formattedTextField_70;
	private JFormattedTextField formattedTextField_71;
	private JFormattedTextField formattedTextField_72;
	private JFormattedTextField formattedTextField_73;
	private JFormattedTextField formattedTextField_74;
	private JFormattedTextField formattedTextField_75;
	private JFormattedTextField formattedTextField_76;
	private JFormattedTextField formattedTextField_77;
	private JFormattedTextField formattedTextField_78;
	private JFormattedTextField formattedTextField_79;
	private JFormattedTextField formattedTextField_80;

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
		frame.setBounds(100, 100, 630, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 9, 0, 0));
		
		formattedTextField = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField);
		
		formattedTextField_1 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_1);
		
		formattedTextField_2 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_2);
		
		formattedTextField_3 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_3);
		
		formattedTextField_5 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_5);
		
		formattedTextField_4 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_4);
		
		formattedTextField_6 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_6);
		
		formattedTextField_7 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_7);
		
		formattedTextField_8 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_8);
		
		formattedTextField_9 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_9);
		
		formattedTextField_10 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_10);
		
		formattedTextField_11 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_11);
		
		formattedTextField_12 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_12);
		
		formattedTextField_13 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_13);
		
		formattedTextField_14 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_14);
		
		formattedTextField_15 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_15);
		
		formattedTextField_16 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_16);
		
		formattedTextField_17 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_17);
		
		formattedTextField_18 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_18);
		
		formattedTextField_19 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_19);
		
		formattedTextField_20 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_20);
		
		formattedTextField_21 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_21);
		
		formattedTextField_22 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_22);
		
		formattedTextField_23 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_23);
		
		formattedTextField_24 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_24);
		
		formattedTextField_25 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_25);
		
		formattedTextField_26 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_26);
		
		formattedTextField_27 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_27);
		
		formattedTextField_28 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_28);
		
		formattedTextField_29 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_29);
		
		formattedTextField_30 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_30);
		
		formattedTextField_31 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_31);
		
		formattedTextField_32 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_32);
		
		formattedTextField_33 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_33);
		
		formattedTextField_34 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_34);
		
		formattedTextField_35 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_35);
		
		formattedTextField_36 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_36);
		
		formattedTextField_37 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_37);
		
		formattedTextField_38 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_38);
		
		formattedTextField_39 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_39);
		
		formattedTextField_40 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_40);
		
		formattedTextField_41 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_41);
		
		formattedTextField_42 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_42);
		
		formattedTextField_43 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_43);
		
		formattedTextField_44 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_44);
		
		formattedTextField_45 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_45);
		
		formattedTextField_46 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_46);
		
		formattedTextField_47 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_47);
		
		formattedTextField_48 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_48);
		
		formattedTextField_49 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_49);
		
		formattedTextField_50 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_50);
		
		formattedTextField_51 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_51);
		
		formattedTextField_52 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_52);
		
		formattedTextField_53 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_53);
		
		formattedTextField_54 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_54);
		
		formattedTextField_55 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_55);
		
		formattedTextField_56 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_56);
		
		formattedTextField_57 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_57);
		
		formattedTextField_58 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_58);
		
		formattedTextField_59 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_59);
		
		formattedTextField_60 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_60);
		
		formattedTextField_61 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_61);
		
		formattedTextField_62 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_62);
		
		formattedTextField_63 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_63);
		
		formattedTextField_64 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_64);
		
		formattedTextField_65 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_65);
		
		formattedTextField_66 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_66);
		
		formattedTextField_67 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_67);
		
		formattedTextField_68 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_68);
		
		formattedTextField_69 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_69);
		
		formattedTextField_70 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_70);
		
		formattedTextField_71 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_71);
		
		formattedTextField_72 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_72);
		
		formattedTextField_73 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_73);
		
		formattedTextField_74 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_74);
		
		formattedTextField_75 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_75);
		
		formattedTextField_76 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_76);
		
		formattedTextField_77 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_77);
		
		formattedTextField_78 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_78);
		
		formattedTextField_79 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_79);
		
		formattedTextField_80 = new JFormattedTextField();
		frame.getContentPane().add(formattedTextField_80);
	}

}
