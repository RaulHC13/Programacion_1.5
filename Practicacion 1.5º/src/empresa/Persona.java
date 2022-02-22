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
public class Persona 
{
    private String nombre;
    private int edad;
    
    public Persona ()
    {
        nombre="";
        edad=0;
    }

    public Persona(String nombre, int edad) {
       setNombre(nombre);
       setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre==null || nombre.equals(""))
            throw new IllegalArgumentException("El nombre no puede ser null");
        
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad<0)
            throw new IllegalArgumentException("La edad no puede ser negativa");
        
        this.edad = edad;
    }
    
    public String toString()
    {
      return " Nombre: "+getNombre()+" Edad: "+getEdad();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.nombre);
        hash = 71 * hash + this.edad;
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
        final Persona other = (Persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
}
