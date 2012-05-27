package Gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JScrollBar;
import java.awt.TextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAgenda extends JInternalFrame {
	private JTextField txtDataConsulta;
	private JTextField txtHorario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAgenda frame = new TelaAgenda();
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
	public TelaAgenda() {
		
		final TelaAgenda estaTela = this;
		setTitle("SystemClin - Agenda");
		getContentPane().setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(null);
		
		JLabel nomePaciente = new JLabel("Nome Paciente:");
		nomePaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		nomePaciente.setBounds(38, 44, 86, 14);
		getContentPane().add(nomePaciente);
		
		JComboBox localizaUserBox = new JComboBox();
		localizaUserBox.setBounds(117, 41, 272, 20);
		getContentPane().add(localizaUserBox);
		
		JLabel dataConsulta = new JLabel("Data Consulta:"); //As datas podem ser iguais, porém os horários não.
		dataConsulta.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		dataConsulta.setBounds(38, 69, 72, 14);
		getContentPane().add(dataConsulta);
		
		txtDataConsulta = new JTextField();
		txtDataConsulta.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		txtDataConsulta.setBounds(117, 66, 62, 20);
		getContentPane().add(txtDataConsulta);
		txtDataConsulta.setColumns(10);
		
		JLabel observacoes = new JLabel("Observa\u00E7\u00F5es:");
		observacoes.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		observacoes.setBounds(38, 93, 69, 14);
		getContentPane().add(observacoes);
		
		TextArea txtAreaObs = new TextArea();
		txtAreaObs.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		txtAreaObs.setBounds(117, 90, 269, 121);
		getContentPane().add(txtAreaObs);
		
		JButton confirmaConsulta = new JButton("Confirmar");
		confirmaConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(null, "Consulta marcada com sucesso!");
			}
			
		});
		confirmaConsulta.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		confirmaConsulta.setBounds(117, 222, 89, 23);
		getContentPane().add(confirmaConsulta);
		
		JButton cancelaConsulta = new JButton("Cancelar");
		cancelaConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				estaTela.setVisible(false);
			}
		});
		cancelaConsulta.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		cancelaConsulta.setBounds(270, 222, 89, 23);
		getContentPane().add(cancelaConsulta);
		
		JLabel horaConsulta = new JLabel("Hor\u00E1rio:"); //Tem que ter uma condição que não deixa as horas ficarem iguais.
		horaConsulta.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		horaConsulta.setBounds(189, 69, 43, 14);
		getContentPane().add(horaConsulta);
		
		setClosable(true);
		setIconifiable(true);
		
		txtHorario = new JTextField();
		txtHorario.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		txtHorario.setBounds(232, 66, 62, 20);
		getContentPane().add(txtHorario);
		txtHorario.setColumns(10);
		setBounds(100, 100, 450, 300);

	}
}
