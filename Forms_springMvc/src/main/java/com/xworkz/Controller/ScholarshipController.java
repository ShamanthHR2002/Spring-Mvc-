package com.xworkz.Controller;

import com.xworkz.Service.ScholarshipService;
import com.xworkz.dto.ScholarshipDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ScholarshipController {

    @Autowired
    private ScholarshipService scholarshipService;

    public ScholarshipController() {
        System.out.println("Running ScholarshipController");
    }

    @RequestMapping("/scholarship")
    public String onPress(ScholarshipDTO scholarshipDTO) {
        System.out.println(scholarshipDTO);
        boolean valid = scholarshipService.isValidAndSave(scholarshipDTO);
        if (valid) {
            System.out.println("Valid ScholarshipDTO");
        } else {
            System.err.println("Invalid ScholarshipDTO");
        }
        return "Scholarship.jsp";
    }
}
