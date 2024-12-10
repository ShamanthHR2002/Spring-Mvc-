package com.xworkz.Controller;

import com.xworkz.Service.HospitalService;
import com.xworkz.dto.HospitalDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    public HospitalController() {
        System.out.println("Running HospitalController");
    }

    @RequestMapping("/hospital")
    public String onPress(HospitalDTO hospitalDTO) {
        System.out.println(hospitalDTO);
        boolean valid = hospitalService.isValidAndSave(hospitalDTO);
        if (valid) {
            System.out.println("Valid HospitalDTO");
        } else {
            System.err.println("Invalid HospitalDTO");
        }
        return "Hospital.jsp";
    }
}
