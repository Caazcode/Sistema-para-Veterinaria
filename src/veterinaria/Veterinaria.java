/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package veterinaria;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author adrianaguilar
 */


// Clase para representar a los animales
class Animal {
    String tipo;
    String raza;
    String tamaño;

    public Animal(String tipo, String raza, String tamaño) {
        this.tipo = tipo;
        this.raza = raza;
        this.tamaño = tamaño;
    }
}

// Clase para representar los servicios de la veterinaria
class Servicio {
    String nombre;
    int precio;

    public Servicio(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}

// Clase principal
public class Veterinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a Veterinaria Aguilar");
        boolean salir = false;

        ArrayList<Animal> grooming = new ArrayList<>();
        ArrayList<Animal> medicos = new ArrayList<>();

        while (!salir) {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Registrar Grooming");
            System.out.println("2. Registrar Atención Médica");
            System.out.println("3. Generar Reporte");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("\nRegistro de Grooming:");
                    System.out.print("Tipo de animal (Perro, Gato, etc.): ");
                    String tipo = sc.nextLine();
                    System.out.print("Raza: ");
                    String raza = sc.nextLine();
                    System.out.print("Tamaño (Pequeño, Mediano, Grande): ");
                    String tamaño = sc.nextLine();

                    System.out.println("\nSeleccione el servicio de grooming:");
                    System.out.println("1. Baño (L. 150 para pequeño, L. 250 para grande)");
                    System.out.println("2. Corte de pelo (L. 200 para pequeño, L. 300 para grande)");
                    System.out.println("3. Limpieza de uñas (L. 100 para pequeño, L. 150 para grande)");
                    System.out.print("Seleccione una opción: ");
                    int servicio = sc.nextInt();
                    sc.nextLine();

                    int precio = 0;
                    switch (servicio) {
                        case 1: precio = tamaño.equalsIgnoreCase("Grande") ? 250 : 150; break;
                        case 2: precio = tamaño.equalsIgnoreCase("Grande") ? 300 : 200; break;
                        case 3: precio = tamaño.equalsIgnoreCase("Grande") ? 150 : 100; break;
                        default: System.out.println("Opción no válida. Volviendo al menú principal."); continue;
                    }

                    grooming.add(new Animal(tipo, raza, tamaño));
                    System.out.println("Servicio registrado. Total a pagar: L. " + precio);
                    break;

                case 2:
                    System.out.println("\nRegistro de Atención Médica:");
                    System.out.print("Tipo de animal (Perro, Gato, etc.): ");
                    tipo = sc.nextLine();
                    System.out.print("Raza: ");
                    raza = sc.nextLine();
                    System.out.print("Tamaño (Pequeño, Mediano, Grande): ");
                    tamaño = sc.nextLine();

                    System.out.println("\nSeleccione el servicio médico:");
                    System.out.println("1. Consulta general (L. 400)");
                    System.out.println("2. Vacunación (L. 300)");
                    System.out.println("3. Emergencias (L. 600)");
                    System.out.print("Seleccione una opción: ");
                    int servicioMedico = sc.nextInt();
                    sc.nextLine();

                    int precioMedico = 0;
                    switch (servicioMedico) {
                        case 1: precioMedico = 400; break;
                        case 2: precioMedico = 300; break;
                        case 3: precioMedico = 600; break;
                        default: System.out.println("Opción no válida. Volviendo al menú principal."); continue;
                    }

                    medicos.add(new Animal(tipo, raza, tamaño));
                    System.out.println("Servicio registrado. Total a pagar: L. " + precioMedico);
                    break;

                case 3:
                    System.out.println("\nReporte de Servicios:");
                    System.out.println("Animales en Grooming:");
                    for (Animal animal : grooming) {
                        System.out.println("- Tipo: " + animal.tipo + ", Raza: " + animal.raza + ", Tamaño: " + animal.tamaño);
                    }
                    System.out.println("Total: " + grooming.size() + " animales.");

                    System.out.println("\nAnimales en Atención Médica:");
                    for (Animal animal : medicos) {
                        System.out.println("- Tipo: " + animal.tipo + ", Raza: " + animal.raza + ", Tamaño: " + animal.tamaño);
                    }
                    System.out.println("Total: " + medicos.size() + " animales.");
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
