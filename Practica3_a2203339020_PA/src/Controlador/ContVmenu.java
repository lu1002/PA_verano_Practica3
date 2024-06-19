package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Vista.Vmenu;

public class ContVmenu implements ActionListener {

	private Vmenu vista;
	private JFrame ventana;

	public ContVmenu() {
		this.vista = new Vmenu();

		this.vista.SMsalida.addActionListener(this);
		this.vista.SMcategorias.addActionListener(this);
		this.vista.SMinsumos.addActionListener(this);
		this.vista.SMobras.addActionListener(this);
		this.vista.VentanaPrincipal.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.vista.SMcategorias)
			JOptionPane.showInternalMessageDialog(this.vista.Escritorio, "Oprimiste Categorias");
		else
			if (e.getSource() == this.vista.SMinsumos)
			{JOptionPane.showInternalMessageDialog(this.vista.Escritorio, "Oprimiste Insumos");
			ContVinsumos hijo= new ContVinsumos(this.vista.VentanaPrincipal.getJMenuBar());
			this.vista.Escritorio.add(hijo.vistahijo.ventanahijo);
			hijo.vistahijo.ventanahijo.setVisible(true);
			}
		else
			if (e.getSource() == this.vista.SMobras)
			JOptionPane.showInternalMessageDialog(this.vista.Escritorio, "Oprimiste Obras");
		else 
			if (e.getSource() == this.vista.SMsalida)
			JOptionPane.showInternalMessageDialog(this.vista.Escritorio, "Oprimiste Salir");
		this.vista.VentanaPrincipal.dispose();

	}

}
