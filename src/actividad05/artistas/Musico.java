package actividad05.artistas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Musico extends Artista {
    private String website;
    private String tituloUltimoDisco;
    private String[] top10Canciones;

    public Musico() {
        super();
        website = "default";
        tituloUltimoDisco = "default";
        top10Canciones = new String[]{"default"};
    }

    public Musico(String nombre, int añoNacimiento, char sexo, String dni, String tituloUltimoDisco, String website) {
        super(dni, nombre, añoNacimiento, sexo);
        this.website = website;
        this.tituloUltimoDisco = tituloUltimoDisco;
    }

    public void setTop10Canciones(String[] top10Canciones) {
        this.top10Canciones = top10Canciones;
    }

    @Override
    public String toString() {
        return "\nMusico {" +
                "\n\t\tnombre = '" + nombre + '\'' +
                ",\n\t\tdni = '" + dni + '\'' +
                ",\n\t\twebsite = '" + website + '\'' +
                ",\n\t\tañoNacimiento = " + añoNacimiento +
                ",\n\t\tsexo = " + sexo +
                ",\n\t\ttituloUltimoDisco = '" + tituloUltimoDisco + '\'' +
                ",\n\t\ttop10Canciones = " + Arrays.toString(top10Canciones) +
                " }";
    }

    public void muestraCanciones() {
        int i = 1;
        System.out.println("\nTop 10 canciones:\n");
        for (String element : top10Canciones
        ) {
            System.out.println(i + ". " + element);
            i++;
        }
    }

    public void setCancion() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cancion = null;
        System.out.println("\nVamos a añadir 3 canciones al top 10.");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + "a canción: ");
            try {
                cancion = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.print("En que posición ponemos la canción? '1 - 10': ");
            try {
                int pos = Integer.parseInt(br.readLine());
                if (pos > 0 && pos <= 10) {
                    top10Canciones[pos - 1] = cancion;
                } else {
                    System.out.println("Introduce un número de 1 al 10.");
                    i = i - 1;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Introduce un número de 1 al 10.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

