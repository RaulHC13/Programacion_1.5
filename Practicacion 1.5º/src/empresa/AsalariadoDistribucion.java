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
public class AsalariadoDistribucion extends Asalariado
{
    private String region;
    
    //Constructor
    public AsalariadoDistribucion()
    {
        super();
        region="";                 
    }
    
    //Constructor con parámetros
    public AsalariadoDistribucion(String nombre, String nif, int edad, int vacaciones, 
            String region, String actividad)
    {
        super(nombre,nif,edad,vacaciones,actividad);
        
        setRegion(region);
        
    }  
    
    public AsalariadoDistribucion(AsalariadoDistribucion asalariado)
    {
        //super(asalariado.getNombre(),asalariado.getNif(),asalariado.getEdad(),asalariado.getVacaciones(),asalariado.getActividad());
        super();
        if(asalariado==null)
        {
            throw new NullPointerException("No se puede copiar un asalariado de ditrubución nulo.");
        }
                
        setNombre(asalariado.getNombre());
        setNif(asalariado.getNif());
        setEdad(asalariado.getEdad());
        setVacaciones(asalariado.getVacaciones());
        setActividad(asalariado.getActividad());        
        setRegion(asalariado.getRegion());
        
        
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        if (region==null || region.equals(""))
            throw new IllegalArgumentException("La región de un asalariado de distribución no puede ser nula o estar vacía");
        
        this.region = region;
    }
    
    public String mensaje()
    {
        return "Soy asalariado de Distribución";
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\nRegión: "+region ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.region);
        hash = 11 * hash + Objects.hashCode(this.actividad);
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
        final AsalariadoDistribucion other = (AsalariadoDistribucion) obj;
        if (!Objects.equals(this.region, other.region)) {
            return false;
        }
        if (!Objects.equals(this.actividad, other.actividad)) {
            return false;
        }
        return true;
    }
    
    
}
