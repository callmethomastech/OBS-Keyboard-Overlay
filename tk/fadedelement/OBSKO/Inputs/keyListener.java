package tk.fadedelement.OBSKO.Inputs;

import java.awt.Color;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import tk.fadedelement.OBSKO.menus.display_keyboard_menu;

public class keyListener implements NativeKeyListener {

	@Override
	public void nativeKeyPressed(NativeKeyEvent ke) {
		
		// First Row
		if (ke.getKeyCode() == 41) {
			display_keyboard_menu.key_0.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 2) {
			display_keyboard_menu.key_1.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 3) {
			display_keyboard_menu.key_2.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 4) {
			display_keyboard_menu.key_3.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 5) {
			display_keyboard_menu.key_4.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 6) {
			display_keyboard_menu.key_5.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 7) {
			display_keyboard_menu.key_6.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 8) {
			display_keyboard_menu.key_7.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 9) {
			display_keyboard_menu.key_8.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 10) {
			display_keyboard_menu.key_9.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 11) {
			display_keyboard_menu.key_10.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 12) {
			display_keyboard_menu.key_11.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 13) {
			display_keyboard_menu.key_12.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 14) {
			display_keyboard_menu.key_13.setBackground(Color.GRAY);
			
		//Second Row
		} else if (ke.getKeyCode() == 15) {
			display_keyboard_menu.key_0_1.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 16) {
			display_keyboard_menu.key_1_1.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 17) {
			display_keyboard_menu.key_2_1.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 18) {
			display_keyboard_menu.key_3_1.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 19) {
			display_keyboard_menu.key_4_1.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 20) {
			display_keyboard_menu.key_5_1.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 21) {
			display_keyboard_menu.key_6_1.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 22) {
			display_keyboard_menu.key_7_1.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 23) {
			display_keyboard_menu.key_8_1.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 24) {
			display_keyboard_menu.key_9_1.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 25) {
			display_keyboard_menu.key_10_1.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 26) {
			display_keyboard_menu.key_11_1.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 27) {
			display_keyboard_menu.key_12_1.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 43) {
			display_keyboard_menu.key_13_1.setBackground(Color.GRAY);
			
		// Third Row
		} else if (ke.getKeyCode() == 58) {
			display_keyboard_menu.key_0_2.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 30) {
			display_keyboard_menu.key_1_2.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 31) {
			display_keyboard_menu.key_2_2.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 32) {
			display_keyboard_menu.key_3_2.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 33) {
			display_keyboard_menu.key_4_2.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 34) {
			display_keyboard_menu.key_5_2.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 35) {
			display_keyboard_menu.key_6_2.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 36) {
			display_keyboard_menu.key_7_2.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 37) {
			display_keyboard_menu.key_8_2.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 38) {
			display_keyboard_menu.key_9_2.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 39) {
			display_keyboard_menu.key_10_2.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 40) {
			display_keyboard_menu.key_11_2.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 28) {
			display_keyboard_menu.key_12_2.setBackground(Color.GRAY);
			
		// Forth Row
		} else if (ke.getKeyCode() == 42) {
			display_keyboard_menu.key_0_3.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 44) {
			display_keyboard_menu.key_1_3.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 45) {
			display_keyboard_menu.key_2_3.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 46) {
			display_keyboard_menu.key_3_3.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 47) {
			display_keyboard_menu.key_4_3.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 48) {
			display_keyboard_menu.key_5_3.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 49) {
			display_keyboard_menu.key_6_3.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 50) {
			display_keyboard_menu.key_7_3.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 51) {
			display_keyboard_menu.key_8_3.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 52) {
			display_keyboard_menu.key_9_3.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 53) {
			display_keyboard_menu.key_10_3.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 3638) {
			display_keyboard_menu.key_11_3.setBackground(Color.GRAY);
			
		// Fifth Row
		} else if (ke.getKeyCode() == 29) {
			display_keyboard_menu.key_0_4.setBackground(Color.GRAY);
			display_keyboard_menu.key_5_4.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 3675) {
			display_keyboard_menu.key_1_4.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 56) {
			display_keyboard_menu.key_2_4.setBackground(Color.GRAY);
			display_keyboard_menu.key_4_4.setBackground(Color.GRAY);
		} else if (ke.getKeyCode() == 57) {
			display_keyboard_menu.key_3_4.setBackground(Color.GRAY);
		}
	}

	@Override
	public void nativeKeyReleased(NativeKeyEvent ke) {
		
		// First Row
		if (ke.getKeyCode() == 41) {
			display_keyboard_menu.key_0.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 2) {
			display_keyboard_menu.key_1.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 3) {
			display_keyboard_menu.key_2.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 4) {
			display_keyboard_menu.key_3.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 5) {
			display_keyboard_menu.key_4.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 6) {
			display_keyboard_menu.key_5.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 7) {
			display_keyboard_menu.key_6.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 8) {
			display_keyboard_menu.key_7.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 9) {
			display_keyboard_menu.key_8.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 10) {
			display_keyboard_menu.key_9.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 11) {
			display_keyboard_menu.key_10.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 12) {
			display_keyboard_menu.key_11.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 13) {
			display_keyboard_menu.key_12.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 14) {
			display_keyboard_menu.key_13.setBackground(Color.BLACK);
				
		//Second Row
		} else if (ke.getKeyCode() == 15) {
			display_keyboard_menu.key_0_1.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 16) {
			display_keyboard_menu.key_1_1.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 17) {
			display_keyboard_menu.key_2_1.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 18) {
			display_keyboard_menu.key_3_1.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 19) {
			display_keyboard_menu.key_4_1.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 20) {
			display_keyboard_menu.key_5_1.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 21) {
			display_keyboard_menu.key_6_1.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 22) {
			display_keyboard_menu.key_7_1.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 23) {
			display_keyboard_menu.key_8_1.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 24) {
			display_keyboard_menu.key_9_1.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 25) {
			display_keyboard_menu.key_10_1.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 26) {
			display_keyboard_menu.key_11_1.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 27) {
			display_keyboard_menu.key_12_1.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 43) {
			display_keyboard_menu.key_13_1.setBackground(Color.BLACK);
			
		// Third Row
		} else if (ke.getKeyCode() == 58) {
			display_keyboard_menu.key_0_2.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 30) {
			display_keyboard_menu.key_1_2.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 31) {
			display_keyboard_menu.key_2_2.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 32) {
			display_keyboard_menu.key_3_2.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 33) {
			display_keyboard_menu.key_4_2.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 34) {
			display_keyboard_menu.key_5_2.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 35) {
			display_keyboard_menu.key_6_2.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 36) {
			display_keyboard_menu.key_7_2.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 37) {
			display_keyboard_menu.key_8_2.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 38) {
			display_keyboard_menu.key_9_2.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 39) {
			display_keyboard_menu.key_10_2.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 40) {
			display_keyboard_menu.key_11_2.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 28) {
			display_keyboard_menu.key_12_2.setBackground(Color.BLACK);
			
		// Forth Row
		} else if (ke.getKeyCode() == 42) {
			display_keyboard_menu.key_0_3.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 44) {
			display_keyboard_menu.key_1_3.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 45) {
			display_keyboard_menu.key_2_3.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 46) {
			display_keyboard_menu.key_3_3.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 47) {
			display_keyboard_menu.key_4_3.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 48) {
			display_keyboard_menu.key_5_3.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 49) {
			display_keyboard_menu.key_6_3.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 50) {
			display_keyboard_menu.key_7_3.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 51) {
			display_keyboard_menu.key_8_3.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 52) {
			display_keyboard_menu.key_9_3.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 53) {
			display_keyboard_menu.key_10_3.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 3638) {
			display_keyboard_menu.key_11_3.setBackground(Color.BLACK);
				
		// Fifth Row
		} else if (ke.getKeyCode() == 29) {
			display_keyboard_menu.key_0_4.setBackground(Color.BLACK);
			display_keyboard_menu.key_5_4.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 3675) {
			display_keyboard_menu.key_1_4.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 56) {
			display_keyboard_menu.key_2_4.setBackground(Color.BLACK);
			display_keyboard_menu.key_4_4.setBackground(Color.BLACK);
		} else if (ke.getKeyCode() == 57) {
			display_keyboard_menu.key_3_4.setBackground(Color.BLACK);
		}
	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent ke) {
		
	}

}
