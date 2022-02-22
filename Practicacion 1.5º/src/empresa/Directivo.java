
package empresa;


public class Directivo extends Empleado
{
    double incentivo;

    public Directivo(double sueldo) {
        super(sueldo);
        incentivo=100;
    }

    public Directivo(double sueldo, String nombre, int edad) {
        super(sueldo, nombre, edad);
        incentivo=100;
    }
    
    public Directivo(double sueldo, double incentivo, String nombre, int edad) {
        super(sueldo, nombre, edad);
        this.incentivo=incentivo;
    }
    

    @Override
    public double calcularSalarioNeto() {
        return super.calcularSalarioNeto() + 20000; 
    }
}
