package Sintaxis;

import chanllegessofka.Cuestionarios.CuestionarioRookie;
import chanllegessofka.Cuestionarios.CuestionarioReclut;
import chanllegessofka.Cuestionarios.CuestionarioRegular;
import chanllegessofka.Cuestionarios.CuestionarioHardened;
import chanllegessofka.Cuestionarios.CuestionarioVeterano;
import javax.swing.JOptionPane;

public class Juego {

    public static Jugadores jugadores;
    public static CadenasDeTexto cadenasDeTexto;
    CuestionarioReclut cuestionarioDeportes = new CuestionarioReclut();
    CuestionarioVeterano cuestionarioVideojuegos = new CuestionarioVeterano();
    CuestionarioRookie cuestionarioCine = new CuestionarioRookie();
    CuestionarioHardened cuestionarioSeriesAnimadas = new CuestionarioHardened();
    CuestionarioRegular cuestionarioGeografia = new CuestionarioRegular();
    public static String nombre;
    public static int opcion;
    public static int[] opcionCategoria;

    public static Juego Jugar() {

        cadenasDeTexto = new CadenasDeTexto();
        opcion = Integer.parseInt(JOptionPane.showInputDialog(cadenasDeTexto.getBienvenida()));
        if ((opcion != 1 && opcion != 2)) {
            JOptionPane.showMessageDialog(null, cadenasDeTexto.getOpcionNoExiste());
        } else {
            switch (opcion) {

                case 1:
                    nombre = JOptionPane.showInputDialog(cadenasDeTexto.getPedirNombre());
                    JOptionPane.showMessageDialog(null, cadenasDeTexto.getHalago());
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(cadenasDeTexto.getCategorias()));

                    switch (opcion) {

                        case 1:
                            CuestionarioRookie.muyFacil();
                            JOptionPane.showMessageDialog(null, cadenasDeTexto.getVolverJugar());
                            break;

                        case 2:
                            CuestionarioReclut.facil();
                            JOptionPane.showMessageDialog(null, cadenasDeTexto.getVolverJugar());
                            break;

                        case 3:
                            CuestionarioRegular.normal();
                            JOptionPane.showMessageDialog(null, cadenasDeTexto.getVolverJugar());
                            break;

                        case 4:
                            CuestionarioHardened.dificil();
                            JOptionPane.showMessageDialog(null, cadenasDeTexto.getVolverJugar());
                            break;

                        case 5:
                            CuestionarioVeterano.muyDificil();
                            JOptionPane.showMessageDialog(null, cadenasDeTexto.getVolverJugar());
                            break;
                            

                        case 6:
                            JOptionPane.showMessageDialog(null, cadenasDeTexto.getSalir());
                            System.exit(0);

                        default:

                    }

                case 2:
                    JOptionPane.showMessageDialog(null, cadenasDeTexto.getSalir());
                    System.exit(0);
                default:

            }
        }
        return Juego.Jugar();
    }

}
