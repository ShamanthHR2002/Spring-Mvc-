package com.xworkz.Service;

import com.xworkz.dto.BankDTO;
import com.xworkz.dto.HospitalDTO;
import org.springframework.stereotype.Service;


@Service
public class BankServiceImp implements BankService {

    BankServiceImp() {
        System.out.println("running BankServiceImp");
    }


    @Override
    public boolean isValidAndSave(BankDTO bankDTO) {
        return false;
    }
}
