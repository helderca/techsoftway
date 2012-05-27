package Gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAgendaRemoverConsulta extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAgendaRemoverConsulta frame = new TelaAgendaRemoverConsulta();
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
	public TelaAgendaRemoverConsulta() {
		setTitle("SystemClin - Remover Consulta");
		
		final TelaAgendaRemoverConsulta estaTela = this;
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel nomePaciente = new JLabel("Nome Paciente:");
		nomePaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		nomePaciente.setBounds(38, 44, 86, 14);
		getContentPane().add(nomePaciente);
		
		JComboBox localizaUserBox = new JComboBox();
		localizaUserBox.setBounds(117, 41, 269, 20);
		getContentPane().add(localizaUserBox);
		
		JLabel removeConsulta = new JLabel("Deseja realmente cancelar essa consulta?");
		removeConsulta.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		removeConsulta.setBounds(128, 106, 260, 14);
		getContentPane().add(removeConsulta);
		
		JButton confirmaCancelaConsulta = new JButton("Confirmar");
		confirmaCancelaConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Consulta cancelada com sucesso!");
			}
		});
		confirmaCancelaConsulta.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		confirmaCancelaConsulta.setBounds(133, 154, 89, 23);
		getContentPane().add(confirmaCancelaConsulta);
		
		JButton cancelaConsulta = new JButton("Cancelar");
		cancelaConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				estaTela.setVisible(false);
			}
		});
		
		setClosable(true);
		setIconifiable(true);
		
		cancelaConsulta.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		cancelaConsulta.setBounds(242, 154, 89, 23);
		getContentPane().add(cancelaConsulta);

	}

}
