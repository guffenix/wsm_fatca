/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.examplerest.service;

import ec.edu.espe.arquitectura.examplerest.modelo.Usuario;
import javax.ejb.Local;

/**
 *
 * @author guffenix
 */
@Local
public interface BCEServiceLocal {
    public Usuario obtenerUsuario();
}
