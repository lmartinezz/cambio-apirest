package com.demo.springboot.rxjava.client.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="cambio")
public class Divisa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -596195078198831784L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Transient
	private Double montoDestino;

	@Transient
	private Double montoOrigen;

	@NotNull
	@Column(name= "precioventa")
	private Double tipoCambio;

	@Column(name= "preciocompra")
	private Double precioCompra;
	
	@NotEmpty
	@Column(name= "monedaorigen")
	private String monedaOrigen;

	@NotEmpty
	@Column(name= "monedadestino")
	private String monedaDestino;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name= "feccambio")
	private Date fechaTipoCambio;

	
	@Column(name= "fecregis")
	private Date fecregis;
	
	
	@Column(name= "enabled")
	private Boolean enabled;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getMontoDestino() {
		return montoDestino;
	}

	public void setMontoDestino(Double montoDestino) {
		this.montoDestino = montoDestino;
	}

	public Double getMontoOrigen() {
		return montoOrigen;
	}

	public void setMontoOrigen(Double montoOrigen) {
		this.montoOrigen = montoOrigen;
	}

	public Double getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(Double tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	public Date getFechaTipoCambio() {
		return fechaTipoCambio;
	}

	public void setFechaTipoCambio(Date fechaTipoCambio) {
		this.fechaTipoCambio = fechaTipoCambio;
	}

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

	public Double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(Double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public Date getFecregis() {
		return fecregis;
	}

	public void setFecregis(Date fecregis) {
		this.fecregis = fecregis;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}


}
