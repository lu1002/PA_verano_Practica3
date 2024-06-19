package Librerias;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Modelo.Categoria;
import Modelo.ListaCategorias;

public class Archivotxt {

	private String nombreArchivo;

	public Archivotxt(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public void guardar(String texto) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
			writer.write(texto);

		} catch (IOException e) {
			System.out.println("Error al guardar el archivo: " + e.getMessage());
		}
	}

	public ArrayList<String[]> cargar() {
		ArrayList<String[]> lineas = new ArrayList<>();
		if (this.existe()) {
			try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
				String linea;
				while ((linea = reader.readLine()) != null) {
					String[] elementos = linea.split(",");

					lineas.add(elementos);

				}

			} catch (IOException e) {
				System.err.println("Error al cargar el archivo:" + e.getMessage());
			}
		} else
			lineas = null;
		return lineas;
	}

	public boolean existe() {
		File archivo = new File(this.nombreArchivo);
		return archivo.exists();
	}
}
