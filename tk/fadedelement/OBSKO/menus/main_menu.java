package tk.fadedelement.OBSKO.menus;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.jnativehook.GlobalScreen;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.util.logging.Level;

@SuppressWarnings("serial")
public class main_menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_menu frame = new main_menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main_menu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(main_menu.class.getResource("/icons/main_icon.jpg")));
		
		GlobalScreen.addNativeKeyListener(new tk.elementplays.OBSKO.Inputs.keyListener());
		Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
		logger.setLevel(Level.OFF);
		
		try {
			GlobalScreen.registerNativeHook();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		setResizable(false);
		setTitle("OBS Keyboard Overlay");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		JLabel mainMenu_display = new JLabel("Main Menu");
		mainMenu_display.setFont(new Font("Times New Roman", Font.BOLD, 25));
		mainMenu_display.setHorizontalAlignment(SwingConstants.CENTER);
		mainMenu_display.setBounds(10, 11, 214, 42);
		contentPane.add(mainMenu_display);
		
		JButton open_display = new JButton("Open Keyboard Overlay");
		open_display.setBounds(32, 61, 172, 23);
		contentPane.add(open_display);
		
		JButton credits_display = new JButton("Credits");
		credits_display.setBounds(32, 95, 172, 23);
		contentPane.add(credits_display);
		
		JButton exit_frame = new JButton("Exit");
		exit_frame.setBounds(32, 129, 172, 23);
		contentPane.add(exit_frame);
		
		JLabel version_type = new JLabel("V 1.0");
		version_type.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		version_type.setForeground(Color.LIGHT_GRAY);
		version_type.setBounds(200, 247, 34, 14);
		contentPane.add(version_type);
		
		open_display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new display_keyboard_menu().setVisible(true);
				
			}
		});
		
		credits_display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new credits_menu().setVisible(true);
				
			}
		});
		
		exit_frame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
				
			}
		});
	}
}
