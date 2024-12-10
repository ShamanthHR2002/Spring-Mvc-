package com.xworkz.Service;

import com.xworkz.dto.HospitalDTO;
import com.xworkz.dto.PassportDTO;
import org.springframework.stereotype.Service;

@Service
public class HospitalServiceImp implements HospitalService {

    HospitalServiceImp() {
        System.out.println("running HospitalServiceImp");
    }


    @Override
    public boolean isValidAndSave(HospitalDTO hospitalDTO) {
        return false;
    }
}