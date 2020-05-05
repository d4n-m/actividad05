package actividad05.gestionaAlumno;

import java.util.Arrays;

public class Alumno {
    private String nombre;
    private String apellido;
    private int edad;
    private double[] notas;

    public Alumno(String nombre, String apellido, int edad, double[] notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public boolean setNota(double nota, int modulo) {
        try {
            notas[modulo-1] = nota;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hay sólo 4 módulos.");
            return false;
        } return true;
    }

    public void showNotas() {
        System.out.println(Arrays.toString(getNotas()));
    }

    public void getNotaMedia() {
        int i;
        double mediaNotas = 0.0;
        for (i = 0; i < notas.length; i++) {
            mediaNotas = mediaNotas + notas[i];
        }
        mediaNotas = mediaNotas / notas.length;
        System.out.println("La media de las notas es: " + mediaNotas);
    }

    public void showInfoAlumno(Alumno a){
        System.out.println("\nNombre: " + a.getNombre());
        System.out.println("Apellido: " + a.getApellido());
        System.out.println("Edad: " + a.getEdad());
        System.out.print("Notas: ");
        a.showNotas();
        a.getNotaMedia();
    }

}
