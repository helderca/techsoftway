package Gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class TelaAlteraPaciente extends JInternalFrame {
	private JTextField txtPaciente;
	private JTextField txtIdade;
	private JTextField txtEndereco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAlteraPaciente frame = new TelaAlteraPaciente();
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
	public TelaAlteraPaciente() {
		setTitle("SystemClin - Alterar Paciente");
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JComboBox localizaUserBox = new JComboBox();
		localizaUserBox.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		localizaUserBox.setBounds(115, 11, 271, 20);
		getContentPane().add(localizaUserBox);
		
		JLabel procurePaciente = new JLabel("Procurar Paciente:");
		procurePaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		procurePaciente.setBounds(27, 14, 95, 14);
		getContentPane().add(procurePaciente);
		
		JButton salvarPaciente = new JButton("Salvar");
		salvarPaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		salvarPaciente.setBounds(120, 228, 89, 23);
		getContentPane().add(salvarPaciente);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		btnCancelar.setBounds(255, 228, 89, 23);
		getContentPane().add(btnCancelar);
		
		JLabel nomePaciente = new JLabel("Nome Paciente:");
		nomePaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		nomePaciente.setBounds(27, 41, 85, 14);
		getContentPane().add(nomePaciente);
		
		txtPaciente = new JTextField();
		txtPaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		txtPaciente.setBounds(115, 38, 271, 20);
		getContentPane().add(txtPaciente);
		txtPaciente.setColumns(10);
		
		JLabel idadePaciente = new JLabel("Idade:");
		idadePaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		idadePaciente.setBounds(27, 66, 46, 14);
		getContentPane().add(idadePaciente);
		
		txtIdade = new JTextField();
		txtIdade.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		txtIdade.setBounds(115, 63, 86, 20);
		getContentPane().add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel enderecoPaciente = new JLabel("Endere\u00E7o:");
		enderecoPaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		enderecoPaciente.setBounds(27, 91, 58, 14);
		getContentPane().add(enderecoPaciente);
		
		txtEndereco = new JTextField();
		txtEndereco.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		txtEndereco.setBounds(115, 94, 271, 20);
		getContentPane().add(txtEndereco);
		txtEndereco.setColumns(10);

	}
}
