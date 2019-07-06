package tk.fadedelement.OBSKO.menus;

import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;

@SuppressWarnings("serial")
public class display_keyboard_menu extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	// Adds the JLabels
	
	// First Row of Keys
	public static JLabel key_0;
	public static JLabel key_1;
	public static JLabel key_2;
	public static JLabel key_3;
	public static JLabel key_4;
	public static JLabel key_5;
	public static JLabel key_6;
	public static JLabel key_7;
	public static JLabel key_8;
	public static JLabel key_9;
	public static JLabel key_10;
	public static JLabel key_11;
	public static JLabel key_12;
	public static JLabel key_13;
	
	// Second Row of Keys
	public static JLabel key_0_1;
	public static JLabel key_1_1;
	public static JLabel key_2_1;
	public static JLabel key_3_1;
	public static JLabel key_4_1;
	public static JLabel key_5_1;
	public static JLabel key_6_1;
	public static JLabel key_7_1;
	public static JLabel key_8_1;
	public static JLabel key_9_1;
	public static JLabel key_10_1;
	public static JLabel key_11_1;
	public static JLabel key_12_1;
	public static JLabel key_13_1;
	
	// Third Row of Keys
	public static JLabel key_0_2;
	public static JLabel key_1_2;
	public static JLabel key_2_2;
	public static JLabel key_3_2;
	public static JLabel key_4_2;
	public static JLabel key_5_2;
	public static JLabel key_6_2;
	public static JLabel key_7_2;
	public static JLabel key_8_2;
	public static JLabel key_9_2;
	public static JLabel key_10_2;
	public static JLabel key_11_2;
	public static JLabel key_12_2;
	
	// Fourth Row of Keys
	public static JLabel key_0_3;
	public static JLabel key_1_3;
	public static JLabel key_2_3;
	public static JLabel key_3_3;
	public static JLabel key_4_3;
	public static JLabel key_5_3;
	public static JLabel key_6_3;
	public static JLabel key_7_3;
	public static JLabel key_8_3;
	public static JLabel key_9_3;
	public static JLabel key_10_3;
	public static JLabel key_11_3;
	
	// Fifth Row of Keys
	public static JLabel key_0_4;
	public static JLabel key_1_4;
	public static JLabel key_2_4;
	public static JLabel key_3_4;
	public static JLabel key_4_4;
	public static JLabel key_5_4;
	
	public static void main(String[] args) {
		try {
			display_keyboard_menu dialog = new display_keyboard_menu();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public display_keyboard_menu() {
		setTitle("OBS Keyboard Overlay");
		setResizable(false);
		setBounds(100, 100, 900, 350);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.GREEN);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		// Display Keys
		
		key_0 = new JLabel("`");
		key_0.setOpaque(true);
		key_0.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		key_0.setHorizontalAlignment(SwingConstants.CENTER);
		key_0.setBackground(Color.BLACK);
		key_0.setForeground(Color.WHITE);
		key_0.setBounds(10, 11, 50, 50);
		contentPanel.add(key_0);
		
		key_1 = new JLabel("1");
		key_1.setHorizontalAlignment(SwingConstants.CENTER);
		key_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_1.setBackground(Color.BLACK);
		key_1.setForeground(Color.WHITE);
		key_1.setOpaque(true);
		key_1.setBounds(70, 11, 50, 50);
		contentPanel.add(key_1);
		
		key_2 = new JLabel("2");
		key_2.setHorizontalAlignment(SwingConstants.CENTER);
		key_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_2.setBackground(Color.BLACK);
		key_2.setForeground(Color.WHITE);
		key_2.setOpaque(true);
		key_2.setBounds(130, 11, 50, 50);
		contentPanel.add(key_2);
		
		key_3 = new JLabel("3");
		key_3.setHorizontalAlignment(SwingConstants.CENTER);
		key_3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_3.setBackground(Color.BLACK);
		key_3.setForeground(Color.WHITE);
		key_3.setOpaque(true);
		key_3.setBounds(190, 11, 50, 50);
		contentPanel.add(key_3);
		
		key_4 = new JLabel("4");
		key_4.setHorizontalAlignment(SwingConstants.CENTER);
		key_4.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_4.setBackground(Color.BLACK);
		key_4.setForeground(Color.WHITE);
		key_4.setOpaque(true);
		key_4.setBounds(250, 11, 50, 50);
		contentPanel.add(key_4);
		
		key_5 = new JLabel("5");
		key_5.setHorizontalAlignment(SwingConstants.CENTER);
		key_5.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_5.setBackground(Color.BLACK);
		key_5.setForeground(Color.WHITE);
		key_5.setOpaque(true);
		key_5.setBounds(310, 11, 50, 50);
		contentPanel.add(key_5);
		
		key_6 = new JLabel("6");
		key_6.setHorizontalAlignment(SwingConstants.CENTER);
		key_6.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_6.setBackground(Color.BLACK);
		key_6.setForeground(Color.WHITE);
		key_6.setOpaque(true);
		key_6.setBounds(370, 11, 50, 50);
		contentPanel.add(key_6);
		
		key_7 = new JLabel("7");
		key_7.setHorizontalAlignment(SwingConstants.CENTER);
		key_7.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_7.setBackground(Color.BLACK);
		key_7.setForeground(Color.WHITE);
		key_7.setOpaque(true);
		key_7.setBounds(430, 11, 50, 50);
		contentPanel.add(key_7);
		
		key_8 = new JLabel("8");
		key_8.setHorizontalAlignment(SwingConstants.CENTER);
		key_8.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_8.setBackground(Color.BLACK);
		key_8.setForeground(Color.WHITE);
		key_8.setOpaque(true);
		key_8.setBounds(490, 11, 50, 50);
		contentPanel.add(key_8);
		
		key_9 = new JLabel("9");
		key_9.setHorizontalAlignment(SwingConstants.CENTER);
		key_9.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_9.setBackground(Color.BLACK);
		key_9.setForeground(Color.WHITE);
		key_9.setOpaque(true);
		key_9.setBounds(550, 11, 50, 50);
		contentPanel.add(key_9);
		
		key_10 = new JLabel("0");
		key_10.setHorizontalAlignment(SwingConstants.CENTER);
		key_10.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_10.setBackground(Color.BLACK);
		key_10.setForeground(Color.WHITE);
		key_10.setOpaque(true);
		key_10.setBounds(610, 11, 50, 50);
		contentPanel.add(key_10);
		
		key_11 = new JLabel("-");
		key_11.setHorizontalAlignment(SwingConstants.CENTER);
		key_11.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_11.setBackground(Color.BLACK);
		key_11.setForeground(Color.WHITE);
		key_11.setOpaque(true);
		key_11.setBounds(670, 11, 50, 50);
		contentPanel.add(key_11);
		
		key_12 = new JLabel("=");
		key_12.setHorizontalAlignment(SwingConstants.CENTER);
		key_12.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_12.setBackground(Color.BLACK);
		key_12.setForeground(Color.WHITE);
		key_12.setOpaque(true);
		key_12.setBounds(730, 11, 50, 50);
		contentPanel.add(key_12);
		
		key_13 = new JLabel("Backspace");
		key_13.setHorizontalAlignment(SwingConstants.CENTER);
		key_13.setFont(new Font("Times New Roman", Font.BOLD, 15));
		key_13.setBackground(Color.BLACK);
		key_13.setForeground(Color.WHITE);
		key_13.setOpaque(true);
		key_13.setBounds(790, 11, 90, 50);
		contentPanel.add(key_13);
		
		key_0_1 = new JLabel("Tab");
		key_0_1.setHorizontalAlignment(SwingConstants.CENTER);
		key_0_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		key_0_1.setBackground(Color.BLACK);
		key_0_1.setForeground(Color.WHITE);
		key_0_1.setOpaque(true);
		key_0_1.setBounds(10, 71, 70, 50);
		contentPanel.add(key_0_1);
		
		key_1_1 = new JLabel("Q");
		key_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		key_1_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_1_1.setBackground(Color.BLACK);
		key_1_1.setForeground(Color.WHITE);
		key_1_1.setOpaque(true);
		key_1_1.setBounds(90, 71, 50, 50);
		contentPanel.add(key_1_1);
		
		key_2_1 = new JLabel("W");
		key_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		key_2_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_2_1.setBackground(Color.BLACK);
		key_2_1.setForeground(Color.WHITE);
		key_2_1.setOpaque(true);
		key_2_1.setBounds(150, 71, 50, 50);
		contentPanel.add(key_2_1);
		
		key_3_1 = new JLabel("E");
		key_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		key_3_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_3_1.setBackground(Color.BLACK);
		key_3_1.setForeground(Color.WHITE);
		key_3_1.setOpaque(true);
		key_3_1.setBounds(210, 71, 50, 50);
		contentPanel.add(key_3_1);
		
		key_4_1 = new JLabel("R");
		key_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		key_4_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_4_1.setBackground(Color.BLACK);
		key_4_1.setForeground(Color.WHITE);
		key_4_1.setOpaque(true);
		key_4_1.setBounds(270, 71, 50, 50);
		contentPanel.add(key_4_1);
		
		key_5_1 = new JLabel("T");
		key_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		key_5_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_5_1.setBackground(Color.BLACK);
		key_5_1.setForeground(Color.WHITE);
		key_5_1.setOpaque(true);
		key_5_1.setBounds(330, 71, 50, 50);
		contentPanel.add(key_5_1);
		
		key_6_1 = new JLabel("Y");
		key_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		key_6_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_6_1.setBackground(Color.BLACK);
		key_6_1.setForeground(Color.WHITE);
		key_6_1.setOpaque(true);
		key_6_1.setBounds(390, 71, 50, 50);
		contentPanel.add(key_6_1);
		
		key_7_1 = new JLabel("U");
		key_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		key_7_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_7_1.setBackground(Color.BLACK);
		key_7_1.setForeground(Color.WHITE);
		key_7_1.setOpaque(true);
		key_7_1.setBounds(450, 71, 50, 50);
		contentPanel.add(key_7_1);
		
		key_8_1 = new JLabel("I");
		key_8_1.setHorizontalAlignment(SwingConstants.CENTER);
		key_8_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_8_1.setBackground(Color.BLACK);
		key_8_1.setForeground(Color.WHITE);
		key_8_1.setOpaque(true);
		key_8_1.setBounds(510, 71, 50, 50);
		contentPanel.add(key_8_1);
		
		key_9_1 = new JLabel("O");
		key_9_1.setHorizontalAlignment(SwingConstants.CENTER);
		key_9_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_9_1.setBackground(Color.BLACK);
		key_9_1.setForeground(Color.WHITE);
		key_9_1.setOpaque(true);
		key_9_1.setBounds(570, 71, 50, 50);
		contentPanel.add(key_9_1);
		
		key_10_1 = new JLabel("P");
		key_10_1.setHorizontalAlignment(SwingConstants.CENTER);
		key_10_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_10_1.setBackground(Color.BLACK);
		key_10_1.setForeground(Color.WHITE);
		key_10_1.setOpaque(true);
		key_10_1.setBounds(630, 71, 50, 50);
		contentPanel.add(key_10_1);
		
		key_11_1 = new JLabel("[");
		key_11_1.setHorizontalAlignment(SwingConstants.CENTER);
		key_11_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_11_1.setBackground(Color.BLACK);
		key_11_1.setForeground(Color.WHITE);
		key_11_1.setOpaque(true);
		key_11_1.setBounds(690, 71, 50, 50);
		contentPanel.add(key_11_1);
		
		key_12_1 = new JLabel("]");
		key_12_1.setHorizontalAlignment(SwingConstants.CENTER);
		key_12_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_12_1.setBackground(Color.BLACK);
		key_12_1.setForeground(Color.WHITE);
		key_12_1.setOpaque(true);
		key_12_1.setBounds(750, 71, 50, 50);
		contentPanel.add(key_12_1);
		
		key_13_1 = new JLabel("\\");
		key_13_1.setHorizontalAlignment(SwingConstants.CENTER);
		key_13_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_13_1.setBackground(Color.BLACK);
		key_13_1.setForeground(Color.WHITE);
		key_13_1.setOpaque(true);
		key_13_1.setBounds(810, 71, 70, 50);
		contentPanel.add(key_13_1);
		
		key_0_2 = new JLabel("Caps Lock");
		key_0_2.setHorizontalAlignment(SwingConstants.CENTER);
		key_0_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		key_0_2.setBackground(Color.BLACK);
		key_0_2.setForeground(Color.WHITE);
		key_0_2.setOpaque(true);
		key_0_2.setBounds(10, 131, 85, 50);
		contentPanel.add(key_0_2);
		
		key_1_2 = new JLabel("A");
		key_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		key_1_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_1_2.setBackground(Color.BLACK);
		key_1_2.setForeground(Color.WHITE);
		key_1_2.setOpaque(true);
		key_1_2.setBounds(105, 131, 50, 50);
		contentPanel.add(key_1_2);
		
		key_2_2 = new JLabel("S");
		key_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		key_2_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_2_2.setBackground(Color.BLACK);
		key_2_2.setForeground(Color.WHITE);
		key_2_2.setOpaque(true);
		key_2_2.setBounds(165, 131, 50, 50);
		contentPanel.add(key_2_2);
		
		key_3_2 = new JLabel("D");
		key_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		key_3_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_3_2.setBackground(Color.BLACK);
		key_3_2.setForeground(Color.WHITE);
		key_3_2.setOpaque(true);
		key_3_2.setBounds(225, 131, 50, 50);
		contentPanel.add(key_3_2);
		
		key_4_2 = new JLabel("F");
		key_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		key_4_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_4_2.setBackground(Color.BLACK);
		key_4_2.setForeground(Color.WHITE);
		key_4_2.setOpaque(true);
		key_4_2.setBounds(285, 131, 50, 50);
		contentPanel.add(key_4_2);
		
		key_5_2 = new JLabel("G");
		key_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		key_5_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_5_2.setBackground(Color.BLACK);
		key_5_2.setForeground(Color.WHITE);
		key_5_2.setOpaque(true);
		key_5_2.setBounds(345, 131, 50, 50);
		contentPanel.add(key_5_2);
		
		key_6_2 = new JLabel("H");
		key_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		key_6_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_6_2.setBackground(Color.BLACK);
		key_6_2.setForeground(Color.WHITE);
		key_6_2.setOpaque(true);
		key_6_2.setBounds(405, 131, 50, 50);
		contentPanel.add(key_6_2);
		
		key_7_2 = new JLabel("J");
		key_7_2.setHorizontalAlignment(SwingConstants.CENTER);
		key_7_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_7_2.setBackground(Color.BLACK);
		key_7_2.setForeground(Color.WHITE);
		key_7_2.setOpaque(true);
		key_7_2.setBounds(465, 131, 50, 50);
		contentPanel.add(key_7_2);
		
		key_8_2 = new JLabel("K");
		key_8_2.setHorizontalAlignment(SwingConstants.CENTER);
		key_8_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_8_2.setBackground(Color.BLACK);
		key_8_2.setForeground(Color.WHITE);
		key_8_2.setOpaque(true);
		key_8_2.setBounds(525, 131, 50, 50);
		contentPanel.add(key_8_2);
		
		key_9_2 = new JLabel("L");
		key_9_2.setHorizontalAlignment(SwingConstants.CENTER);
		key_9_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_9_2.setBackground(Color.BLACK);
		key_9_2.setForeground(Color.WHITE);
		key_9_2.setOpaque(true);
		key_9_2.setBounds(585, 131, 50, 50);
		contentPanel.add(key_9_2);
		
		key_10_2 = new JLabel(";");
		key_10_2.setHorizontalAlignment(SwingConstants.CENTER);
		key_10_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_10_2.setBackground(Color.BLACK);
		key_10_2.setForeground(Color.WHITE);
		key_10_2.setOpaque(true);
		key_10_2.setBounds(645, 131, 50, 50);
		contentPanel.add(key_10_2);
		
		key_11_2 = new JLabel("'");
		key_11_2.setHorizontalAlignment(SwingConstants.CENTER);
		key_11_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_11_2.setBackground(Color.BLACK);
		key_11_2.setForeground(Color.WHITE);
		key_11_2.setOpaque(true);
		key_11_2.setBounds(705, 131, 50, 50);
		contentPanel.add(key_11_2);
		
		key_12_2 = new JLabel("Enter");
		key_12_2.setHorizontalAlignment(SwingConstants.CENTER);
		key_12_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		key_12_2.setBackground(Color.BLACK);
		key_12_2.setForeground(Color.WHITE);
		key_12_2.setOpaque(true);
		key_12_2.setBounds(765, 131, 115, 50);
		contentPanel.add(key_12_2);
		
		key_0_3 = new JLabel("L-Shift");
		key_0_3.setHorizontalAlignment(SwingConstants.CENTER);
		key_0_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		key_0_3.setBackground(Color.BLACK);
		key_0_3.setForeground(Color.WHITE);
		key_0_3.setOpaque(true);
		key_0_3.setBounds(10, 191, 130, 50);
		contentPanel.add(key_0_3);
		
		key_1_3 = new JLabel("Z");
		key_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		key_1_3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_1_3.setBackground(Color.BLACK);
		key_1_3.setForeground(Color.WHITE);
		key_1_3.setOpaque(true);
		key_1_3.setBounds(150, 191, 50, 50);
		contentPanel.add(key_1_3);
		
		key_2_3 = new JLabel("X");
		key_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		key_2_3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_2_3.setBackground(Color.BLACK);
		key_2_3.setForeground(Color.WHITE);
		key_2_3.setOpaque(true);
		key_2_3.setBounds(210, 191, 50, 50);
		contentPanel.add(key_2_3);
		
		key_3_3 = new JLabel("C");
		key_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		key_3_3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_3_3.setBackground(Color.BLACK);
		key_3_3.setForeground(Color.WHITE);
		key_3_3.setOpaque(true);
		key_3_3.setBounds(270, 191, 50, 50);
		contentPanel.add(key_3_3);
		
		key_4_3 = new JLabel("V");
		key_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		key_4_3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_4_3.setBackground(Color.BLACK);
		key_4_3.setForeground(Color.WHITE);
		key_4_3.setOpaque(true);
		key_4_3.setBounds(330, 191, 50, 50);
		contentPanel.add(key_4_3);
		
		key_5_3 = new JLabel("B");
		key_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		key_5_3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_5_3.setBackground(Color.BLACK);
		key_5_3.setForeground(Color.WHITE);
		key_5_3.setOpaque(true);
		key_5_3.setBounds(390, 191, 50, 50);
		contentPanel.add(key_5_3);
		
		key_6_3 = new JLabel("N");
		key_6_3.setHorizontalAlignment(SwingConstants.CENTER);
		key_6_3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_6_3.setBackground(Color.BLACK);
		key_6_3.setForeground(Color.WHITE);
		key_6_3.setOpaque(true);
		key_6_3.setBounds(450, 191, 50, 50);
		contentPanel.add(key_6_3);
		
		key_7_3 = new JLabel("M");
		key_7_3.setHorizontalAlignment(SwingConstants.CENTER);
		key_7_3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_7_3.setBackground(Color.BLACK);
		key_7_3.setForeground(Color.WHITE);
		key_7_3.setOpaque(true);
		key_7_3.setBounds(510, 191, 50, 50);
		contentPanel.add(key_7_3);
		
		key_8_3 = new JLabel(",");
		key_8_3.setHorizontalAlignment(SwingConstants.CENTER);
		key_8_3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_8_3.setBackground(Color.BLACK);
		key_8_3.setForeground(Color.WHITE);
		key_8_3.setOpaque(true);
		key_8_3.setBounds(570, 191, 50, 50);
		contentPanel.add(key_8_3);
		
		key_9_3 = new JLabel(".");
		key_9_3.setHorizontalAlignment(SwingConstants.CENTER);
		key_9_3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_9_3.setBackground(Color.BLACK);
		key_9_3.setForeground(Color.WHITE);
		key_9_3.setOpaque(true);
		key_9_3.setBounds(630, 191, 50, 50);
		contentPanel.add(key_9_3);
		
		key_10_3 = new JLabel("/");
		key_10_3.setHorizontalAlignment(SwingConstants.CENTER);
		key_10_3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		key_10_3.setBackground(Color.BLACK);
		key_10_3.setForeground(Color.WHITE);
		key_10_3.setOpaque(true);
		key_10_3.setBounds(690, 191, 50, 50);
		contentPanel.add(key_10_3);
		
		key_11_3 = new JLabel("R-Shift");
		key_11_3.setHorizontalAlignment(SwingConstants.CENTER);
		key_11_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		key_11_3.setBackground(Color.BLACK);
		key_11_3.setForeground(Color.WHITE);
		key_11_3.setOpaque(true);
		key_11_3.setBounds(750, 191, 130, 50);
		contentPanel.add(key_11_3);
		
		key_0_4 = new JLabel("L-CTRL");
		key_0_4.setHorizontalAlignment(SwingConstants.CENTER);
		key_0_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		key_0_4.setBackground(Color.BLACK);
		key_0_4.setForeground(Color.WHITE);
		key_0_4.setOpaque(true);
		key_0_4.setBounds(10, 252, 60, 50);
		contentPanel.add(key_0_4);
		
		key_1_4 = new JLabel("WK");
		key_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		key_1_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		key_1_4.setBackground(Color.BLACK);
		key_1_4.setForeground(Color.WHITE);
		key_1_4.setOpaque(true);
		key_1_4.setBounds(80, 251, 60, 50);
		contentPanel.add(key_1_4);
		
		key_2_4 = new JLabel("L-ALT");
		key_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		key_2_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		key_2_4.setBackground(Color.BLACK);
		key_2_4.setForeground(Color.WHITE);
		key_2_4.setOpaque(true);
		key_2_4.setBounds(150, 251, 60, 50);
		contentPanel.add(key_2_4);
		
		key_3_4 = new JLabel("Space");
		key_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		key_3_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		key_3_4.setBackground(Color.BLACK);
		key_3_4.setForeground(Color.WHITE);
		key_3_4.setOpaque(true);
		key_3_4.setBounds(220, 251, 520, 50);
		contentPanel.add(key_3_4);
		
		key_4_4 = new JLabel("R-ALT");
		key_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		key_4_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		key_4_4.setBackground(Color.BLACK);
		key_4_4.setForeground(Color.WHITE);
		key_4_4.setOpaque(true);
		key_4_4.setBounds(750, 252, 60, 50);
		contentPanel.add(key_4_4);
		
		key_5_4 = new JLabel("R-CTRL");
		key_5_4.setHorizontalAlignment(SwingConstants.CENTER);
		key_5_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		key_5_4.setBackground(Color.BLACK);
		key_5_4.setForeground(Color.WHITE);
		key_5_4.setOpaque(true);
		key_5_4.setBounds(820, 251, 60, 50);
		contentPanel.add(key_5_4);
		
		
	}
}