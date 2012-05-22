package Gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JInternalFrame;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.TextArea;


//se ligar no JInternalFrame para não dar errado na outra.
public class TelaProntuario extends JInternalFrame {

	private JPanel addProntuario;
	private JTextField txtCodProntuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProntuario frame = new TelaProntuario();
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
	final  TelaProntuario estaTela = this;
	
	public TelaProntuario() {
		
		final TelaProntuario estaTela = this;
		
		setTitle("SystemClin - Prontu\u00E1rio");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		addProntuario = new JPanel();
		addProntuario.setBackground(Color.LIGHT_GRAY);
		addProntuario.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(addProntuario);
		addProntuario.setLayout(null);
		
		JLabel nomePaciente = new JLabel("Nome Paciente:");
		nomePaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		nomePaciente.setBounds(38, 44, 86, 14);
		addProntuario.add(nomePaciente);
		
		JLabel codigoPronturio = new JLabel("Cod. Prontu\u00E1rio:");
		codigoPronturio.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		codigoPronturio.setBounds(38, 69, 86, 14);
		addProntuario.add(codigoPronturio);
		
		txtCodProntuario = new JTextField();
		txtCodProntuario.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		txtCodProntuario.setBounds(117, 66, 86, 20);
		addProntuario.add(txtCodProntuario);
		txtCodProntuario.setColumns(10);
		
		JButton inserirProntuario = new JButton("Inserir");
		inserirProntuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Prontuário inserido com sucesso!");
			}
		});
		inserirProntuario.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		inserirProntuario.setBounds(117, 222, 89, 23);
		addProntuario.add(inserirProntuario);
		
		JButton cancelProntuario = new JButton("Cancelar");
		cancelProntuario.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		cancelProntuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				estaTela.setVisible(false);
			}
			
		});
		
		setClosable(true);
		setIconifiable(true);
		
		cancelProntuario.setBounds(251, 222, 89, 23);
		addProntuario.add(cancelProntuario);
		
		JComboBox localizaUsersBox = new JComboBox();
		localizaUsersBox.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		localizaUsersBox.setBounds(117, 41, 269, 20);
		addProntuario.add(localizaUsersBox);
		
		JLabel descricaoProntuario = new JLabel("Descri\u00E7\u00E3o:");
		descricaoProntuario.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		descricaoProntuario.setBounds(38, 93, 69, 14);
		addProntuario.add(descricaoProntuario);
		
		TextArea txtAreaDescricao = new TextArea();
		txtAreaDescricao.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		txtAreaDescricao.setBounds(117, 90, 269, 121);
		addProntuario.add(txtAreaDescricao);
	}
}

