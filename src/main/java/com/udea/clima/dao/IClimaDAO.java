/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.clima.dao;

import com.udea.clima.model.Clima;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Esteban/jagler
 */
@Repository
public interface IClimaDAO extends CrudRepository<Clima, Long>{
//    public Clima findByCiudadPais(String ciudad, String pais);

}
