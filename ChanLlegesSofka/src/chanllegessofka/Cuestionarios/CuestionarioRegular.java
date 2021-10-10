
package chanllegessofka.Cuestionarios;

import Sintaxis.CadenasDeTexto;
import Sintaxis.Preguntas;
import chanllegessofka.Utilidades.Funciones;
import javax.swing.JOptionPane;

public class CuestionarioRegular {
        public static Preguntas preguntas;
    public static CadenasDeTexto cadenasDeTexto;
    public static Funciones funciones;

    public static void normal() {
        cadenasDeTexto = new CadenasDeTexto();
        preguntas = new Preguntas();
       
        int opcion;

        int contador = 0;

        opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntas.getQuestionVideojuegos4()));
        
        if (opcion == 5) {
            JOptionPane.showMessageDialog(null, cadenasDeTexto.getSalirVoluntariamente() + "\n"
                    + "       " + contador + " Puntos");
            System.exit(0);
        }
        if (!(opcion == 2)) {
            JOptionPane.showMessageDialog(null, cadenasDeTexto.getFallaste());
            contador = 0;
            System.exit(0);

        } else {
            JOptionPane.showMessageDialog(null, cadenasDeTexto.getRespuestaCorrecta());
            contador = contador + 60;
            opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntas.getQuestionDeportes4()));

            if (opcion == 5) {
                JOptionPane.showMessageDialog(null, cadenasDeTexto.getSalirVoluntariamente() + "\n"
                        + "       " + contador + " Puntos");
                System.exit(0);
            }
            if (!(opcion == 4)) {
                JOptionPane.showMessageDialog(null, cadenasDeTexto.getFallaste());
                contador = 0;
                System.exit(0);

            } else {
                JOptionPane.showMessageDialog(null, cadenasDeTexto.getRespuestaCorrecta());
                contador = contador + 80;

                opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntas.getQuestionGeografia3()));

                if (opcion == 5) {
                    JOptionPane.showMessageDialog(null, cadenasDeTexto.getSalirVoluntariamente() + "\n"
                            + "       " + contador + " Puntos");
                    System.exit(0);
                }
                if (!(opcion == 4)) {
                    JOptionPane.showMessageDialog(null, cadenasDeTexto.getFallaste());
                    contador = 0;
                    System.exit(0);

                } else {
                    JOptionPane.showMessageDialog(null, cadenasDeTexto.getRespuestaCorrecta());
                    contador = contador + 100;

                    opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntas.getQuestionSeriesAnimadas3()));
                    if (opcion == 5) {
                        JOptionPane.showMessageDialog(null, cadenasDeTexto.getSalirVoluntariamente() + "\n"
                                + "       " + contador + " Puntos");
                        System.exit(0);
                    }
                    if (!(opcion == 3)) {
                        JOptionPane.showMessageDialog(null, cadenasDeTexto.getFallaste());
                        contador = 0;
                        System.exit(0);

                    } else {
                        JOptionPane.showMessageDialog(null, cadenasDeTexto.getRespuestaCorrecta());
                        contador = contador + 120;

                        opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntas.getQuestionCine3()));
                        if (opcion == 5) {
                            JOptionPane.showMessageDialog(null, cadenasDeTexto.getSalirVoluntariamente() + "\n"
                                    + "       " + contador + " Puntos");
                            System.exit(0);
                        }
                        if (!(opcion == 3)) {
                            JOptionPane.showMessageDialog(null, cadenasDeTexto.getFallaste());
                            contador = 0;
                            System.exit(0);

                        } else {
                            JOptionPane.showMessageDialog(null, cadenasDeTexto.getRespuestaCorrecta());
                            contador = contador + 150;

                        }

                    }

                }

            }

        }
        JOptionPane.showMessageDialog(null, cadenasDeTexto.getCategoriaCompleta() + "REGULAR" +"\n"+"      TU PUNTUACION= "+contador);

        
    }
    
}
