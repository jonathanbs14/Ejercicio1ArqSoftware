package com.example.demo.application.service;

import com.example.demo.application.port.input.ReportGenerator;
import com.example.demo.application.port.input.ReportSaver;
import com.example.demo.application.port.input.ReportSender;
import com.example.demo.application.port.output.ReportService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ReportUserCase implements ReportService {
    private final ReportGenerator generator;
    private final ReportSaver saver;
    private final ReportSender sender;

    @Override
    public void processReport(String data, String email) {
        String report = generator.generate(data);
        saver.save(report);
        sender.send(report, email);
    }
}
