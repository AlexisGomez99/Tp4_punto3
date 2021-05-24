package ar.edu.unrn.modelo;

import java.util.ArrayList;
import java.util.List;

public class PackDeSeguros implements GestorSeguros{
	private String nombre;
	private List<GestorSeguros> listaSeguros= new ArrayList<GestorSeguros>();
	public PackDeSeguros(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void agregarSeguro(GestorSeguros seguro) {
		listaSeguros.add(seguro);
	}

	@Override
	public double calcularSeguro() {
		return 0;
	}

	@Override
	public double calcularTotalSeguros() {
		double total=calcularSeguro();
		for(GestorSeguros seguro: listaSeguros) {
			total= total + seguro.calcularTotalSeguros();
		}
		return total*0.05;
	}
	
}
