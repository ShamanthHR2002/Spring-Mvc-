package com.xworkz.Service;

import com.xworkz.dto.MatrimonyDTO;
import com.xworkz.dto.PassportDTO;
import org.springframework.stereotype.Service;


@Service
public class MatrimonyServiceImp implements MatrimonyService {

    MatrimonyServiceImp() {
        System.out.println("running MatrimonyServiceImp");
    }


    @Override
    public boolean isValidAndSave(MatrimonyDTO matrimonyDTO) {
        return false;
    }
}
