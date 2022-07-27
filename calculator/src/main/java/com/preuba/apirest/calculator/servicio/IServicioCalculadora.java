package com.preuba.apirest.calculator.servicio;
import java.math.BigDecimal;


public interface IServicioCalculadora {

	double sumar(BigDecimal primerNumero, BigDecimal segundoNumero);
	
	double restar(BigDecimal primerNumero, BigDecimal segundoNumero);
}

