package com.xworkz.Service;

import com.xworkz.dto.PassportDTO;
import com.xworkz.dto.ScholarshipDTO;
import org.springframework.stereotype.Service;


@Service
public class ScholarshipServiceImp implements ScholarshipService {

    ScholarshipServiceImp() {
        System.out.println("running ScholarshipServiceImp");
    }


    @Override
    public boolean isValidAndSave(ScholarshipDTO scholarshipDTO) {
        return false;
    }
}
