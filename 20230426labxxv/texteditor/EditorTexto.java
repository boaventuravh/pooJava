package texteditor;

import java.awt.EventQueue;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditorTexto {
	
	private File file;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditorTexto window = new EditorTexto();
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
	public EditorTexto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 776, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JEditorPane editorTexto = new JEditorPane();
		editorTexto.setBounds(10, 11, 740, 365);
		frame.getContentPane().add(editorTexto);
		
		JButton btnLoad = new JButton("LOAD");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileSelectionBox = new JFileChooser();
				fileSelectionBox.showOpenDialog(fileSelectionBox);
				file = fileSelectionBox.getSelectedFile();
				try {
					editorTexto.setPage(file.toURI().toURL());
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnLoad.setBounds(230, 398, 89, 23);
		frame.getContentPane().add(btnLoad);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					editorTexto.write(new FileWriter(file));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSave.setBounds(444, 398, 89, 23);
		frame.getContentPane().add(btnSave);
	}
}
