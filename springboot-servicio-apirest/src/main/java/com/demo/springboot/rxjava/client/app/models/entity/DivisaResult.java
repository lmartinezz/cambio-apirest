package com.demo.springboot.rxjava.client.app.models.entity;

import java.io.Serializable;

public class DivisaResult implements Serializable {
 /**
	 * 
	 */
	private static final long serialVersionUID = -2367943836695747802L;

Double montoOrigen;
 
 Double montoDestino;
 
 String monedaOrigen;
 
 String monedaDestino;
 
 Double tipoCambio;



public String getMonedaOrigen() {
	return monedaOrigen;
}

public void setMonedaOrigen(String monedaOrigen) {
	this.monedaOrigen = monedaOrigen;
}

public String getMonedaDestino() {
	return monedaDestino;
}

public void setMonedaDestino(String monedaDestino) {
	this.monedaDestino = monedaDestino;
}

public Double getMontoOrigen() {
	return montoOrigen;
}

public void setMontoOrigen(Double montoOrigen) {
	this.montoOrigen = montoOrigen;
}

public Double getMontoDestino() {
	return montoDestino;
}

public void setMontoDestino(Double montoDestino) {
	this.montoDestino = montoDestino;
}

public Double getTipoCambio() {
	return tipoCambio;
}

public void setTipoCambio(Double tipoCambio) {
	this.tipoCambio = tipoCambio;
}

}
