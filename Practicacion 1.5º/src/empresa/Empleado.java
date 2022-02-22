/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package empresa;

/**
 *
 * @author arubio
 */
public class Empleado extends Persona 
{
    private double sueldo;

    public Empleado(double sueldo) 
    {
        super();
        setSueldo(sueldo);
    }
    
    public Empleado(double sueldo, String nombre, int edad){
        super(nombre, edad);
        setSueldo(sueldo);
    }
    
    public Empleado(Empleado empleado)
    {
        if (empleado==null)
            throw new IllegalArgumentException("No se puede copiar un empleado nulo.");
	
        setNombre(empleado.getNombre());
        setEdad(empleado.getEdad());
        setSueldo(empleado.getSueldo());
    }
    
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        if (sueldo<0)
            throw new IllegalArgumentException("El sueldo de un empleado no puede ser negativo");
        
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString(){
        return super.toString()
                + " Sueldo Bruto: $ " + sueldo
                + " Sueldo Liquido: $ " + calcularSalarioNeto();
    }
    
    public double calcularSalarioNeto(){
        return sueldo - 0.11 * sueldo - 0.03 * sueldo; 
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
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
        final Empleado other = (Empleado) obj;
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
            return false;
        }
        return true;
    }
    
    
}
