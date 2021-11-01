package mx.ipn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String flag = "S";
        Scanner scanner = new Scanner(System.in);

        while(flag.equals("S") || flag.equals("s")) {
            System.out.println("Bienvenido a la actividad 11\n" +
                    "Ingrese el ejercicio que desea ejecutar:\n" +
                    "1. Ejercicio 1\n" +
                    "2. Ejercicio 2");

            int exercise;
            try {
                exercise = scanner.nextInt();
            } catch (InputMismatchException $e) {
                exercise = 0;
            }

            scanner.nextLine();

            switch (exercise) {
                case 1:
                    Arreglos arreglos = new Arreglos();
                    arreglos.generateArreglo();

                    int[] array = arreglos.getArreglo();

                    System.out.println("Elemento en la posición 10: " + array[9] + "\n" +
                            "Elemento en la posición 11: " + array[10]);
                    break;

                case 2:
                    System.out.println("Ingrese los datos de su agenda");

                    ArreglosCad schedule = new ArreglosCad();
                    String[][] data = new String[3][4];

                    for (int i = 0; i < 3; i++) {
                        System.out.println("Registro: " + (i+1) + "\n" +
                                "Ingrese el Nombre:");
                        data[i][0] = scanner.nextLine();

                        System.out.println("Ingrese la Boleta");
                        data[i][1] = scanner.nextLine();

                        System.out.println("Ingrese la Edad");
                        data[i][2] = scanner.nextLine();

                        System.out.println("Ingrese el Teléfono");
                        data[i][3] = scanner.nextLine();
                    }

                    schedule.setAgenda(data);
                    data = schedule.getAgenda();

                    for (int y = 0; y < 4; y++) {
                        for (int x = 0; x < 4; x++) {
                            System.out.print(data[y][x] + " ");
                        }
                        System.out.println("");
                    }
                    break;

                default:
                    System.out.println("Opción Incorrecta");
                    break;
            }

            System.out.println("¿Desea repetir? S/N");
            flag = scanner.nextLine();
        }
    }
}
