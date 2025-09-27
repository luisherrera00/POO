/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuwork.models;

/**
 *
 * @author Luis Daniel
 */
public class Usuario extends Persona {
    private String username;
    private String password;
    private String rol;

    public Usuario(String cedula, String nombre, String email, String telefono,
                   String username, String password, String rol) {
        super(cedula, nombre, email, telefono);
        this.username = username;
        this.password = password;
        this.rol = rol;
    }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }

    public boolean autenticar(String user, String pass) {
        return this.username.equals(user) && this.password.equals(pass);
    }

    @Override
    public boolean validarDatos() {
        return getCedula() != null && username != null && password != null;
    }
}