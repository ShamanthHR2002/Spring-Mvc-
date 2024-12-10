package com.xworkz.Service;

import com.xworkz.dto.ScholarshipDTO;
import org.springframework.stereotype.Service;


public interface ScholarshipService {
    boolean isValidAndSave(ScholarshipDTO scholarshipDTO);
}
