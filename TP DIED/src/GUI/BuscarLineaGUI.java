package GUI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;

public class BuscarLineaGUI extends JPanel {
	
	JLabel titulo;
	JLabel lblNombre;
	JLabel lblColor;
	JLabel lblEstado;
	JLabel lblTituloResultados;
	
	JTextField txtID;
	JTextField txtNombre;
	JTextField txtColor;
	
	JComboBox cboxEstado;
	
	GridBagConstraints gbc;
	
	public BuscarLineaGUI() {
	}
	
	public BuscarLineaGUI armarBuscarLineaGUI() {
		//INICIALIZAR COMPONENTES
		
		this.gbc = new GridBagConstraints();
		this.setLayout(new GridBagLayout());
		
		this.titulo  = new JLabel("Buscar linea");
		this.lblNombre = new JLabel("Nombre");
		this.lblColor = new JLabel("Color");
		this.lblEstado = new JLabel("Estado");
		
		this.txtID = new JTextField(15);
		this.txtNombre = new JTextField(15);
		this.txtColor = new JTextField(15);
		
		this.cboxEstado = new JComboBox();
		
		gbc.anchor = GridBagConstraints.NORTHWEST;
		
		this.add(VentanaContenedora.btnMasOpciones);
		
		this.add(titulo);
		
		gbc.ipadx = 20;
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		this.add(lblNombre,gbc);
	
		gbc.gridy = 2;
		this.add(txtNombre,gbc);
		
		gbc.gridy = 3;
		this.add(lblColor,gbc);
		
		gbc.gridy = 4;
		this.add(txtColor,gbc);
		
		gbc.gridy = 5;
		this.add(lblEstado,gbc);
		
		gbc.gridy = 6;
		this.add(cboxEstado,gbc);
		
		
		gbc.gridy = 7;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(10,10,10,10);
		this.add(VentanaContenedora.btnMostrarResultadoBuscarLinea,gbc);
		
		return this;
	}
	
	public BuscarLineaGUI mostrarResultadoBuscarLineaGUI() {
		
		BuscarLineaGUI mostrarResultadoGUI = new BuscarLineaGUI().armarBuscarLineaGUI();
		
		this.lblTituloResultados = new JLabel("Resultados de la buqueda");
		
		mostrarResultadoGUI.gbc.gridx = 2;
		mostrarResultadoGUI.gbc.gridy = 0;
		mostrarResultadoGUI.gbc.anchor = GridBagConstraints.CENTER;
		
		mostrarResultadoGUI.add(lblTituloResultados,gbc);
		
		return mostrarResultadoGUI;
	}
	
}
