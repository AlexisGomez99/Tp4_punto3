package ar.edu.unrn.modelo;

public class Seguro implements GestorSeguros{
	private String tipoSeguro;
	private double costo;
	
	public Seguro(String tipoSeguro, double costo) {
		super();
		this.tipoSeguro = tipoSeguro;
		this.costo = costo;
	}
	
	@Override
	public double calcularSeguro() {
		return costo;
	}


	@Override
	public double calcularTotalSeguros() {
		return calcularSeguro();
	}
}
