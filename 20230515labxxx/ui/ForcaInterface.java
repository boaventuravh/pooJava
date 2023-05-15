package ui;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class ForcaInterface {

	private JFrame frame;
	private ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtLetra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForcaInterface window = new ForcaInterface();
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
	public ForcaInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 678, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panelInicio = new JPanel();
		tabbedPane.addTab("Início", null, panelInicio, null);
		panelInicio.setLayout(null);
		
		JRadioButton rdbtnFilmes = new JRadioButton("Filmes");
		rdbtnFilmes.setBounds(256, 91, 109, 23);
		panelInicio.add(rdbtnFilmes);
		
		JRadioButton rdbtnNovelas = new JRadioButton("Novelas");
		rdbtnNovelas.setBounds(256, 147, 109, 23);
		panelInicio.add(rdbtnNovelas);
		
		JRadioButton rdbtnCarros = new JRadioButton("Carros");
		rdbtnCarros.setBounds(256, 207, 109, 23);
		panelInicio.add(rdbtnCarros);
		
		buttonGroup.add(rdbtnCarros);
		buttonGroup.add(rdbtnNovelas);
		buttonGroup.add(rdbtnFilmes);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(262, 267, 150, 23);
		panelInicio.add(btnIniciar);
		
		JPanel panelJogo = new JPanel();
		tabbedPane.addTab("Jogo", null, panelJogo, null);
		panelJogo.setLayout(null);
		
		txtLetra = new JTextField();
		txtLetra.setBounds(442, 124, 146, 20);
		panelJogo.add(txtLetra);
		txtLetra.setColumns(10);
		
		JLabel lblLetra = new JLabel("Letra:");
		lblLetra.setBounds(326, 127, 46, 14);
		panelJogo.add(lblLetra);
		
		JLabel lblLetrasSorteadas = new JLabel("Já foram sorteadas:");
		lblLetrasSorteadas.setBounds(326, 182, 106, 14);
		panelJogo.add(lblLetrasSorteadas);
	}
}
