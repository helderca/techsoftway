package Gui;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaProntuarioRemover extends JInternalFrame {

	private JPanel removerProntuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProntuarioRemover frame = new TelaProntuarioRemover();
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
	public TelaProntuarioRemover() {
		
		final TelaProntuarioRemover estaTela = this;
		
		setTitle("SystemClin - Remover Prontu\u00E1rio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		removerProntuario = new JPanel();
		removerProntuario.setBackground(Color.LIGHT_GRAY);
		removerProntuario.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(removerProntuario);
		removerProntuario.setLayout(null);
		
		JLabel nomePaciente = new JLabel("Nome Paciente:");
		nomePaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		nomePaciente.setBounds(38, 44, 86, 14);
		removerProntuario.add(nomePaciente);
		
		JButton confirmaRemover = new JButton("Confirma");
		confirmaRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Prontuário removido com sucesso!");
			}
		});
		
		setClosable(true);
		setIconifiable(true);
		
		confirmaRemover.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		confirmaRemover.setBounds(118, 154, 89, 23);
		removerProntuario.add(confirmaRemover);
		
		JButton cancelarRemover = new JButton("Cancelar");
		cancelarRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				estaTela.setVisible(false);
			}
		});
		cancelarRemover.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		cancelarRemover.setBounds(227, 154, 89, 23);
		removerProntuario.add(cancelarRemover);
		
		JComboBox localizaUsersBox = new JComboBox();
		localizaUsersBox.setBounds(118, 41, 270, 20);
		removerProntuario.add(localizaUsersBox);
		
		JLabel removeProntuario = new JLabel("Deseja realmente remover este prontu\u00E1rio?");
		removeProntuario.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		removeProntuario.setBounds(128, 105, 260, 14);
		removerProntuario.add(removeProntuario);
	}

}
