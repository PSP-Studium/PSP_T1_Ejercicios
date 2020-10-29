package es.studium.Ejercicios;
import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;

import javax.swing.JButton;

public class Ejercicio06_ExploradorDeArchivos extends Frame implements WindowListener, ActionListener
{
	private static final long serialVersionUID = 1L;
	JButton btnNewButton = new JButton("Leer directorio");

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio06_ExploradorDeArchivos frame = new Ejercicio06_ExploradorDeArchivos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Ejercicio06_ExploradorDeArchivos()
	{
		setLayout(new FlowLayout());
		btnNewButton.addActionListener(this);
		add(btnNewButton);
		addWindowListener(this);
		setSize(200,150);
		setVisible(true);
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
	@Override
	public void windowActivated(WindowEvent arg0) {}
	@Override
	public void windowClosed(WindowEvent arg0) {}
	@Override
	public void windowClosing(WindowEvent arg0)
	{
		System.exit(0);
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {}
	@Override
	public void windowDeiconified(WindowEvent arg0) {}
	@Override
	public void windowIconified(WindowEvent arg0) {}
	@Override
	public void windowOpened(WindowEvent arg0) {}
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		FileDialog fl = new FileDialog(this, "Indicar el directorio", FileDialog.LOAD);
		fl.setDirectory("C:\\");
		fl.setVisible(true);
	}
}