package com.ps.labs.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrazyCalculatorService {

    private final CalculatorService service;

    private final MailService mailService;

    @Autowired
    public CrazyCalculatorService(final CalculatorService service, final MailService mailService) {
        this.service = service;
        this.mailService = mailService;
    }

    public int crazyAdd(final int first, final int second) {
        return service.add(first, second) * 2;
    }

    public int crazySubstract(final int first, final int second) {
        mailService.sendMail();
        return service.substract(first, second) - 66;
    }

}
