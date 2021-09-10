package GUI;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class MenuPrincipalGUI extends JPanel{
	
	public MenuPrincipalGUI() {
	}
	
	public MenuPrincipalGUI armarMenuPrincipalGUI() {
		this.setLayout(new GridLayout(0,1));
		
		this.add(VentanaContenedora.btnDarAltaEstacion);
		this.add(VentanaContenedora.btnEditarEstacion);
		this.add(VentanaContenedora.btnDarBajaEstacion);
		this.add(VentanaContenedora.btnBuscarEstacion);
		this.add(VentanaContenedora.btnRegistrarInicioTareaDeMantenimiento);
		this.add(VentanaContenedora.btnRegistrarFinTareaDeMantenimiento);
		this.add(VentanaContenedora.btnDarAltaLinea);
		this.add(VentanaContenedora.btnDarBajaLinea);
		this.add(VentanaContenedora.btnBuscarLinea);
		this.add(VentanaContenedora.btnRegistrarTrayecto);
		
		return this;
	}

}
