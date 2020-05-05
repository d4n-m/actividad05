package actividad05.pideDatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pregunta {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int pedirEntero(String pregunta) {
        int num = 0;
        do try {
            System.out.println(pregunta);
            num = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("Algo ha fallado, intentalo de nuevo.");
        } catch (NumberFormatException e) {
            System.out.println("Ha de introducir un número entero mayor que '0'.");
        } while (num <= 0);
        return num;
    }

    public static double pedirDoble(String pregunta) {
        double dou = 0;
        do try {
            System.out.println(pregunta);
            dou = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.out.println("Algo ha fallado, intentalo de nuevo.");
        } catch (NumberFormatException e) {
            System.out.println("Ha de introducir un número doble mayor que '0'.");
        } while (dou <= 0);
        return dou;
    }
}
