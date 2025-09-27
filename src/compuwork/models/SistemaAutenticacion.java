/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuwork.models;

/**
 *
 * @author Luis Daniel
 */
import java.util.ArrayList;
import java.util.List;

public class SistemaAutenticacion {
    private static SistemaAutenticacion instancia;
    private List<Usuario> usuarios;

    private SistemaAutenticacion() {
        usuarios = new ArrayList<>();
    }

    public static SistemaAutenticacion getInstancia() {
        if (instancia == null) {
            instancia = new SistemaAutenticacion();
        }
        return instancia;
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario autenticar(String username, String password) {
        for (Usuario u : usuarios) {
            if (u.autenticar(username, password)) {
                return u;
            }
        }
        return null;
    }
}