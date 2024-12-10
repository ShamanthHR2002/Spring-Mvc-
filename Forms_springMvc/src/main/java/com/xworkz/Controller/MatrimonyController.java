package com.xworkz.Controller;

import com.xworkz.Service.MatrimonyService;
import com.xworkz.dto.MatrimonyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MatrimonyController {

    @Autowired
    private MatrimonyService matrimonyService;

    public MatrimonyController() {
        System.out.println("Running MatrimonyController");
    }

    @RequestMapping("/matrimony")
    public String onPress(MatrimonyDTO matrimonyDTO) {
        System.out.println(matrimonyDTO);
        boolean valid = matrimonyService.isValidAndSave(matrimonyDTO);
        if (valid) {
            System.out.println("Valid MatrimonyDTO");
        } else {
            System.err.println("Invalid MatrimonyDTO");
        }
        return "Matrimony.jsp";
    }
}
