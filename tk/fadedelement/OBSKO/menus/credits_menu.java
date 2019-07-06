package tk.fadedelement.OBSKO.menus;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Desktop;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

@SuppressWarnings("serial")
public class credits_menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					credits_menu frame = new credits_menu();
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
	public credits_menu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(main_menu.class.getResource("/icons/main_icon.jpg")));
		
		setResizable(false);
		setTitle("OBS Keyboard Overlay - Credits");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 454, 133);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		JLabel channel_link = new JLabel("");
		channel_link.setBounds(280, 11, 116, 25);
		contentPane.add(channel_link);
		
		JLabel timelapse_link = new JLabel("");
		timelapse_link.setBounds(324, 74, 52, 20);
		contentPane.add(timelapse_link);
		
		JTextArea display_credits = new JTextArea();
		display_credits.setFont(new Font("Times New Roman", Font.BOLD, 17));
		display_credits.setWrapStyleWord(true);
		display_credits.setEditable(false);
		display_credits.setLineWrap(true);
		display_credits.setText("The Credit for this program goes to (Fuze_Element) to get to my channel click the name displayed in the text I hope you enjoy my program and to the link to the timelapse of me makeing this can be found (here).");
		display_credits.setBounds(10, 11, 428, 83);
		contentPane.add(display_credits);
		
		channel_link.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				
				try {
					Desktop.getDesktop().browse(new URL("https://tinyurl.com/fadedelementYT").toURI());
				} catch (Exception e) {
					System.out.println(e);
				}
				
			}
		});
		
		timelapse_link.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				
				// Put Video URL up when the video is out!
				
				try {
					Desktop.getDesktop().browse(new URL("https://www.youtube.com/watch?v=D9t3NZikQ2s").toURI());
				} catch (Exception e) {
					System.out.println(e);
				}
				
			}
		});
	}
}
