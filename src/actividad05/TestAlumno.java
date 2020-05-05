package actividad05;

import actividad05.gestionaAlumno.Alumno;

import static actividad05.pideDatos.Pregunta.*;

public class TestAlumno {

    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Tom", "Cat", 9, new double[]{9.9, 8.9, 7.9, 6.9});
        Alumno alumno2 = new Alumno("Paris", "Hilton", 39, new double[]{1.1, 2.1, 3.1, 4.1});

        int userInput;
        do {
            System.out.println("\n1. Consultar alumno");
            System.out.println("2. Modificar datos personales");
            System.out.println("3. Modificar nota");
            System.out.println("4. Salir");
            userInput = pedirEntero("\nIndique una opción '1 - 4'");
            switch (userInput) {
                case 1:
                    System.out.println("1. " + alumno1.getNombre());
                    System.out.println("2. " + alumno2.getNombre());
                    int n1 = pedirEntero("De cual alumno mostrar datos? '1 - 2'");
                    if (n1 == 1) {
                        alumno1.showInfoAlumno(alumno1);
                    } else if (n1 == 2) {
                        alumno2.showInfoAlumno(alumno2);
                    } else {
                        System.out.println("Ese alumno no existe.");
                    }
                    break;
                case 2:
                    System.out.println("1. " + alumno1.getNombre());
                    System.out.println("2. " + alumno2.getNombre());
                    int n2 = pedirEntero("De cual alumno modificar datos? '1 - 2'");
                    if (n2 == 1) {
                        alumno1.showInfoAlumno(alumno1);

                        System.out.println("\n1. Nombre");
                        System.out.println("2. Apellido");
                        System.out.println("3. Edad");

                        n2 = pedirEntero("Cual dato quiere modificar? '1 - 3'");

                        if (n2 == 1) {
                            try {
                                System.out.print("Introduce un nombre: ");
                                alumno1.setNombre(br.readLine());
                                System.out.println("Cambio hecho.");
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } else if (n2 == 2) {
                            try {
                                System.out.print("Introduce un apellido: ");
                                alumno1.setApellido(br.readLine());
                                System.out.println("Cambio hecho.");
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } else if (n2 == 3) {
                            try {
                                alumno1.setEdad(pedirEntero("Introduce la edad: "));
                                System.out.println("Cambio hecho.");
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                    } else if (n2 == 2) {

                        alumno2.showInfoAlumno(alumno2);
                        System.out.println("\n1. Nombre");
                        System.out.println("2. Apellido");
                        System.out.println("3. Edad");

                        n2 = pedirEntero("Cual dato quiere modificar? '1 - 3'");

                        if (n2 == 1) {
                            try {
                                System.out.print("Introduce un nombre: ");
                                alumno2.setNombre(br.readLine());
                                System.out.println("Cambio hecho.");
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } else if (n2 == 2) {
                            try {
                                System.out.print("Introduce un apellido: ");
                                alumno2.setApellido(br.readLine());
                                System.out.println("Cambio hecho.");
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } else if (n2 == 3) {
                            try {
                                alumno2.setEdad(pedirEntero("Introduce la edad: "));
                                System.out.println("Cambio hecho.");
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    } else {
                        System.out.println("Ese alumno no existe.");
                    }
                    break;
                case 3:
                    System.out.println("\n1. " + alumno1.getNombre());
                    System.out.println("2. " + alumno2.getNombre());
                    int n3 = pedirEntero("De cual alumno modificar notas? '1 - 2'");
                    if (n3 == 1) {
                        alumno1.showInfoAlumno(alumno1);
                        if (alumno1.setNota(pedirDoble("Introduce la nueva nota: "), pedirEntero("Introduce el módulo a cambiar '1 - 4'"))) {
                            System.out.println("Cambio hecho.");
                        } else {
                            System.out.println("Vuelve a intentarlo.");
                        }
                    } else if (n3 == 2) {
                        alumno2.showInfoAlumno(alumno2);
                        if (alumno2.setNota(pedirDoble("Introduce la nueva nota: "), pedirEntero("Introduce el módulo a cambiar '1 - 4'"))) {
                            System.out.println("Cambio hecho.");
                        } else {
                            System.out.println("Vuelve a intentarlo.");
                        }
                    } else {
                        System.out.println("Ese alumno no existe.");
                    }
                    break;
                case 4:
                    System.out.println("Hasta la vista, baby!");
                    userInput = 4;
                    break;
                default:
                    System.out.println("Elige una opción correcta. '1 - 4'");
            }
        } while (userInput != 4);
    }
}
