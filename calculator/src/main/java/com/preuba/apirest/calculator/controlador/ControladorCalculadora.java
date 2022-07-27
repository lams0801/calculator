package com.preuba.apirest.calculator.controlador;
import com.preuba.apirest.calculator.servicio.IServicioCalculadora;

import java.math.BigDecimal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ControladorCalculadora {
	
	@Autowired
    private IServicioCalculadora servicioCalculadora;

	 /**
     * Se geenra el metodo a ultilizar para el envio de los parametros solicitando un primer valor,segundo valor y la operacion a realizar,
     * y ejecutamos la operación correspondiente
     * @param primerNumero
     * @param segundoNumero
     * @param operacion
     * @return
     */

    @GetMapping(value = "/sumar")
    public ResponseEntity<Double> sumar(@Valid  @RequestParam(name = "primero", required = true) BigDecimal primerNumero,
    		@Valid  @RequestParam(name = "segundo", required = true) BigDecimal segundoNumero) {
    	
    	

        double result = this.servicioCalculadora.sumar(primerNumero, segundoNumero);
      
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    
    @GetMapping(value = "/restar")
    public ResponseEntity<Double> restar(@Valid  @RequestParam(name = "primero", required = true) BigDecimal primerNumero,
    		@Valid  @RequestParam(name = "segundo", required = true) BigDecimal segundoNumero) {
    	
    	

        double result = this.servicioCalculadora.restar(primerNumero, segundoNumero);
      
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}

