package arvoregenealogica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class FormularioArvoreGenealogica {

	private JFrame frame;
	private JTextField txtFilho;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioArvoreGenealogica window = new FormularioArvoreGenealogica();
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
	public FormularioArvoreGenealogica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 787, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFamiliares = new JLabel("Familiares:");
		lblFamiliares.setBounds(68, 48, 52, 14);
		frame.getContentPane().add(lblFamiliares);
		
		JComboBox comboBoxFamiliares = new JComboBox();
		comboBoxFamiliares.setBounds(130, 44, 154, 22);
		frame.getContentPane().add(comboBoxFamiliares);
		
		JLabel lblFilho = new JLabel("Filho:");
		lblFilho.setBounds(314, 48, 32, 14);
		frame.getContentPane().add(lblFilho);
		
		txtFilho = new JTextField();
		txtFilho.setBounds(356, 45, 205, 20);
		frame.getContentPane().add(txtFilho);
		txtFilho.setColumns(10);
	}
}
