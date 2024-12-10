package com.xworkz.Controller;

import com.xworkz.Service.BankService;
import com.xworkz.Service.HospitalService;
import com.xworkz.dto.BankDTO;
import com.xworkz.dto.HospitalDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class BankController {

    @Autowired
    private BankService bankService;

    public BankController() {
        System.out.println("Running BankService");
    }

    @RequestMapping("/Bank")
    public String onPress(BankDTO bankDTO) {
        System.out.println(bankDTO);
        boolean valid = bankService.isValidAndSave(bankDTO);
        if (valid) {
            System.out.println("Valid bankDTO");
        } else {
            System.err.println("Invalid bankDTO");
        }
        return "Bank.jsp";
    }
}
