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
    
    
    
    
   public Estudiante(String matricula,String nombre,String apellido, String facultad){
       this.matricula=matricula;
       this.nombre=nombre;
       this.apellido=apellido;
       this.facultad=facultad;
   } 
   
   
   
   
    //Calcula y devuelve la nota de cualquier parcial, contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    public double CalcularNota(Paralelo p, double nexamen,double ndeberes, double nlecciones, double ntalleres){
        double calificacion=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                calificacion+=(nexamen+ndeberes+nlecciones)*0.80; //agregar nota teorica
                calificacion+= (ntalleres)*0.20; //agregar nota teorica
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
        
    
    
    
            
        
        
