package modelos;

public class calcularSueldoProfesor {
    
    public double calcularSueldo(Profesor prof){
        double sueldo=0;
        sueldo= prof.añosdeTrabajo*600 + prof.BonoFijo;
        return sueldo;
    }  
}
