package GUI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;

public class RegistrarTrayectoLineaGUI extends JPanel {
	
	JButton btnDarAlta;
	
	JLabel titulo;
	JLabel lblLinea;
	JLabel lblOrigen;
	JLabel lblDestino;
	JLabel lblDistancia;
	JLabel lblDuracion;
	JLabel lblCantidadPasajeros;
	JLabel lblEstado;
	JLabel lblCosto;
	
	JComboBox cboxLinea;
	JComboBox cboxOrigen;
	JComboBox cboxDestino;
	JComboBox cboxEstado;
	
	JTextField txtDistancia;
	JTextField txtDuracion;
	JTextField txtCantidadPasajeros;
	JTextField txtCosto;
	
	JButton btnAgregarTramo;
	
	GridBagConstraints gbc;
	
	public RegistrarTrayectoLineaGUI() {
	}
	
	public RegistrarTrayectoLineaGUI armarRegistrarTrayectoLineaGUI() {
		//INICIALIZAR COMPONENTES
		
		this.gbc = new GridBagConstraints();
		this.setLayout(new GridBagLayout());
		
		this.titulo  = new JLabel("Registrar tramo");
		this.lblLinea = new JLabel("Linea");
		this.lblOrigen = new JLabel("Origen");
		this.lblDestino = new JLabel("Destino");
		this.lblDistancia = new JLabel("Distancia (en km)");
		this.lblDuracion = new JLabel("Duracion (en minutos)");
		this.lblCantidadPasajeros = new JLabel("Cantidad maxima de pasajeros");
		this.lblEstado = new JLabel("Estado");
		this.lblCosto = new JLabel("Costo");
		
		this.txtDistancia = new JTextField(15);
		this.txtDuracion = new JTextField(15);
		this.txtCantidadPasajeros = new JTextField(15);
		this.txtCosto = new JTextField(15);
		
		this.cboxLinea = new JComboBox();
		this.cboxOrigen = new JComboBox();
		this.cboxDestino = new JComboBox();
		this.cboxEstado = new JComboBox();
		
		this.btnAgregarTramo = new JButton("Agregar tramo");
		
		gbc.anchor = GridBagConstraints.NORTHWEST;
		
		this.add(VentanaContenedora.btnMasOpciones);
		
		this.add(titulo);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		this.add(lblLinea,gbc);
	
		gbc.gridy = 2;
		this.add(cboxLinea,gbc);
		
		gbc.gridy = 3;
		this.add(lblOrigen,gbc);
		
		gbc.gridy = 4;
		this.add(cboxOrigen,gbc);
		
		gbc.gridy = 5;
		this.add(lblDestino,gbc);
		
		gbc.gridy = 6;
		this.add(cboxDestino,gbc);
		
		gbc.gridy = 7;
		this.add(lblDistancia,gbc);
		
		gbc.gridy = 8;
		this.add(txtDistancia,gbc);
		
		gbc.gridy = 9;
		this.add(lblDuracion,gbc);
		
		gbc.gridy = 10;
		this.add(txtDuracion,gbc);
		
		gbc.gridy = 11;
		this.add(lblCantidadPasajeros,gbc);
		
		gbc.gridy = 12;
		this.add(txtCantidadPasajeros,gbc);
		
		gbc.gridy = 13;
		this.add(lblEstado,gbc);
		
		gbc.gridy = 14;
		this.add(cboxEstado,gbc);
		
		gbc.gridy = 15;
		this.add(lblCosto,gbc);
		
		gbc.gridy = 16;
		this.add(txtCosto,gbc);
		
		gbc.gridy = 17;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(10,10,10,10);
		this.add(btnAgregarTramo,gbc);
		
		return this;
	}
	
	
	
}
