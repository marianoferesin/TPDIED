package GUI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;

public class BuscarEstacionGUI extends JPanel {
	
	JLabel titulo;
	JLabel lblID;
	JLabel lblNombre;
	JLabel lblHorarioApertura;
	JLabel lblHorarioCierre;
	JLabel lblEstado;
	JLabel lblTituloResultados;
	
	JTextField txtID;
	JTextField txtNombre;
	JTextField txtHorarioApertura;
	JTextField txtHorarioCierre;
	
	JComboBox cboxEstado;
	
	GridBagConstraints gbc;
	
	public BuscarEstacionGUI() {
	}
	
	public BuscarEstacionGUI armarBuscarEstacionGUI() {
		//INICIALIZAR COMPONENTES
		
		this.gbc = new GridBagConstraints();
		this.setLayout(new GridBagLayout());
		
		this.titulo  = new JLabel("Buscar estacion");
		this.lblID = new JLabel("ID");
		this.lblNombre = new JLabel("Nombre");
		this.lblHorarioApertura = new JLabel("Horario Apertura (HH:MM)");
		this.lblHorarioCierre = new JLabel("Horario Cierre (HH:MM)");
		this.lblEstado = new JLabel("Estado");
		
		this.txtID = new JTextField(15);
		this.txtNombre = new JTextField(15);
		this.txtHorarioApertura = new JTextField(15);
		this.txtHorarioCierre = new JTextField(15);
		
		this.cboxEstado = new JComboBox();
		
		gbc.anchor = GridBagConstraints.NORTHWEST;
		
		this.add(VentanaContenedora.btnMasOpciones);
		
		this.add(titulo);
		
		gbc.ipadx = 20;
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		this.add(lblID,gbc);
	
		gbc.gridy = 2;
		this.add(txtID,gbc);
		
		gbc.gridy = 3;
		this.add(lblNombre,gbc);
		
		gbc.gridy = 4;
		this.add(txtNombre,gbc);
		
		gbc.gridy = 5;
		this.add(lblHorarioApertura,gbc);
		
		gbc.gridy = 6;
		this.add(txtHorarioApertura,gbc);
		
		gbc.gridy = 7;
		this.add(lblHorarioCierre,gbc);
		
		gbc.gridy = 8;
		this.add(txtHorarioCierre,gbc);
		
		gbc.gridy = 9;
		this.add(lblEstado,gbc);
		
		gbc.gridy = 10;
		this.add(cboxEstado,gbc);
		
		
		gbc.gridy = 11;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(10,10,10,10);
		this.add(VentanaContenedora.btnMostrarResultadoBuscarEstacion,gbc);
		
		return this;
	}
	
	public BuscarEstacionGUI mostrarResultadoBuscarEstacionGUI() {
		
		BuscarEstacionGUI mostrarResultadoGUI = new BuscarEstacionGUI().armarBuscarEstacionGUI();
		
		this.lblTituloResultados = new JLabel("Resultados de la buqueda");
		
		
		mostrarResultadoGUI.gbc.gridx = 2;
		mostrarResultadoGUI.gbc.gridy = 0;
		mostrarResultadoGUI.gbc.anchor = GridBagConstraints.CENTER;
		
		mostrarResultadoGUI.add(lblTituloResultados,gbc);
		
		return mostrarResultadoGUI;
	}
	
}
