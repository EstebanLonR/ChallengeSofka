package chanllegessofka.Cuestionarios;

import Sintaxis.CadenasDeTexto;
import Sintaxis.Preguntas;

import javax.swing.JOptionPane;

public class CuestionarioRookie {

    public static Preguntas preguntas;
    public static CadenasDeTexto cadenasDeTexto;

    public static void muyFacil() {
        cadenasDeTexto = new CadenasDeTexto();
        preguntas = new Preguntas();

        int opcion;

        int contador = 0;

        opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntas.getQuestionCine5()));

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
            opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntas.getQuestionVideojuegos3()));

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
                contador = contador + 60;

                opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntas.getQuestionSeriesAnimadas2()));

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
                    contador = contador + 70;

                    opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntas.getQuestionGeografia5()));
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
                        contador = contador + 80;

                        opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntas.getQuestionDeportes1()));
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
                            contador = contador + 100;

                        }

                    }

                }

            }

        }
        JOptionPane.showMessageDialog(null, cadenasDeTexto.getCategoriaCompleta() + "CINE" + "\n" + "      TU PUNTUACION= " + contador);

    }

}
