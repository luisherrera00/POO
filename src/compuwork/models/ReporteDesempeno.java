/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuwork.models;

/**
 *
 * @author Luis Daniel
 */
public class ReporteDesempeno {
    private String periodo;
    private String metricas;
    private Empleado empleado;

    public ReporteDesempeno(String periodo, String metricas, Empleado empleado) {
        this.periodo = periodo;
        this.metricas = metricas;
        this.empleado = empleado;
    }

    public String getPeriodo() { return periodo; }
    public void setPeriodo(String periodo) { this.periodo = periodo; }

    public String getMetricas() { return metricas; }
    public void setMetricas(String metricas) { this.metricas = metricas; }

    public Empleado getEmpleado() { return empleado; }
    public void setEmpleado(Empleado empleado) { this.empleado = empleado; }
}