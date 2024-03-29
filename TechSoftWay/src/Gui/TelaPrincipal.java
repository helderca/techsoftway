package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		
		final TelaPrincipal tp = this;
		
		setBackground(Color.LIGHT_GRAY);
		setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		setTitle("SystemClin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height-20);
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setResizable(false);

		
		final JDesktopPane desktopPane = new JDesktopPane();
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		setJMenuBar(menuBar);
		
		JMenu menuCadastro = new JMenu("Cadastro");
		menuCadastro.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		menuBar.add(menuCadastro);

		//cria e instancia a tela de pacientes
		final TelaPacientes tPaciente = new TelaPacientes();
		tPaciente.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		tPaciente.setLocation(38, 37);
		desktopPane.add(tPaciente);
		tPaciente.setVisible(false);

		JMenuItem cadastroPacientes = new JMenuItem("Inserir Pacientes");
		cadastroPacientes.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				//Chamando a tela de cadastro de pacientes.
				tPaciente.setVisible(true);
			}
		});
		
		
		
		cadastroPacientes.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		menuCadastro.add(cadastroPacientes);
		
		//Cria e instancia a tela de alterar paciente.
		final TelaAlteraPaciente tAlteraPaciente = new TelaAlteraPaciente();
		tAlteraPaciente.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		tAlteraPaciente.setLocation(38,67);
		desktopPane.add(tAlteraPaciente);
		tAlteraPaciente.setVisible(false);
		
		JMenuItem alterarPaciente = new JMenuItem("Alterar Paciente");
		alterarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				tAlteraPaciente.setVisible(true);
			
			}
		});
		alterarPaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		menuCadastro.add(alterarPaciente);
		
		//cria e instancia a tela de remover paciente
		final TelaRemoverPaciente tRemoverPaciente = new TelaRemoverPaciente();
		tRemoverPaciente.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		tRemoverPaciente.setLocation(38,40);
		desktopPane.add(tRemoverPaciente);
		tRemoverPaciente.setVisible(false);
		
		JMenuItem mntmRemoverPaciente = new JMenuItem("Remover Paciente");
		mntmRemoverPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				tRemoverPaciente.setVisible(true);
			}
		});
		mntmRemoverPaciente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		menuCadastro.add(mntmRemoverPaciente);
		
		JMenu menuProntuario = new JMenu("Prontuario");
		menuProntuario.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		menuBar.add(menuProntuario);
		
		//Cria e instancia a tela de prontuario;
		final TelaProntuario tProntuario = new TelaProntuario();
		tProntuario.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		tProntuario.setLocation(38,65);
		desktopPane.add(tProntuario);
		tProntuario.setVisible(false);
		
		JMenuItem cadastroProntuario = new JMenuItem("Inserir Prontu\u00E1rio");
		cadastroProntuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Chamando a tela de inserir prontuario
				tProntuario.setVisible(true);
			}
		});
		
		cadastroProntuario.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		menuProntuario.add(cadastroProntuario);
		
		//Cria e instancia a tela de alterar prontuario
		final TelaProntuarioAlterar tProntuarioAlterar = new TelaProntuarioAlterar();
		tProntuarioAlterar.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		tProntuarioAlterar.setLocation(38,65);
		desktopPane.add(tProntuarioAlterar);
		
		JMenuItem alterarPronturio = new JMenuItem("Alterar Prontu\u00E1rio");
		alterarPronturio.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//Chamando tela de altera prontuario
				tProntuarioAlterar.setVisible(true);
			}
		});
		alterarPronturio.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		menuProntuario.add(alterarPronturio);
		
		//Cria e instancia a tela de remover prontuarios
		final TelaProntuarioRemover tProntuarioRemover = new TelaProntuarioRemover();
		tProntuarioRemover.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		tProntuarioRemover.setLocation(38,65);
		desktopPane.add(tProntuarioRemover);
		
		JMenuItem removerPronturio = new JMenuItem("Remover Prontu\u00E1rio");
		removerPronturio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Chamando tela de remover prontuario
				tProntuarioRemover.setVisible(true);
			}
		});
		removerPronturio.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		menuProntuario.add(removerPronturio);
		
		JMenu menuAgenda = new JMenu("Agenda");
		menuAgenda.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		menuBar.add(menuAgenda);
		
		final TelaAgenda tAgenda = new TelaAgenda();
		tAgenda.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		tAgenda.setLocation(38,65);
		desktopPane.add(tAgenda);
		
		JMenuItem marcarConsulta = new JMenuItem("Marcar Consulta");
		marcarConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Chamando a tela de agenda
				tAgenda.setVisible(true);
				}
		});
		marcarConsulta.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		menuAgenda.add(marcarConsulta);
		
		//Cria e instancia tela agenda altera consulta
		final TelaAgendaAlteraConsulta tAgendaAlteraConsulta = new TelaAgendaAlteraConsulta();
		tAgendaAlteraConsulta.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		tAgendaAlteraConsulta.setLocation(38,65);
		desktopPane.add(tAgendaAlteraConsulta);
		
		JMenuItem alterarConsulta = new JMenuItem("Alterar Consulta");
		alterarConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Chamando tela de alterar agenda de consulta
				tAgendaAlteraConsulta.setVisible(true);
			}
		});
		alterarConsulta.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		menuAgenda.add(alterarConsulta);
		
		//Cria e instancia tela de remover/cancelar consulta
		final TelaAgendaRemoverConsulta tRemoveConsulta = new TelaAgendaRemoverConsulta();
		tRemoveConsulta.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		tRemoveConsulta.setLocation(38, 65);
		desktopPane.add(tRemoveConsulta);
		
		JMenuItem RemoverConsulta = new JMenuItem("Remover Consulta");
		RemoverConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		    //Chamando a tela de remover consultas
				tRemoveConsulta.setVisible(true);
			}
		});
		RemoverConsulta.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		menuAgenda.add(RemoverConsulta);
		
	
		JMenu menuRelatorios = new JMenu("Relat\u00F3rios");
		menuRelatorios.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		menuBar.add(menuRelatorios);
		
		//Cria e instancia tela de relatorios
		final TelaRelatorios tRelatorios = new TelaRelatorios();
		tRelatorios.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		tRelatorios.setLocation(38,65);
		desktopPane.add(tRelatorios);
		
		JMenuItem selecioneRelatrio = new JMenuItem("Selecionar Relat\u00F3rio");
		selecioneRelatrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//chamando tela de relatorios
				tRelatorios.setVisible(true);
			}
		});
		selecioneRelatrio.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		menuRelatorios.add(selecioneRelatrio);
		
		JMenu menuSair = new JMenu("Outras Op\u00E7\u00F5es");
		menuSair.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		menuBar.add(menuSair);
		
		JMenuItem sairSistema = new JMenuItem("Sair");
		sairSistema.addActionListener(new ActionListener() {
			int sair;
			
			public void actionPerformed(ActionEvent arg0) {
				
				int opcao = JOptionPane.showConfirmDialog(null, "Deseja Realmente sair?");
				if(opcao == JOptionPane.YES_OPTION){
					JOptionPane.showMessageDialog(null, "Obrigado por usar o SystemClin!");
					dispose();
				}			
			}
		});
		sairSistema.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		menuSair.add(sairSistema);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setToolTipText("");
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		desktopPane.setBackground(Color.LIGHT_GRAY);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JLabel imgWallpaper = new JLabel("");
		imgWallpaper.setIcon(new ImageIcon("C:\\Users\\HelderCA\\Desktop\\wallpaper_fisioterapia23.png"));
		imgWallpaper.setBounds(0, 0, 1390, 683);
		desktopPane.add(imgWallpaper);
	}
}
