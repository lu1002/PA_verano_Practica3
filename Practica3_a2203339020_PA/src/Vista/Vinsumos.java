package Vista;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JList;

public class Vinsumos  {
	
	public JInternalFrame ventanahijo;
	public JList ListaCategoria;
	public  JTextField Tid,Tinsumo;
	public JButton Bagregar,Beliminar,Bsalir;
	private JPanel panelFormulario;
	public JTable TareaProductos;
	private JLabel Limagen;

	
	public Vinsumos() {
		
		this.ventanahijo=new JInternalFrame();
		this.ventanahijo.setTitle("Administracion de productos");
		ventanahijo.getContentPane().setLayout(new CardLayout(0,0));
		this.ventanahijo.setBounds(0, 0, 577, 409);
		
		this.panelFormulario=new JPanel();
		this.ventanahijo.getContentPane().add(panelFormulario,BorderLayout.CENTER);
        this .ventanahijo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridBagLayout gbl_panelFormulario = new GridBagLayout();
		gbl_panelFormulario.columnWidths = new int[]{376, 0, 124, 0, 0};
		gbl_panelFormulario.rowHeights = new int[]{0, 35, 35, 42, 31, 135, 33, 0, 0};
		gbl_panelFormulario.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelFormulario.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelFormulario.setLayout(gbl_panelFormulario);
		
		JPanel panel1 = new JPanel();
		FlowLayout flowLayout =(FlowLayout)panel1.getLayout();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		panelFormulario.add(panel1, gbc_panel_1);
		
		
		JLabel labelId = new JLabel("ID:");
		labelId.setBounds(10, 9, 71, 20);
		this.Tid =new JTextField(10);
		this.Tid.setEditable(false);
		this.Tid.setBounds(91, 9, 147, 20);
		panel1.add(labelId);
		panel1.add(Tid);
		
		JPanel panel2 = new JPanel();
		FlowLayout flowLayout_1 =(FlowLayout)panel2.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		GridBagConstraints gbc_panel2 = new GridBagConstraints();
		gbc_panel2.insets = new Insets(0, 0, 5, 5);
		gbc_panel2.fill = GridBagConstraints.BOTH;
		gbc_panel2.gridx = 0;
		gbc_panel2.gridy = 2;
		panelFormulario.add(panel2, gbc_panel2);
		
		JLabel labelInsumo = new JLabel("Insumo:");
		labelInsumo.setBounds(10, 34, 71, 20);
		this.Tinsumo= new JTextField(20);
		this.Tinsumo.setEditable(false);
		this.Tinsumo.setBounds(91, 35, 147, 20);
		panel2.add(labelInsumo);
		panel2.add(this.Tinsumo);
		
		
		JPanel panel3 = new JPanel();
		FlowLayout flowLayout_2 =(FlowLayout)panel3.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		GridBagConstraints gbc_panel3 = new GridBagConstraints();
		gbc_panel3.insets = new Insets(0, 0, 5, 5);
		gbc_panel3.fill = GridBagConstraints.BOTH;
		gbc_panel3.gridx = 0;
		gbc_panel3.gridy = 3;
		panelFormulario.add(panel3, gbc_panel3);
		
		JLabel labelCategoria = new JLabel("Categoria:");
		labelCategoria.setBounds(10, 66, 71, 20);
	    JScrollPane scrollPane_jlist = new JScrollPane();
		scrollPane_jlist.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		this.ListaCategoria= new JList();
		ListaCategoria.setVisibleRowCount(1);
		ListaCategoria.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane_jlist.setViewportView(ListaCategoria);
		this.ListaCategoria.setEnabled(true );
		panel3.add(labelCategoria);
		panel3.add(scrollPane_jlist);
		
		
		JPanel panel4 = new JPanel();
		GridBagConstraints gbc_panel4 = new GridBagConstraints();
		gbc_panel4.insets = new Insets(0, 0, 5, 5);
		gbc_panel4.fill = GridBagConstraints.BOTH;
		gbc_panel4.gridx = 0;
		gbc_panel4.gridy = 4;
		panelFormulario.add(panel4, gbc_panel4);
		
		this.Bagregar = new JButton("Agregar");
		this.Bagregar.setBounds(10, 130, 111, 20);
		this.Beliminar = new JButton("Eliminar");
		this.Beliminar.setBounds(143, 130,111, 20);
		panel4.add(this.Bagregar);
		panel4.add(this.Beliminar);
		
		
		JPanel panel5 = new JPanel();
		GridBagConstraints gbc_panel5 = new GridBagConstraints();
		gbc_panel5.insets = new Insets(0, 0, 5, 5);
		gbc_panel5.fill = GridBagConstraints.BOTH;
		gbc_panel5.gridx = 0;
		gbc_panel5.gridy = 5;
		panelFormulario.add(panel5, gbc_panel5);
		
		JScrollPane scrollPane = new JScrollPane();
		panel5.add(scrollPane);
	    this.TareaProductos = new JTable();
		scrollPane.setViewportView(TareaProductos);
		
		
		JPanel panel6 = new JPanel();
		GridBagConstraints gbc_panel6 = new GridBagConstraints();
		gbc_panel6.insets = new Insets(0, 0, 5, 5);
		gbc_panel6.fill = GridBagConstraints.BOTH;
		gbc_panel6.gridx = 0;
		gbc_panel6.gridy = 6;
		panelFormulario.add(panel6, gbc_panel6);
		
		this.Bsalir = new JButton("Salir");
		this.Bsalir.setBounds(258, 0, 89, 23);
		panel6.add(this.Bsalir);
		
		
		JPanel panel7 = new JPanel();
		GridBagConstraints gbc_panel7 = new GridBagConstraints();
		gbc_panel7.gridheight = 4;
		gbc_panel7.insets = new Insets(0, 0, 5, 5);
		gbc_panel7.fill = GridBagConstraints.BOTH;
		gbc_panel7.gridx = 2;
		gbc_panel7.gridy = 1;
		panelFormulario.add(panel7, gbc_panel7);
		
		this.Limagen = new JLabel("Imagen");
		this.Limagen.setBounds(335, 12, 142, 107);
		panel7.add(Limagen);
		
	}
}
