package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CampeonatoController;
import model.Campeonato;
import model.Jogada;
import model.Jogador;
import model.Rodada;
import model.Sequencia;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Comparator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CompletableFuture;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class geniusView {

	private JFrame frame;
	private JLabel lblTabuleiro;
	private JTextField txtTituloCampeonato;
	private JTabbedPane tabbedPane;
	private JLabel lblJogadorAtual;
	private ButtonGroup bgQtdeJogadores = new ButtonGroup();
	private ButtonGroup bgDificuldade = new ButtonGroup();
	private ButtonGroup bgVelocidade =  new ButtonGroup();
	private JTextField txtNomeJogador;
	private JTextField txtApelidoJogador;
	private JLabel lblTextoRelatorio;
	
	private Campeonato campeonato;
	private Sequencia sequencia;
	private String relatorio = "";
	
	int indexJogador = 0;
	int indexSequencia = 0;
	int indexRodada = 0;
	
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
		frame.setBounds(100, 100, 1259, 708);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
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
				int qtdJogadores = 0;
				int dificuldade = 1;
				int velocidade = 1;
				
				
				if(rbQtdJogadores2.isSelected())
					qtdJogadores = 2;
				else if(rbQtdJogadores3.isSelected())
					qtdJogadores = 3;
				else if(rbQtdJogadores4.isSelected())
					qtdJogadores = 4;
				
				if (rbDificuldade1.isSelected())
					dificuldade = 1;
				else if (rbDificuldade2.isSelected())
					dificuldade = 2;
				else if (rbDificuldade3.isSelected())
					dificuldade = 3;
				
				if (rbVelocidade1.isSelected())
					velocidade = 1;
				else if (rbVelocidade2.isSelected())
					velocidade = 2;
				else if (rbVelocidade3.isSelected())
					velocidade = 3;
				
				registrarCampeonato(titulo, qtdJogadores, dificuldade, velocidade);
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
		
		
		JLabel lblNumeracaoJogador = new JLabel("Jogador: 1");
		lblNumeracaoJogador.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNumeracaoJogador.setBounds(322, 69, 100, 14);
		pnlRegistroJogadores.add(lblNumeracaoJogador);
		
		lblTabuleiro = new JLabel("");
		lblTabuleiro.setBounds(0, 0, 959, 641);
		lblTabuleiro.setIcon(new ImageIcon(geniusView.class.getResource("/files/00Neutro.png")));
		lblTabuleiro.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		JButton btnRegistrarJogador = new JButton("Registrar");
		btnRegistrarJogador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Jogador jogador = new Jogador(txtNomeJogador.getText(), txtApelidoJogador.getText());
				
				campeonato.addJogadorCampeonato(jogador);
								
				
				if(campeonato.getJogadoresCampeonato().size() <= campeonato.getQtdJogadores() - 1)
				{
					txtNomeJogador.setText(null);
					txtApelidoJogador.setText(null);
					lblNumeracaoJogador.setText("Jogador: " + (campeonato.getJogadoresCampeonato().size() + 1) );
				}				
				
				else 
				{					
					sequencia = new Sequencia();
					
					lblJogadorAtual.setText("Jogador: " + campeonato.getJogadoresCampeonato().get(indexJogador).getNome());
					
					tabbedPane.setSelectedIndex(2);
					
					playSequencia();
					
				}
							
				
			}
		});
		btnRegistrarJogador.setBounds(266, 305, 169, 23);
		pnlRegistroJogadores.add(btnRegistrarJogador);
		
		
		
		JPanel pnlJogo = new JPanel();
		tabbedPane.addTab("Jogo", null, pnlJogo, null);
		pnlJogo.setLayout(null);
		
		pnlJogo.add(lblTabuleiro);
		
		JButton btnVerde = new JButton("");
		btnVerde.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
					
				lblTabuleiro.setIcon(new ImageIcon(geniusView.class.getResource(
					(btnVerde.getModel().isPressed()) ? "/files/01VerdePressionado.png" : "/files/00Neutro.png")));
							
			}
		});
		btnVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Verde clicado");
				campeonato.getJogadoresCampeonato().get(indexJogador).getSequencia().getSequenciaCores().add(1);
				if(campeonato.getJogadoresCampeonato().get(indexJogador).getSequencia().getSequenciaCores().size() >= sequencia.getSequenciaCores().size())
					comparaSequencia();
				
			}
		});
		btnVerde.setBounds(212, 53, 244, 246);
		btnVerde.setOpaque(false);
		btnVerde.setContentAreaFilled(false);
		btnVerde.setBorderPainted(false);
		pnlJogo.add(btnVerde);
		
		JButton btnAmarelo = new JButton("");
		btnAmarelo.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				lblTabuleiro.setIcon(new ImageIcon(geniusView.class.getResource(
						(btnAmarelo.getModel().isPressed()) ? "/files/02AmareloPressionado.png" : "/files/00Neutro.png")));
				
			}
		});
		btnAmarelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Amarelo clicado");
				campeonato.getJogadoresCampeonato().get(indexJogador).getSequencia().getSequenciaCores().add(2);
				if(campeonato.getJogadoresCampeonato().get(indexJogador).getSequencia().getSequenciaCores().size() >= sequencia.getSequenciaCores().size())
					comparaSequencia();
			}
		});
		btnAmarelo.setBounds(488, 53, 244, 246);
		btnAmarelo.setOpaque(false);
		btnAmarelo.setContentAreaFilled(false);
		btnAmarelo.setBorderPainted(false);
		pnlJogo.add(btnAmarelo);
		
		JButton btnAzul = new JButton("");
		btnAzul.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				lblTabuleiro.setIcon(new ImageIcon(geniusView.class.getResource(
						(btnAzul.getModel().isPressed()) ? "/files/03AzulPressionado.png" : "/files/00Neutro.png")));
				
			}
		});
		btnAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Azul clicado");
				campeonato.getJogadoresCampeonato().get(indexJogador).getSequencia().getSequenciaCores().add(3);
				if(campeonato.getJogadoresCampeonato().get(indexJogador).getSequencia().getSequenciaCores().size() >= sequencia.getSequenciaCores().size())
					comparaSequencia();
			}
		});
		btnAzul.setBounds(488, 341, 244, 246);
		btnAzul.setOpaque(false);
		btnAzul.setContentAreaFilled(false);
		btnAzul.setBorderPainted(false);
		pnlJogo.add(btnAzul);
		
		JButton btnVermelho = new JButton("");
		btnVermelho.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				lblTabuleiro.setIcon(new ImageIcon(geniusView.class.getResource(
						(btnVermelho.getModel().isPressed()) ? "/files/04VermelhoPressionado.png" : "/files/00Neutro.png")));
				
			}
		});
		btnVermelho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Vermelho clicado");
				campeonato.getJogadoresCampeonato().get(indexJogador).getSequencia().getSequenciaCores().add(4);
				if(campeonato.getJogadoresCampeonato().get(indexJogador).getSequencia().getSequenciaCores().size() >= sequencia.getSequenciaCores().size())
					comparaSequencia();
			}
		});
		btnVermelho.setBounds(212, 341, 244, 246);
		btnVermelho.setOpaque(false);
		btnVermelho.setContentAreaFilled(false);
		btnVermelho.setBorderPainted(false);
		pnlJogo.add(btnVermelho);
		
		lblJogadorAtual = new JLabel("Jogador: ");
		lblJogadorAtual.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblJogadorAtual.setHorizontalAlignment(SwingConstants.LEFT);
		lblJogadorAtual.setBounds(969, 53, 259, 103);
		lblJogadorAtual.setVisible(true);
		pnlJogo.add(lblJogadorAtual);
		
		JPanel pnlRelatorio = new JPanel();
		tabbedPane.addTab("Relatório", null, pnlRelatorio, null);
		pnlRelatorio.setLayout(null);
		
		JLabel lblTituloRelatorio = new JLabel("RELATÓRIO");
		lblTituloRelatorio.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTituloRelatorio.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloRelatorio.setBounds(300, 27, 136, 53);
		pnlRelatorio.add(lblTituloRelatorio);		
		
		lblTextoRelatorio = new JLabel("-------");
		lblTextoRelatorio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTextoRelatorio.setVerticalAlignment(SwingConstants.TOP);
		lblTextoRelatorio.setHorizontalAlignment(SwingConstants.LEFT);
		lblTextoRelatorio.setBounds(60, 117, 733, 343);
		pnlRelatorio.add(lblTextoRelatorio);
		
	}
	
	public void registrarCampeonato(String titulo, int qtdJogadores, int dificuldade, int velocidade) {
				
		campeonato = new Campeonato(titulo, qtdJogadores, dificuldade, velocidade);
		
	}
	
	public void registrarJogadores(Jogador jogador) {
		
		campeonato.addJogadorCampeonato(jogador);
		
	}
	
	public void adicionarRodada(Rodada rodada) {
		campeonato.addRodada(rodada);
	}
	
	public void comparaSequencia() {
		
		Timer timer = new Timer();
		
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				if(sequencia.getSequenciaCores().equals(campeonato.getJogadoresCampeonato().get(indexJogador).getSequencia().getSequenciaCores())) {
					campeonato.getJogadoresCampeonato().get(indexJogador).addPonto();
					campeonato.getJogadoresCampeonato().get(indexJogador).getSequencia().getSequenciaCores().clear();
					playSequencia();
				}
				
				else {
					if(indexJogador == campeonato.getJogadoresCampeonato().size() - 1) {
						
						ordenaJogadoresPorPontos();
						geraRelatorio(); 
						tabbedPane.setSelectedIndex(3);
					}
						
					
					else {
						System.out.println("Sequencia jogador: " + campeonato.getJogadoresCampeonato().get(indexJogador).getSequencia().getSequenciaCores());
						System.out.println("Errou!");
						sequencia.getSequenciaCores().clear();
						sequencia = new Sequencia();
						indexJogador++;
						lblJogadorAtual.setText("Jogador: " + campeonato.getJogadoresCampeonato().get(indexJogador).getNome());
						playSequencia();
					}
					
				}
			}
		}, 2000);
		
		
	}
	
	public void addToSequenciaJogador(int idCor) {

		campeonato.getJogadoresCampeonato().get(indexJogador).getSequencia().addToSequencia(idCor);
		
	}
	
	public void geraRelatorio () {
		int i = 1;
		relatorio += "<html>";
		//<html>Hello World!<br/>blahblahblah</html>
		for (Jogador jo : campeonato.getJogadoresCampeonato()) {
			
			relatorio += i + "º: " + jo.getNome() + " com " + jo.getPontos() + " pontos <br/>";
			
			i++;
		}
		relatorio += "</html>";
		lblTextoRelatorio.setText(relatorio);
		
	}
	
	public void ordenaJogadoresPorPontos() {
		
		Collections.sort(campeonato.getJogadoresCampeonato(), new Comparator<Jogador>() {

			@Override
			public int compare(Jogador o1, Jogador o2) {
				
				return o2.getPontos() - o1.getPontos();
			}
		});
		
	}
	
	public void playSequencia() {
		
		Timer timer = new Timer();
		indexSequencia = 0;

		sequencia.addRandomToSequencia();

		System.out.println("Jogador: " + campeonato.getJogadoresCampeonato().get(indexJogador).getNome());
		System.out.println(sequencia.getSequenciaCores());
		
		TimerTask piscaBotao = new TimerTask() {

			@Override
			public void run() {
				if (indexSequencia < sequencia.getSequenciaCores().size()) {
					
					switch(sequencia.getSequenciaCores().get(indexSequencia)) {
					
						case 1: {
							lblTabuleiro.setIcon(new ImageIcon(geniusView.class.getResource(("/files/01VerdePressionado.png"))));
							break;
						}
						case 2: {
							lblTabuleiro.setIcon(new ImageIcon(geniusView.class.getResource(("/files/02AmareloPressionado.png"))));
							break;
						}
						case 3: {
							lblTabuleiro.setIcon(new ImageIcon(geniusView.class.getResource(("/files/03AzulPressionado.png"))));
							break;
						}
						case 4: {
							lblTabuleiro.setIcon(new ImageIcon(geniusView.class.getResource(("/files/04VermelhoPressionado.png"))));
							break;
						}
					}
					indexSequencia++;
				
				}
				
				else {
					lblTabuleiro.setIcon(new ImageIcon(geniusView.class.getResource(("/files/00Neutro.png"))));
					timer.cancel();
				}
			
			}
		};
		
		timer.scheduleAtFixedRate(piscaBotao, 1000, 1000);
		
	}	
}
