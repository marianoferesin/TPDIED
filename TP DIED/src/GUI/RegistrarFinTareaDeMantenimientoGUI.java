package GUI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;

public class RegistrarFinTareaDeMantenimientoGUI extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	JLabel titulo;
	JLabel lblID;
	
	JTextField txtID;
	
	JComboBox cboxEstado;
	JComboBox cboxID;
	
	JButton btnRegistrarFinMantenimiento;
	
	GridBagConstraints gbc;
	
	public RegistrarFinTareaDeMantenimientoGUI() {
	}
	
	public RegistrarFinTareaDeMantenimientoGUI armarRegistrarFinTareaDeMantenimientoGUI() {
		//INICIALIZAR COMPONENTES
		
		this.gbc = new GridBagConstraints();
		this.setLayout(new GridBagLayout());
		
		this.titulo  = new JLabel("Registrar Fin Tarea De Mantenimiento");
		this.lblID = new JLabel("ID");
		
		this.cboxID = new JComboBox();
		
		this.btnRegistrarFinMantenimiento = new JButton("Registrar fin mantenimiento");
		
		gbc.anchor = GridBagConstraints.NORTHWEST;
		
		this.add(VentanaContenedora.btnMasOpciones);
		
		this.add(titulo);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		this.add(lblID,gbc);
	
		gbc.gridy = 2;
		this.add(cboxID,gbc);
			
		gbc.gridy = 3;
		gbc.gridheight = 2;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(10,10,10,10);
		this.add(btnRegistrarFinMantenimiento,gbc);
		
		return this;
	}
	

}
