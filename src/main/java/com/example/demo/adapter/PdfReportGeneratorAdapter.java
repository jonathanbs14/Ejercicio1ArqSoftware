package com.example.demo.adapter;

import com.example.demo.application.port.input.ReportGenerator;

public class PdfReportGeneratorAdapter implements ReportGenerator {

    @Override
    public String generate(String data) {
        // Aquí iría la lógica para generar un reporte PDF a partir de los datos proporcionados.
        // Por simplicidad, solo devolveremos una cadena que simula la generación del PDF.
        return "PDF Report generated with data: " + data;
    }
}
