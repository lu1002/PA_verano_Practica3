package Modelo;

import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;

public class ListaCategorias {
	private ArrayList<Categoria> categorias;
	
	
	
	public ListaCategorias() {
		this.categorias=new ArrayList<>();
	}
	public void agregarCategoria(Categoria categoria) {
		if (buscarCategoriaPorId(categoria.getIdcategoria())== null) {
			categorias.add(categoria);
			
		}
	}
	
	public void eliminarCategoriaPorId ( String id) {
		Categoria categoria =buscarCategoriaPorId(id);
		if (categoria!=null) {
			categorias.remove(categoria);
			
		}
	}
	
	public String toLinea () {
		String resultado="";
		for (Categoria categoria : categorias) {
			resultado+= categoria.toString() +"\n";
		
		}
		return resultado;
	}
	
	private Categoria buscarCategoriaPorId (String Id) {
		for (Categoria categoria : categorias ) {
			if (categoria.getIdcategoria().equals(Id)) {
				return categoria;
			}
		}
		return null;
	}
	
	public String buscarCategoria (String Id) {
		Categoria categoria = buscarCategoriaPorId (Id);
		if  ( categoria !=null ) {
			return categoria.getCategoria();
		}
		return null;
	}
	
	public JComboBox agregarCategoriasAComboBox (JComboBox comboBox ) {
		JComboBox aux=comboBox;
		aux.removeAllItems();
		for (Categoria categoria : categorias)
			aux.addItem (categoria);
		return aux;
	}
	public Object [] CategoriasArreglo ()
	{
		return this.categorias.toArray();
	}
	
	public void cargarCategorias (ArrayList<String[]> categoriasString) {
		for (String [] categoriaString : categoriasString) {
			String idCategoria = categoriaString [0];
			String nombreCategoria = categoriaString [1];
			Categoria categoria = new Categoria (idCategoria,nombreCategoria);
			this.agregarCategoria(categoria);
			
		}
	}

	public DefaultListModel<Categoria> generarModeloCategorias () {
		DefaultListModel<Categoria> modelo = new DefaultListModel<>();
		for ( Categoria categoria : categorias) {
			modelo.addElement(categoria);
		}
		return modelo;
	}
}
