package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.*;
import vista.*;
	
public class controladorCalculadora implements ActionListener{
	private vistaCalculadora vista;
	private modeloOperaciones modelo;
	
	public controladorCalculadora(modeloOperaciones modelo,vistaCalculadora vista) {
		this.vista = vista;
		this.modelo = modelo;
		this.vista.bCalcular.addActionListener(this);
	}
	public void iniciarVista() {
		vista.setTitle("Calculadora suma");
		vista.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		modelo.setNumero1(Double.parseDouble(vista.textNum1.getText()));
		modelo.setNumero2(Double.parseDouble(vista.textNum2.getText()));
		
		if(e.getSource()==vista.bCalcular) {
			modelo.Operacion();
		}
		vista.labelRespuesta.setText(String.valueOf(modelo.getTotal()));
	}
	
}