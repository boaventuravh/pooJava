package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Campeonato;
import model.Jogador;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class geniusView {

	private JFrame frame;
	private JTextField txtTituloCampeonato;
	private ButtonGroup bgQtdeJogadores = new ButtonGroup();
	private ButtonGroup bgDificuldade = new ButtonGroup();
	private ButtonGroup bgVelocidade =  new ButtonGroup();
	private Campeonato campeonato;
	private JTextField txtNomeJogador;
	private JTextField txtApelidoJogador;
	private int numeroJogador;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					geniusView window = new geniusView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public geniusView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 783, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel pnlMenuPrincipal = new JPanel();
		tabbedPane.addTab("Menu", null, pnlMenuPrincipal, null);
		pnlMenuPrincipal.setLayout(null);
		
		txtTituloCampeonato = new JTextField();
		txtTituloCampeonato.setBounds(302, 86, 246, 20);
		pnlMenuPrincipal.add(txtTituloCampeonato);
		txtTituloCampeonato.setColumns(10);
		
		JLabel lblTituloCampeonato = new JLabel("Título do campeonato:");
		lblTituloCampeonato.setBounds(109, 89, 145, 14);
		pnlMenuPrincipal.add(lblTituloCampeonato);
		
		JLabel lblQtdeJogadores = new JLabel("Quantidade de jogadores:");
		lblQtdeJogadores.setBounds(109, 133, 145, 14);
		pnlMenuPrincipal.add(lblQtdeJogadores);
		
		JRadioButton rbQtdJogadores2 = new JRadioButton("2", true);
		rbQtdJogadores2.setBounds(302, 129, 55, 23);
		pnlMenuPrincipal.add(rbQtdJogadores2);
		
		JRadioButton rbQtdJogadores3 = new JRadioButton("3");
		rbQtdJogadores3.setBounds(419, 129, 55, 23);
		pnlMenuPrincipal.add(rbQtdJogadores3);
		
		JRadioButton rbQtdJogadores4 = new JRadioButton("4");
		rbQtdJogadores4.setBounds(520, 129, 55, 23);
		pnlMenuPrincipal.add(rbQtdJogadores4);
		
		bgQtdeJogadores.add(rbQtdJogadores2);
		bgQtdeJogadores.add(rbQtdJogadores3);
		bgQtdeJogadores.add(rbQtdJogadores4);
		
		JLabel lblDificuldade = new JLabel("Dificuldade:");
		lblDificuldade.setBounds(109, 184, 69, 14);
		pnlMenuPrincipal.add(lblDificuldade);
		
		JRadioButton rbDificuldade1 = new JRadioButton("1", true);
		rbDificuldade1.setBounds(302, 180, 55, 23);
		pnlMenuPrincipal.add(rbDificuldade1);
		
		JRadioButton rbDificuldade2 = new JRadioButton("2");
		rbDificuldade2.setBounds(419, 180, 55, 23);
		pnlMenuPrincipal.add(rbDificuldade2);
		
		JRadioButton rbDificuldade3 = new JRadioButton("3");
		rbDificuldade3.setBounds(520, 180, 55, 23);
		pnlMenuPrincipal.add(rbDificuldade3);
		
		bgDificuldade.add(rbDificuldade1);
		bgDificuldade.add(rbDificuldade2);
		bgDificuldade.add(rbDificuldade3);
		
		
		JLabel lblVelocidade = new JLabel("Velocidade:");
		lblVelocidade.setBounds(109, 236, 69, 14);
		pnlMenuPrincipal.add(lblVelocidade);
		
		JRadioButton rbVelocidade1 = new JRadioButton("1", true);
		rbVelocidade1.setBounds(302, 232, 55, 23);
		pnlMenuPrincipal.add(rbVelocidade1);
		
		JRadioButton rbVelocidade2 = new JRadioButton("2");
		rbVelocidade2.setBounds(419, 232, 55, 23);
		pnlMenuPrincipal.add(rbVelocidade2);
		
		JRadioButton rbVelocidade3 = new JRadioButton("3");
		rbVelocidade3.setBounds(520, 232, 55, 23);
		pnlMenuPrincipal.add(rbVelocidade3);
		
		bgVelocidade.add(rbVelocidade1);
		bgVelocidade.add(rbVelocidade2);
		bgVelocidade.add(rbVelocidade3);
		
		JButton btnIniciarCampeonato = new JButton("Iniciar");
		btnIniciarCampeonato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String titulo = txtTituloCampeonato.getText();
				int qtdJogadores = 2;
				int dificuldade = 1;
				int velocidade = 1;
				
				if(rbQtdJogadores3.isSelected())
					qtdJogadores = 3;
				else if(rbQtdJogadores4.isSelected())
					qtdJogadores = 4;
				
				if (rbDificuldade2.isSelected())
					dificuldade = 2;
				else if (rbDificuldade3.isSelected())
					dificuldade = 3;
				
				if (rbVelocidade2.isSelected())
					velocidade = 2;
				else if (rbVelocidade3.isSelected())
					velocidade = 3;
				
				campeonato = new Campeonato(titulo, qtdJogadores, dificuldade, velocidade);
				System.out.println("Quantidade de jogadores: " + campeonato.getQtdJogadores());
				tabbedPane.setSelectedIndex(1);
				
				
			}
		});
		btnIniciarCampeonato.setBounds(268, 320, 206, 23);
		pnlMenuPrincipal.add(btnIniciarCampeonato);
		
		JPanel pnlRegistroJogadores = new JPanel();
		tabbedPane.addTab("Registro de Jogadores", null, pnlRegistroJogadores, null);
		pnlRegistroJogadores.setLayout(null);
		
		JLabel lblRegistroJogadores = new JLabel("Registro de Jogadores");
		lblRegistroJogadores.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRegistroJogadores.setBounds(274, 29, 192, 29);
		pnlRegistroJogadores.add(lblRegistroJogadores);
		
		JLabel lblNomeJogador = new JLabel("Nome:");
		lblNomeJogador.setBounds(152, 146, 46, 14);
		pnlRegistroJogadores.add(lblNomeJogador);
		
		JLabel lblApelido = new JLabel("Apelido:");
		lblApelido.setBounds(152, 214, 61, 14);
		pnlRegistroJogadores.add(lblApelido);
		
		txtNomeJogador = new JTextField();
		txtNomeJogador.setBounds(244, 143, 234, 20);
		pnlRegistroJogadores.add(txtNomeJogador);
		txtNomeJogador.setColumns(10);
		
		txtApelidoJogador = new JTextField();
		txtApelidoJogador.setBounds(244, 211, 234, 20);
		pnlRegistroJogadores.add(txtApelidoJogador);
		txtApelidoJogador.setColumns(10);
		
		
		numeroJogador= 1;
		JLabel lblNumeracaoJogador = new JLabel("Jogador: " + numeroJogador);
		lblNumeracaoJogador.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNumeracaoJogador.setBounds(322, 69, 100, 14);
		pnlRegistroJogadores.add(lblNumeracaoJogador);
		
		//HERE
		JButton btnRegistrarJogador = new JButton("Registrar");
		btnRegistrarJogador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Jogador jogador = new Jogador(txtNomeJogador.getText(), txtApelidoJogador.getText());
				campeonato.addJogadorCampeonato(jogador);
				txtNomeJogador.setText(null);
				txtApelidoJogador.setText(null);
				
				
				if(numeroJogador < campeonato.getQtdJogadores()) {					
					numeroJogador++;
					lblNumeracaoJogador.setText("Jogador: " + numeroJogador);
				}
				else {
					tabbedPane.setSelectedIndex(2);
					for (Jogador j : campeonato.getJogadoresCampeonato()) {
						System.out.println("Jogador " + campeonato.getJogadoresCampeonato().indexOf(j) + " " + j.getNome());
					}
				}
				
				
			}
		});
		btnRegistrarJogador.setBounds(266, 305, 169, 23);
		pnlRegistroJogadores.add(btnRegistrarJogador);
		
		
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
	}
}
