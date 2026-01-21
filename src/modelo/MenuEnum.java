package modelo;

public enum MenuEnum {

    SALIR("Salir"),
    TOTAL_DOCUMENTOS("Número total de documentos en el sistema."),
    MEDIA_EDAD("Media de edad de los alumnos."),
    MAYOR_MENOR("Alumno mayor y menor."),
    NOMBRE_ORDENADOS_EDAD("Mostrar el nombre de los alumnos ordenado por edad de mayor a menor."),
    NOMBRE_ALEATORIO("Mostrar el nombre de un alumno de forma aleatoria.");


    private final String TEXTO;

    MenuEnum(String TEXTO) {
        this.TEXTO = TEXTO;
    }

    public String getTexto() {
        return TEXTO;
    }
}
