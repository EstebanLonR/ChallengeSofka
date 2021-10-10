
package Sintaxis;

import java.util.List;


public class Jugadores {
    private List<String> nombre;
    private int puntuacion;

    public Jugadores(List<String> nombre, int puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    public void setNombre(List<String> nombre) {
        this.nombre = nombre;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

 
    
    
}
