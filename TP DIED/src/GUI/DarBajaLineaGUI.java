package GUI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;

public class DarBajaLineaGUI extends JPanel {
	
	JButton btnDarBaja;
	
	JLabel titulo;
	JLabel lblNombre;
	
	JComboBox cboxID;
	
	GridBagConstraints gbc;
	
	public DarBajaLineaGUI() {
	}
	
	public DarBajaLineaGUI armarDarBajaLineaGUI() {
		//INICIALIZAR COMPONENTES
		
		this.gbc = new GridBagConstraints();
		this.setLayout(new GridBagLayout());
		
		this.btnDarBaja = new JButton("DAR BAJA");
		
		this.titulo  = new JLabel("Dar baja Linea");
		this.lblNombre = new JLabel("Nombre");

		this.cboxID = new JComboBox();
		
		gbc.anchor = GridBagConstraints.NORTHWEST;
		
		this.add(VentanaContenedora.btnMasOpciones);
		
		this.add(titulo);
		
		gbc.ipadx = 20;
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		this.add(lblNombre,gbc);
	
		gbc.gridy = 2;
		this.add(cboxID,gbc);
			
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(10,10,10,10);
		this.add(btnDarBaja,gbc);
		
		return this;
	}
	
	
	
}
