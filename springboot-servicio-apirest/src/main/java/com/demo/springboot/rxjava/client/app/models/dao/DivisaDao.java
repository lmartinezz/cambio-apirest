/**
 * 
 */
package com.demo.springboot.rxjava.client.app.models.dao;

import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.demo.springboot.rxjava.client.app.models.entity.Divisa;


/**
 * @author roger
 *
 */
public interface DivisaDao extends PagingAndSortingRepository<Divisa, Long> {
	
	@Query("select u from Divisa u where u.monedaOrigen = ?1 and u.monedaDestino = ?2 and u.fechaTipoCambio = to_date(sysdate, 'YYYY-MM-DD') and u.enabled = ?3")
	Divisa obtenerPorTipoCambio(String monedaorigen, String monedadestino, Boolean enabled );
	
}
