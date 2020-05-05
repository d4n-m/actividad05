package actividad05.artistas;

public class Artista {
    protected String dni;
    protected String nombre;
    protected int añoNacimiento;
    protected char sexo;

    public Artista() {
        dni = "default";
        nombre = "default";
        añoNacimiento = 0;
        sexo = 'N';
    }

    public Artista(String dni, String nombre, int añoNacimiento, char sexo) {
        this.dni = dni;
        this.nombre = nombre;
        this.añoNacimiento = añoNacimiento;
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Artista {" +
                "\n\t\tnombre = '" + nombre + '\'' +
                ",\n\t\tdni = '" + dni + '\'' +
                ",\n\t\tañoNacimiento = " + añoNacimiento +
                ",\n\t\tsexo = " + sexo +
                " }";
    }
}
