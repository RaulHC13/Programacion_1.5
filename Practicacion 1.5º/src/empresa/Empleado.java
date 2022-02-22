package empresa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arubio
 */
public class Empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Asalariado a1=new Asalariado("Carmen López","11111111A",25,17,"RRHH");
        Asalariado a2=new Asalariado("Jesús Pérez","22222222B",35,20,"Informática");
        
        AsalariadoDistribucion ed1=new AsalariadoDistribucion("Laura Martínez",
                "33333333C",40,25,"Madrid","RRHH");
        
        AsalariadoDistribucion ed2=new AsalariadoDistribucion("Alfonso Carrasco", "44444444D", 
                31, 18, "Andalucía", "Informática");
        
        AsalariadoProduccion ep1=new AsalariadoProduccion("Jaime Sánchez", "55555555E",
                23, 16, "Nocturno", "Mantenimiento");
        
        AsalariadoProduccion ep2=new AsalariadoProduccion("Susana Gómez", "77777777F", 
                30, 24, "Diurno", "Transporte");
        
        List<Asalariado> trabajadores=new ArrayList<>();
        
        trabajadores.add(a1);
        trabajadores.add(a2);
        trabajadores.add(ed1);
        trabajadores.add(ed2);
        trabajadores.add(ep1);
        trabajadores.add(ep2);
        
        for(Asalariado a:trabajadores)
        {
            
            /*if (a instanceof AsalariadoDistribucion)            
                System.out.println("\n\nASALARIADO DE DISTRIBUCIÓN\n--------------------------");                          
            else if (a instanceof AsalariadoProduccion)
                System.out.println("\n\nASALARIADO DE PRODUCCIÓN\n------------------------");
            else 
                System.out.println("\n\nASALARIADO\n----------");*/
            
            if (a instanceof AsalariadoDistribucion)
                System.out.println(((AsalariadoDistribucion) a).mensaje());
            System.out.println(a);
            
        }
    }
    
}
