/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package veterinaria;

import java.util.Scanner;

/**
 *
 * @author adrianaguilar
 */
import java.util.Scanner;

public class Veterinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a Veterinaria Aguilar");
        boolean salir = false;

        // Variables para el conteo de perros en grooming y atención médica
        int perrosGrooming = 0;
        int perrosMedicos = 0;

        while (!salir) {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Grooming");
            System.out.println("2. Atención Médica");
            System.out.println("3. Generar Reporte");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("\nOpción Grooming seleccionada:");
                    System.out.println("- Baño (L. 150 para pequeño, L. 250 para grande)");
                    System.out.println("- Corte de pelo (L. 200 para pequeño, L. 300 para grande)");
                    System.out.println("- Limpieza de uñas (L. 100 para pequeño, L. 150 para grande)");
                    System.out.print("¿Desea continuar con algún servicio de grooming? (sí/no): ");
                    String respuestaGrooming = sc.nextLine();

                    if (respuestaGrooming.equalsIgnoreCase("sí")) {
                        System.out.println("\nSeleccione el tamaño del perro:");
                        System.out.println("1. Pequeño");
                        System.out.println("2. Grande");
                        System.out.print("Seleccione una opción: ");
                        int tamaño = sc.nextInt();
                        sc.nextLine();

                        System.out.println("\nSeleccione el servicio de grooming:");
                        System.out.println("1. Baño");
                        System.out.println("2. Corte de pelo");
                        System.out.println("3. Limpieza de uñas");
                        System.out.print("Seleccione una opción: ");
                        int servicio = sc.nextInt();
                        sc.nextLine();

                        int precio = 0;
                        if (tamaño == 1) { // Pequeño
                            switch (servicio) {
                                case 1: precio = 150; break;
                                case 2: precio = 200; break;
                                case 3: precio = 100; break;
                                default: System.out.println("Opción de servicio inválida."); continue;
                            }
                        } else if (tamaño == 2) { // Grande
                            switch (servicio) {
                                case 1: precio = 250; break;
                                case 2: precio = 300; break;
                                case 3: precio = 150; break;
                                default: System.out.println("Opción de servicio inválida."); continue;
                            }
                        } else {
                            System.out.println("Opción de tamaño inválida.");
                            continue;
                        }

                        System.out.println("Servicio registrado. Total a pagar: L. " + precio);
                        perrosGrooming++;
                    } else {
                        System.out.println("Volviendo al menú principal...");
                    }
                    break;

                case 2:
                    System.out.println("\nOpción Atención Médica seleccionada:");
                    System.out.println("- Consulta general (L. 400)");
                    System.out.println("- Vacunación (L. 300)");
                    System.out.println("- Emergencias (L. 600)");
                    System.out.print("¿Desea continuar con algún servicio médico? (sí/no): ");
                    String respuestaMedica = sc.nextLine();

                    if (respuestaMedica.equalsIgnoreCase("sí")) {
                        System.out.println("\nSeleccione el servicio médico:");
                        System.out.println("1. Consulta general");
                        System.out.println("2. Vacunación");
                        System.out.println("3. Emergencias");
                        System.out.print("Seleccione una opción: ");
                        int servicioMedico = sc.nextInt();
                        sc.nextLine();

                        int precioMedico = 0;
                        switch (servicioMedico) {
                            case 1: precioMedico = 400; break;
                            case 2: precioMedico = 300; break;
                            case 3: precioMedico = 600; break;
                            default: System.out.println("Opción de servicio inválida."); continue;
                        }

                        System.out.println("Servicio médico registrado. Total a pagar: L. " + precioMedico);
                        perrosMedicos++;
                    } else {
                        System.out.println("Volviendo al menú principal...");
                    }
                    break;

                case 3:
                    System.out.println("\nReporte de Servicios:");
                    System.out.println("Perros atendidos en Grooming: " + perrosGrooming);
                    System.out.println("Perros atendidos en Atención Médica: " + perrosMedicos);
                    break;

                case 4:
                    System.out.println("Gracias por utilizar el sistema. ¡Adiós!");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        sc.close();
    }
}
