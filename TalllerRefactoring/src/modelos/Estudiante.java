package modelos;

import java.util.ArrayList;

public class Estudiante{
    //Informacion del estudiante
    public String matricula;
    public String nombre;
    public String apellido;
    public String facultad;
    public int edad;
    public String direccion;
    public String telefono;
    public ArrayList<Paralelo> paralelos;
    
   
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    public double CalcularNota(Paralelo p, double nexamen,double ndeberes, double nlecciones, double ntalleres){
        double calificacion=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                double notaTeorico=(nexamen+ndeberes+nlecciones)*0.80;
                double notaPractico=(ntalleres)*0.20;
                calificacion=notaTeorico+notaPractico;
            }
        }
        return calificacion;
    }
    
   
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public double CalcularNotaTotal(Paralelo p){
        double notaTotal=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                notaTotal=(p.getMateria().notaInicial+p.getMateria().notaFinal)/2;
                
            }
        }
        return notaTotal;
        
    }
}
        
    
    
    
            
        
        
