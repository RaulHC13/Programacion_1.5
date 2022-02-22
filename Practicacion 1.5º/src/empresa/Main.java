/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package empresa;

import java.util.List;
import java.util.Random;

/**
 *
 * @author arubio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Empresa empresa = new Empresa("coca-cola");
        List<Cliente> clientesCocaCola=empresa.getClientes();
        List<Empleado> empleadosCocaCola=empresa.getEmpleados();
        
        clientesCocaCola.add(new Cliente("Jesus", 25, "Vea", "123123123"));
        clientesCocaCola.add(new Cliente("Melchor", 21, "Libertad", "123123123"));
        clientesCocaCola.add(new Cliente("Baltazar", 22, "Disco", "123123123"));
        
        empresa.mostrarClientes();
        
        empleadosCocaCola.add(new Empleado(10000,  "juan", 25));
        empleadosCocaCola.add(new Empleado(20000,  "Gaspar", 30));
        empleadosCocaCola.add(new Directivo(30000, "Smithers", 30));
        empresa.mostrarEmpleados();
    }
}
