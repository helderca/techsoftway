package Gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaRelatorios extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRelatorios frame = new TelaRelatorios();
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
	public TelaRelatorios() {
		
		final TelaRelatorios estaTela = this;
		
		setTitle("SystemClin - Relat\u00F3rios");
		getContentPane().setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JRadioButton imprimirRelatorioPaciente = new JRadioButton("Relat\u00F3rio de Pacientes");
		imprimirRelatorioPaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		imprimirRelatorioPaciente.setBackground(Color.LIGHT_GRAY);
		imprimirRelatorioPaciente.setBounds(117, 43, 133, 23);
		getContentPane().add(imprimirRelatorioPaciente);
		
		JRadioButton imprimirRelatorioProntuario = new JRadioButton("Relat\u00F3rio de Prontu\u00E1rio");
		imprimirRelatorioProntuario.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		imprimirRelatorioProntuario.setBackground(Color.LIGHT_GRAY);
		imprimirRelatorioProntuario.setBounds(117, 82, 137, 23);
		getContentPane().add(imprimirRelatorioProntuario);
		
		JRadioButton imprimirRelatorioAgenda = new JRadioButton("Relat\u00F3rio de Agenda");
		imprimirRelatorioAgenda.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		imprimirRelatorioAgenda.setBackground(Color.LIGHT_GRAY);
		imprimirRelatorioAgenda.setBounds(117, 121, 123, 23);
		getContentPane().add(imprimirRelatorioAgenda);
		
		JButton imprimiRelatorios = new JButton("Imprimir");
		imprimiRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Aguarde comunicação com a impressora...");
				JOptionPane.showMessageDialog(null, "Impressão concluída!");
			}
		});
		imprimiRelatorios.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		imprimiRelatorios.setBounds(74, 177, 89, 23);
		getContentPane().add(imprimiRelatorios);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				estaTela.setVisible(false);			
			}
		});
		
		setClosable(true);
		setIconifiable(true);
		
		btnCancelar.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		btnCancelar.setBounds(216, 177, 89, 23);
		getContentPane().add(btnCancelar);

	}
}
