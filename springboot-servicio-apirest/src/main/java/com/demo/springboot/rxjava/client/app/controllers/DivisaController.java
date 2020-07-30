package com.demo.springboot.rxjava.client.app.controllers;

import java.net.URI;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.support.WebExchangeBindException;

import com.demo.springboot.rxjava.client.app.models.entity.Divisa;
import com.demo.springboot.rxjava.client.app.models.entity.DivisaResult;
import com.demo.springboot.rxjava.client.app.services.DivisaService;

import rx.Observable;

@RestController
@RequestMapping("api/divisa")
public class DivisaController {

	@Autowired
	private DivisaService divisaService;
	
	@GetMapping("/{monedaOrigen}/{monedaDestino}/{cantidad}")
	public DivisaResult ver (@PathVariable String monedaOrigen, @PathVariable String monedaDestino, @PathVariable Double cantidad) throws ParseException{
		
		
		return  divisaService.findByTipoCambio(monedaOrigen, monedaDestino, cantidad);
	}
	
	@PostMapping
	public ResponseEntity<Map<String, Object>> crear(@Valid @RequestBody Divisa observableDivisa){
		Map<String, Object> respuesta = new HashMap<String, Object>();
		divisaService.save(observableDivisa);
		respuesta.put("Divisa", observableDivisa);
		respuesta.put("mensaje", "Divisa creado con éxito");
		respuesta.put("timestamp", new Date());
        return ResponseEntity
        		.created(URI.create("/api/divisa/"))
                .body(respuesta);
		

	}
}
