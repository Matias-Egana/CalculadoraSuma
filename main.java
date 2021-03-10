import controlador.*;
import modelo.*;
import vista.*;

public class main {
	public static void main(String[] args) {
		modeloOperaciones m1 = new modeloOperaciones();
		vistaCalculadora v1 = new vistaCalculadora();
		controladorCalculadora c1 = new controladorCalculadora(m1,v1);
		c1.iniciarVista();
		v1.setVisible(true);
	}
}
