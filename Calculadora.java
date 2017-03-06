public class Calculadora implements CalculadoraBasica {
	
	public Double operandoIzquierdo = 0.0;
	public Double operandoDerecho = 0.0;
	
	public Calculadora() {
		
	}
	
	public Calculadora(Double operandoIzquierdo, Double operandoDerecho) {
		this.operandoIzquierdo = operandoIzquierdo;
		this.operandoDerecho = operandoDerecho;
	}
	
	public Double suma() {
		return operandoIzquierdo + operandoDerecho;
	}
	
	public Double resta() {
		return operandoIzquierdo - operandoDerecho;
	}
	
	public Double multiplicacion() {
		return operandoIzquierdo * operandoDerecho;
	}
	
	public Double division() {
		return operandoIzquierdo / operandoDerecho;
	}
	
	public String mostrarOperandos() {
		return this.operandoIzquierdo.toString() + ", " + this.operandoDerecho.toString();
	}
}