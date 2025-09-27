/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author Luis Daniel
 */
import java.util.Scanner;
import compuwork.models.Usuario;

public class VistaConsola {
    private Scanner scanner = new Scanner(System.in);

    public String pedirDato(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarMenu() {
        System.out.println("1. Iniciar sesión");
        System.out.println("2. Salir");
    }
}