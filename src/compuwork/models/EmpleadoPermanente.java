/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuwork.models;

/**
 *
 * @author Luis Daniel
 */

public class EmpleadoPermanente extends Empleado {
    private double beneficios;
    private int vacaciones;
    private double pension;

    public EmpleadoPermanente(String cedula, String nombre, String email, String telefono,
                              String idEmpleado, String fechaIngreso, double salario, String cargo, String estado,
                              double beneficios, int vacaciones, double pension) {
        super(cedula, nombre, email, telefono, idEmpleado, fechaIngreso, salario, cargo, estado);
        this.beneficios = beneficios;
        this.vacaciones = vacaciones;
        this.pension = pension;
    }

    public double getBeneficios() { return beneficios; }
    public void setBeneficios(double beneficios) { this.beneficios = beneficios; }

    public int getVacaciones() { return vacaciones; }
    public void setVacaciones(int vacaciones) { this.vacaciones = vacaciones; }

    public double getPension() { return pension; }
    public void setPension(double pension) { this.pension = pension; }

    @Override
    public double calcularSalario() {
        return getSalario() + beneficios - pension;
    }
} 