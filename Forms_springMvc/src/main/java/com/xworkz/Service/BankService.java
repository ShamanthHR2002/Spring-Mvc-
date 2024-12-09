package com.xworkz.Service;

import com.xworkz.dto.BankDTO;
import org.springframework.stereotype.Service;

@Service
public interface BankService {

    boolean isValidAndSave(BankDTO bankDTO);
}
