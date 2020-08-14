/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Hayleen Carrillo <IviCarrillo@bitbucket.org>
 */
public class calcularNotasEstudiante {
    public double teorica;
    public double practica;
    Estudiante est;
    
    public calcularNotasEstudiante(Estudiante estudiante){
        this.est=estudiante;
    }
    
    
//calcula la nota teorica
    public double notaTeorica(double nexamen,double ndeberes, double nlecciones){
        teorica= (nexamen+ndeberes+nlecciones)*0.80;
        return  teorica;
    }
//calcula nota practica
    public double notaPractica(double ntalleres){
        practica= (ntalleres)*0.20; 
        return practica;
    }
    
//calcula nota parcial
    public double CalcularNota(Paralelo p){
        for(Paralelo par:est.paralelos){
            if(p.equals(par)){
                return teorica+practica;
            }         
        }
        return 0;
    }

      
    //Calcula y devuelve la nota final contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public double CalcularNotaTotal(Paralelo p){
        double notaTotal=0;
        for(Paralelo par:est.paralelos){
            if(p.equals(par)){
                notaTotal=(p.getMateria().notaInicial+p.getMateria().notaFinal)/2;              
            }
        }
        return notaTotal;
        
    }
}
