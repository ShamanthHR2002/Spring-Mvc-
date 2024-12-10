package com.xworkz.Controller;

import com.xworkz.Service.OrganDonationService;
import com.xworkz.dto.OrganDonationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class OrganDonationController {

    @Autowired
    private OrganDonationService organDonationService;

    public OrganDonationController() {
        System.out.println("Running OrganDonationController");
    }

    @RequestMapping("/organDonation")
    public String onPress(OrganDonationDTO organDonationDTO) {
        System.out.println(organDonationDTO);
        boolean valid = organDonationService.isValidAndSave(organDonationDTO);
        if (valid) {
            System.out.println("Valid OrganDonationDTO");
        } else {
            System.err.println("Invalid OrganDonationDTO");
        }
        return "OrganDonation.jsp";
    }
}
