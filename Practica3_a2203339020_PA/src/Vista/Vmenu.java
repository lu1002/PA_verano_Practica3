
package Vista;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.CardLayout;
import javax.swing.JDesktopPane;


public class Vmenu {


    public JFrame VentanaPrincipal;   
    private JMenuBar BarraMenu;
    private JMenu Moperacion,Mconfiguracion,Msalir;
   public JMenuItem SMsalida,SMcategorias,SMinsumos,SMobras;
   public JDesktopPane Escritorio;
   
   
    public Vmenu() {
    	this .VentanaPrincipal= new JFrame();
    	this.VentanaPrincipal.setBounds(100,100, 622,395);
       this.VentanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       
       this.BarraMenu = new JMenuBar();
       this.VentanaPrincipal.setJMenuBar(BarraMenu);
       this.Moperacion= new JMenu("Operacion");
       this.BarraMenu.add(Moperacion);
       this.Mconfiguracion=new JMenu("Configuracion");
       this.BarraMenu.add(Mconfiguracion);
       this.Msalir= new JMenu("Salir");
       this.BarraMenu.add(Msalir);
       
       this.SMcategorias= new JMenuItem("Categorias");
       this.Mconfiguracion.add(SMcategorias);
       this.SMinsumos= new JMenuItem("Insumos");
       this.Mconfiguracion.add(SMinsumos);
       
       this.SMobras =new JMenuItem ("Obras");
       this.Mconfiguracion.add(SMobras);
       this.SMsalida=new JMenuItem("Salida");
       this.Msalir.add(SMsalida);
       this.VentanaPrincipal.getContentPane().setLayout(new CardLayout(0,0));
       
       this.Escritorio=new JDesktopPane();
       this.VentanaPrincipal.getContentPane().add(Escritorio,"name_246389861377700");
       
       
    }
}


   