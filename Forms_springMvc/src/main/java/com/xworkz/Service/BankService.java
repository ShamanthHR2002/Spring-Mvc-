package com.xworkz.Service;

import com.xworkz.dto.BankDTO;
import com.xworkz.dto.HospitalDTO;
import org.springframework.stereotype.Service;


public interface BankService {


    boolean isValidAndSave(BankDTO bankDTO);
}