package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import Librerias.Archivotxt;
import Librerias.Librerias;
import Modelo.ListaCategorias;
import Modelo.ListaInsumos;
import Vista.Vinsumos;

public class ContVinsumos implements ActionListener {
	
	ListaInsumos listainsumo;
	ListaCategorias listacategorias;

	Archivotxt archivocategorias,archivoinsummos;
	Librerias libreria;
	
	public Vinsumos vistahijo;
	JMenuBar padre;
	

	public ContVinsumos(JMenuBar padre) {
		libreria=new Librerias();
		vistahijo = new Vinsumos();
		
		this.vistahijo.Bagregar.addActionListener(this);
		this.vistahijo.Beliminar.addActionListener(this);
		this.vistahijo.Bsalir.addActionListener(this);
		this.padre=padre;
		//this.padre=this.libreria.menuspadre(this.padre,false);
		
		
	}


	@Override
	
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == this.vistahijo.Bagregar)
				JOptionPane.showInternalMessageDialog(this.vistahijo.ventanahijo, "Agregando");
			else
				if (e.getSource() == this.vistahijo.Beliminar)
				JOptionPane.showInternalMessageDialog(this.vistahijo.ventanahijo, "Eliminando");
			else
				if (e.getSource() == this.vistahijo.Bsalir)
				JOptionPane.showInternalMessageDialog(this.vistahijo.ventanahijo, "Saliendo");
			//this.padre=this.libreria.menuspadre(this.padre,true);
			this.vistahijo.ventanahijo.dispose();

		
	}
	

}
