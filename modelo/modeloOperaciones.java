package modelo;

public class modeloOperaciones {
	private double numero1;
	private double numero2;
	private double total;
	public double getNumero1() {
		return this.numero1;
	}
	public void setNumero1(double num1) {
		this.numero1 = num1;
	}
	
	public double getNumero2() {
		return this.numero2;
	}
	public void setNumero2(double num2) {
		this.numero2 = num2;
	}
	public double getTotal() {
		return this.total;
	}
	public double Operacion() {
		this.total =  this.numero1 + this.numero2;
		return this.total;
	}
	
}
