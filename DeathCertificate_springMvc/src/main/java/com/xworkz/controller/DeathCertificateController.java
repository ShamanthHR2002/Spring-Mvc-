package com.xworkz.controller;

import com.xworkz.Service.DeathcertificateService;
import com.xworkz.dto.DeathCertificateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DeathCertificateController {

    @Autowired
    private DeathcertificateService deathcertificateService;

    public DeathCertificateController() {
        System.out.println("running DeathCertificateController");
    }

    @RequestMapping("/index")
    public String onClick(DeathCertificateDto deathCertificateDto) {
        System.out.println(deathCertificateDto);
        boolean valid = deathcertificateService.isValidAnSave(deathCertificateDto);
        if (valid) {
            System.out.println("valid");
        } else {
            System.err.println("not valid");
        }
        return "index.jsp";
    }
}
