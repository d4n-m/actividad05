package actividad05.artistas;

public class Dibujante extends Artista {
    private String dataUltimaExposicion;
    private String nombreDibujoMasCaro;
    private int precioDibujoMasCaro;

    public Dibujante() {
        super();
        dataUltimaExposicion = "default";
        nombreDibujoMasCaro = "default";
        precioDibujoMasCaro = 0;
    }

    public Dibujante(String dataUltimaExposicion, String nombreDibujoMasCaro, int precioDibujoMasCaro, String dni, String nombre, int añoNacimiento, char sexo) {
        super(dni, nombre, añoNacimiento, sexo);
        this.dataUltimaExposicion = dataUltimaExposicion;
        this.nombreDibujoMasCaro = nombreDibujoMasCaro;
        this.precioDibujoMasCaro = precioDibujoMasCaro;
    }

    @Override
    public String toString() {
        return "\nDibujante {" +
                "\n\t\tnombre = '" + nombre + '\'' +
                ",\n\t\tdni = '" + dni + '\'' +
                ",\n\t\tañoNacimiento = " + añoNacimiento +
                ",\n\t\tsexo = " + sexo +
                ",\n\t\tdataUltimaExposicion = '" + dataUltimaExposicion + '\'' +
                ",\n\t\tnombreDibujoMasCaro = '" + nombreDibujoMasCaro + '\'' +
                ",\n\t\tprecioDibujoMasCaro = " + precioDibujoMasCaro +
                " }";
    }
}
