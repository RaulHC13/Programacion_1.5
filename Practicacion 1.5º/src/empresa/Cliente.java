/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package empresa;

import java.util.Objects;

/**
 *
 * @author arubio
 */
public class Cliente extends Persona 
{
    private String nombreEmpresa;
    private String telefono;
    
    public Cliente (String nombre,int edad,
            String nombreEmpresa,String telefono) 
    {
        super(nombre,edad);
        setNombreEmpresa(nombreEmpresa);
        setTelefono(telefono);
    }
    
    public Cliente (Cliente cliente)
    {
        if (cliente==null)
            throw new IllegalArgumentException("No se puede copiar un cliente nulo.");
        
        setNombre(cliente.getNombre());
        setEdad(cliente.getEdad());
        setNombreEmpresa(cliente.getNombreEmpresa());
        setTelefono(cliente.getTelefono());
    }
    
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    
    public void setNombreEmpresa(String nombreEmpresa) {
        if (nombreEmpresa==null || nombreEmpresa.equals(""))
            throw new IllegalArgumentException("El nombre de la empresa no puede ser null o estar vacío");
            
        this.nombreEmpresa = nombreEmpresa;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    @Override
    public String toString(){
        return super.toString()
           + " Nombre empresa:"
           + getNombreEmpresa() 
           + " Telefono:" + getTelefono();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nombreEmpresa);
        hash = 29 * hash + Objects.hashCode(this.telefono);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nombreEmpresa, other.nombreEmpresa)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        return true;
    }
    
    
}
