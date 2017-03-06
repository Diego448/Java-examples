public class CalculadoraAvanzada extends Calculadora {
	
	public Double segundaPotencia() {
		return operandoIzquierdo * operandoIzquierdo;
	}
	
	public String mostrarOperandos() {
		return operandoIzquierdo.toString() + "\n" + operandoDerecho.toString();
	}
	
	public String mostrarOperandosHeredado() {
		return super.mostrarOperandos();
	}
	
}