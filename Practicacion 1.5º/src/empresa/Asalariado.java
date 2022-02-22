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
public  class Asalariado 
{
    //Atributos
    protected String nombre, nif,actividad;
    protected int edad, vacaciones;
    
    //constructor
    public Asalariado()
    {
        this.nombre="";
        this.nif="";
        this.edad=0;
        this.vacaciones=30;
        this.actividad="";
    }
    
    //Constructor con parámetros
    public Asalariado(String nombre, String nif, int edad, int vacaciones,String actividad)
    {
        setNombre(nombre);
        setNif(nif);
        setEdad(edad);
        setVacaciones(vacaciones);
        setActividad(actividad);
        
    }
    
    public Asalariado(Asalariado asalariado)
    {
        if (asalariado==null)
            throw new NullPointerException("No se pueden copiar un asalariado nulo.");
        
        setNombre(asalariado.getNombre());
        setNif(asalariado.getNif());
        setEdad(asalariado.getEdad());
        setVacaciones(asalariado.getVacaciones());
        setActividad(asalariado.getActividad());
    }
  
    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        if (actividad==null || actividad.equals(""))
            throw new IllegalArgumentException("La actividad de un asalariado de distribución no puede ser nula o estar vacía");
        
        this.actividad = actividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre==null || nombre.equals(""))
            throw new IllegalArgumentException("El nombre de un asalariado no puede ser nulo o vacío");
        
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        if (nif==null || nif.equals(""))
            throw new IllegalArgumentException("El nif de un asalariado no puede ser nulo");
    
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad<=0)
            throw new IllegalArgumentException("La edad de un asalariado no puede ser negativa");
        
        this.edad = edad;
    }

    public int getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(int vacaciones) {
        if (vacaciones<=0 || vacaciones>30)
            throw new IllegalArgumentException("El número de días de vacaciones de un asalariado debe estar entre 1 y 30");
        
        this.vacaciones = vacaciones;
    }
    
    //Método toString para representar los datos del Asalariado en forma de String
    public String toString()
    {
        return "\n\nDATOS DE EMPLEADO\n--------------------------"+"\nNombre: " + 
                nombre + "\nNIF: "+nif+ "\nEdad: " +edad+ "\nVacaciones: "+ vacaciones + "\nActividad:" + actividad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.nif);
        hash = 59 * hash + this.edad;
        hash = 59 * hash + this.vacaciones;
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
        final Asalariado other = (Asalariado) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (this.vacaciones != other.vacaciones) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.nif, other.nif)) {
            return false;
        }
        return true;
    }
    
    
    
}
