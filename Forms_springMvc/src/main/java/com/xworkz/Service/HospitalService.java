package com.xworkz.Service;

import com.xworkz.dto.HospitalDTO;
import org.springframework.stereotype.Service;


public interface HospitalService {
    boolean isValidAndSave(HospitalDTO hospitalDTO);
}
