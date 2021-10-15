/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.clima.service;

import com.udea.clima.dao.IClimaDAO;
import com.udea.clima.model.Clima;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Esteban
 */
@Service
public class ClimaService {
    
    @Autowired
    private IClimaDAO daoClima;
    
    
    public Clima agg(Clima clima) { return daoClima.save(clima);}
    
    public Iterable<Clima> getClima() { return daoClima.findAll();}
    
}
