package com.example.demo.adapter;

import com.example.demo.application.port.input.ReportSaver;

public class DiskReportSaverAdapter implements ReportSaver {
    @Override
    public void save(String report) {
        System.out.println("Guardando en disco: " + report);
    }
}
