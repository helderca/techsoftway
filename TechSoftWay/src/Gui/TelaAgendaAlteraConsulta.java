package Gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.TextArea;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAgendaAlteraConsulta extends JInternalFrame {
	private JTextField txtPaciente;
	private JTextField txtDataConsulta;
	private JTextField txtHorario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAgendaAlteraConsulta frame = new TelaAgendaAlteraConsulta();
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
	public TelaAgendaAlteraConsulta() {
		
		final TelaAgendaAlteraConsulta estaTela = this;
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setTitle("SystemClin - Alterar Consulta");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel nomePaciente = new JLabel("Nome Paciente:");
		nomePaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		nomePaciente.setBounds(38, 44, 86, 14);
		getContentPane().add(nomePaciente);
		
		txtPaciente = new JTextField();
		txtPaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		txtPaciente.setBounds(117, 41, 242, 20);
		getContentPane().add(txtPaciente);
		txtPaciente.setColumns(10);
		
		JComboBox localizaUserBox = new JComboBox();
		localizaUserBox.setBounds(117, 41, 271, 20);
		getContentPane().add(localizaUserBox);
		
		JLabel dataConsulta = new JLabel("Data Consulta:");
		dataConsulta.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		dataConsulta.setBounds(38, 69, 72, 14);
		getContentPane().add(dataConsulta);
		
		txtDataConsulta = new JTextField();
		txtDataConsulta.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		txtDataConsulta.setBounds(117, 66, 62, 20);
		getContentPane().add(txtDataConsulta);
		txtDataConsulta.setColumns(10);
		
		JLabel horaConsulta = new JLabel("Hor\u00E1rio:");
		horaConsulta.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		horaConsulta.setBounds(189, 69, 43, 14);
		getContentPane().add(horaConsulta);
		
		txtHorario = new JTextField();
		txtHorario.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		txtHorario.setBounds(232, 66, 62, 20);
		getContentPane().add(txtHorario);
		txtHorario.setColumns(10);
		
		TextArea txtAreaObs = new TextArea();
		txtAreaObs.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		txtAreaObs.setBounds(117, 90, 269, 121);
		getContentPane().add(txtAreaObs);
		
		JLabel observacoes = new JLabel("Observa\u00E7\u00F5es:");
		observacoes.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		observacoes.setBounds(38, 93, 69, 14);
		getContentPane().add(observacoes);
		
		JButton confirmaAlteracao = new JButton("Alterar");
		confirmaAlteracao.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		confirmaAlteracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Cuidado!");
			}
		});
		confirmaAlteracao.setBounds(56, 228, 89, 23);
		getContentPane().add(confirmaAlteracao);
		
		JButton cancelaAlteracao = new JButton("Cancelar");
		cancelaAlteracao.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		cancelaAlteracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			estaTela.setVisible(false);			
			}
		});
		
		setClosable(true);
		setIconifiable(true);
		
		cancelaAlteracao.setBounds(284, 228, 89, 23);
		getContentPane().add(cancelaAlteracao);
		
		JButton salvatrAlteracaoConsulta = new JButton("Salvar");
		salvatrAlteracaoConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Relatório salvo com sucesso!");
			}
		});
		salvatrAlteracaoConsulta.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		salvatrAlteracaoConsulta.setBounds(167, 228, 89, 23);
		getContentPane().add(salvatrAlteracaoConsulta);

	}
}
