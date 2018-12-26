/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.examplerest.service;

/**
 *
 * @author guffenix
 */
public class UsrFatca {
    private String cedula;
    private String rucUS;
    private String personaUS;
    private String entidadUS;
    private String direccionUS;
    private String instruccionPermanente;
    private String direccionPostal;
    private String poderNotarial;
    private String tipoFatca;

    public UsrFatca() {
    }
    
    
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getRucUS() {
        return rucUS;
    }

    public void setRucUS(String rucUS) {
        this.rucUS = rucUS;
    }

    public String getPersonaUS() {
        return personaUS;
    }

    public void setPersonaUS(String personaUS) {
        this.personaUS = personaUS;
    }

    public String getEntidadUS() {
        return entidadUS;
    }

    public void setEntidadUS(String entidadUS) {
        this.entidadUS = entidadUS;
    }

    public String getDireccionUS() {
        return direccionUS;
    }

    public void setDireccionUS(String direccionUS) {
        this.direccionUS = direccionUS;
    }

    public String getInstruccionPermanente() {
        return instruccionPermanente;
    }

    public void setInstruccionPermanente(String instruccionPermanente) {
        this.instruccionPermanente = instruccionPermanente;
    }

    public String getDireccionPostal() {
        return direccionPostal;
    }

    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public String getPoderNotarial() {
        return poderNotarial;
    }

    public void setPoderNotarial(String poderNotarial) {
        this.poderNotarial = poderNotarial;
    }

    public String getTipoFatca() {
        return tipoFatca;
    }

    public void setTipoFatca(String tipoFatca) {
        this.tipoFatca = tipoFatca;
    }
}
