/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.centrodeportivo.entities;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author estudiante
 */
@Entity
public class ZonaCuerpoEntity  extends BaseEntity implements Serializable
{
    private String nombre;
    

    public void setNombre(String nombre)
    {
         this.nombre = nombre;
    }
    
    public String getNombre( )
    {
        return nombre;
    }
    
}