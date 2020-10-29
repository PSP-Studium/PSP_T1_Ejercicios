/*
 * Realizar un programa que lea en un cuadro de texto una ruta física del
 * equipo, y muestre el contenido (ficheros y carpetas) en un TextArea.
 */
package es.studium.Ejercicios;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Ejercicio05_WB_LeerRutaYMostrarEnTextArea extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	/**

	 * Launch the application.

	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Ejercicio05_WB_LeerRutaYMostrarEnTextArea frame = new Ejercicio05_WB_LeerRutaYMostrarEnTextArea();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	/**

	 * Create the frame.

	 */

	public Ejercicio05_WB_LeerRutaYMostrarEnTextArea()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		textField = new JTextField();
		textField.setBounds(143, 29, 169, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		JLabel lblRutaFsica = new JLabel("Ruta f\u00EDsica");
		lblRutaFsica.setBounds(27, 32, 71, 14);
		contentPane.add(lblRutaFsica);
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.setBounds(153, 60, 89, 23);
		contentPane.add(btnGenerar);
		JTextArea textArea = new JTextArea();
		JScrollPane textPan = new JScrollPane(textArea);
		textPan.setBounds(43, 94, 366, 144);
		contentPane.add(textPan);
		btnGenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource().equals(btnGenerar)) {
					textArea.setText(leerDirectorio(textField.getText()));
				}
			}
		});
	}
	public String leerDirectorio(String pathname)
	{
		File filePathname = new File(pathname);
		File[] files = filePathname.listFiles();
		String res = "";
		if(files!=null)
		{
			for(File element:files)
			{
				if(res=="")
				{
					if(element.isDirectory())
					{
						res = "<DIR>"+element.getName();
					}
					else
					{
						res = element.getName();
					}
				}
				else
				{
					if(element.isDirectory())
					{
						res = res + "\n<DIR>" + element.getName();
					}
					else
					{
						res = res + "\n" + element.getName();
					}
				}
			}
		}
		return res;
	}
}
