package Gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAlteraPaciente extends JInternalFrame {
	
	private JTextField txtPaciente;
	private JTextField txtIdade;
	private JTextField txtEndereco;
	private JTextField txtTelefone;
	private JTextField textField;

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
		
		final TelaAlteraPaciente estaTela = this;
		
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
		salvarPaciente.setBounds(115, 213, 89, 23);
		getContentPane().add(salvarPaciente);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				estaTela.setVisible(false);
			}
		});
		
		setClosable(true);
		setIconifiable(true);
		
		btnCancelar.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		btnCancelar.setBounds(256, 213, 89, 23);
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
		idadePaciente.setBounds(27, 69, 46, 14);
		getContentPane().add(idadePaciente);
		
		txtIdade = new JTextField();
		txtIdade.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		txtIdade.setBounds(115, 66, 86, 20);
		getContentPane().add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel enderecoPaciente = new JLabel("Endere\u00E7o:");
		enderecoPaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		enderecoPaciente.setBounds(27, 97, 58, 14);
		getContentPane().add(enderecoPaciente);
		
		txtEndereco = new JTextField();
		txtEndereco.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		txtEndereco.setBounds(115, 94, 271, 20);
		getContentPane().add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel telefonePaciente = new JLabel("Telefone:");
		telefonePaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		telefonePaciente.setBounds(27, 126, 46, 14);
		getContentPane().add(telefonePaciente);
		
		txtTelefone = new JTextField();
		txtTelefone.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		txtTelefone.setBounds(115, 123, 271, 20);
		getContentPane().add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblCpfrg = new JLabel("CPF/RG:");
		lblCpfrg.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		lblCpfrg.setBounds(27, 157, 46, 14);
		getContentPane().add(lblCpfrg);
		
		textField = new JTextField();
		textField.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		textField.setBounds(115, 154, 271, 20);
		getContentPane().add(textField);
		textField.setColumns(10);

	}
}
