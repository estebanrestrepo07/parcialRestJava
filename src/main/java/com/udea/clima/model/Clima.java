/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.clima.model;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Esteban / Jagler
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@ApiModel(description = "Todos los detalles del clima")
@Entity
public class Clima implements Serializable {
    
    @ApiModelProperty(notes = "La BD genera el ID del clima")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idclima")
    private Long idClima;
    
    @ApiModelProperty(notes = "El nombre de la ciudad")
    @Column(name = "ciudad")
    private String ciudad;
    
    @ApiModelProperty(notes = "El nombre del pais")
    @Column(name = "pais")
    private String pais;
    
    @ApiModelProperty(notes = "velocidad del Viento")
    @Column(name = "velviento")
    private Double velViento;
    
    @ApiModelProperty(notes = "direccion del viento")
    @Column(name = "dirviento")
    private String dirViento;
    
    @ApiModelProperty(notes = "sensacion del clima")
    @Column(name = "sensacion")
    private String sensacion;
    
    @ApiModelProperty(notes = "porcentaje precipitacion")
    @Column(name = "precipitacion")
    private Double precipitacion;

    public Long getIdClima(){
        return idClima;
    } 
}
