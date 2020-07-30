/**
 * 
 */
package com.demo.springboot.rxjava.client.app.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springboot.rxjava.client.app.models.dao.DivisaDao;
import com.demo.springboot.rxjava.client.app.models.entity.Divisa;
import com.demo.springboot.rxjava.client.app.models.entity.DivisaResult;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import rx.Observable;
import org.json.JSONObject;
/**
 * @author roger
 *
 */
@Service
public class DivisaServiceImpl implements DivisaService{

	@Autowired
	private DivisaDao dao;
	
	@Override
	public DivisaResult findByTipoCambio(String monedaOrigen, String monedaDestino, Double montoOrigen) throws ParseException {
		// TODO Auto-generated method stub
		Divisa divisaResult= null;
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date dt = sf.parse(sf.format(new Date()));
		divisaResult = dao.obtenerPorTipoCambio(monedaOrigen, monedaDestino,  true);
		divisaResult.setMontoOrigen(montoOrigen);
		divisaResult.setMontoDestino(obtenerMontoDestino(divisaResult));
		//String cadenaJSON = "{\monto\:"+divisaResult.getMontoDestino()+"}"
		JSONObject json = new JSONObject(); 
		json.put("moneda", divisaResult.getMonedaDestino());
		
		DivisaResult divisaResultado= new DivisaResult();
		divisaResultado.setMonedaDestino(divisaResult.getMonedaDestino());
		divisaResultado.setMonedaOrigen(divisaResult.getMonedaOrigen());
		divisaResultado.setMontoDestino(divisaResult.getMontoDestino());
		divisaResultado.setMontoOrigen(divisaResult.getMontoOrigen());
		divisaResultado.setTipoCambio(divisaResult.getTipoCambio());
		return  divisaResultado;
	}

	@Override
	public Divisa save(Divisa divisa) {
		return dao.save(divisa);
	}
	
	private Double obtenerMontoDestino(Divisa divisa) {
		
		Double montoOrigen = divisa.getMontoOrigen();
		Double tipoCambio = divisa.getTipoCambio();
		
		Double montoDestino = montoOrigen*tipoCambio;
	
		return montoDestino;
	}

}
