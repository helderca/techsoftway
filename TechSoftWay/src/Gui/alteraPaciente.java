package Gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Font;

public class alteraPaciente extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					alteraPaciente frame = new alteraPaciente();
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
	public alteraPaciente() {
		getContentPane().setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		setBounds(100, 100, 450, 300);

	}

}
