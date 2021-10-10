package chanllegessofka.Cuestionarios;

import Sintaxis.CadenasDeTexto;
import static chanllegessofka.Cuestionarios.CuestionarioHardened.cadenasDeTexto;
import Sintaxis.Preguntas;
import javax.swing.JOptionPane;

public class CuestionarioVeterano {

    public static Preguntas preguntas;
    public static CadenasDeTexto cadenasDeTexto;

    public static void muyDificil() {
        cadenasDeTexto = new CadenasDeTexto();
        preguntas = new Preguntas();
        int opcion;
        int contador = 0;

        opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntas.getQuestionVideojuegos5()));
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
            contador = contador + 100;
            opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntas.getQuestionSeriesAnimadas5()));

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
                contador = contador + 130;

                opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntas.getQuestionGeografia4()));

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

                    opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntas.getQuestionCine2()));
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
                        contador = contador + 190;

                        opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntas.getQuestionDeportes3()));

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
        JOptionPane.showMessageDialog(null, cadenasDeTexto.getCategoriaCompleta() + "VETERANO" +"\n"+"      TU PUNTUACION= "+contador);

    }
}
