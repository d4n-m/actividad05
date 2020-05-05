package actividad05;

import actividad05.artistas.Artista;
import actividad05.artistas.Dibujante;
import actividad05.artistas.Musico;

public class TestArtista {
    public static void main(String[] args) {

        // Variable artista con constructor vacío
        Artista artista = new Artista();
        // Rellena datos vía setters
        artista.setNombre("Banksy");
        artista.setAñoNacimiento(1974);
        artista.setDni("Y0750982-T");
        artista.setSexo('H');
        // Muestra datos del objeto creado
        System.out.println(artista.toString());

        // Variable del tipo Dibujante con todos sus valores vía su constructor
        Dibujante dibujante = new Dibujante("12/08/1988", "Untitled", 110500000, "898989W", "Jean-Michel Basquiat", 1960, 'H');
        // Muestra datos del objeto creado
        System.out.println(dibujante.toString());

        // Crea una variable de tipo Musico  con un constructor que reciba y establezca el nombre, año de nacimiento, sexo, dni, último disco y el sitio web.
        Musico musico = new Musico("Adele", 1988, 'M',"123456W","25", "http://www.adele.com");
        // Defino el array String[] con las canciones del top
        String[] top10 = {"Hello", "Rolling in the Deep", "Someone Like You", "Set Fire to the Rain", "Send My Love (to Your New Lover)", "Skyfall", "When We Were Young", "Rumor Has It", "Chasing Pavements", "Water Under the Bridge"};
        // Setter con el array
        musico.setTop10Canciones(top10);
        // Muestra todos los datos del Musico creado
        System.out.println(musico.toString());

        // setCancion para añadir tres canciones en el top
        musico.setCancion();
        // muestraCanciones para mostrar las canciones por consola
        musico.muestraCanciones();
    }
}
