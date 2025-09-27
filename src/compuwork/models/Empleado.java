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

public abstract class Empleado extends Persona {
    private String idEmpleado;
    private String fechaIngreso;
    private double salario;
    private String cargo;
    private String estado;
    private Departamento departamento;
    private List<ReporteDesempeno> reportes;

    public Empleado(String cedula, String nombre, String email, String telefono,
                    String idEmpleado, String fechaIngreso, double salario, String cargo, String estado) {
        super(cedula, nombre, email, telefono);
        this.idEmpleado = idEmpleado;
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
        this.cargo = cargo;
        this.estado = estado;
        this.reportes = new ArrayList<>();
    }

    public String getIdEmpleado() { return idEmpleado; }
    public void setIdEmpleado(String idEmpleado) { this.idEmpleado = idEmpleado; }

    public String getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(String fechaIngreso) { this.fechaIngreso = fechaIngreso; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public Departamento getDepartamento() { return departamento; }
    public void setDepartamento(Departamento departamento) { this.departamento = departamento; }

    public List<ReporteDesempeno> getReportes() { return reportes; }

    public void agregarReporte(ReporteDesempeno reporte) {
        reportes.add(reporte);
    }

    public void asignarDepartamento(Departamento departamento) throws Exception {
        if (departamento == null) throw new Exception("Departamento no válido");
        this.departamento = departamento;
        departamento.agregarEmpleado(this);
    }

    public abstract double calcularSalario();

    @Override
    public boolean validarDatos() {
        return getCedula() != null && getNombre() != null && getEmail() != null;
    }
}