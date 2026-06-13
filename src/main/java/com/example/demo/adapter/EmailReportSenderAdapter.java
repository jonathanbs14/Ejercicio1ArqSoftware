package com.example.demo.adapter;

import com.example.demo.application.port.input.ReportSender;

public class EmailReportSenderAdapter implements ReportSender{

    @Override
    public void send(String report, String destination) {
        System.out.println("Enviando por email a " + destination + ": " + report);
    }
}

