package chanllegessofka.Cuestionarios;

import Sintaxis.CadenasDeTexto;
import Sintaxis.Preguntas;
import chanllegessofka.Utilidades.Funciones;
import javax.swing.JOptionPane;

public class CuestionarioReclut {

    public static Preguntas preguntas;
    public static CadenasDeTexto cadenasDeTexto;
    public static Funciones funciones;

    public static  void facil() {
        cadenasDeTexto = new CadenasDeTexto();
        preguntas = new Preguntas();
       
        int opcion;

        int contador = 0;

        opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntas.getQuestionDeportes5()));
        
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
            contador = contador + 50;
            opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntas.getQuestionVideojuegos1()));

            if (opcion == 5) {
                JOptionPane.showMessageDialog(null, cadenasDeTexto.getSalirVoluntariamente() + "\n"
                        + "       " + contador + " Puntos");
                System.exit(0);
            }
            if (!(opcion == 1)) {
                JOptionPane.showMessageDialog(null, cadenasDeTexto.getFallaste());
                contador = 0;
                System.exit(0);

            } else {
                JOptionPane.showMessageDialog(null, cadenasDeTexto.getRespuestaCorrecta());
                contador = contador + 50;

                opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntas.getQuestionCine1()));

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
                    contador = contador + 50;

                    opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntas.getQuestionSeriesAnimadas4()));
                    if (opcion == 5) {
                        JOptionPane.showMessageDialog(null, cadenasDeTexto.getSalirVoluntariamente() + "\n"
                                + "       " + contador + " Puntos");
                        System.exit(0);
                    }
                    if (!(opcion == 1)) {
                        JOptionPane.showMessageDialog(null, cadenasDeTexto.getFallaste());
                        contador = 0;
                        System.exit(0);

                    } else {
                        JOptionPane.showMessageDialog(null, cadenasDeTexto.getRespuestaCorrecta());
                        contador = contador + 50;

                        opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntas.getQuestionGeografia1()));
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
                            contador = contador + 50;

                        }

                    }

                }

            }

        }
        
        JOptionPane.showMessageDialog(null, cadenasDeTexto.getCategoriaCompleta() + "RECLUTA" +"\n"+"      TU PUNTUACION= "+contador);
        

        
        
    }

}


