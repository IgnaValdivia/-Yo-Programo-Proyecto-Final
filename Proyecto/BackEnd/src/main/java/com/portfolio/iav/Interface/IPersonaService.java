/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.iav.Interface;

import com.portfolio.iav.Entity.Persona;
import java.util.List;

/**
 *
 * @author Igna
 */
public interface IPersonaService {
    //Traer lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto persona
    public void savePersona(Persona persona);
    
    //Eliminar una persona por ID
    public void deletePersona(Long id);
    
    //Buscar persona por id
    public Persona findPersona(Long id);
}
