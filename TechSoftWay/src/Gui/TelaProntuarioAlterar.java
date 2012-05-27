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
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JSplitPane;
import java.awt.TextArea;

public class TelaProntuarioAlterar extends JInternalFrame {

	private JPanel alterarProntuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProntuarioAlterar frame = new TelaProntuarioAlterar();
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
	public TelaProntuarioAlterar() {
		setTitle("SystemClin - Alterar Prontu\u00E1rio");
		
			final TelaProntuarioAlterar estaTela = this;
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		alterarProntuario = new JPanel();
		alterarProntuario.setBackground(Color.LIGHT_GRAY);
		alterarProntuario.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(alterarProntuario);
		alterarProntuario.setLayout(null);
		
		JLabel nomePaciente = new JLabel("Nome Paciente:");
		nomePaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		nomePaciente.setBounds(38, 44, 86, 14);
		alterarProntuario.add(nomePaciente);
		
		JComboBox localizaUserBox = new JComboBox();
		localizaUserBox.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		localizaUserBox.setBounds(118, 41, 267, 20);
		alterarProntuario.add(localizaUserBox);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		lblDescrio.setBounds(38, 80, 74, 14);
		alterarProntuario.add(lblDescrio);
		
		JButton alteraProntuario = new JButton("Alterar");
		alteraProntuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Cuidado!");
			}
		});
		alteraProntuario.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		alteraProntuario.setBounds(56, 228, 89, 23);
		alterarProntuario.add(alteraProntuario);
		
		JButton salvaProntuario = new JButton("Salvar");
		salvaProntuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Prontuário salvo com sucesso!");
			}
		});
		salvaProntuario.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		salvaProntuario.setBounds(167, 228, 89, 23);
		alterarProntuario.add(salvaProntuario);
		
		JButton cancelaProntuario = new JButton("Cancelar");
		cancelaProntuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				estaTela.setVisible(false);
			}
		});
		
		setClosable(true);
		setIconifiable(true);
		
		cancelaProntuario.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		cancelaProntuario.setBounds(284, 228, 89, 23);
		alterarProntuario.add(cancelaProntuario);
		
		TextArea txtAreaDescricao = new TextArea();
		txtAreaDescricao.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		txtAreaDescricao.setBounds(117, 80, 269, 121);
		alterarProntuario.add(txtAreaDescricao);
	}

}
