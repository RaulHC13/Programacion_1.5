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
public class AsalariadoProduccion extends Asalariado
{
    //Atributos
    String turno;
    
    //Constructor
    public AsalariadoProduccion()
    {
        super();
        turno="";        
    }
    
    //Constructor con parámetros
    public AsalariadoProduccion(String nombre, String nif, int edad, int vacaciones, 
            String turno, String actividad)
    {
        super(nombre,nif,edad,vacaciones,actividad);
        setTurno(turno);
        
        
    }
    
    public AsalariadoProduccion(AsalariadoProduccion asalariado)
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
        setTurno(asalariado.getTurno());
        
        
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        if (turno==null || turno.equals(""))
            throw new IllegalArgumentException("El turno de un asalariado de producción no puede ser nulo o vacío");
        
        this.turno = turno;
    }

    
    
        
    @Override
    public String toString()
    {
        return  super.toString() +"\nTurno: " + turno ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.turno);
        hash = 67 * hash + Objects.hashCode(this.actividad);
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
        final AsalariadoProduccion other = (AsalariadoProduccion) obj;
        if (!Objects.equals(this.turno, other.turno)) {
            return false;
        }
        
        return true;
    }
    
    
}
