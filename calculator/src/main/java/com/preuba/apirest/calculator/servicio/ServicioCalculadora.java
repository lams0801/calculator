package com.preuba.apirest.calculator.servicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ServicioCalculadora implements IServicioCalculadora{
	  private static final Logger LOGGER = LoggerFactory.getLogger(ServicioCalculadora.class);
	    /**
	     * Se intenta convertir la operación, sino es valido se lanza una excepcion de error,
	     * y ejecutamos la operación correspondiente
	     * @param primerNumero
	     * @param segundoNumero
	     * @param opTexto
	     * @return
	     */
	    @Override
	    public double sumar(BigDecimal primerNumero, BigDecimal segundoNumero) {

	        if (LOGGER.isDebugEnabled()) {
	            LOGGER.debug("Calculando resultado para : {} {} {}", primerNumero, segundoNumero);
	        }

	            
	        return primerNumero.add(segundoNumero).doubleValue();

	    }
	    
	    
	    @Override
	    public double restar(BigDecimal primerNumero, BigDecimal segundoNumero) {

	        if (LOGGER.isDebugEnabled()) {
	            LOGGER.debug("Calculando resultado para : {} {} {}", primerNumero, segundoNumero);
	        }
	        return primerNumero.subtract(segundoNumero).doubleValue();

	    }
}

