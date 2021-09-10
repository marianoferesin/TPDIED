package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaContenedora extends JFrame {

	private static final long serialVersionUID = 1L;

	//BOTON PARA VOLVER AL MENU PRINCIPAL
	public static JButton btnMasOpciones;
	
	//BOTONES MENU PRINCIPAL
	public static JButton btnDarAltaEstacion;
	public static JButton btnEditarEstacion;
	public static JButton btnDarBajaEstacion;
	public static JButton btnBuscarEstacion;
	public static JButton btnRegistrarInicioTareaDeMantenimiento;
	public static JButton btnRegistrarFinTareaDeMantenimiento;
	public static JButton btnDarAltaLinea;
	public static JButton btnDarBajaLinea;
	public static JButton btnBuscarLinea;
	public static JButton btnRegistrarTrayecto;
	
	//BOTON MOSTRAR RESULTADO BUSCAR ESTACION
	public static JButton btnMostrarResultadoBuscarEstacion;
	
	//BOTON MOSTRAR RESULTADO BUSCAR LINEA
	public static JButton btnMostrarResultadoBuscarLinea;
	
	//BOTON MOSTRAR PANEL EDICION ESTACION
	public static JButton btnMostrarPanelEdicionEstacion;

	public VentanaContenedora() {	
	}
	
	public VentanaContenedora armarVentanaContenedora(String titulo) {
		
		btnMasOpciones = new JButton("+");
		
		btnDarAltaEstacion = new JButton("Dar Alta Estacion");
		btnEditarEstacion = new JButton("Editar Estacion");
		btnDarBajaEstacion = new JButton("Dar Baja Estacion");
		btnBuscarEstacion = new JButton("Buscar Estacion");
		btnRegistrarInicioTareaDeMantenimiento = new JButton("Registrar Inicio Tarea De Mantenimiento");
		btnRegistrarFinTareaDeMantenimiento = new JButton("Registrar Fin Tarea De Mantenimiento");
		btnDarAltaLinea = new JButton("Dar Alta Linea");
		btnDarBajaLinea = new JButton("Dar Baja Linea");
		btnBuscarLinea = new JButton("Buscar Linea");
		btnRegistrarTrayecto = new JButton("Registrar Trayecto");
		
		btnMostrarResultadoBuscarEstacion = new JButton("BUSCAR");
		btnMostrarResultadoBuscarLinea = new JButton("BUSCAR");
		btnMostrarPanelEdicionEstacion = new JButton("EDITAR");
		
		this.setTitle(titulo);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		
		this.setContentPane(new DarAltaEstacionGUI().armarDarAltaEstacionGUI());
		this.pack();
		this.setLocationRelativeTo(null);
		
		
		//LISTENERS
		
		btnMasOpciones.addActionListener(e -> {
			this.setContentPane(new MenuPrincipalGUI().armarMenuPrincipalGUI());
			this.pack();
		});
		
		btnDarAltaEstacion.addActionListener(e -> {
			this.setContentPane(new DarAltaEstacionGUI().armarDarAltaEstacionGUI());
			this.pack();
		});
		
		btnEditarEstacion.addActionListener(e -> {
			this.setContentPane(new EditarEstacionGUI().armarEditarEstacionGUI());
			this.pack();
		});
		
		btnDarBajaEstacion.addActionListener(e -> {
			this.setContentPane(new DarBajaEstacionGUI().armarDarBajaEstacionGUI());
			this.pack();
		});
		
		btnBuscarEstacion.addActionListener(e -> {
			this.setContentPane(new BuscarEstacionGUI().armarBuscarEstacionGUI());
			this.pack();
		});
		
		btnMostrarResultadoBuscarEstacion.addActionListener(e -> {
			this.setContentPane(new BuscarEstacionGUI().mostrarResultadoBuscarEstacionGUI());
			this.pack();
		});
		
		btnMostrarPanelEdicionEstacion.addActionListener(e -> {
			this.setContentPane(new EditarEstacionGUI().mostrarPanelEditarEstacionGUI());
			this.pack();
		});
		
		btnRegistrarInicioTareaDeMantenimiento.addActionListener(e -> {
			this.setContentPane(new RegistrarInicioTareaDeMantenimientoGUI().armarRegistrarInicioTareaDeMantenimientoGUI());
			this.pack();
		});
		
		btnRegistrarFinTareaDeMantenimiento.addActionListener(e -> {
			this.setContentPane(new RegistrarFinTareaDeMantenimientoGUI().armarRegistrarFinTareaDeMantenimientoGUI());
			this.pack();
		});
		
		btnDarAltaLinea.addActionListener(e -> {
			this.setContentPane(new DarAltaLineaGUI().armarDarAltaLineaGUI());
			this.pack();
		});
		
		btnDarBajaLinea.addActionListener(e -> {
			this.setContentPane(new DarBajaLineaGUI().armarDarBajaLineaGUI());
			this.pack();
		});
		
		btnBuscarLinea.addActionListener(e -> {
			this.setContentPane(new BuscarLineaGUI().armarBuscarLineaGUI());
			this.pack();
		});
		
		btnMostrarResultadoBuscarLinea.addActionListener(e -> {
			this.setContentPane(new BuscarLineaGUI().mostrarResultadoBuscarLineaGUI());
			this.pack();
		});
		
		btnRegistrarTrayecto.addActionListener(e -> {
			this.setContentPane(new RegistrarTrayectoLineaGUI().armarRegistrarTrayectoLineaGUI());
			this.pack();
		});
		
		return this;
	}

}
