import java.awt.EventQueue;

import Controlador.ContVmenu;

public class Principal {

	ContVmenu ventana;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContVmenu ventana = new ContVmenu();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
