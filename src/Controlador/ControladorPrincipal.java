/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Luis Daniel
 */
import compuwork.models.*;

public class ControladorPrincipal {
    private SistemaAutenticacion sistemaAutenticacion;

    public ControladorPrincipal() {
        sistemaAutenticacion = SistemaAutenticacion.getInstancia();
    }

    public Usuario login(String username, String password) {
        return sistemaAutenticacion.autenticar(username, password);
    }

    // Métodos para gestionar empleados, departamentos, reportes, etc.
}