package view;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JComboBox;

public class CompraIngressoView {

	private JFrame frame;
	private ButtonGroup bgTamanhoSala = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompraIngressoView window = new CompraIngressoView();
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
	public CompraIngressoView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 652, 395);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("COMPRA DE INGRESSO");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTitulo.setBounds(239, 29, 179, 14);
		frame.getContentPane().add(lblTitulo);
		
		JLabel lblTamanhoSala = new JLabel("Selecione o tamanho da sala:");
		lblTamanhoSala.setBounds(24, 92, 179, 14);
		frame.getContentPane().add(lblTamanhoSala);
		
		JRadioButton rdbtnPequena = new JRadioButton("Pequena");
		rdbtnPequena.setBounds(209, 88, 96, 23);
		frame.getContentPane().add(rdbtnPequena);
		
		JRadioButton rdbtnMedia = new JRadioButton("Média");
		rdbtnMedia.setBounds(335, 88, 96, 23);
		frame.getContentPane().add(rdbtnMedia);
		
		JRadioButton rdbtnGrande = new JRadioButton("Grande");
		rdbtnGrande.setBounds(460, 88, 96, 23);
		frame.getContentPane().add(rdbtnGrande);
		
		bgTamanhoSala.add(rdbtnGrande);
		bgTamanhoSala.add(rdbtnMedia);
		bgTamanhoSala.add(rdbtnPequena);
		
		JComboBox<String> cmbBxSessao = new JComboBox<String>();
		cmbBxSessao.setBounds(144, 153, 135, 22);
		frame.getContentPane().add(cmbBxSessao);
		cmbBxSessao.addItem("test");
		cmbBxSessao.addItem(null);
		cmbBxSessao.setSelectedIndex(1);
		
		JLabel lblSessao = new JLabel("Selecione a sessão:");
		lblSessao.setBounds(25, 157, 122, 14);
		frame.getContentPane().add(lblSessao);
	}
}
