package com.demo.springboot.rxjava.client.app.services;


import java.text.ParseException;
import java.util.Date;

import com.demo.springboot.rxjava.client.app.models.entity.Divisa;
import com.demo.springboot.rxjava.client.app.models.entity.DivisaResult;

import rx.Observable;

public interface DivisaService {

	public DivisaResult findByTipoCambio(String monedaOrigen, String monedaDestino, Double cambio) throws ParseException;
	
	public Divisa save (Divisa divisa);
	
}
