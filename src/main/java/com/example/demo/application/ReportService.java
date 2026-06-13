package com.example.demo.application;

public class ReportService {
    public void generateReport(String data) {

        System.out.println("Generando reporte con datos: " + data);
    }

    public void saveReport(String data) {

        System.out.println("Guardando reporte en disco: " + data);
    }

    public void sendReportByEmail(String data, String email) {
        // Envía el reporte por correo
        System.out.println("Enviando reporte a " + email + " con datos: " + data);
    }
}
