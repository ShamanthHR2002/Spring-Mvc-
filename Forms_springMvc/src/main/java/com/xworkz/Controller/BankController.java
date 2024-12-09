package com.xworkz.Controller;

import com.xworkz.Service.BankService;
import com.xworkz.dto.BankDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BankController {

    @Autowired
    private BankService bankService;

    BankController() {
        System.out.println("running BankController");
    }

    @RequestMapping("/bank")
    public String onpress(BankDTO bankDTO) {
        System.out.println(bankDTO);
        boolean valid = bankService.isValidAndSave(bankDTO);
        if (valid)
            System.out.println("valid");
        else {
            System.err.println("not valid");
        }
        return "Bank.jsp";
    }


}