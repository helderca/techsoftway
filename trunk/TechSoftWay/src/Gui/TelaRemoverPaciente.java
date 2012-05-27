package Gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaRemoverPaciente extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRemoverPaciente frame = new TelaRemoverPaciente();
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
	public TelaRemoverPaciente() {
		
		final TelaRemoverPaciente estaTela = this;
		
		setTitle("SystemClin - Retemover Paciente");
		getContentPane().setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel nomePaciente = new JLabel("Nome Paciente:");
		nomePaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		nomePaciente.setBounds(38, 44, 86, 14);
		getContentPane().add(nomePaciente);
		
		JComboBox localizaUserBox = new JComboBox();
		localizaUserBox.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		localizaUserBox.setBounds(118, 41, 270, 20);
		getContentPane().add(localizaUserBox);
		
		JLabel removerPaciente = new JLabel("Deseja realmente remover este paciente?");
		removerPaciente.setBounds(128, 105, 260, 14);
		getContentPane().add(removerPaciente);
		
		JButton btnNewButton = new JButton("Confirma");
		btnNewButton.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Paciente removido com sucesso!");	
			}
		});
		btnNewButton.setBounds(118, 154, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				estaTela.setVisible(false);
				}
		});
		
		setClosable(true);
		setIconifiable(true);
		
		btnNewButton_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		btnNewButton_1.setBounds(227, 154, 89, 23);
		getContentPane().add(btnNewButton_1);

	}
}

