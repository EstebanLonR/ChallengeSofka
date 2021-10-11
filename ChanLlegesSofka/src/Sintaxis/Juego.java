package Sintaxis;

import chanllegessofka.Cuestionarios.CuestionarioRookie;
import chanllegessofka.Cuestionarios.CuestionarioReclut;
import chanllegessofka.Cuestionarios.CuestionarioRegular;
import chanllegessofka.Cuestionarios.CuestionarioHardened;
import chanllegessofka.Cuestionarios.CuestionarioVeterano;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Juego {

    
    public static CadenasDeTexto cadenasDeTexto;
    CuestionarioReclut cuestionarioDeportes = new CuestionarioReclut();
    CuestionarioVeterano cuestionarioVideojuegos = new CuestionarioVeterano();
    CuestionarioRookie cuestionarioCine = new CuestionarioRookie();
    CuestionarioHardened cuestionarioSeriesAnimadas = new CuestionarioHardened();
    CuestionarioRegular cuestionarioGeografia = new CuestionarioRegular();
    public static String nombre[]=new String[10];
    public static int opcion;
    public static int i=0;
    

    public static Juego Jugar() {

        cadenasDeTexto = new CadenasDeTexto();
        opcion = Integer.parseInt(JOptionPane.showInputDialog(cadenasDeTexto.getBienvenida()));
        if ((opcion != 1 && opcion != 2)) {
            JOptionPane.showMessageDialog(null, cadenasDeTexto.getOpcionNoExiste());
        } else {
            switch (opcion) {

                case 1:
                    
                    nombre[i] = JOptionPane.showInputDialog(cadenasDeTexto.getPedirNombre());
                    
                    JOptionPane.showMessageDialog(null, cadenasDeTexto.getHalago());
                    
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(cadenasDeTexto.getCategorias()));

                    switch (opcion) {

                        case 1:
                            CuestionarioRookie.muyFacil();
                            JOptionPane.showMessageDialog(null, cadenasDeTexto.getVolverJugar());
                            i=i+1;
                            break;

                        case 2:
                            CuestionarioReclut.facil();
                            JOptionPane.showMessageDialog(null, cadenasDeTexto.getVolverJugar());
                            i=i+1;
                            break;

                        case 3:
                            CuestionarioRegular.normal();
                            JOptionPane.showMessageDialog(null, cadenasDeTexto.getVolverJugar());
                            i=i+1;
                            break;

                        case 4:
                            CuestionarioHardened.dificil();
                            JOptionPane.showMessageDialog(null, cadenasDeTexto.getVolverJugar());
                            i=i+1;
                            break;

                        case 5:
                            CuestionarioVeterano.muyDificil();
                            JOptionPane.showMessageDialog(null, cadenasDeTexto.getVolverJugar());
                            i=i+1;
                            break;
                            
                        case 6:
                            for (int j = 0; j < 10; j++) {
                                JOptionPane.showMessageDialog(null, nombre[j]);
                                
                                
                           }
                            

                        case 7:
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
