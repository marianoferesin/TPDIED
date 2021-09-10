package GUI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;

public class RegistrarInicioTareaDeMantenimientoGUI extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	JLabel titulo;
	JLabel lblID;
	
	JTextField txtID;
	
	JComboBox cboxEstado;
	JComboBox cboxID;
	
	JTextArea txtObservaciones;
	
	JButton btnRegistrarMantenimiento;
	
	GridBagConstraints gbc;
	
	public RegistrarInicioTareaDeMantenimientoGUI() {
	}
	
	public RegistrarInicioTareaDeMantenimientoGUI armarRegistrarInicioTareaDeMantenimientoGUI() {
		//INICIALIZAR COMPONENTES
		
		this.gbc = new GridBagConstraints();
		this.setLayout(new GridBagLayout());
		
		this.titulo  = new JLabel("Registrar Inicio Tarea De Mantenimiento");
		this.lblID = new JLabel("ID");
		
		this.txtObservaciones = new JTextArea("Obseravaciones", 5, 20);
		
		this.cboxID = new JComboBox();
		
		this.btnRegistrarMantenimiento = new JButton("Registrar mantenimiento");
		
		gbc.anchor = GridBagConstraints.NORTHWEST;
		
		this.add(VentanaContenedora.btnMasOpciones);
		
		this.add(titulo);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		this.add(lblID,gbc);
	
		gbc.gridy = 2;
		this.add(cboxID,gbc);
	
		gbc.gridy = 3;
		gbc.insets = new Insets(5,0,0,0);
		this.add(txtObservaciones,gbc);
			
		gbc.gridy = 4;
		gbc.gridheight = 2;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(10,10,10,10);
		this.add(btnRegistrarMantenimiento,gbc);
		
		return this;
	}
	

}
