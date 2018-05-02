package main;

import main.Alumno.*;

public class Main {

    public static void main(String[] args) {
        
        Alumno alumno1 = new Alumno("Samuel", 0);
        alumno1.setEnderezo(alumno1.new Enderezo("Calle de los pelicanos", 69));
        
        // Muestra la información
        System.out.println(alumno1.toString());
        
        // Cambia la nota del alumno
        alumno1.cambiarNota();
        
        // Muestra la información
        System.out.println(alumno1.toString());
    }
    
}
