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

public class Departamento {
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public List<Empleado> getEmpleados() { return empleados; }

    public void agregarEmpleado(Empleado empleado) throws Exception {
        if (empleado == null) throw new Exception("Empleado no válido");
        if (!empleados.contains(empleado)) {
            empleados.add(empleado);
        }
    }

  // Sobrecarga: agregar empleado temporal directamente con datos
    
    public void agregarEmpleado(String cedula, String nombre, String email, String telefono,
                               String idEmpleado, String fechaIngreso, double salario, String cargo, String estado,
                               String fechaFinContrato, String tipoContrato, int horasTrabajadas) throws Exception {
        EmpleadoTemporal nuevo = new EmpleadoTemporal(
            cedula, nombre, email, telefono,
            idEmpleado, fechaIngreso, salario, cargo, estado,
            fechaFinContrato, tipoContrato, horasTrabajadas
        );
        agregarEmpleado(nuevo);
    }
    
    
    public void removerEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    public void listarEmpleados() {
        for (Empleado e : empleados) {
            System.out.println(e.getNombre() + " - " + e.getCargo());
        }
    }
}

