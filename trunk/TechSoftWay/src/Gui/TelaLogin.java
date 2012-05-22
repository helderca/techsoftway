package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Font;

public class TelaLogin extends JFrame {

	private JPanel TelaLogin;
	private JTextField txtLogin;
	private JPasswordField txtSenha;
	private JButton btnConectar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		
		//Fecha a tela de login, mais continua sendo executado.
		final TelaLogin estaTela = this;
		
		setResizable(false);
		setTitle("SystemClin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		TelaLogin = new JPanel();
		TelaLogin.setForeground(Color.DARK_GRAY);
		TelaLogin.setBackground(Color.LIGHT_GRAY);
		TelaLogin.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(TelaLogin);
		TelaLogin.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(63, 46, 305, 176);
		TelaLogin.add(panel);
		panel.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		lblLogin.setBounds(47, 39, 46, 21);
		panel.add(lblLogin);
		lblLogin.setToolTipText("Nome de usuario");
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		lblSenha.setBounds(47, 71, 46, 14);
		panel.add(lblSenha);
		lblSenha.setToolTipText("Sua senha");
		
		txtSenha = new JPasswordField();
		txtSenha.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		txtSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				btnConectar.doClick();
				
			}
		});
		txtSenha.setBounds(103, 68, 106, 20);
		panel.add(txtSenha);
		txtSenha.setColumns(10);
		
		txtLogin = new JTextField();
		txtLogin.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		txtLogin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				btnConectar.doClick();
			
			}
		});
		txtLogin.setBounds(103, 39, 106, 20);
		panel.add(txtLogin);
		txtLogin.setColumns(10);
		
		btnConectar = new JButton("Conectar");
		btnConectar.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		btnConectar.setBounds(103, 113, 89, 23);
		panel.add(btnConectar);
		btnConectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String loginDigitado = txtLogin.getText();
				String senhaDigitada = txtSenha.getText();
				
				
				if (loginDigitado.trim().equals("user") && senhaDigitada.equals("123")){
		
					JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
					
					//Abrir a tela principal
					TelaPrincipal tp = new TelaPrincipal();
					tp.setVisible(true);
					
					//Fechar tela de login e encerra ele da memoria
					estaTela.dispose();				
					
				}				
				else {
					JOptionPane.showMessageDialog(null, "Acesso Negado!");
				}
				
								
			}
		});
	}
}
