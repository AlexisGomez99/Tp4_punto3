package ar.edu.unrn.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unrn.modelo.PackDeSeguros;
import ar.edu.unrn.modelo.Seguro;

public class GestorSegurosTest {
	
	@Test 
	public void calcularCostoDeUnSeguro() {
		//set up
		Seguro seguro = new Seguro("Automovil", 3000);
		double resultado= 3000;
		
		assertEquals(resultado,seguro.calcularSeguro());
		
	}
	
	@Test 
	public void calcularCostoDeUnPackDeSeguro() {
		//set up
		Seguro seguro1 = new Seguro("Automovil", 3000);
		Seguro seguro2 = new Seguro("Hogar", 8000);
		Seguro seguro3 = new Seguro("Medico", 5000);
		PackDeSeguros paquete= new PackDeSeguros("Pack de seguros");
		paquete.agregarSeguro(seguro1);
		paquete.agregarSeguro(seguro2);
		paquete.agregarSeguro(seguro3);
		double resultado = (3000 + 8000+ 5000)* 0.05;
		assertEquals(resultado,paquete.calcularTotalSeguros());
		
	}

}
