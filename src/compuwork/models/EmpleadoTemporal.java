/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuwork.models;

/**
 *
 * @author Luis Daniel
 */
public class EmpleadoTemporal extends Empleado {
    private String fechaFinContrato;
    private String tipoContrato;
    private int horasTrabajadas;

    public EmpleadoTemporal(String cedula, String nombre, String email, String telefono,
                            String idEmpleado, String fechaIngreso, double salario, String cargo, String estado,
                            String fechaFinContrato, String tipoContrato, int horasTrabajadas) {
        super(cedula, nombre, email, telefono, idEmpleado, fechaIngreso, salario, cargo, estado);
        this.fechaFinContrato = fechaFinContrato;
        this.tipoContrato = tipoContrato;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getFechaFinContrato() { return fechaFinContrato; }
    public void setFechaFinContrato(String fechaFinContrato) { this.fechaFinContrato = fechaFinContrato; }

    public String getTipoContrato() { return tipoContrato; }
    public void setTipoContrato(String tipoContrato) { this.tipoContrato = tipoContrato; }

    public int getHorasTrabajadas() { return horasTrabajadas; }
    public void setHorasTrabajadas(int horasTrabajadas) { this.horasTrabajadas = horasTrabajadas; }

    @Override
    public double calcularSalario() {
        return getSalario() * horasTrabajadas;
    }
}