/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author arubio
 */
public class Empresa {
    
    private String nombre;
    private List<Cliente> clientes; 
    private List<Empleado> empleados;

    
     public Empresa(String nombre)
     {
        setNombre(nombre);
        clientes = new ArrayList<>();
        empleados = new ArrayList<>();
    }
       
    
    
    public List<Empleado> getEmpleados() 
    {
        return empleados;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre==null || nombre.equals(""))
            throw new IllegalArgumentException("El nombre de una empresa no puede ser null o estar vacío");
        
        this.nombre = nombre;
    }

    
    
    
    public List<Cliente> getClientes() {
        return clientes;
    }
    
    public void mostrarClientes()
    {
        System.out.println("LISTADO DE CLIENTES");
        
        for(Cliente cliente:clientes)
        {
            System.out.println(cliente);            
        }
        
        System.out.println("TOTAL DE CLIENTES "
                + clientes.size());
    }
    
    public void mostrarEmpleados()
    {
        System.out.println("LISTADO DE EMPLEADOS");
        for(Empleado empleado:empleados)
        {
            System.out.println(empleado);
        }
        
        System.out.println("TOTAL DE EMPLEADOS "
                + empleados.size());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.clientes);
        hash = 53 * hash + Objects.hashCode(this.empleados);
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
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.clientes, other.clientes)) {
            return false;
        }
        if (!Objects.equals(this.empleados, other.empleados)) {
            return false;
        }
        return true;
    }
    
    
}
