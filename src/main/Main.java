/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Luis Daniel
 */
import Controlador.ControladorPrincipal;
import compuwork.models.Usuario;
import Vista.VistaConsola;

public class Main {
    public static void main(String[] args) {
        VistaConsola vista = new VistaConsola();
        ControladorPrincipal controlador = new ControladorPrincipal();

// === Agregar usuarios de prueba ===
        compuwork.models.SistemaAutenticacion sistema = compuwork.models.SistemaAutenticacion.getInstancia();
        sistema.agregarUsuario(new Usuario("12345678", "Ana Pérez", "ana@correo.com", "555-1234", "ana", "1234", "Administrador"));
        sistema.agregarUsuario(new Usuario("87654321", "Luis Gómez", "luis@correo.com", "555-5678", "luis", "abcd", "Empleado"));

        vista.mostrarMenu();
        String opcion = vista.pedirDato("Seleccione una opción: ");
        if (opcion.equals("1")) {
            String user = vista.pedirDato("Usuario: ");
            String pass = vista.pedirDato("Contraseña: ");
            Usuario u = controlador.login(user, pass);
            if (u != null) {
                vista.mostrarMensaje("Bienvenido, " + u.getNombre() + " (" + u.getRol() + ")");
            } else {
                vista.mostrarMensaje("Credenciales incorrectas.");
            }
        }
    }
}