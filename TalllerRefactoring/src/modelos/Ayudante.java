package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante{

    public ArrayList<Paralelo> paralelosAyudante;

    public Ayudante(String matricula, String nombre, String apellido, String facultad) {
        super(matricula, nombre, apellido, facultad);
    }

    //Los paralelos se añaden/eliminan directamente del Arraylist de paralelos


    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}
