/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.clima.controller;

import com.udea.clima.exception.ModelNotFoundException;
import com.udea.clima.model.Clima;
import com.udea.clima.service.ClimaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Esteban
 */
@RestController
@RequestMapping("/clima")
@CrossOrigin("*")
@Api(value="Sistema para gestion del clima")
public class ClimaController {
    
    @Autowired
    ClimaService climaService;
    
    @ApiOperation(value="agregar informacion clima")
    @PostMapping("/agg")
    public long agg(@RequestHeader(value="udeaHeader") String headerStr, @RequestBody Clima clima){
        climaService.agg(clima);
        return clima.getIdClima();
    };


    @ApiOperation(value = "clima en una ciudad", response = List.class)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successfully retrieved clima")
        ,@ApiResponse(code = 401, message = "You are not authorized to view the resource")
        ,@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden")
        ,@ApiResponse(code = 404, message = "The resource you were trying to reach is not found")})
    @GetMapping("/get")
    public Iterable<Clima> getClima( @RequestHeader(value="udeaHeader") String headerStr){
        
        Iterable<Clima> climas = climaService.getClima();
        return climas;
        
//        throw new ModelNotFoundException("ID de persona invalido");
    }
}
