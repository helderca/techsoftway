package Gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelaPacientes extends JInternalFrame {
	
	private JPanel cadastroPaciente;
	private JTextField txtPaciente;
	private JTextField txtIdade;
	private JTextField txtEndereco;
	private JTextField txtTelefone;
	private JTextField txtCpfRg;
	private JTextField txtPlanoSaude;
	private JTextField txtCodPaciente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPacientes frame = new TelaPacientes();
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
	public TelaPacientes() {
		
		final TelaPacientes estaTela = this;
		
		setTitle("SystemClin - Cadastro de Pacientes");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		cadastroPaciente = new JPanel();
		cadastroPaciente.setBackground(Color.LIGHT_GRAY);
		cadastroPaciente.setForeground(Color.DARK_GRAY);
		cadastroPaciente.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(cadastroPaciente);
		cadastroPaciente.setLayout(null);
		
		JLabel nomePaciente = new JLabel("Nome Paciente:");
		nomePaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		nomePaciente.setBounds(38, 44, 86, 14);
		cadastroPaciente.add(nomePaciente);
		
		JLabel idadePaciente = new JLabel("Idade:");
		idadePaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		idadePaciente.setBounds(38, 72, 46, 14);
		cadastroPaciente.add(idadePaciente);
		
		txtPaciente = new JTextField();
		txtPaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		txtPaciente.setBounds(123, 41, 242, 20);
		cadastroPaciente.add(txtPaciente);
		txtPaciente.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		txtIdade.setBounds(123, 69, 86, 20);
		cadastroPaciente.add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel enderecoPaciente = new JLabel("Endere\u00E7o:");
		enderecoPaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		enderecoPaciente.setBounds(38, 100, 75, 14);
		cadastroPaciente.add(enderecoPaciente);
		
		txtEndereco = new JTextField();
		txtEndereco.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		txtEndereco.setBounds(123, 97, 242, 20);
		cadastroPaciente.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel telefonePaciente = new JLabel("Telefone:");
		telefonePaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		telefonePaciente.setBounds(38, 131, 46, 14);
		cadastroPaciente.add(telefonePaciente);
		
		txtTelefone = new JTextField();
		txtTelefone.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		txtTelefone.setBounds(123, 128, 242, 20);
		cadastroPaciente.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel cpfRg = new JLabel("CPF/RG:");
		cpfRg.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		cpfRg.setBounds(38, 162, 46, 14);
		cadastroPaciente.add(cpfRg);
		
		txtCpfRg = new JTextField();
		txtCpfRg.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		txtCpfRg.setBounds(123, 159, 242, 20);
		cadastroPaciente.add(txtCpfRg);
		txtCpfRg.setColumns(10);
		
		JLabel planoSaude = new JLabel("Plano de Sa\u00FAde:");
		planoSaude.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		planoSaude.setBounds(38, 193, 86, 14);
		cadastroPaciente.add(planoSaude);
		
		txtPlanoSaude = new JTextField();
		txtPlanoSaude.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		txtPlanoSaude.setBounds(123, 190, 242, 20);
		cadastroPaciente.add(txtPlanoSaude);
		txtPlanoSaude.setColumns(10);
		
		JButton inserirPaciente = new JButton("Inserir");
		inserirPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso!");
			}
		});
		inserirPaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		inserirPaciente.setBounds(120, 228, 89, 23);
		cadastroPaciente.add(inserirPaciente);
		
		JButton cancelarPaciente = new JButton("Cancelar");
		cancelarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					estaTela.setVisible(false);
			}
		});
		
		setClosable(true);
		setIconifiable(true);
		
		cancelarPaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		cancelarPaciente.setBounds(255, 228, 89, 23);
		cadastroPaciente.add(cancelarPaciente);
		
		JLabel codPaciente = new JLabel("Codigo:");
		codPaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		codPaciente.setBounds(38, 19, 46, 14);
		cadastroPaciente.add(codPaciente);
		
		txtCodPaciente = new JTextField();
		txtCodPaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		txtCodPaciente.setBounds(123, 13, 86, 20);
		cadastroPaciente.add(txtCodPaciente);
		txtCodPaciente.setColumns(10);
	}
}
