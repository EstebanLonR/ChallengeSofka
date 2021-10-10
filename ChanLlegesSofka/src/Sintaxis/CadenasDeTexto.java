package Sintaxis;

public class CadenasDeTexto {

    private String bienvenida = "Para comenzar, Porfavor Elija una de las Opciones" + "\n"
            + "1.Registrarse" + "\n"
            + "2.Salir";

    private String salir = "Sera para otra ocasion.... Bye";

    private String opcionNoExiste = "Porfavor ingresa una de las opciones en pantalla";

    private String categorias = "Por favor selecciona una de las categorias" + "\n"
            + "1.Rookie(MuyFacil)" + "\n"
            + "2.Reclut(Facil)" + "\n"
            + "3.Regular(Normal)" + "\n"
            + "4.Hardened(Dificil)" + "\n"
            + "5.Veterano(MuyDificil)" + "\n" 
            + "--------------------------" + "\n" + "\n"
            + "6.Salir";
    
    private String volverJugar="Felicidades, Ganaste.....Vuelve a iniciar el juego para concursar en otra categoria";

    private String pedirNombre = "Porfavor, Digite su nombre para jugar";

    private String halago = "Lindo Nombre :>";

    private String fallaste = "Upsss...Parece que esa no era la Respuesta xD" + "\n"
            + "A casita crack..." + "\n"
            + "             Puntuacion=0     ";

    private String respuestaCorrecta = "Correcto, Muy bien";

    private String categoriaCompleta = "Felicidades, has completado la categoria de ";

    private String salirVoluntariamente = "Gracias por llegar hasta aca," + "\n" + " tu puntuacion fue de ";

    private String categoriaYaSuperada = "Esta Categoria ya fue superada";

    private String avanzar = "Muy bien Ahora, continua con otra categoria";

    public String getVolverJugar() {
        return volverJugar;
    }
    
    

    public String getAvanzar() {
        return avanzar;
    }

    public String getCategoriaYaSuperada() {
        return categoriaYaSuperada;
    }

    public String getSalirVoluntariamente() {
        return salirVoluntariamente;
    }

    public String getCategoriaCompleta() {
        return categoriaCompleta;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public String getFallaste() {
        return fallaste;
    }

    public String getBienvenida() {
        return bienvenida;
    }

    public String getSalir() {
        return salir;
    }

    public String getOpcionNoExiste() {
        return opcionNoExiste;
    }

    public String getPedirNombre() {
        return pedirNombre;
    }

    public String getHalago() {
        return halago;
    }

    public String getCategorias() {
        return categorias;
    }

}
