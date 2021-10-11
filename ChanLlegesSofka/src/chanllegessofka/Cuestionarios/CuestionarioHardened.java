package chanllegessofka.Cuestionarios;

import Sintaxis.CadenasDeTexto;
import Sintaxis.Preguntas;

import javax.swing.JOptionPane;

public class CuestionarioHardened {

    public static Preguntas preguntas;
    public static CadenasDeTexto cadenasDeTexto;

    public static void dificil() {
        cadenasDeTexto = new CadenasDeTexto();
        preguntas = new Preguntas();

        int opcion;

        int contador = 0;

        opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntas.getQuestionSeriesAnimadas1()));

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
            contador = contador + 80;
            opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntas.getQuestionVideojuegos2()));

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
                contador = contador + 110;

                opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntas.getQuestionDeportes2()));

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
                    contador = contador + 150;

                    opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntas.getQuestionCine4()));
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
                        contador = contador + 170;

                        opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntas.getQuestionGeografia2()));
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
                            contador = contador + 210;

                        }

                    }

                }

            }

        }
        JOptionPane.showMessageDialog(null, cadenasDeTexto.getCategoriaCompleta() + "HARDENED" + "\n" + "      TU PUNTUACION = " + contador);

    }

}
