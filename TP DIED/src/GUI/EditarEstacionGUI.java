package GUI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;

public class EditarEstacionGUI extends JPanel {
	
	JLabel titulo;
	JLabel lblID;
	JLabel lblNombre;
	JLabel lblHorarioApertura;
	JLabel lblHorarioCierre;
	JLabel lblEstado;
	JLabel lblPanelDeEdicion;
	
	JTextField txtID;
	JTextField txtNombre;
	JTextField txtHorarioApertura;
	JTextField txtHorarioCierre;
	
	JComboBox cboxEstado;
	JComboBox cboxID;
	
	JButton btnGuardarCambios;
	
	GridBagConstraints gbc;
	
	public EditarEstacionGUI() {
	}
	
	public EditarEstacionGUI armarEditarEstacionGUI() {
		//INICIALIZAR COMPONENTES
		
		this.gbc = new GridBagConstraints();
		this.setLayout(new GridBagLayout());
		
		this.titulo  = new JLabel("Editar estacion");
		this.lblID = new JLabel("ID");

		this.cboxID = new JComboBox();
		
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
		this.add(VentanaContenedora.btnMostrarPanelEdicionEstacion,gbc);
		
		return this;
	}
	
	public EditarEstacionGUI mostrarPanelEditarEstacionGUI() {
		
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
		
		this.btnGuardarCambios = new JButton("Guardar cambios");
		
		EditarEstacionGUI panelDeEdicionGUI = new EditarEstacionGUI().armarEditarEstacionGUI();
		
		panelDeEdicionGUI.gbc.gridheight = 1;
		panelDeEdicionGUI.gbc.insets = new Insets(0,0,0,0);
		
		this.lblPanelDeEdicion = new JLabel("Panel de edicion");
		
		panelDeEdicionGUI.gbc.gridx = 2;
		
		panelDeEdicionGUI.gbc.gridy = 0;
		panelDeEdicionGUI.gbc.anchor = GridBagConstraints.CENTER;
		panelDeEdicionGUI.add(lblPanelDeEdicion,panelDeEdicionGUI.gbc);
		
		panelDeEdicionGUI.gbc.anchor = GridBagConstraints.NORTHWEST;
		
		panelDeEdicionGUI.gbc.gridy = 1;
		panelDeEdicionGUI.add(lblID,panelDeEdicionGUI.gbc);
	
		panelDeEdicionGUI.gbc.gridy = 2;
		panelDeEdicionGUI.add(txtID,panelDeEdicionGUI.gbc);
		
		panelDeEdicionGUI.gbc.gridy = 3;
		panelDeEdicionGUI.add(lblNombre,panelDeEdicionGUI.gbc);
		
		panelDeEdicionGUI.gbc.gridy = 4;
		panelDeEdicionGUI.add(txtNombre,panelDeEdicionGUI.gbc);
		
		panelDeEdicionGUI.gbc.gridy = 5;
		panelDeEdicionGUI.add(lblHorarioApertura,panelDeEdicionGUI.gbc);
		
		panelDeEdicionGUI.gbc.gridy = 6;
		panelDeEdicionGUI.add(txtHorarioApertura,panelDeEdicionGUI.gbc);
		
		panelDeEdicionGUI.gbc.gridy = 7;
		panelDeEdicionGUI.add(lblHorarioCierre,panelDeEdicionGUI.gbc);
		
		panelDeEdicionGUI.gbc.gridy = 8;
		panelDeEdicionGUI.add(txtHorarioCierre,panelDeEdicionGUI.gbc);
		
		panelDeEdicionGUI.gbc.gridy = 9;
		panelDeEdicionGUI.add(lblEstado,panelDeEdicionGUI.gbc);
		
		panelDeEdicionGUI.gbc.gridy = 10;
		panelDeEdicionGUI.add(cboxEstado,panelDeEdicionGUI.gbc);
	
		panelDeEdicionGUI.gbc.gridy = 11;
		panelDeEdicionGUI.gbc.anchor = GridBagConstraints.CENTER;
		panelDeEdicionGUI.gbc.insets = new Insets(10,10,10,10);
		panelDeEdicionGUI.add(btnGuardarCambios,panelDeEdicionGUI.gbc);
		
		return panelDeEdicionGUI;
	}

}
